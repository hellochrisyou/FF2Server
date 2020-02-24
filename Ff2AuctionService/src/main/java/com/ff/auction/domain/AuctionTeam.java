package com.ff.auction.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.ff.auction.dto.CreateDto;

@DynamoDBDocument
public class AuctionTeam implements Serializable {

	private static final long serialVersionUID = 1L;

	private String Name;
	private String CurrentBudget;
	private List<AuctionPlayer> auctionPlayers;
	

	public AuctionTeam() {		
	}

	public AuctionTeam(CreateDto createDto) {
		this.Name = createDto.getTeamName();
		this.CurrentBudget = createDto.getTotalBudget();
	}

	@DynamoDBAttribute
	public List<AuctionPlayer> getAuctionPlayers() {
		return this.auctionPlayers;
	}

	@DynamoDBAttribute
	public String getCurrentBudget() {
		return CurrentBudget;
	}

	@DynamoDBAttribute
	public String getName() {
		return Name;
	}

	public void setName(String teamName) {
		this.Name = teamName;
	}

	public void addAuctionPlayer(AuctionPlayer auctionPlayer) {
		this.auctionPlayers.add(auctionPlayer);
	}

	public void setAuctionPlayers(List<AuctionPlayer> auctionPlayers) {
		this.auctionPlayers = auctionPlayers;
	}

	public void setCurrentBudget(String currentBudget) {
		this.CurrentBudget = currentBudget;
	}
}
