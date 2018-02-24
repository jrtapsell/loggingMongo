FROM ubuntu AS build 
WORKDIR /build
RUN apt-get update
RUN apt-get install -y python2.7 git gcc g++ python-pip
RUN pip install -r buildscripts/requirements.txt
ADD . /build
RUN git status
#RUN python2.7 buildscripts/scons.py -j 8 mongod


# Use an official Python runtime as a parent image
FROM ubuntu

RUN apt-get update
RUN apt-get install -y mongodb-clients
RUN apt-get install -y nmap

# Set the working directory to /app
WORKDIR /app

COPY --from=build mongod ./
ADD static/* ./

RUN mkdir log
RUN mkdir data

RUN ./makeUser.sh

# Run app.py when the container launches
EXPOSE 27017
EXPOSE 24109
CMD /bin/bash -c './mongod -f mongod.conf --auth | tee /proc/1/fd/1 | ncat -lkp 24109'
