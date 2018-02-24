FROM ubuntu
WORKDIR /build
ADD . /build
RUN apt-get update && apt-get install -y python2.7 git gcc g++ python-pip && pip install -r buildscripts/requirements.txt
RUN git status
RUN python2.7 buildscripts/scons.py -j $((2 * $(grep -c ^processor /proc/cpuinfo))) mongod


# Use an official Python runtime as a parent image
FROM ubuntu

RUN apt-get update
RUN apt-get install -y mongodb-clients
RUN apt-get install -y nmap

# Set the working directory to /app
WORKDIR /app

COPY --from=0 /build/mongod ./
ADD static/* ./

RUN mkdir log
RUN mkdir data

RUN ./makeUser.sh

# Run app.py when the container launches
EXPOSE 27017
EXPOSE 24109
CMD /bin/bash -c './mongod -f mongod.conf --auth | tee /proc/1/fd/1 | ncat -lkp 24109'
