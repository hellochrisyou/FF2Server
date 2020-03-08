package com.ff.auction.domain;

import java.io.Serializable;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.ff.auction.dto.CreateTeamDto;

@DynamoDBDocument
public class AuctionTeam implements Serializable {

	private static final long serialVersionUID = 1L;

	private String teamName;
	private String email;
	private String budget;
	private String photoUrl;
	private String draftPosition;
	private String isReady = "No";
	private List<AuctionPlayer> auctionPlayers;
	

	public AuctionTeam() {		
	}

	public AuctionTeam(CreateTeamDto createTeamDto) {
		this.teamName = createTeamDto.getTeamName();
		this.budget = createTeamDto.getBudget();
		this.email = createTeamDto.getEmail();
		this.photoUrl = createTeamDto.getPhotoUrl();
	}

	@DynamoDBAttribute
	public List<AuctionPlayer> getAuctionPlayers() {
		return this.auctionPlayers;
	}

	@DynamoDBAttribute
	public String getBudget() {
		return this.budget;
	}
	@DynamoDBAttribute
	public String getDraftPosition() {
		return this.draftPosition;
	}
	@DynamoDBAttribute
	public String getTeamName() {
		return this.teamName;
	}
	@DynamoDBAttribute
	public String getPhotoUrl() {
		return this.photoUrl;
	}
	@DynamoDBAttribute
	public String getEmail() {
		return this.email;
	}
	@DynamoDBAttribute
	public String getIsReady() {
		return this.isReady;
	}
	public void setDraftPosition(String draftPosition) {
		this.draftPosition = draftPosition;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void addAuctionPlayer(AuctionPlayer auctionPlayer) {
		this.auctionPlayers.add(auctionPlayer);
	}

	public void setAuctionPlayers(List<AuctionPlayer> auctionPlayers) {
		this.auctionPlayers = auctionPlayers;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public void setIsReady(String isReady) {
		this.isReady = isReady;
	}
	
}
