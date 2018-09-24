# Prezentace migraèních dat
Vytvoøeno bìhem akce HackujStat.cz 2018

## Struèný slovní popis
Prezentace demografických ukazatelù cizincù v Èeské republice. Využívá data Èeského statistického úøadu z let 2004-2017.
Konkrétnì se jedná o poèty cizincù s pobytem pøechodným, dlouhodobým, pobytem trvalým a dlouhodobým vízem v Èeské republice, ale vyjma azylantù. Jsou dostupná èlenìní podle pohlaví, pìtiletých vìkových skupin, státního obèanství cizince a podle okresù nebo krajù Èeské republiky.
K prezentaci dat používáme nástroj a službu od cleveranalytics.com.
Další migraèní dataset vychází ze statistik oecd.org a zachycuje poèty migrantù z jednotlivých zemí svìta.

## Screenshoty z øešení
Následuje úkazka vizualizace napø. poètu migrantù v rùzném období 2006-2017 pro cizince s ukrajinským obèanstvím.
![Screenshot - Poèty migrantù ve svìtì](hackujstat-2018-screenshot_UKR_01_Pocty_migrantu_ve_svete.png)
![Screenshot - Pøehled migrace v letech 2006-2017](hackujstat-2018-screenshot_UKR_02_Prehled_migrace_2006-2017.png)
![Screenshot - Období ekonomické krize a její vliv na migraci](hackujstat-2018-screenshot_UKR_03_Obdobi_ekonomicke_krize_a_jeji_vliv_na_migraci.png)
![Screenshot - Nárust migrace po ekonomické krizi](hackujstat-2018-screenshot_UKR_04_Narust_migrace_po_ekonomicke_krizi.png)

## Seznam dat/datových sad použitých v øešení
* https://www.czso.cz/csu/czso/cizinci-podle-statniho-obcanstvi-veku-a-pohlavi
* https://stats.oecd.org/Index.aspx?DataSetCode=MIG

## Seznam èlenù týmu
* Martin Tesaø
* Zbynìk Rùžièka
* Jindøich Mynarz
* Narcisa Kadleèáková

## Linky s aplikací a kódy
* Aplikace pøístupná skrze https://secure.cleveranalytics.com/ui/#/go7u17ovdi3b9t4j/project (vyžaduje pøihlášení).
* Související GitHub repo https://github.com/zruzicka/HackujStat.cz_2018

---

## Postup pøi øešení
* Seznámení s datovou sadou.
* Ovìøení, zda ÈSÚ tato data již nìkde prezentuje.
* Návrh zkoumaných pohledù, trendù a jevù.
* Validace a èištìní dat (csvclean).
* Transformace dat pro potøeby našeho datového modelu.
* Import dat do CleverAnalytics.
* Definice pohledù/views (v modelu CleverAnalytics).
* Definice modulù a poèetních metrik (v modelu CleverAnalytics).
* Analytika výstupních dat.
* Prezentace dat a výsledkù.