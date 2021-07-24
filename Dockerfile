FROM openjdk:8-jdk-alpine
COPY target/SpringWebBoot-0.0.1-SNAPSHOT.jar SpringWebBoot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "SpringWebBoot-0.0.1-SNAPSHOT.jar"]