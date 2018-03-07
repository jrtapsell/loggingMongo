FROM mongo-built

#FROM mongo
RUN echo "deb http://ftp.us.debian.org/debian unstable main contrib non-free" > /etc/apt/sources.list.d/testing.list
RUN apt-get update
RUN apt-get install -y nmap
COPY --from=0 /build/mongod /usr/bin/mongod
# ENTRYPOINT ["docker-entrypoint.sh"]
# CMD ["bash", "-c", "'mongod --logpath /proc/1/fd/2 | tee /proc/1/fd/1 | ncat -lkp $PROVENANCE_PORT'"]	
# ENTRYPOINT ["docker-entrypoint.sh"]

EXPOSE 27017
# CMD ["mongod"]