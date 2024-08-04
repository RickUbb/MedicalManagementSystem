FROM openjdk:17-slim
VOLUME /tmp
COPY target/microservice-doctor-0.0.1-SNAPSHOT.jar app_microservice-doctor.jar
EXPOSE 8092
ENTRYPOINT ["java", "-jar", "app_microservice-doctor.jar"]