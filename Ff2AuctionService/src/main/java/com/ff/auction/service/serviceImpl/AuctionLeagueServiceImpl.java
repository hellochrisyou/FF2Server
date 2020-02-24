package com.ff.auction.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.dto.CreateDto;
import com.ff.auction.repository.AuctionLeagueRepository;
import com.ff.auction.service.AuctionLeagueService;

@Service
public class AuctionLeagueServiceImpl implements AuctionLeagueService {
	
	@Autowired
	private AuctionLeagueRepository auctionLeagueRepository;
	
	public void createAuctionLeague(CreateDto createDto) {
		AuctionLeague newAuctionLeague = new AuctionLeague(createDto);
		this.auctionLeagueRepository.save(newAuctionLeague);
		return;
	}
}
