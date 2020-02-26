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
import com.ff.auction.dto.CreateDto;
import com.ff.auction.dto.CreateLeagueDto;
import com.ff.auction.service.AuctionLeagueService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/auction")
public class AuctionDraftController {
	
	@Autowired
	private AuctionLeagueService auctionLeagueService;
	
	@CrossOrigin	
	@PostMapping(value = "/createAuctionLeague/", consumes = "application/json", produces = "application/json")
	public void createLeague(@RequestBody CreateAuctionDto createAuctionDto) {
		this.auctionLeagueService.createAuctionLeague(createAuctionDto);
	}
	
	@CrossOrigin	
	@GetMapping(value = "/getAllLeagues/", consumes = "application/json", produces = "application/json")
	public List<AuctionLeague> getAllLeagues() {
		return this.auctionLeagueService.getAllLeagues();
	}
	
	@CrossOrigin	
	@GetMapping(value = "/existsByLeagueName/{name}", consumes = "application/json", produces = "application/json")
	public boolean leagueNameExists(@PathVariable String name) {
		return this.auctionLeagueService.existsByLeagueName(name);
	}
}
