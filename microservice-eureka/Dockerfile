FROM openjdk:17-slim
VOLUME /tmp
COPY target/microservice-eureka-0.0.1-SNAPSHOT.jar app_microservice-eureka.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","app_microservice-eureka.jar"]