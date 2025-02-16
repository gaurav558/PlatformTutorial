FROM 21-alpine3.21-jdk

LABEL authors="cars24"

# Set the working directory
WORKDIR /usr/src/app

# Copy the application jar
COPY build/libs/Platform-Tutorial-0.0.1-SNAPSHOT.jar /usr/src/app/app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

# Expose the port
EXPOSE 8080