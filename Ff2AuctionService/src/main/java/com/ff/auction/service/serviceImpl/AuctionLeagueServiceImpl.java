package com.ff.auction.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.auction.domain.AuctionLeague;
import com.ff.auction.domain.AuctionPlayer;
import com.ff.auction.domain.AuctionTeam;
import com.ff.auction.dto.BidDto;
import com.ff.auction.dto.CreateAuctionDto;
import com.ff.auction.dto.CreateTeamDto;
import com.ff.auction.dto.TeamDto;
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
		List<AuctionLeague> persistentLeague = this.auctionLeagueRepository.findAll();
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
		List<AuctionLeague> persistentLeague = this.auctionLeagueRepository.findAll();
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
		List<AuctionLeague> persistentLeague = this.auctionLeagueRepository.findAll();
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

	public AuctionLeague getLeague(String leagueName) {
		AuctionLeague returnLeague = this.auctionLeagueRepository.findByLeagueName(leagueName);
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

	@Override 
	public AuctionLeague startBid(BidDto bidDto) {
		AuctionLeague persistentLeague = this.auctionLeagueRepository.findByLeagueName(bidDto.getLeagueName());	
		persistentLeague.setCurrentBidder(bidDto.getTeamName());
		persistentLeague.setCurrentBid(bidDto.getNewBid());
		persistentLeague.setCurrentPlayer(bidDto.getPlayerName());
		persistentLeague.setStatus("Ongoing");
		for (AuctionTeam team: persistentLeague.getAuctionTeams()) {
			if (team.getTeamName().equals(bidDto.getTeamName())) {
				team.setEndBid("No");
			}
		}
		return this.auctionLeagueRepository.save(persistentLeague);
	}
	
	@Override
	public AuctionLeague makeBid(BidDto bidDto) {
		AuctionLeague persistentLeague = this.auctionLeagueRepository.findByLeagueName(bidDto.getLeagueName());
		
		persistentLeague.getTeam(bidDto.getLeagueName()).setEndBid("No");
		persistentLeague.getTeam(persistentLeague.getCurrentBidder()).setEndBid("No");
		persistentLeague.setCurrentBidder(bidDto.getTeamName());
		persistentLeague.setCurrentBid(bidDto.getNewBid());
		persistentLeague.setCurrentPlayer(bidDto.getPlayerName());
		
		for (AuctionTeam team: persistentLeague.getAuctionTeams()) {
			if (!team.getTeamName().equals(bidDto.getTeamName())) {
				team.setEndBid("No");
			}
		}
		
		return this.auctionLeagueRepository.save(persistentLeague);
	}
	
	@Override
	public AuctionLeague noBid(BidDto bidDto) {
		int counter = 0;

		AuctionLeague persistentLeague = this.auctionLeagueRepository.findByLeagueName(bidDto.getLeagueName());
		persistentLeague.getTeam(bidDto.getTeamName()).setEndBid("Yes");
		
		for (AuctionTeam team: persistentLeague.getAuctionTeams()) {
			if (team.getEndBid().equals("Yes")) {
				counter++;
			}
		}
		if (counter == persistentLeague.getAuctionTeams().size() - 1) {
			AuctionPlayer newPlayer = new AuctionPlayer(bidDto); 
			persistentLeague.getTeam(bidDto.getTeamName()).addAuctionPlayer(newPlayer);
			for (AuctionTeam team: persistentLeague.getAuctionTeams()) {
				persistentLeague.setDraftTurn(persistentLeague.getDraftTurn() + 1);
				if (team.getDraftPosition().equals(persistentLeague.getDraftTurn())) {
					team.setEndBid("Yes");
				} else {
					team.setEndBid("No");
				}
			}
		} 
		return this.auctionLeagueRepository.save(persistentLeague);
	}
}
