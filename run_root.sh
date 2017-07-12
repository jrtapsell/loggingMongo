#!/bin/bash
service mongodb stop
killall mongod 2> /dev/null
sleep 10
build/opt/mongo/mongod -f /etc/mongod.conf | nc -k -l 1234

