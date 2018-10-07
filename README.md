# Don't be ignorant about the world
Nastartov�no b�hem akce HackujStat.cz 2018

* **Spole�ensk� probl�m:** V�dom� ve�ejnosti se �asto op�r� o domn�nky a emoce vytvo�en� nez��dka na z�klad� senza�n�ch titulk� sou�asn�ch m�di�. Chyb� komplexn� a srozumiteln� data pro ve�ejnost, kter� nejsou vytr�ena z dlouhodob�j��ho kontextu a trend�.
* **Na�e �e�en�:** Snaha zv��it pov�dom� o okoln�m sv�t� na z�klad� ve�ejn� dostupn�ch dat a poskytnout re�ln� statistiky i data a doplnit je o p�ehledn� vizualizace.
* **Sou�asn� probl�m na�eho �e�en�:** jak se dostat do pov�dom� �ir�� ve�ejnosti. :)

## Linky na aplikaci a k�dy
* Aplikace p��stupn� skrze https://secure.cleveranalytics.com/ui/#/go7u17ovdi3b9t4j/project (vy�aduje vytvo�it voln� ��et a p�ihl�en� na CleverAnalytics platform�).
* Souvisej�c� GitHub repo https://github.com/zruzicka/HackujStat.cz_2018

## Popis projektu

C�lem projektu je zv��it pov�dom� o okoln�m sv�t� na z�klad� ve�ejn� dostupn�ch dat a poskytnout re�ln� statistiky a data tam, kde se v�dom� ve�ejnosti op�r� o domn�nky a emoce vytvo�en� �asto na z�klad� senza�n�ch titulk� sou�asn�ch m�di�. Hloubku problematiky nasti�uje video ["Hans and Ola Rosling: How not to be ignorant about the world"](https://www.ted.com/talks/hans_and_ola_rosling_how_not_to_be_ignorant_about_the_world?language=en) dostupn� skrze TED platformu.

V sou�asnosti jsme ji� dok�zali mapovat a vizualizovat statistiky demografick�ch ukazatel� cizinc� v �esk� republice (t�ma migrace a imigrace ve ve�ejnosti vytv��� emoce, ale �asto chyb� p�ehledn� prezentovan� re�ln� data pro mo�nost vytv��en� vlastn�ho n�zoru a diskuze). Data cizinc� v �R dopl�ujeme i t�matikou migrace ve sv�tov�m m���tku a ��slech.

T�matika "Don't be ignorant about the world" n�m umo��uje ve sv�tov�m m���tku d�le hledat, mapovat a vizualizovat i dal�� zaj�mav� otev�en� data jako nap�. statistiky gramotnosti, trend v�voje objemu turismu, v�voj humanit�rn�ch mis�, trendy v�voje HDP, p��padn� pod�l HDP v�novan� na sektor vzd�l�n� nebo zdravotnictv�. Sou��st� sv�ta jsou i nevesel� t�mata jako mno�stv� p��rodn�ch katastrof dle regionu, v�le�n� konflikty dle regionu nebo t� po�ty teroristick�ch �tok� dle data a regionu. Nab�z� se tak� mapovat mno�stv� t�by d�eva dle regionu, produkce CO2 dle regionu nebo spot�eba p��rodn�ch zdroj� dle regionu. Ve�ejnost m� m�t snadn� p��stup k dat�m i datovov�m zdroj�m, kter� jsou pro ni zaj�mav�.

Velmi atraktivn� by bylo postavit platformu takov�m zp�sobem, aby umo��ovala ve�ejnosti vytv��et/registrovat t�mata z�jmu a t� o nich hlastovat. Po z�sk�n� dostate�n�ho po�tu z�jemc� a sou�asn� tak� po definov�n� relevantn� datov� sady by prob�hla integrace a zve�ejn�n� dat i vizualizace skrze na�i platformu. Toto vytv��en� a integrace nov�ch t�mat m��e fungovat na osv�d�en�m principu [Area 51, the Stack Exchange Q&A](http://area51.stackexchange.com/). Zp�sob a forma nastartov�n� prezentace cel�ho �e�en� �irok� ve�ejnosti je p�edm�tem sou�asn� diskuze. Nab�z� se platformy jako Kickstarter, Patreon atd. nebo p�edstaven� konceptu ve�ejnosti t�eba pr�v� skrze Stack Exchange/Area 51. C�lem by ale m�lo b�t ud�lat obsah platformy �asem natolik nez�visl�, aby si ji mohly spravovat nad�enci a spr�vci sami podobn� jako p�isp�v� ve�ejnost do obsahu Wikipedie.

V sou�asnosti pou��v�me k prezentaci dat platformu CleverAnalytics, kter� n�m vyhovuje k prezentaci sou�asn�ch dat na �rovni jednotliv�ch st�t� ve sv�t� nebo na �rovni jednotliv�ch okres� v �R (granularita na detailn�j�� jednotky plochy je konfigurovateln�). Ale uv�domujeme si, �e m�me-li integrovat otev�en� data r�zn�ho charakteru dohromady, potom m��eme p�es�hnout i mo�nosti sou�asn� zvolen� platformy a budeme hledat nov� �e�en�.

## Popis pohled� v CleverAnalytics dashboard

### Anal�za cizinc� v �R
Prezentace demografick�ch ukazatel� cizinc� v �esk� republice. Vyu��v� data �esk�ho statistick�ho ��adu z let 2004-2017.
Konkr�tn� se jedn� o po�ty cizinc� s pobytem p�echodn�m, dlouhodob�m, pobytem trval�m a dlouhodob�m v�zem v �esk� republice, ale vyjma azylant�. Jsou dostupn� �len�n� podle pohlav�, p�tilet�ch v�kov�ch skupin, st�tn�ho ob�anstv� cizince a podle okres� nebo kraj� �esk� republiky.

### Anal�za cizinc� ve sv�t�
Migra�n� dataset vych�z� ze statistik oecd.org a zachycuje po�ty migrant� z jednotliv�ch zem� sv�ta.

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
* D�le mo�nost hled�n� a integrace dal��ch dataset�: statistiky gramotnosti, trend v�voje objemu turismu, v�voj humanit�rn�ch mis�, trendy v�voje HDP, p��padn� pod�l HDP v�novan� na sektor vzd�l�n� nebo zdravotnictv�, mno�stv� p��rodn�ch katastrof dle regionu, v�le�n� konflikty dle regionu nebo t� po�ty teroristick�ch �tok� dle data a regionu, mno�stv� t�by d�eva dle regionu, produkce CO2 dle regionu nebo spot�eba p��rodn�ch zdroj� dle regionu.
* Dal�� zaj�mavou mo�nost� je sna�it se vytvo�it u�ivatelsky p��v�tiv� rozhran�, kter� by v kontextu statistik migrace umo�nilo nahl�dnout na ud�losti, kter� byly pro zvolen� region v�znamn� ve zvolen�m �ase. Jin�mi slovy, nav�zat se na glob�ln� archiv zpr�v a m�t mo�nost nad n�m vykon�vat p��kazy jako 
`select * from [gdelt-bq:gdeltv2.events] where year=2014 and Actor1CountryCode='UKR' and sourceurl like '%ukraine%' LIMIT 20`
nap��klad skrze [GDELT 2.0 platformu](https://blog.gdeltproject.org/gdelt-2-0-our-global-world-in-realtime/) nebo skrze [GDELT 2.0 in Google BigQuery](https://bigquery.cloud.google.com/table/gdelt-bq:gdeltv2.events)
