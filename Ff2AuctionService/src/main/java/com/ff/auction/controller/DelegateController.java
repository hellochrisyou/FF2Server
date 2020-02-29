package com.ff.auction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ff.auction.dto.CreateTeamDto;

@CrossOrigin(maxAge = 3600)
@RestController
public class DelegateController {

	@Autowired
    private RestTemplate restTemplate;

    @Autowired
    @LoadBalanced
    private RestTemplate loadBalanced;
	
	@CrossOrigin
	public void delegateCreateTeam(CreateTeamDto createteamDto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.parseMediaType(MediaType.APPLICATION_JSON + ";charset=UTF-8"));
		HttpEntity<CreateTeamDto> request = new HttpEntity<>(createteamDto, headers);
		restTemplate.postForObject("http://ModelService/dynamoDb/team/createTeam/", request, CreateTeamDto.class);
	}
	
	@Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
