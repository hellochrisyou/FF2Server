package com.ff.auction.dto;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(isReady, leagueName, teamName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof TeamDto)) {
			return false;
		}
		TeamDto other = (TeamDto) obj;
		return Objects.equals(isReady, other.isReady) && Objects.equals(leagueName, other.leagueName)
				&& Objects.equals(teamName, other.teamName);
	}

}
