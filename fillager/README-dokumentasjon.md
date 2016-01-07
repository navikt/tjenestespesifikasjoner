## Automatisk dokumentasjon av WSDL for fillager-tjenesten

I denne module er det gjort en test av automatisk generering av dokumentasjon basert på wsdl. Dokumentasjonen lastes opp som en attachment på en spesifisert Confluence-side.

### Prosessen

Prosessen igangsettes ved å kjøre `mvn clean install`. Deretter er prosessen todelt. 
 
* En html-side basert på wdsl generers i target-mappa
* Denne html lastes opp på en spesifisert pageid i confluence

#### Html-generering

Dette skjer ved hjelp av maven-plugin `xml-maven-plugin` som scanner etter `*.wsdl` og deretter kjører en XSL-transformsjon basert på `wsdl-viewer.xsl`.  
Den genererte html-fila legges på default-location `/target/generated-resources/xml/xslt`.

#### Opplasting til Confluence

Opplasting til vedlegg på Confluence skjer via maven-plugin `exec-maven-plugin`. Denne kjører først `npm install` og deretter sciptet `upload-attachment.js`. 
Det oppretter vedlegget dersom det ikke finnes fra før, men oppdaterer innholdet dersom det finnes et vedlegg med likt filnavn. Opplastingen krever at pagid for siden som 
skal få vedlegget spesifiseres i pom'en. Opplasting vil kun ta første fil den finner under `/target/generated-resources/xml/xslt`.

### Fremover

Ettersom dette kun er en test for å se hvordan dette kan gjennomføres er det problemer som ikke er løst i denne første implementasjonen. 

* Hvordan skal disse filene deles på en måte som gjør at flere kan benytte seg av det?
    * Hvordan kunne spesifisere confluence-side pr wsdl? 
* Holder det å forvente wsdlen under `src/main/resource` eller bør dette kunne tilpasses? 
* Fjerne innsjekkede bruker?
* Bør det settes opp egne byggjobber som kjører dette slik at vi er sikre på at dokumentasjonen alltid er oppdatert?
    * Hvordan bør dette i så fall gjennomføres? 
* Bør det kjøres på clean install som nå eller bør det være en egen byggjobb? 

For en bedre brukervennlighet rundt visningen bør man ta tak i saken [VRK-3791](http://jira/browse/VRK-3791).

#### Tilhørende filer

* `package.json`
* `upload-attachment.js`
* `wsdl-viewer.xsl`
* Deler av `pom.xml`

`wsdl-viewer.xsl` er lisensiert under APACHE 2.0