package com.ff.auction.dto;


public class CreateTeamDto {
	private String email;
	private String leagueName;
	private String teamName;
	private String budget;
	private String ppr;
	private String maxPlayers;

	
	CreateTeamDto() {};

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	public String getBudget() {
		return this.budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
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
