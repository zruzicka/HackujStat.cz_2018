# Prezentace migra�n�ch dat
Vytvo�eno b�hem akce HackujStat.cz 2018

## Stru�n� slovn� popis
Prezentace demografick�ch ukazatel� cizinc� v �esk� republice. Vyu��v� data �esk�ho statistick�ho ��adu z let 2004-2017.
Konkr�tn� se jedn� o po�ty cizinc� s pobytem p�echodn�m, dlouhodob�m, pobytem trval�m a dlouhodob�m v�zem v �esk� republice, ale vyjma azylant�. Jsou dostupn� �len�n� podle pohlav�, p�tilet�ch v�kov�ch skupin, st�tn�ho ob�anstv� cizince a podle okres� nebo kraj� �esk� republiky.
K prezentaci dat pou��v�me n�stroj a slu�bu od cleveranalytics.com.
Dal�� migra�n� dataset vych�z� ze statistik oecd.org a zachycuje po�ty migrant� z jednotliv�ch zem� sv�ta.

## Screenshoty z �e�en�
N�sleduje �kazka vizualizace nap�. po�tu migrant� v r�zn�m obdob� 2006-2017 pro cizince s ukrajinsk�m ob�anstv�m.
![Screenshot - Po�ty migrant� ve sv�t�](hackujstat-2018-screenshot_UKR_01_Pocty_migrantu_ve_svete.png)
![Screenshot - P�ehled migrace v letech 2006-2017](hackujstat-2018-screenshot_UKR_02_Prehled_migrace_2006-2017.png)
![Screenshot - Obdob� ekonomick� krize a jej� vliv na migraci](hackujstat-2018-screenshot_UKR_03_Obdobi_ekonomicke_krize_a_jeji_vliv_na_migraci.png)
![Screenshot - N�rust migrace po ekonomick� krizi](hackujstat-2018-screenshot_UKR_04_Narust_migrace_po_ekonomicke_krizi.png)

## Seznam dat/datov�ch sad pou�it�ch v �e�en�
* https://www.czso.cz/csu/czso/cizinci-podle-statniho-obcanstvi-veku-a-pohlavi
* https://stats.oecd.org/Index.aspx?DataSetCode=MIG

## Seznam �len� t�mu
* Martin Tesa�
* Zbyn�k R��i�ka
* Jind�ich Mynarz
* Narcisa Kadle��kov�

## Linky s aplikac� a k�dy
* Aplikace p��stupn� skrze https://secure.cleveranalytics.com/ui/#/go7u17ovdi3b9t4j/project (vy�aduje p�ihl�en�).
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