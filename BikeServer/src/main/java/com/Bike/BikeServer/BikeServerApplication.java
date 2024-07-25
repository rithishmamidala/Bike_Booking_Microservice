package com.Bike.BikeServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BikeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikeServerApplication.class, args);
	}

}
