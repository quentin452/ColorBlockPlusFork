#!/bin/bash

cd "$(dirname "$0")"
source .bash_util



while true; do
    ./generator.py && newline && echo 'Building codes…' && newline && ./gradlew build && newline && ./generator.py --packaging
    *echo '* REBUILD [PRESS ENTER] *'
    read INPUT
done
