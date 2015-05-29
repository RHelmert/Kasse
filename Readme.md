#Kassensystem der Ostmark

*todo: name*

## Projektdateien generieren

Das Kassensystem  benutzt [gradle](https://gradle.org/) als build-system.

###eclipse

Posix:

```sh
./gradlew eclipse
```

Windows CMD:

```bat
gradlew.bat eclipse
```

###idea

Posix:

```sh
./gradlew idea
```

Windows CMD:

```bat
gradlew.bat idea
```

## Projekt compilieren

IDEs können das Projekt nativ kompilieren.
Ohne IDE wird das Projekt mit

```
./gradlew build
```

ausgeführt.

