package com.ff.snake.dto;

public class CreateTeamDto extends TeamDto {
	private String email;
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
		result = prime * result + ((draftPosition == null) ? 0 : draftPosition.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((leagueType == null) ? 0 : leagueType.hashCode());
		result = prime * result + ((maxPlayers == null) ? 0 : maxPlayers.hashCode());
		result = prime * result + ((photoUrl == null) ? 0 : photoUrl.hashCode());
		result = prime * result + ((ppr == null) ? 0 : ppr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof CreateTeamDto))
			return false;
		CreateTeamDto other = (CreateTeamDto) obj;
		if (draftPosition == null) {
			if (other.draftPosition != null)
				return false;
		} else if (!draftPosition.equals(other.draftPosition))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (leagueType == null) {
			if (other.leagueType != null)
				return false;
		} else if (!leagueType.equals(other.leagueType))
			return false;
		if (maxPlayers == null) {
			if (other.maxPlayers != null)
				return false;
		} else if (!maxPlayers.equals(other.maxPlayers))
			return false;
		if (photoUrl == null) {
			if (other.photoUrl != null)
				return false;
		} else if (!photoUrl.equals(other.photoUrl))
			return false;
		if (ppr == null) {
			if (other.ppr != null)
				return false;
		} else if (!ppr.equals(other.ppr))
			return false;
		return true;
	}



}
