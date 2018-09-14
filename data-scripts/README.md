# hackuj-stat

Skripty pro hackathon Hackuj stát 2018.

## Použití

### Data o migraci z ČSÚ 

Stažení [dat o migraci z ČSÚ](https://www.czso.cz/csu/czso/cizinci-podle-statniho-obcanstvi-veku-a-pohlavi) pomocí [Leiningenu](https://leiningen.org):

```sh
lein run \
  -m hackuj-stat.csu-migration \
  - \
  migrace.csv.gz
```

## License

Copyright © 2018 Jindřich Mynarz

Distributed under the Eclipse Public License version 1.0.
