#!/bin/bash

python2 buildscripts/scons.py all &&
notify-send "Build complete" "Custom server running" &&
sudo build/opt/mongo/mongod -f /etc/mongod.conf
