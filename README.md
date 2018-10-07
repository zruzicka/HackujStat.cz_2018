# Prezentace migra�n�ch dat
Nastartov�no b�hem akce HackujStat.cz 2018

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
* [Martin Tesa�](https://github.com/mattesCZ)
* [Zbyn�k R��i�ka](https://github.com/zruzicka)
* [Jind�ich Mynarz](https://github.com/jindrichmynarz)
* Narcisa Kadle��kov�

## Linky s aplikac� a k�dy
* Aplikace p��stupn� skrze https://secure.cleveranalytics.com/ui/#/go7u17ovdi3b9t4j/project (vy�aduje vytvo�it voln� ��et a p�ihl�en� na CleverAnalytics platform�).
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

---

## Mo�nosti dal��ho roz���en�
### Kr�tkodob� m���tko
* P�id�n� pohledu se zam��en�m na statistiky azylant� v �R v podobn�m �asov�m rozmez�. (Jsme v kontatku s mentorem z �S� a po komun�ln�ch volb�ch 2018 m� prob�hat na�e dal�� komunikace ohledn� form�tu)
* P�id�n� statistik dat cizinc� za rok 2018 - tyto data maj� b�t k dispozici (dle informace z �S�) koncem �ervna 2019.
* Roz���en� view "Anal�za cizinc� ve sv�t�" o statistiky tak� z p�ede�l�ch let (= nikoliv prezentace dat pouze ze sou�asnosti).
### Dlouhodob�j�� m���tko
* Umo�nit lokalizaci obsahu pro �eskou i mezin�rodn� ve�ejnost.
* Zaj�mavou mo�nost� m��e b�t t� hled�n� souvislost� ohledn� trend� migrace v n�vaznosti na ekonomick� ukazatele (nap�. nav�z�n� na statistiky z International Monetary Fund) nebo hled�n� souvislost� trendu migrace v n�vaznosti na politickou stabilitu.
* Dal�� zaj�mavou mo�nost� je sna�it se vytvo�it u�ivatelsky p��v�tiv� rozhran�, kter� by v kontextu statistik migrace umo�nilo nahl�dnout na ud�losti, kter� byly pro zvolen� region v�znamn� ve zvolen�m �ase. Jin�mi slovy, nav�zat se na glob�ln� archiv zpr�v a m�t mo�nost nad n�m vykon�vat p��kazy jako 
`select * from [gdelt-bq:gdeltv2.events] where year=2014 and Actor1CountryCode='UKR' and sourceurl like '%ukraine%' LIMIT 20`
nap��klad skrze [GDELT 2.0 platformu](https://blog.gdeltproject.org/gdelt-2-0-our-global-world-in-realtime/) nebo skrze [GDELT 2.0 in Google BigQuery](https://bigquery.cloud.google.com/table/gdelt-bq:gdeltv2.events)
