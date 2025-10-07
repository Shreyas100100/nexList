# Build stage
FROM maven:3.8.6-eclipse-temurin-17-alpine AS builder

WORKDIR /app

# Copy dependency files first for better caching
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source and build
COPY src ./src
RUN mvn clean package -DskipTests -B

# Runtime stage
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy jar from build stage
COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

# Use exec form and optimized JVM settings
ENTRYPOINT ["java", "-jar", "app.jar"]