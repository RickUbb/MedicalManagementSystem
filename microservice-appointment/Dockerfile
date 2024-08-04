FROM openjdk:17-slim
VOLUME /tmp
COPY target/microservice-appointment-0.0.1-SNAPSHOT.jar app_microservice-appointment.jar
EXPOSE 8093
ENTRYPOINT ["java", "-jar", "app_microservice-appointment.jar"]