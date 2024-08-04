package com.microservice.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDoctorApplication.class, args);
	}

}
