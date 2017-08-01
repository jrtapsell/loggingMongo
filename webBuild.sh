#!/bin/bash
git pull
rm mongod
wget http://$(echo $1).ngrok.io/mongod
