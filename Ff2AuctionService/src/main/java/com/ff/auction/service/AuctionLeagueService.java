package com.ff.auction.service;

import java.util.List;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.dto.CreateDto;

public interface AuctionLeagueService {
	public void createAuctionLeague(CreateDto createDto);

	public List<AuctionLeague> getAllLeagues();
	
	public boolean existsByLeagueName(String leagueName);
}