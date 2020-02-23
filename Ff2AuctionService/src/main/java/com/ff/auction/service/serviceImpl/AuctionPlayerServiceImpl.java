package com.ff.auction.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.domain.AuctionPlayer;
import com.ff.auction.repository.AuctionLeagueRepository;
import com.ff.auction.service.AuctionPlayerService;

import dto.AuctionDto;

public class AuctionPlayerServiceImpl implements AuctionPlayerService {

	@Autowired
	private AuctionLeagueRepository auctionLeagueRepository;
	
	@Override
	public void addPlayer(AuctionDto auctionDto) {
		AuctionLeague persistentLeague= this.auctionLeagueRepository.findByLeagueName(auctionDto.getLeagueName());
		AuctionPlayer newAuctionPlayer= new AuctionPlayer(auctionDto);
		persistentLeague.getTeam(auctionDto.getTeamName()).addAuctionPlayer(newAuctionPlayer);
		auctionLeagueRepository.save(persistentLeague);
		return;
	}
}
