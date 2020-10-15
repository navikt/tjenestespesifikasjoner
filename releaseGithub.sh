#!/bin/bash
set -e

TIME=$(TZ="Europe/Oslo" date +%Y.%m.%d-%H.%M)
COMMIT=$(git rev-parse --short=12 HEAD)
VERSION="1.$TIME-$COMMIT"
echo "Setting version $VERSION"

mvn -B versions:set -DnewVersion="$VERSION" >/dev/null
mvn -B versions:commit >/dev/null

echo "Running release"
mvn -B -X --settings maven-settings.xml deploy -Dmaven.wagon.http.pool=false -DretryFailedDeploymentCount=5 -pl :arbeidOgAktivitetVedtak-v1-tjenestespesifikasjon
