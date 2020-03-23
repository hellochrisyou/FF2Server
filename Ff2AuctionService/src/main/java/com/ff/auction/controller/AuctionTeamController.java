package com.ff.auction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ff.auction.dto.CreateTeamDto;
import com.ff.auction.service.AuctionTeamService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/auction/team")
public class AuctionTeamController {
	
	@Autowired
	private AuctionTeamService auctionTeamService;

	@CrossOrigin	
	@PostMapping(value = "/createTeam/", consumes = "application/json", produces = "application/json")
	public void createTeam(@RequestBody CreateTeamDto createTeamDto) {
		this.auctionTeamService.createAuctionTeam(createTeamDto);
	}
	
	@CrossOrigin	
	@GetMapping(value = "/teamNameExists/{name}", consumes = "application/json", produces = "application/json")
	public boolean teamNameExists(@PathVariable String name) {
		return this.auctionTeamService.teamNameExists(name);
	}
}
