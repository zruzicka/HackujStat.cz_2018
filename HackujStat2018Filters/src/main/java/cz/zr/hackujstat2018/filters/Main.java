/*
 * Copyright (c) 2018 Zbynek Ruzicka
 */

package cz.zr.hackujstat2018.filters;

/**
 * Main class for DataSetFilter execution.
 * 
 * @author ZRuzicka
 */
public class Main {

    public static void main(String[] args) {
        if (args == null || args.length < 1) {
            System.err.println("Input CSV file must be specified via argument.");
            System.exit(0);
        }
        DataSetFilter filter = new DataSetFilter();
        for (String inputFile : args) {
            // DataSetFilter is applied for each input file.
            filter.applyFilter(inputFile);
        }
    }

}
