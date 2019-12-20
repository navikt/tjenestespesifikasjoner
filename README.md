[![Build Status](https://github.com/navikt/tjenestespesifikasjoner/workflows/Release%20(Github%20Package%20Registry)/badge.svg)](https://github.com/navikt/tjenestespesifikasjoner/actions?query=workflow%3A%22Release+%28Github+Package+Registry%29%22)

# Tjenestespesifikasjoner

Dette prosjektet inneholder tjenestespesifikasjoner for de tjenestene som NAV tilbyr internt.
De er maskinlesbare i form av WSDL/XSD/JSON-filer, og disse brukes som utgangspunkt for å
generere Javakode. Denne autogenererte koden blir kompilert og siden publisert, slik at konsumenter
kan bruke dem til å kommunisere med tjenestene.

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
