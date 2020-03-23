package com.ff.auction.domain;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.ff.auction.dto.BidDto;

@DynamoDBDocument
public class AuctionPlayer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String team = "";
    private String position = "";
    private String bid = "";
    private String points = "";
    
    public AuctionPlayer(){};
    
    public AuctionPlayer(BidDto bidDto) {
		this.name = bidDto.getPlayerName();
		this.team = bidDto.getTeam();
		this.position = bidDto.getPosition();
		this.bid = bidDto.getNewBid();
		this.team = "Dolphins";
	}

	@DynamoDBAttribute
	public String getName() {
		return name;
	}
	@DynamoDBAttribute
	public String getTeam() {
		return team;
	}
	@DynamoDBAttribute
	public String getPosition() {
		return position;
	}
	@DynamoDBAttribute
	public String getBid() {
		return bid;
	}
	@DynamoDBAttribute
	public String getPoints() {
		return points;
	}
	
	public void setBid(String bid) {
		this.bid = bid;
	}
	
	public void setPoints(String points) {
		this.points = points;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setTeam(String footballTeam) {
		this.team = footballTeam;
	}
	public void setPosition(String position) {
		this.position = position;
	}

}