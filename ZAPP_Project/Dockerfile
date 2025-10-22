# -------- 1. Build Vue frontend --------
FROM node:18 AS build
WORKDIR /app

# Copy only package files first (better caching)
COPY package*.json ./

# Use npm ci for reproducible & faster installs
RUN npm ci

# Copy rest of the source code
COPY . .

# Build the app
RUN npm run build


# -------- 2. Serve with Nginx --------
FROM nginx:alpine

# Copy built files from build stage
COPY --from=build /app/dist /usr/share/nginx/html

# Expose port 80
EXPOSE 80

# Run nginx in foreground
CMD ["nginx", "-g", "daemon off;"]
