package cz.zr.hackujstat2018.filters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import cz.zr.hackujstat2018.filters.DataSetFilter.Rules;

/**
 * Initial filter implementation for input CSV files.
 * 
 * @author ZRuzicka
 */
public class DataSetFilter {

    /** Types of validation rules. */
    enum Rules {
        NOT_EMPTY, APPEND
    }

    /* Debug and settings flags. */
    static boolean applyDemoProcessing = true;
    static boolean isInputDebug = false;

    String[] targetColumns = new String[] { "id", "hodnota", "rok", "datum", "okres_kod", "okres", "kraj_txt",
            "pohlavi", "obcanstvi_kod", "obcanstvi", "vek_txt", "vek_index" };
    String[] sourceColumns = new String[] { "idhod", "hodnota", "rok", "rok", "vuzemi_kod", "vuzemi_txt", "kraj_txt",
            "pohlavi_txt", "stobcan_kod", "stobcan_txt", "vek_txt", "vek_kod" };
    Rules[] targetColumnsRules = new Rules[] { null, null, null, Rules.APPEND, null, null, Rules.NOT_EMPTY,
            Rules.NOT_EMPTY, Rules.NOT_EMPTY, Rules.NOT_EMPTY, Rules.NOT_EMPTY, Rules.NOT_EMPTY };
    Columns outputColumns = new Columns(targetColumns, sourceColumns, targetColumnsRules);

    public static void main(String[] args) {
        long started = System.currentTimeMillis();
        DataSetFilter filter = new DataSetFilter();
        try {
            if (args.length < 1) {
                System.err.println("Input CSV file must be specified via argument.");
                System.exit(0);
            }
            String inputFile = args[0];
            System.out.println("Input file: " + inputFile);

            File f = new File(inputFile);
            CSVReader csvReader = new CSVReader(new InputStreamReader(new FileInputStream(f), "UTF8"));

            Writer writer = new OutputStreamWriter(new FileOutputStream(inputFile + ".filtered.csv"),
                    StandardCharsets.UTF_8);
            CSVWriter csvWriter = new CSVWriter(writer, 
                    CSVWriter.DEFAULT_SEPARATOR, 
                    CSVWriter.DEFAULT_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER, 
                    CSVWriter.DEFAULT_LINE_END);

            csvWriter.writeNext(filter.outputColumns.getTargetColumns());

            String[] header = null;
            String[] lineColumns;
            int i = 1;
            int writtenLines = 0;
            while ((lineColumns = csvReader.readNext()) != null) {
                if (i == 1) { // Defines header columns.
                    header = lineColumns;
                    filter.outputColumns.initSourceColumnIndices(header);
                    filter.outputColumns.columnsDebugInfo(header);
                    i++;
                    continue;
                }
                String[] columns = lineColumns;
                String[] output = filter.outputColumns.transformInputData(columns);
                if (isInputDebug) {
                    System.out.println("(" + i + ") input:" + Arrays.toString(columns)); // TMP output.
                    System.out.println("(" + i + ") output:" + Arrays.toString(output)); // TMP output.
                }
                if (output != null) {
                    csvWriter.writeNext(output);
                    writtenLines++;
                }

                i++;
                if (applyDemoProcessing && writtenLines == 10) {
                    // Demo mode processes only a small subset of data instead of whole file.
                    break;
                }
            }

            csvReader.close();
            csvWriter.close();

            if (isInputDebug) {
                filter.outputColumns.columnsDebugInfo(header);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long finished = System.currentTimeMillis();
        System.out.println("Finished in " + (finished - started) + " ms.");
    }
}

/**
 * Carries columns transformation definition.
 */
class Columns {

    final String[] targetColumns;
    final String[] correspondingSourceColumns;
    final int[] sourceColumnIndices;
    final Rules[] targetColumnsRules;

    public Columns(String[] targetColumns, String[] correspondingSourceColumns, Rules[] targetColumnsRules) {
        super();
        this.targetColumns = targetColumns;
        this.correspondingSourceColumns = correspondingSourceColumns;
        this.targetColumnsRules = targetColumnsRules;
        sourceColumnIndices = new int[targetColumns.length];
    }

    public void initSourceColumnIndices(String[] inputHeader) {
        int columnIndex = 0;
        for (String searchedSourceColumn : correspondingSourceColumns) {
            for (int i = 0; i < inputHeader.length; i++) {
                String inputColumn = inputHeader[i];
                if (inputColumn.equals(searchedSourceColumn)) {
                    sourceColumnIndices[columnIndex] = i;
                }
            }
            columnIndex++;
        }
    }

    public void columnsDebugInfo(String[] header) {
        System.out.println("targetColumns: " + Arrays.toString(targetColumns));
        System.out.println("correspondingSourceColumns: " + Arrays.toString(correspondingSourceColumns));
        System.out.println("sourceColumnIndices: " + Arrays.toString(sourceColumnIndices));
        System.out.println("full input header: " + Arrays.toString(header));
    }

    public String[] transformInputData(String[] inputValues) {
        String[] output = new String[targetColumns.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sourceColumnIndices.length; i++) {
            int columnIndex = sourceColumnIndices[i];
            if (columnIndex < inputValues.length) {
                String columnValue = inputValues[columnIndex].trim();

                if (Rules.NOT_EMPTY.equals(targetColumnsRules[i])
                        && (columnValue.length() == 0 || "\"\"".equals(columnValue))) {
                    // Column data does not match validation rule constraint. -> Whole row should be skipped.
                    return null;
                } else if (Rules.APPEND.equals(targetColumnsRules[i])) {
                    columnValue = columnValue.replaceAll("\"", "");
                    columnValue += "-12-31"; // TODO Appended value should be loaded from rules configuration.
                }
                
                output[i] = columnValue;
            }
        }
        return output;
    }
    
    public String[] getTargetColumns() {
        return targetColumns;
    }

}
