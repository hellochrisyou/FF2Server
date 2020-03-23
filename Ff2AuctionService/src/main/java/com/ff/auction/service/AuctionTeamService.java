package com.ff.auction.service;

import com.ff.auction.dto.CreateTeamDto;

public interface AuctionTeamService {
	
	public void createAuctionTeam(CreateTeamDto createTeamDto) ;
	public boolean teamNameExists(String teamName);
}