package com.Bike.TypeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TypeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TypeServiceApplication.class, args);
	}

}
