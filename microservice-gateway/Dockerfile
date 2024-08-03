FROM openjdk:17-slim
VOLUME /tmp
COPY target/microservice-gateway-0.0.1-SNAPSHOT.jar app_microservice-gateway.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app_microservice-gateway.jar"]
