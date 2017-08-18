#!/bin/bash

echo ">>> Removing old servers"

rm -rf servers/local;
rm -rf servers/localProv;
rm -rf servers/shadow;

echo ">>> Making servers"

./makeServer.sh local 1234 1235;
./makeServer.sh localProv 2345 3456;
./makeServer.sh shadow 5678 6789;

echo ">>> Waiting for setup servers to die"

sleep 5;

echo ">>> Starting runtime servers"

screen -S local -d -m ./runServer.sh local;
screen -S localProv -d -m ./runServer.sh localProv;
screen -S shadow -d -m ./runServer.sh shadow;
