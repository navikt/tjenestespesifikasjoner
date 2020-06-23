#!/bin/bash

function update() {
  mkdir -p tmp
  wget -O tmp/wsdl.zip $2
  unzip -d "$1/src/main/wsdl" tmp/wsdl.zip
  rm tmp/wsdl.zip
  rm -r tmp
}

# update "arbeidsevnevurdering-v1-tjenestespesifikasjon" "http://maven.adeo.no/nexus/content/groups/public/no/nav/tjenester/fim/nav-fim-arbeidsevnevurdering-v1-tjenestespesifikasjon/1.0.0/nav-fim-arbeidsevnevurdering-v1-tjenestespesifikasjon-1.0.0.zip"
# update "oppgavebegrenset-v1-tjenestespesifikasjon" "http://maven.adeo.no/nexus/content/groups/public/no/nav/tjenester/nav-oppgaveBegrenset-v1-tjenestespesifikasjon/1.0.11/nav-oppgaveBegrenset-v1-tjenestespesifikasjon-1.0.11.zip"
# update "behandleinntekt-v1-tjenestespesifikasjon" "http://maven.adeo.no/nexus/content/groups/public/no/nav/tjenester/fim/nav-fim-behandleInntekt-v1-tjenestespesifikasjon/1.1.0/nav-fim-behandleInntekt-v1-tjenestespesifikasjon-1.1.0.zip"
# update "oppgavebegrenset-v1-tjenestespesifikasjon" "http://maven.adeo.no/nexus/content/groups/public/no/nav/tjenester/nav-oppgaveBegrenset-v1-tjenestespesifikasjon/1.0.11/nav-oppgaveBegrenset-v1-tjenestespesifikasjon-1.0.11.zip"
# update "dokumentproduksjon-v3-tjenestespesifikasjon" "http://maven.adeo.no/nexus/service/local/artifact/maven/redirect?a=nav-dokumentproduksjon-v3-tjenestespesifikasjon&e=zip&g=no.nav.tjenester&r=m2internal&v=3.3.0"
