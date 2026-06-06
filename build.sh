#!/bin/bash

# Compile all Java files
javac *.java

if [ $? -eq 0 ]; then
    echo "Compiled successfully. Run 'java Main' to execute."
else
    echo "Compilation failed!"
    exit 1
fi
