FROM mongo
WORKDIR /build
ADD . /build
RUN echo "deb http://ftp.us.debian.org/debian unstable main contrib non-free" > /etc/apt/sources.list.d/testing.list
RUN apt-get update
RUN apt-get install -y python2.7 git gcc-5 g++-5 python-pip python-dev
RUN pip install -r buildscripts/requirements.txt
RUN git status
RUN python2.7 buildscripts/scons.py -j $((2 * $(grep -c ^processor /proc/cpuinfo))) mongod --disable-warnings-as-errors=DISABLE-WARNINGS-AS-ERRORS
RUN strip --strip-all mongod

#FROM 999123763a18

# Use an official Python runtime as a parent image
#FROM ubuntu

#RUN apt-get update
#RUN apt-get install -y apt-transport-https
#RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2930ADAE8CAF5059EE73BB4B58712A2291FA4AD5
#RUN echo "deb [ arch=amd64,arm64 ] https://repo.mongodb.org/apt/ubuntu xenial/mongodb-org/3.6 multiverse" | tee /etc/apt/sources.list.d/mongodb-org-3.6.list
#RUN apt-get update

#RUN apt-get update && apt-get install -y nmap mongodb-org-shell

# Set the working directory to /app
#WORKDIR /app

#COPY --from=0 /build/mongod ./
#ADD static/* ./

#RUN mkdir log
#RUN mkdir data

# Run app.py when the container launches
#EXPOSE 27017
#EXPOSE 24109
#CMD ./entry.sh

FROM mongo
RUN echo "deb http://ftp.us.debian.org/debian unstable main contrib non-free" > /etc/apt/sources.list.d/testing.list
RUN apt-get update
RUN apt-get install -y nmap
COPY --from=0 /build/mongod /usr/bin/mongod
CMD mongod --logpath /dev/null --auth | tee /proc/1/fd/1 | ncat -lkp $PROVENANCE_PORT
