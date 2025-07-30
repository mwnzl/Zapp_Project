#!/bin/bash

# Start-Skript für Spring Boot App (Backend)
echo "Starte Spring Boot Anwendung..."

# Optional: exportiere env-Variablen, falls notwendig
# export SPRING_DATASOURCE_URL=
# export SPRING_DATASOURCE_USERNAME=
# export SPRING_DATASOURCE_PASSWORD=

# App starten
java -jar app.jar
