package com.ff.snake.dto;

public class CreateSnakeDto {
	private String leagueName;
	private String teamName;
	private String ppr;
	private String maxPlayers;
	
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
