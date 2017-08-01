#!/bin/bash
export start=$(date +%s)
python2 buildscripts/scons.py -j 8 mongod
export end=$(date +%s)
export delta=$(expr $end - $start)
echo $start > timeLog/start
echo $end > timeLog/end
echo $delta > timeLog/delta
echo $start,$end,$delta >> timeLog/all.csv
rm mongod.gz
gzip -k mongod
