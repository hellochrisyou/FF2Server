package com.ff.auction.service;

import java.util.List;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.dto.CreateAuctionDto;

public interface AuctionLeagueService {
	public void createAuctionLeague(CreateAuctionDto createAuctionDto);

	public List<AuctionLeague> getAllLeagues(String email);
	
	public List<AuctionLeague> getMyLeagues(String email);
	
	public List<AuctionLeague> getAllOtherLeagues(String email);
	
	public boolean existsByLeagueName(String leagueName);
}