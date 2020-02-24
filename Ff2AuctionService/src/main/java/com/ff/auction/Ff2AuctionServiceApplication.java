package com.ff.auction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ff2AuctionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ff2AuctionServiceApplication.class, args);
	}

}
