#!/bin/bash
service mongodb stop
killall mongod 2> /dev/null
echo "Spinning up"
sleep 10
echo "Server starting"
build/opt/mongo/mongod -f /etc/mongod.conf | nc -k -l 1234

