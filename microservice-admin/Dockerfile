FROM openjdk:17-slim
VOLUME /tmp
COPY target/microservice-admin-0.0.1-SNAPSHOT.jar app_microservice-admin.jar
EXPOSE 8097
ENTRYPOINT ["java", "-jar", "app_microservice-admin.jar"]