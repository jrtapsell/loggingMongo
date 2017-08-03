#!/bin/bash
cp -r template servers/$1
cd servers/$1
echo "  port: $2" >> mongod.conf
echo "echo Running server $1" >> run.sh
echo "../../mongod -f mongod.conf --auth | tee -a audit/mirror.log | tee /dev/tty | ncat -lkp $3" >> run.sh

../../mongod -f mongod.conf >> audit/mirror.log &
export mongoServ=$!
sleep 5
mongo -port $2 < ../../makeUser.js > /dev/null

kill $mongoServ
