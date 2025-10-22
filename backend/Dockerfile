# -------- 1. Build Vue frontend --------
FROM node:18 AS frontend-builder
WORKDIR /app
COPY Zapp_Project/ .
RUN npm install && npm run build

# -------- 2. Build Spring Boot backend --------
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Zertifikate aktualisieren (Debian/Ubuntu-basiert)
RUN apt-get update && apt-get install -y ca-certificates

COPY . .
RUN mvn clean package -DskipTests

# -------- 3. Final image --------
FROM eclipse-temurin:17
WORKDIR /app

# Copy backend JAR
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
