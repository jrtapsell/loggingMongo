#!/bin/bash
./makeUser.sh
./mongod -f mongod.conf --auth | tee /proc/1/fd/1 | ncat -lkp 24109