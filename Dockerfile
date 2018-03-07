FROM mongo
WORKDIR /build
ADD . /build
RUN echo "deb http://ftp.us.debian.org/debian unstable main contrib non-free" > /etc/apt/sources.list.d/testing.list
RUN apt-get update
RUN apt-get install -y python2.7 git gcc-5 g++-5 python-pip python-dev libssl-dev
RUN pip install -r buildscripts/requirements.txt
RUN git status
RUN python2.7 buildscripts/scons.py -j $((2 * $(grep -c ^processor /proc/cpuinfo))) mongod --disable-warnings-as-errors=DISABLE-WARNINGS-AS-ERRORS
RUN strip --strip-all mongod

#FROM mongo-built

#FROM mongo
#RUN echo "deb http://ftp.us.debian.org/debian unstable main contrib non-free" > /etc/apt/sources.list.d/testing.list
#RUN apt-get update
#RUN apt-get install -y nmap
#COPY --from=0 /build/mongod /usr/bin/mongod
# ENTRYPOINT ["docker-entrypoint.sh"]
# CMD ["bash", "-c", "'mongod --logpath /proc/1/fd/2 | tee /proc/1/fd/1 | ncat -lkp $PROVENANCE_PORT'"]	
# ENTRYPOINT ["docker-entrypoint.sh"]

#EXPOSE 27017
# CMD ["mongod"]
