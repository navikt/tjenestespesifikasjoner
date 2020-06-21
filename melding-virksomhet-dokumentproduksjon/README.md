melding-virksomhet-dokumentproduksjon
=====================================

XML grensesnitt for dokumentproduksjon gjennom DOKSYS.

# Endringslogg
Alle nevneverdige endringer i dette prosjektet blir dokumentert i denne filen.

Formatet er basert på [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)

## [1.2.2] - 2018-09-28

### Endret
- La til 'berik' boolean attributt til Aktoer.

## [1.2.1] - 2018-09-28

### Endret
- Feltet `utletRegisterInfo` på typen `Dokumentbestillingsinformasjon` er satt til `@Deprecated` i den JAXB genererte koden.
- Fjernet `utledRegisterInfo` fra typen `Vedleggbestillingsinformasjon`.

## [1.2.0] - 2018-09-24 - Skal ikke brukes

### Endret
- La til støtte for produksjon av vedlegg til hoveddokumentet. Spesifiseres ved hjelp av `Vedleggbestillingsinformasjon`.

## [1.1.1] - 2018-09-04

### Endret
- Endret sjekk av landkoder for å godta `???` av legacy årsaker. Skal ikke brukes av konsumenter utenfor Dokument.

## [1.1.0] - 2018-08-17

### Endret
- La til `ustrukturertTittel` for produksjon i dokumentbestilling av hoveddokument.

## [1.0.4] - 2018-06-19

### Endret
- Laget workaround for validering av XML, slik at brevdata ikke valideres i første omgang. Doksys validerer mot `produserikkeredigerbartdokument-skipbrevdata.xsd`. På 

## [1.0.3] - 2018-06-18

### Endret
- Navn på `Person` og `Organisasjon` settes til ikke påkrevd. Elementene er i praksis betinget påkrevd.

## [1.0.2] - 2018-06-18

### Endret
- Setter `processContents=skip` på brevdata anyelement for å unngå validering av dette. 

## [1.0.1] - 2018-06-07

### Fikset
- Fikset elementnavn i `@XmlRootElement` for JAXB av `ProduserIkkeRedigerbartDokument`.

## [1.0.0] - 2018-05-24

### Lagt til
- Første versjon av meldingsgrensesnitt for dokumentproduksjon med støtte for hoveddokument.
