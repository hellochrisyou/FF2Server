package com.ff.auction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ff.auction.dto.CreateTeamDto;

@CrossOrigin(maxAge = 3600)
@RestController
public class DelegateController {

	@Autowired
    private RestTemplate restTemplate;
	
	@CrossOrigin
	public void delegateCreateTeam(CreateTeamDto createteamDto) {
		restTemplate.postForObject("http://localhost:8081/dynamoDb/team/createTeam", createteamDto, CreateTeamDto.class);
	}
	
	@Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
