FROM openjdk:17-slim
VOLUME /tmp
COPY target/microservice-medicalrecord-0.0.1-SNAPSHOT.jar app_microservice-medicalrecord.jar
EXPOSE 8095
ENTRYPOINT ["java", "-jar", "app_microservice-medicalrecord.jar"]