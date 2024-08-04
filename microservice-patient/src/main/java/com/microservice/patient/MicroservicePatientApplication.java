package com.microservice.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicePatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicePatientApplication.class, args);
	}

}