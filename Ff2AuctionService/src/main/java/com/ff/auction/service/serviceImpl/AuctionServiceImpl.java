package com.ff.auction.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ff.auction.LiveAuction.LiveAuction;
import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.domain.AuctionPlayer;
import com.ff.auction.dto.AuctionDto;
import com.ff.auction.repository.AuctionLeagueRepository;
import com.ff.auction.service.AuctionService;

public class AuctionServiceImpl implements AuctionService{
	
	LiveAuction liveAuction;
	
	@Autowired
	private AuctionLeagueRepository auctionLeagueRepository;
	@Override
	public void goAuction(AuctionDto auctionDto) throws InterruptedException{
		
		AuctionLeague thisPersistentLeague= this.auctionLeagueRepository.findByLeagueName(auctionDto.getLeagueName());	
		this.liveAuction = new LiveAuction();
		
		AuctionDto localAuctionDto= liveAuction.startGoingBid(auctionDto);
		AuctionPlayer newAuctionPlayer = new AuctionPlayer(localAuctionDto);
		thisPersistentLeague.getTeam(auctionDto.getTeamName()).addAuctionPlayer(newAuctionPlayer);
		this.auctionLeagueRepository.save(thisPersistentLeague);
	}

	@Override
	public boolean makeBid(AuctionDto auctionDto) {
		try {
			this.liveAuction.makeBid(auctionDto);
		} catch (InterruptedException e) {		 
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void endAuction() {
		// TODO Auto-generated method stub
		
	}

}
