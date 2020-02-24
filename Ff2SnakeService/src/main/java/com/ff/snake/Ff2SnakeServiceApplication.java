package com.ff.snake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ff2SnakeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ff2SnakeServiceApplication.class, args);
	}

}
