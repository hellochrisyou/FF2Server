package com.ff.auction.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.domain.AuctionTeam;
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
	public List<AuctionLeague> getAllLeagues(String email) {
		List<AuctionLeague> persistentLeague = auctionLeagueRepository.findAll();
		List<AuctionLeague> returnLeague = new ArrayList<AuctionLeague>(persistentLeague);
		for (AuctionLeague tmpLeague : persistentLeague) {
			for (AuctionTeam tmpTeam : tmpLeague.getAuctionTeams()) {
				if (tmpTeam.getEmail().equals(email)) {
					returnLeague.remove(tmpLeague);
				}
			}
		}
		return returnLeague;
	}
	
	public List<AuctionLeague> getMyLeagues(String email) {
		List<AuctionLeague> persistentLeague = auctionLeagueRepository.findAll();
		List<AuctionLeague> returnLeague = new ArrayList<AuctionLeague>();
		for (AuctionLeague tmpLeague : persistentLeague) {
			for (AuctionTeam tmpTeam : tmpLeague.getAuctionTeams()) {
				if (tmpTeam.getEmail().equals(email)) {
					returnLeague.add(tmpLeague);
				}
			}
		}
		return returnLeague;
	}
	
	public List<AuctionLeague> getAllOtherLeagues(String email) {
		List<AuctionLeague> persistentLeague = auctionLeagueRepository.findAll();
		List<AuctionLeague> returnLeague = new ArrayList<AuctionLeague>();
		for (AuctionLeague tmpLeague : persistentLeague) {
			if (tmpLeague.getAuctionTeams().size() == 0) {
				returnLeague.add(tmpLeague);
				continue;
			}
			for (AuctionTeam tmpTeam : tmpLeague.getAuctionTeams()) {
				if (tmpTeam.getEmail().equals(email) == false) {
					returnLeague.add(tmpLeague);
					break;
				}
			}
		}
		return returnLeague;
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
