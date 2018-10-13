FROM openjdk:8-jdk-alpine

LABEL maintainer="nadim.sumon11@gmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=./target/spring-boot-hello-world-example-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} hello-demo.jar

ENTRYPOINT ["java","-jar","/hello-demo.jar"]
