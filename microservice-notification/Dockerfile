FROM openjdk:17-slim
VOLUME /tmp
COPY target/microservice-notification-0.0.1-SNAPSHOT.jar app_microservice-notification.jar
EXPOSE 8096
ENTRYPOINT ["java", "-jar", "app_microservice-notification.jar"]