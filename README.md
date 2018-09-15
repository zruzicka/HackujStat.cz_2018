# HackujStat.cz (2018)

## Název aplikace
Hackuj stát 2018/dataset cizinci a obèanství

## Struèný slovní popis
Prezentace demografických ukazatelù cizincù v Èeské republice. Využívá data Èeského statistického úøadu z let 2004-2017.
Konkrétnì se jedná o poèty cizincù s pobytem pøechodným, dlouhodobým, pobytem trvalým a dlouhodobým vízem v Èeské republice, ale vyjma azylantù. Jsou dostupná èlenìní podle pohlaví, pìtiletých vìkových skupin, státního obèanství cizince a podle okresù nebo krajù Èeské republiky.
K prezentaci dat používáme nástroj a službu od cleveranalytics.com.

## Printscreen navrhovaného øešení
TODO

## Seznam dat/datových sad použitých k øešení
https://www.czso.cz/csu/czso/cizinci-podle-statniho-obcanstvi-veku-a-pohlavi

## Seznam èlenù týmu
* Martin Tesaø
* Zbynìk Rùžièka
* Jindrich Mynarz
* Narcisa

## Linky s aplikací a kódy
* Aplikace pøístupná skrze https://secure.cleveranalytics.com/ui/#/go7u17ovdi3b9t4j (vyžaduje pøihlášení).
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