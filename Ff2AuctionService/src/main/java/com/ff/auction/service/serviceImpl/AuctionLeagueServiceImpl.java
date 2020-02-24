package com.ff.auction.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.dto.CreateDto;
import com.ff.auction.repository.AuctionLeagueRepository;
import com.ff.auction.service.AuctionLeagueService;

@Service
public class AuctionLeagueServiceImpl implements AuctionLeagueService {
	
	@Autowired
	private AuctionLeagueRepository auctionLeagueRepository;
	
	public void createAuctionLeague(CreateDto createDto) {
		AuctionLeague newAuctionLeague = new AuctionLeague(createDto);
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

