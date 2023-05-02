FROM openjdk:17-alpine
LABEL maintainer=root
WORKDIR /app
COPY spring-0.0.1-SNAPSHOT.jar .
ENTRYPOINT java -jar spring-0.0.1-SNAPSHOT.jar
EXPOSE 8877
