FROM openjdk:17-jdk-slim
WORKDIR /usr/app
COPY target/sl_jenkins-0.0.1-SNAPSHOT.jar .
