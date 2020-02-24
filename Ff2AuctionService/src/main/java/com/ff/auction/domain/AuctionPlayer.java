package com.ff.auction.domain;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.ff.auction.dto.AuctionDto;

@DynamoDBDocument
public class AuctionPlayer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String playerName;
	private String footballTeam;
    private String position;
    
    public AuctionPlayer(){};
    
    public AuctionPlayer(AuctionDto auctionDto) {
		this.playerName = auctionDto.getPlayerName();
		this.footballTeam = auctionDto.getFootballTeam();
		this.position = auctionDto.getPosition();
	}

	@DynamoDBAttribute
	public String getPlayerName() {
		return playerName;
	}
	@DynamoDBAttribute
	public String getFootballTeam() {
		return footballTeam;
	}
	@DynamoDBAttribute
	public String getPosition() {
		return position;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public void setTeam(String footballTeam) {
		this.footballTeam = footballTeam;
	}
	public void setPosition(String position) {
		this.position = position;
	}

}