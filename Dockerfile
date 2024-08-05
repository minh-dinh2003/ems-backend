FROM maven:4.0.0-openjdk-17 AS build
COPY . . 
RUN mvn clean package -DskipTests

FROM openjdk:17.0.10-jdk
COPY --from=build /target/ems-backend-0.0.1-SNAPSHOT.jar ems-backend.jar

EXPOSE 8080
ENTRYPOINT [ "java","-jar","ems-backend.jar" ]