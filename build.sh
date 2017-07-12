#!/bin/bash
export start=$(date +%s)
python2 buildscripts/scons.py all
export end=$(date +%s)
export delta=$(expr $end - $start)
echo $start > timeLog/start
echo $end > timeLog/end
echo $delta > timeLog/delta
