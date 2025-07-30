# -------- 1. Build Vue frontend --------
FROM node:18 AS frontend-builder
WORKDIR /app
COPY ZAPP_Project/ .
RUN npm install && npm run build

# -------- 2. Build Spring Boot backend --------
FROM maven:3.9.6-eclipse-temurin-17 AS backend-builder
WORKDIR /app
COPY backend/ .
RUN mvn clean package -DskipTests

# -------- 3. Final image --------
FROM eclipse-temurin:17
WORKDIR /app

# Copy backend JAR
COPY --from=backend-builder /app/target/*.jar app.jar

# Copy built frontend (Vue) into static folder
COPY --from=frontend-builder /app/dist /app/public

EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
