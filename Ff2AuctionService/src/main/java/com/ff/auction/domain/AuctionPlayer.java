package com.ff.auction.domain;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.ff.auction.dto.BidDto;

@DynamoDBDocument
public class AuctionPlayer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String Name;
	private String Team = "";
    private String Position = "";
    private String Bid = "";
    private String Points = "";
    
    public AuctionPlayer(){};
    
    public AuctionPlayer(BidDto bidDto) {
		this.Name = bidDto.getPlayerName();
		this.Team = bidDto.getTeam();
//		this.Position = bidDto.getPosition();
//		this.Bid = bidDto.getNewBid();
		this.Position = "QB";
		this.Team = "Dolphins";
	}

	@DynamoDBAttribute
	public String getName() {
		return Name;
	}
	@DynamoDBAttribute
	public String getTeam() {
		return Team;
	}
	@DynamoDBAttribute
	public String getPosition() {
		return Position;
	}
	@DynamoDBAttribute
	public String getBid() {
		return Bid;
	}
	@DynamoDBAttribute
	public String getPoints() {
		return Points;
	}
	
	public void setBid(String bid) {
		Bid = bid;
	}
	
	public void setPoints(String points) {
		Points = points;
	}

	public void setName(String name) {
		this.Name = name;
	}
	public void setTeam(String footballTeam) {
		this.Team = footballTeam;
	}
	public void setPosition(String position) {
		this.Position = position;
	}

}