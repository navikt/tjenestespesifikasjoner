#!/bin/bash
echo "Importing GPG key into keyring"
echo $GPG_KEY | gpg --fast-import

TIME=$(TZ="Europe/Oslo" date +%Y.%m.%d-%H.%M)
COMMIT=$(git rev-parse --short=12 HEAD)
VERSION="1.$TIME-$COMMIT"
echo "Setting version $VERSION"

mvn -B versions:set -DnewVersion="$VERSION"
mvn -B versions:commit

echo "Running release"
mvn -T 12 -B --settings maven-settings.xml deploy -Prelease # -DskipTests=true
