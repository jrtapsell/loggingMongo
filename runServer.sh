echo -en "\033]0;Running server: $1\a"
cd servers
cd $1
./run.sh
