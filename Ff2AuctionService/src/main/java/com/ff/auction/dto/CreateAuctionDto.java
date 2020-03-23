package com.ff.auction.dto;

import java.util.Objects;

public class CreateAuctionDto {
	private String leagueName;
	private String teamName;
	private String budget;
	private String ppr;
	private String maxPlayers;

	
	public CreateAuctionDto() {};

	public String getLeagueName() {
		return this.leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public String getTeamName() {
		return this.teamName;
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
		return this.ppr;
	}
	public void setPpr(String ppr) {
		this.ppr = ppr;
	}

	public String getMaxPlayers() {
		return this.maxPlayers;
	}
	public void setMaxPlayers(String maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(budget, leagueName, maxPlayers, ppr, teamName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CreateAuctionDto)) {
			return false;
		}
		CreateAuctionDto other = (CreateAuctionDto) obj;
		return Objects.equals(budget, other.budget) && Objects.equals(leagueName, other.leagueName)
				&& Objects.equals(maxPlayers, other.maxPlayers) && Objects.equals(ppr, other.ppr)
				&& Objects.equals(teamName, other.teamName);
	}

	
	
}
