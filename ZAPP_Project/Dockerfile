# -------- 1. Build Vue frontend --------
FROM node:18 AS frontend-builder
WORKDIR /app
COPY ZAPP_Project/ .    # Kopiere das Vue-Projekt
RUN npm install && npm run build

# -------- 2. Build Spring Boot backend --------
FROM maven:3.9.6-eclipse-temurin-17 AS backend-builder
WORKDIR /app
COPY backend/ .         # Kopiere das Spring Boot Backend
RUN mvn clean package -DskipTests

# -------- 3. Final runtime image --------
FROM eclipse-temurin:17
WORKDIR /app

# Kopiere das JAR aus dem vorherigen Stage
COPY --from=backend-builder /app/target/*.jar app.jar

# Kopiere das gebaute Vue-Frontend ins Spring Static-Verzeichnis
RUN mkdir -p /app/public
COPY --from=frontend-builder /app/dist/ /app/public/

# Railway setzt die PORT-Umgebungsvariable
ENV PORT=8080

# Starte Spring Boot und setze den Port dynamisch
CMD ["java", "-Dserver.port=${PORT}", "-Dspring.web.resources.static-locations=file:/app/public/", "-jar", "app.jar"]
