#!/bin/bash -e
if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    echo "Decrypting GPG key"
    openssl aes-256-cbc -K $encrypted_a973f24e4f75_key -iv $encrypted_a973f24e4f75_iv \
    -in travis/codesigning.asc.enc -out travis/codesigning.asc -d

    echo "Importing GPG key into keyring"
    gpg --fast-import travis/codesigning.asc

    TIME=$(TZ="Europe/Oslo" date +%Y.%m.%d-%H.%M)
    COMMIT=$(git rev-parse --short=12 HEAD)
    VERSION="1.$TIME-$COMMIT-SNAPSHOT"
    echo "Setting version $VERSION"

    mvn versions:set -DnewVersion="$VERSION"
    mvn versions:commit

    echo "Running release"
    mvn --settings travis/settings.xml deploy -Prelease -DskipTests=true
fi
