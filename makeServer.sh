#!/bin/bash
cp -r template servers/$1
echo "  port: $2" >> servers/$1/mongod.conf
echo "echo Running server $1" >> servers/$1/run.sh
echo "../../mongod -f mongod.conf | tee audit/mirror.txt | tee /dev/tty | nc -lp $3" >> servers/$1/run.sh
