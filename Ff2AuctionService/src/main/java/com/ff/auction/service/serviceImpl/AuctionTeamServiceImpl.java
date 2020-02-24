package com.ff.auction.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.domain.AuctionTeam;
import com.ff.auction.dto.CreateDto;
import com.ff.auction.repository.AuctionLeagueRepository;
import com.ff.auction.service.AuctionTeamService;

public class AuctionTeamServiceImpl implements AuctionTeamService{

	@Autowired AuctionLeagueRepository auctionLeagueRepository;

	@Override
	public void createTeamLeague(CreateDto createDto) {
		AuctionLeague persistentLeague= this.auctionLeagueRepository.findByLeagueName(createDto.getLeagueName());
		AuctionTeam newAuctionTeam = new AuctionTeam(createDto);
		persistentLeague.addAuctionTeam(newAuctionTeam);
	}	
}
