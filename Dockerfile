FROM ubuntu:latest
LABEL authors="boo"

ENTRYPOINT ["top", "-b"]
