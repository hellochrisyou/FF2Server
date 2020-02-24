package com.ff.auction.dto;

public class AuctionDto {
	private String leagueName;
	private String teamName;
	private String playerName;
	private String footballTeam;
    private String position;
	private String currentBidder;
	private int askingBid;
	
	public AuctionDto() {};
	
	public AuctionDto(String currentBidder,int askingBid, String playerName) {
		this.currentBidder = currentBidder;
		this.askingBid = askingBid;
		this.playerName = playerName;
	}
	
	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCurrentBidder() {
		return currentBidder;
	}

	public int getAskingBid() {
		return askingBid;
	}

	public void setCurrentBidder(String currentBidder) {
		this.currentBidder = currentBidder;
	}

	public void setAskingBid(int askingBid) {
		this.askingBid = askingBid;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getFootballTeam() {
		return footballTeam;
	}

	public void setFootballTeam(String footballTeam) {
		this.footballTeam = footballTeam;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
