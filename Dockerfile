FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
EXPOSE ${PORT:-10000}
ENTRYPOINT ["java","-Dserver.port=${PORT:-10000}","-jar","/app.jar"]