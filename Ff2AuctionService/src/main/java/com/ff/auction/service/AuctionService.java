package com.ff.auction.service;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.dto.AuctionDto;

public interface AuctionService {
	
	void goAuction(AuctionDto auctionDto) throws InterruptedException;
	boolean makeBid(AuctionDto dto);
	void endAuction(); 
}
