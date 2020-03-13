package com.ff.auction.dto;

public class BidDto {

	private String leagueName;
	private String teamName;
	private float newBid;
	private String playerName;
	private String position;
	private String team;
	
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
	public String getNewBid() {
		return String.valueOf(this.newBid);
	}
	public void setNewBid(float newBid) {
		this.newBid = newBid;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
}
