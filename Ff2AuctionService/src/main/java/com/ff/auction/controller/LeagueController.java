package com.ff.auction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ff.auction.dto.CreateDto;
import com.ff.auction.service.AuctionLeagueService;

@CrossOrigin(maxAge = 3600)
@RestController
public class LeagueController {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private AuctionLeagueService auctionLeagueService;
	
	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(
			@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}
	
	@CrossOrigin	
	@PostMapping(value = "/league/", consumes = "application/json", produces = "application/json")
	public void createLeague(@RequestBody CreateDto createDto) {
		this.auctionLeagueService.createAuctionLeague(createDto);
	}
}
