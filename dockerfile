FROM adoptopenjdk/openjdk11:alpine-jre
COPY ./target/handbook-0.0.1-SNAPSHOT.jar ./handbook.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "handbook.jar"]