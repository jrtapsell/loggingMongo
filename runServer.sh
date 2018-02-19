#!/bin/bash

# Runs one server
# Takes 1 argument
# - The name of the server to run
echo -en "\033]0;Running server: $1\a"
cd servers
cd $1
./run.sh
