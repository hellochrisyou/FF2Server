package com.ff.auction.dto;

public class CreateAuctionDto {
	private String leagueName;
	private String teamName;
	private String Budget;
	private String ppr;
	private String maxPlayers;
	private String position;
	private String team;
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Budget == null) ? 0 : Budget.hashCode());
		result = prime * result + ((leagueName == null) ? 0 : leagueName.hashCode());
		result = prime * result + ((maxPlayers == null) ? 0 : maxPlayers.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((ppr == null) ? 0 : ppr.hashCode());
		result = prime * result + ((team == null) ? 0 : team.hashCode());
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateAuctionDto other = (CreateAuctionDto) obj;
		if (Budget == null) {
			if (other.Budget != null)
				return false;
		} else if (!Budget.equals(other.Budget))
			return false;
		if (leagueName == null) {
			if (other.leagueName != null)
				return false;
		} else if (!leagueName.equals(other.leagueName))
			return false;
		if (maxPlayers == null) {
			if (other.maxPlayers != null)
				return false;
		} else if (!maxPlayers.equals(other.maxPlayers))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (ppr == null) {
			if (other.ppr != null)
				return false;
		} else if (!ppr.equals(other.ppr))
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		return true;
	}



	
	
}
