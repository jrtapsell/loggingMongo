#!/bin/bash
./mongod -f mongod.conf > /dev/null&
export mongoServ=$!
sleep 5
mongo -port 27017 --eval "var username='$USERNAME';var password='$PASSWORD';" makeUser.js

kill -SIGINT $mongoServ
sleep 5
