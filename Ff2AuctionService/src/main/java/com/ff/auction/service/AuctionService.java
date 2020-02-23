package com.ff.auction.service;

import com.ff.auction.domain.AuctionLeague;

import dto.AuctionDto;

public interface AuctionService {
	
	void startAuction(AuctionDto auctionDto) throws InterruptedException;
	boolean makeBid(AuctionDto dto);
	void endAuction(); 
}
