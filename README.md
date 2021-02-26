[![](https://jitpack.io/v/navikt/tjenestespesifikasjoner.svg)](https://jitpack.io/#navikt/tjenestespesifikasjoner)

# Tjenestespesifikasjoner

Dette prosjektet inneholder tjenestespesifikasjoner for de tjenestene som NAV tilbyr internt.
De er maskinlesbare i form av WSDL/XSD/JSON-filer, og disse brukes som utgangspunkt for å
generere Javakode. Denne autogenererte koden blir kompilert og siden publisert, slik at konsumenter
kan bruke dem til å kommunisere med tjenestene.

## Bruk

[Tjenestespesifikasjoner er nå tilgjengelig på JitPack.](https://jitpack.io/#navikt/tjenestespesifikasjoner)

### Gradle

```
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.navikt.tjenestespesifikasjoner:navn-på-modul:Tag'
}
```

### Maven

```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	
	<dependency>
	    <groupId>com.github.navikt.tjenestespesifikasjoner</groupId>
	    <artifactId>navn-på-modul</artifactId>
	    <version>Tag</version>
	</dependency>
```



## Bygging

Java 8 trenges pga `javax.xml.bind.*` bygg virker ikke lenger med Java versjon >= 9.
https://stackoverflow.com/questions/43574426/how-to-resolve-java-lang-noclassdeffounderror-javax-xml-bind-jaxbexception-in-j

`mvn clean install`

## Gjøre endringer, release

For å endre spesifikasjoner, lag en branch. Kjør bygget lokalt, da vil du
få siste endringer med `1-SNAPSHOT` som versjon. Test med en konsument at
endringene fungerer (sett versjon av tjenestespesifikasjoner til `0-SNAPSHOT` i konsumenten.)
Når testingen er ferdig, send en pull request til dette repoet.

Hver branch og pull request vil gå gjennom et CI-bygg.
Etter at en pull request er merget til master-branchen, vil
CI automatisk gjøre en release av hele repoet til Maven Central.
Alle modulene i dette repoet får samme versjonsnummer.
Versjonsnummeret til releasen blir `1.YYYY.MM.DD-HH-MM-commithash`.
