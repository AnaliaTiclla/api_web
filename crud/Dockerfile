FROM openjdk:22-jdk-slim
ARG JAR_FILE=target/crud-0.0.1-SNAPSHOT.jar 
COPY ${JAR_FILE} app_crud.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar","app_crud.jar" ]