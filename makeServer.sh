#!/bin/bash

# Takes the following arguments
# - The name of the server
# - The port to run the mongo server on
# - The port to stream audit events out on

cp -r template servers/$1
cd servers/$1
echo "  port: $2" >> mongod.conf
echo "echo Running server $1" >> run.sh
echo "../../mongod -f mongod.conf --auth | tee -a audit/mirror.log | tee /dev/tty | ncat -lkp $3" >> run.sh

../../mongod -f mongod.conf >> audit/mirror.log &
export mongoServ=$!
sleep 5
mongo -port $2 < ../../makeUser.js > /dev/null

kill -SIGINT $mongoServ
