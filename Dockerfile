# Build stage
FROM gradle:7.4-jdk17 AS build
ARG PORT
ENV PORT=$PORT

COPY . /src
WORKDIR /src
RUN gradle bootJar --no-daemon

# Package stage
FROM openjdk:17.0.2-jdk-bullseye
ENV PORT=$PORT
COPY --from=build /src/build/libs/ezvitrine-*.jar /app/app.jar
EXPOSE $PORT
ENTRYPOINT ["java","-Dserver.address=0.0.0.0","-jar","/app/app.jar"]
