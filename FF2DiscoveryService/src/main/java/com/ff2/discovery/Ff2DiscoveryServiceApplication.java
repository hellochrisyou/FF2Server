package com.ff2.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ff2DiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ff2DiscoveryServiceApplication.class, args);
	}

}
