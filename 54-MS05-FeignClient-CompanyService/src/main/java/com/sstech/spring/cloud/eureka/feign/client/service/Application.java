package com.sstech.spring.cloud.eureka.feign.client.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient  //Register with Eureka Server
@EnableFeignClients //Generate Proxy Class
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
