package com.avijit.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServerSideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerSideApplication.class, args);
	}

}
