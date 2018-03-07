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