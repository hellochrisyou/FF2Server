package com.ff.auction.dto;

import java.util.Objects;

public class CreateTeamDto extends TeamDto {
	private String email;
	private String budget;
	private String ppr;
	private String maxPlayers;
	private String leagueType;
	private String photoUrl;
	private String draftPosition;

	CreateTeamDto() {
	};

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(budget, draftPosition, email, leagueType, maxPlayers, photoUrl, ppr);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof CreateTeamDto)) {
			return false;
		}
		CreateTeamDto other = (CreateTeamDto) obj;
		return Objects.equals(budget, other.budget) && Objects.equals(draftPosition, other.draftPosition)
				&& Objects.equals(email, other.email) && Objects.equals(leagueType, other.leagueType)
				&& Objects.equals(maxPlayers, other.maxPlayers) && Objects.equals(photoUrl, other.photoUrl)
				&& Objects.equals(ppr, other.ppr);
	}

}
