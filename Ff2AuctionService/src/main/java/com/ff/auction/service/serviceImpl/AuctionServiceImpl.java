package com.ff.auction.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.repository.AuctionLeagueRepository;
import com.ff.auction.service.AuctionService;

import LiveAuction.LiveAuction;
import dto.AuctionDto;

public class AuctionServiceImpl implements AuctionService{
	
	LiveAuction liveAuction;
	
	@Autowired
	private AuctionLeagueRepository auctionLeagueRepository;
		@Override
	public void startAuction(AuctionDto auctionDto) throws InterruptedException{
		
		int totalPlayers = 0;
		AuctionLeague thisPersistentLeague= this.auctionLeagueRepository.findByLeagueName(auctionDto.getLeagueName());
		
		while (totalPlayers <= thisPersistentLeague.getAuctionTeams().size() * 15) {
				this.liveAuction = new LiveAuction();
				AuctionDto localAuctionDto= liveAuction.startGoingBid(auctionDto);
				
		}
		
	}

	@Override
	public boolean makeBid(AuctionDto auctionDto) {
		this.liveAuction.makeBid(auctionDto);
		return false;
	}

	@Override
	public void endAuction() {
		// TODO Auto-generated method stub
		
	}

}
