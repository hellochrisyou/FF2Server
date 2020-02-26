package com.ff.auction.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.domain.AuctionTeam;
import com.ff.auction.dto.CreateAuctionDto;
import com.ff.auction.repository.AuctionLeagueRepository;
import com.ff.auction.service.AuctionTeamService;

public class AuctionTeamServiceImpl implements AuctionTeamService{

	@Autowired AuctionLeagueRepository auctionLeagueRepository;

	@Override
	public void createTeamLeague(CreateAuctionDto createAuctionDto) {
		AuctionLeague persistentLeague= this.auctionLeagueRepository.findByLeagueName(createAuctionDto.getLeagueName());
		AuctionTeam newAuctionTeam = new AuctionTeam(createAuctionDto);
		persistentLeague.addAuctionTeam(newAuctionTeam);
	}	
}
