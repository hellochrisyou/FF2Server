package com.ff.auction.service;

import java.util.List;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.dto.BidDto;
import com.ff.auction.dto.CreateAuctionDto;
import com.ff.auction.dto.CreateTeamDto;
import com.ff.auction.dto.TeamDto;

public interface AuctionLeagueService {
	public void createAuctionLeague(CreateAuctionDto createAuctionDto);

	public List<AuctionLeague> getAllLeagues(String email);
	
	public List<AuctionLeague> getMyLeagues(String email);
	
	public List<AuctionLeague> getAllOtherLeagues(String email);
	
	public AuctionLeague getLeague(String email);
	
	public boolean existsByLeagueName(String leagueName);
	
	public AuctionLeague startBid(BidDto bidDto);
	
	public AuctionLeague makeBid(BidDto bidDto);
	
	public AuctionLeague noBid(BidDto bidDto);
}