package com.ff.auction.service;

import java.util.List;

import com.ff.auction.domain.AuctionTeam;
import com.ff.auction.dto.CreateTeamDto;

public interface AuctionTeamService {
	
	public void createAuctionTeam(CreateTeamDto createTeamDto) ;
	public boolean teamNameExists(String teamName);
}