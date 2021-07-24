**Spring boot application with Docker image**

Basic requisite is to create a Dockerfile in the root of the application

**Format**
```dockerfile
FROM <give Java version>
COPY <src> <target>
EXPOSE <port>
ENTRYPOINT [<all commands comma separated>]
```

**Example**
```dockerfile
FROM openjdk:8-jdk-alpine
COPY target/SpringWebBoot-0.0.1-SNAPSHOT.jar SpringWebBoot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "SpringWebBoot-0.0.1-SNAPSHOT.jar"]
```

To build docker image issue the below command:
>
> 
> docker build -t <tagname> .

To show list of images created
>docker images

To run the image
>docker run -p 9000:8080 imageName,
> where 9000 is the external port and 8080 internal.


Open browser and hit the below to see the results
```http request
https://localhost:9000/greeting
```
