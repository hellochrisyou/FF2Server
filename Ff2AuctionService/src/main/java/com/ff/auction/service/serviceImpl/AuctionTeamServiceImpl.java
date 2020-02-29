package com.ff.auction.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.domain.AuctionTeam;
import com.ff.auction.dto.CreateTeamDto;
import com.ff.auction.repository.AuctionLeagueRepository;
import com.ff.auction.service.AuctionTeamService;

@Service
public class AuctionTeamServiceImpl implements AuctionTeamService{

	@Autowired AuctionLeagueRepository auctionLeagueRepository;

	@Override
	public void createAuctionTeam(CreateTeamDto createTeamDto) {
		AuctionLeague persistentLeague= this.auctionLeagueRepository.findByLeagueName(createTeamDto.getLeagueName());
		AuctionTeam newAuctionTeam = new AuctionTeam(createTeamDto);
		persistentLeague.addAuctionTeam(newAuctionTeam);
	}
	
	public boolean teamNameExists(String teamName) {
		List<AuctionLeague> persistentLeague= this.auctionLeagueRepository.findAll();
		for (AuctionLeague league: persistentLeague) {
			List<AuctionTeam> teams = league.getAuctionTeams();
			if (teams == null) {
				continue;
			}
			for (AuctionTeam team: teams) {
				if (team.getTeamName() == teamName) {
					return true;
				}
			}
			
		}
		return false;
	}

}
