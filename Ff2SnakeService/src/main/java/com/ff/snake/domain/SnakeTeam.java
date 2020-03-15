package com.ff.snake.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.ff.snake.dto.CreateTeamDto;

@DynamoDBDocument
public class SnakeTeam implements Serializable {

	private static final long serialVersionUID = 1L;

	private String email;
	private String teamName;
	private String photoUrl;
	private String draftPosition;
	private List<SnakePlayer> snakePlayers = new ArrayList<SnakePlayer>();
	

	public SnakeTeam() {		
	}

	public SnakeTeam(CreateTeamDto createTeamDto) {
		this.teamName = createTeamDto.getTeamName();
		this.email = createTeamDto.getEmail();
		this.photoUrl = createTeamDto.getPhotoUrl();
		this.draftPosition = createTeamDto.getDraftPosition();
	}
	

	@DynamoDBAttribute
	public List<SnakePlayer> getSnakePlayers() {
		return this.snakePlayers;
	}
	@DynamoDBAttribute
	public String getDraftPosition() {
		return this.draftPosition;
	}
	@DynamoDBAttribute
	public String getPhotoUrl() {
		return this.photoUrl;
	}
	@DynamoDBAttribute
	public String getTeamName() {
		return this.teamName;
	}
	@DynamoDBAttribute
	public String getEmail() {
		return this.email;
	}
	public void setName(String teamName) {
		this.teamName = teamName;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public void setDraftPosition(String draftPosition) {
		this.draftPosition = draftPosition;
	}
	public void addSnakePlayer(SnakePlayer snakePlayer) {
		this.snakePlayers.add(snakePlayer);
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void setSnakePlayers(List<SnakePlayer> snakePlayers) {
		this.snakePlayers = snakePlayers;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((draftPosition == null) ? 0 : draftPosition.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((photoUrl == null) ? 0 : photoUrl.hashCode());
		result = prime * result + ((snakePlayers == null) ? 0 : snakePlayers.hashCode());
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SnakeTeam))
			return false;
		SnakeTeam other = (SnakeTeam) obj;
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
		if (photoUrl == null) {
			if (other.photoUrl != null)
				return false;
		} else if (!photoUrl.equals(other.photoUrl))
			return false;
		if (snakePlayers == null) {
			if (other.snakePlayers != null)
				return false;
		} else if (!snakePlayers.equals(other.snakePlayers))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		return true;
	}



}
