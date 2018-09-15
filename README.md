# HackujStat.cz (2018)

## N�zev aplikace
Hackuj st�t 2018/dataset cizinci a ob�anstv�

## Stru�n� slovn� popis
Prezentace demografick�ch ukazatel� cizinc� v �esk� republice. Vyu��v� data �esk�ho statistick�ho ��adu z let 2004-2017.
Konkr�tn� se jedn� o po�ty cizinc� s pobytem p�echodn�m, dlouhodob�m, pobytem trval�m a dlouhodob�m v�zem v �esk� republice, ale vyjma azylant�. Jsou dostupn� �len�n� podle pohlav�, p�tilet�ch v�kov�ch skupin, st�tn�ho ob�anstv� cizince a podle okres� nebo kraj� �esk� republiky.
K prezentaci dat pou��v�me n�stroj a slu�bu od cleveranalytics.com.

## Printscreen navrhovan�ho �e�en�
TODO

## Seznam dat/datov�ch sad pou�it�ch k �e�en�
https://www.czso.cz/csu/czso/cizinci-podle-statniho-obcanstvi-veku-a-pohlavi

## Seznam �len� t�mu
* Martin Tesa�
* Zbyn�k R��i�ka
* Jindrich Mynarz
* Narcisa

## Linky s aplikac� a k�dy
* Aplikace p��stupn� skrze https://secure.cleveranalytics.com/ui/#/go7u17ovdi3b9t4j (vy�aduje p�ihl�en�).
* Souvisej�c� GitHub repo https://github.com/zruzicka/HackujStat.cz_2018

---

## Postup p�i �e�en�
* Sezn�men� s datovou sadou.
* Ov��en�, zda �S� tato data ji� n�kde prezentuje.
* N�vrh zkouman�ch pohled�, trend� a jev�.
* Validace a �i�t�n� dat (csvclean).
* Transformace dat pro pot�eby na�eho datov�ho modelu.
* Import dat do CleverAnalytics.
* Definice pohled�/views (v modelu CleverAnalytics).
* Definice modul� a po�etn�ch metrik (v modelu CleverAnalytics).
* Analytika v�stupn�ch dat.
* Prezentace dat a v�sledk�.