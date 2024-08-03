FROM openjdk:17-slim
VOLUME /tmp
COPY target/microservice-config-0.0.1-SNAPSHOT.jar app_microservice-config.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","app_microservice-config.jar"]
