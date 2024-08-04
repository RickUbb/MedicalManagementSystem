FROM openjdk:17-slim
VOLUME /tmp
COPY target/microservice-patient-0.0.1-SNAPSHOT.jar app_microservice-patient.jar
EXPOSE 8091
ENTRYPOINT ["java", "-jar", "app_microservice-patient.jar"]