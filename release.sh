#!/bin/bash
set -e

apt-get update
apt-get install ca-certificates

echo "GPG version"
gpg --version
echo $GPG_KEY > key.gpg
echo "Importing GPG key into keyring"
gpg --yes --batch --fast-import key.gpg

TIME=$(TZ="Europe/Oslo" date +%Y.%m.%d-%H.%M)
COMMIT=$(git rev-parse --short=12 HEAD)
VERSION="1.$TIME-$COMMIT"
echo "Setting version $VERSION"

mvn -B versions:set -DnewVersion="$VERSION"
mvn -B versions:commit

echo "Running release"
mvn -T 12 -B --settings maven-settings.xml deploy -Prelease # -DskipTests=true
