#Kassensystem der Ostmark

*todo: name*

## Projektdateien generieren

Das Kassensystem  benutzt [gradle](https://gradle.org/) als build-system.

###eclipse

Projektdateien für eclipse werden mit `./gradlew eclipse` erstellt.
(`gradlew.bat` für windows)

Posix:

```sh
./gradlew idea
```

Windows CMD:

```bat
gradlew.bat idea
```

###idea

## Projekt compilieren

IDEs können das Projekt nativ kompilieren.
Ohne IDE wird das Projekt mit

```
./gradlew build
```

ausgeführt.