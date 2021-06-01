FROM openjdk:8
EXPOSE 8080
COPY /target/hello-world.jar .
ENTRYPOINT ["java","-jar","/hello-world.jar"]

