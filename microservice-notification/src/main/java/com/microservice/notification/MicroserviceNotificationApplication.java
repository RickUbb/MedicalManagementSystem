package com.microservice.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceNotificationApplication.class, args);
	}

}
