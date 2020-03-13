package com.ff.auction.dto;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(Budget, leagueName, maxPlayers, ppr, teamName);
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
		return Objects.equals(Budget, other.Budget) && Objects.equals(leagueName, other.leagueName)
				&& Objects.equals(maxPlayers, other.maxPlayers) && Objects.equals(ppr, other.ppr)
				&& Objects.equals(teamName, other.teamName);
	}

	
	
}
