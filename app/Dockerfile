FROM alpine/java:21-jdk

USER root

RUN addgroup -S spring && adduser -S spring -G spring

USER spring:spring

COPY build/libs/*.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]