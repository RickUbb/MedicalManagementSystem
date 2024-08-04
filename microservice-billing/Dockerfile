FROM openjdk:17-slim
VOLUME /tmp
COPY target/microservice-billing-0.0.1-SNAPSHOT.jar app_microservice-billing.jar
EXPOSE 8094
ENTRYPOINT ["java", "-jar", "app_microservice-billing.jar"]