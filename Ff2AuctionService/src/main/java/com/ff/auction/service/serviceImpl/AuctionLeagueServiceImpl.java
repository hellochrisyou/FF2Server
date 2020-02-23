package com.ff.auction.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.repository.AuctionLeagueRepository;
import com.ff.auction.service.AuctionLeagueService;
import com.ff.auction.service.AuctionTeamService;

import dto.CreateDto;

public class AuctionLeagueServiceImpl implements AuctionLeagueService {

	@Autowired
	private AuctionTeamService auctionTeamService;
	@Autowired
	private AuctionLeagueRepository auctionLeagueRepository;
	
	public void createAuctionLeague(CreateDto createDto) {
		AuctionLeague newAuctionLeague = new AuctionLeague(createDto);
		this.auctionLeagueRepository.save(newAuctionLeague);
		return;
	}
}
