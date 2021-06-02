FROM openjdk:8
EXPOSE 8080
COPY /target/movie-service.jar movie-service.jar
ENTRYPOINT ["java","-jar","/movie-service.jar"]

