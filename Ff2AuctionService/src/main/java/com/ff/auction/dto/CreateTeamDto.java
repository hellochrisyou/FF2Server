package com.ff.auction.dto;


public class CreateTeamDto extends TeamDto {
	private String email;
	private String budget;
	private String ppr;
	private String maxPlayers;
	private String leagueType;
	private String photoUrl;
	private String draftPosition;
	
	CreateTeamDto() {};
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLeagueType() {
		return leagueType;
	}

	public void setLeagueType(String leagueType) {
		this.leagueType = leagueType;
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

	public String getDraftPosition() {
		return draftPosition;
	}

	public void setDraftPosition(String draftPosition) {
		this.draftPosition = draftPosition;
	}

	public String getMaxPlayers() {
		return maxPlayers;
	}
	public void setMaxPlayers(String maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
}
