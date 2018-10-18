[![Build Status](https://travis-ci.com/navikt/tjenestespesifikasjoner.svg?token=f9LTHkxUqzyjiE6pDoDQ&branch=master)](https://travis-ci.com/navikt/tjenestespesifikasjoner)

# Tjenestespesifikasjoner

Dette prosjektet inneholder tjenestespesifikasjoner for de tjenestene som NAV tilbyr internt.
De er maskinlesbare i form av WSDL/XSD/JSON-filer, og disse brukes som utgangspunkt for å
generere Javakode. Denne autogenererte koden blir kompilert og siden publisert, slik at konsumenter
kan bruke dem til å kommunisere med tjenestene.

## Bygging

`mvn clean install`
