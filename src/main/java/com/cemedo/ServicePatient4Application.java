package com.cemedo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ServicePatient4Application {

	public static void main(String[] args) {
		SpringApplication.run(ServicePatient4Application.class, args);
	}

}
