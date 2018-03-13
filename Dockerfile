FROM gradle:4.6-jdk8-alpine

USER root
RUN set -ex && \
    mkdir -p /home/gradle/build && \
    chown gradle:gradle /home/gradle/build

USER gradle
COPY hypercube/ /home/gradle/
