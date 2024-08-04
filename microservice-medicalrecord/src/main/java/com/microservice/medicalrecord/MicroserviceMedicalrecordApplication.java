package com.microservice.medicalrecord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceMedicalrecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceMedicalrecordApplication.class, args);
	}

}
