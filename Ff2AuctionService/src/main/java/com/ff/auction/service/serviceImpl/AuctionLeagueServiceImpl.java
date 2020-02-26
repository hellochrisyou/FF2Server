package com.ff.auction.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.dto.CreateAuctionDto;
import com.ff.auction.repository.AuctionLeagueRepository;
import com.ff.auction.service.AuctionLeagueService;

@Service
public class AuctionLeagueServiceImpl implements AuctionLeagueService {
	
	@Autowired
	private AuctionLeagueRepository auctionLeagueRepository;
	
	public void createAuctionLeague(CreateAuctionDto createAuctionDto) {
		AuctionLeague newAuctionLeague = new AuctionLeague(createAuctionDto);
		this.auctionLeagueRepository.save(newAuctionLeague);
		return;
	}
	
	@Override
	public List<AuctionLeague> getAllLeagues() {
		List<AuctionLeague> auctionLeague =  auctionLeagueRepository.findAll();
		return auctionLeague;
	}

	@Override
	public boolean existsByLeagueName(String leagueName) {		
		if (this.auctionLeagueRepository.existsByLeagueName(leagueName)) {
			return true;
		} else {
		return false;
		}
	}
}

