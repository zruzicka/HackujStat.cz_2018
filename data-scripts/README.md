# hackuj-stat

Skripty pro hackathon Hackuj stát 2018.

## Použití

### Data o cizincích z ČSÚ 

Stažení [dat o cizincích z ČSÚ](https://www.czso.cz/csu/czso/cizinci-podle-statniho-obcanstvi-veku-a-pohlavi) pomocí [Leiningenu](https://leiningen.org):

```sh
lein run \
  -m hackuj-stat.csu-foreigners \
  foreigners.csv.gz
```

## Číselník státního občanství z ČSÚ

URL: <http://apl.czso.cz/iSMS/cisdet.jsp?kodcis=3228>

Stažení anglické verze s výběrem relevantních sloupců v CSV:

```sh
lein run \
  -m hackuj-stat.citizenship-code-list \
  citizenship_code_list.csv
```

## License

Copyright © 2018 Jindřich Mynarz

Distributed under the Eclipse Public License version 1.0.
