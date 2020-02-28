package com.ff.auction.domain;

import java.io.Serializable;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.ff.auction.dto.CreateTeamDto;

@DynamoDBDocument
public class AuctionTeam implements Serializable {

	private static final long serialVersionUID = 1L;

	private String TeamName;
	private String Budget;
	private List<AuctionPlayer> auctionPlayers;
	

	public AuctionTeam() {		
	}

	public AuctionTeam(CreateTeamDto createTeamDto) {
		this.TeamName = createTeamDto.getTeamName();
		this.Budget = createTeamDto.getBudget();
	}

	@DynamoDBAttribute
	public List<AuctionPlayer> getAuctionPlayers() {
		return this.auctionPlayers;
	}

	@DynamoDBAttribute
	public String getBudget() {
		return Budget;
	}

	@DynamoDBAttribute
	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		this.TeamName = teamName;
	}

	public void addAuctionPlayer(AuctionPlayer auctionPlayer) {
		this.auctionPlayers.add(auctionPlayer);
	}

	public void setAuctionPlayers(List<AuctionPlayer> auctionPlayers) {
		this.auctionPlayers = auctionPlayers;
	}

	public void setBudget(String budget) {
		this.Budget = budget;
	}
}
