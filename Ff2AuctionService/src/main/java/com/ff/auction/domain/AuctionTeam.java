package com.ff.auction.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import dto.CreateDto;

@DynamoDBDocument
public class AuctionTeam implements Serializable {

	private static final long serialVersionUID = 1L;

	private String teamName;
	private String currentBudget;
	private List<AuctionPlayer> auctionPlayers = new ArrayList<AuctionPlayer>();
	

	public AuctionTeam() {
	}

	public AuctionTeam(CreateDto createDto) {
		this.teamName = createDto.getTeamName();
		this.currentBudget = createDto.getTotalBudget();
	}

	@DynamoDBAttribute
	public List<AuctionPlayer> getAuctionPlayers() {
		return this.auctionPlayers;
	}

	@DynamoDBAttribute
	public String getCurrentBudget() {
		return currentBudget;
	}

	@DynamoDBAttribute
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void addAuctionPlayer(AuctionPlayer auctionPlayer) {
		this.auctionPlayers.add(auctionPlayer);
	}

	public void setAuctionPlayers(List<AuctionPlayer> auctionPlayers) {
		this.auctionPlayers = auctionPlayers;
	}

	public void setCurrentBudget(String currentBudget) {
		this.currentBudget = currentBudget;
	}
}
