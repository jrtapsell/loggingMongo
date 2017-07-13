#!/bin/bash
./build.sh &&
notify-send "Build complete" "Custom server running" &&
aplay ~/Downloads/Pling-KevanGC-1485374730.wav &&
./run.sh
