package com.ff.auction.dto;

public class CreateAuctionDto {
	private String leagueName;
	private String teamName;
	private String Budget;
	private String ppr;
	private String maxPlayers;

	
	public CreateAuctionDto() {};

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

	public String getBudget() {
		return Budget;
	}

	public void setBudget(String budget) {
		Budget = budget;
	}

	public String getPpr() {
		return ppr;
	}
	public void setPpr(String ppr) {
		this.ppr = ppr;
	}

	public String getMaxPlayers() {
		return maxPlayers;
	}
	public void setMaxPlayers(String maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	
	
}
