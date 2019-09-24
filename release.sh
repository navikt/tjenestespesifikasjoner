#!/bin/bash
set -e

echo "Importing GPG key into keyring"
echo $GPG_KEY_BASE64 | base64 -d | gpg --yes --batch --fast-import

TIME=$(TZ="Europe/Oslo" date +%Y.%m.%d-%H.%M)
COMMIT=$(git rev-parse --short=12 HEAD)
VERSION="1.$TIME-$COMMIT"
echo "Setting version $VERSION"

mvn -B versions:set -DnewVersion="$VERSION"
mvn -B versions:commit

echo "Running release"
export GPG_TTY=$(tty) && mvn -B --settings maven-settings.xml deploy -Prelease # -DskipTests=true
