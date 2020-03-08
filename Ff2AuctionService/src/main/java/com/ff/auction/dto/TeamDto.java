package com.ff.auction.dto;

public class TeamDto {

	private String isReady;
	private String teamName;
	private String leagueName;
    
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
	public String getIsReady() {
		return isReady;
	}
	public void setIsReady(String isReady) {
		this.isReady = isReady;
	}   
}
