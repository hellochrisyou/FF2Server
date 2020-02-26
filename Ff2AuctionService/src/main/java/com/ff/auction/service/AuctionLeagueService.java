package com.ff.auction.service;

import java.util.List;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.dto.CreateAuctionDto;

public interface AuctionLeagueService {
	public void createAuctionLeague(CreateAuctionDto createAuctionDto);

	public List<AuctionLeague> getAllLeagues();
	
	public boolean existsByLeagueName(String leagueName);
}