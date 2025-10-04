FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
COPY .env .env
ENTRYPOINT ["java","-jar","/app.jar"]