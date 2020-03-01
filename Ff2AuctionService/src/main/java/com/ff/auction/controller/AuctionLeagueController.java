package com.ff.auction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.dto.CreateAuctionDto;
import com.ff.auction.service.AuctionLeagueService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/auction")
public class AuctionLeagueController {
	
	@Autowired
	private AuctionLeagueService auctionLeagueService;
	
	@CrossOrigin	
	@PostMapping(value = "/createAuctionLeague/", consumes = "application/json", produces = "application/json")
	public void createLeague(@RequestBody CreateAuctionDto createAuctionDto) {
		this.auctionLeagueService.createAuctionLeague(createAuctionDto);
	}
	
	@CrossOrigin	
	@PostMapping(value = "/getAllLeagues/", consumes = "application/json", produces = "application/json")
	public List<AuctionLeague> getAllLeagues(@RequestBody String email) {
		return this.auctionLeagueService.getAllLeagues(email);
	}
	
	@CrossOrigin	
	@PostMapping(value = "/getAllMyLeagues/", consumes = "application/json", produces = "application/json")
	public List<AuctionLeague> getAllMyLeagues(@RequestBody String email) {
		return this.auctionLeagueService.getAllLeagues(email);
	}
	
	@CrossOrigin	
	@PostMapping(value = "/getAllOtherLeagues/", consumes = "application/json", produces = "application/json")
	public List<AuctionLeague> getAllOtherLeagues(@RequestBody String email) {
		return this.auctionLeagueService.getAllLeagues(email);
	}
	
	@CrossOrigin	
	@GetMapping(value = "/existsByLeagueName/{name}", consumes = "application/json", produces = "application/json")
	public boolean leagueNameExists(@PathVariable String name) {
		return this.auctionLeagueService.existsByLeagueName(name);
	}
}