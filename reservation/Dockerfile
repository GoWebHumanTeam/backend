# Maven
FROM openjdk:17-jdk

CMD ["./mvnw", "clean", "package"]

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]