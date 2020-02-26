package com.ff.snake.domain;

import java.io.Serializable;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.ff.snake.dto.CreateSnakeDto;

@DynamoDBDocument
public class SnakeTeam implements Serializable {

	private static final long serialVersionUID = 1L;

	private String TeamName;
	private String CurrentBudget;
	private List<SnakePlayer> snakePlayers;
	

	public SnakeTeam() {		
	}

	public SnakeTeam(CreateSnakeDto createSnakeDto) {
		this.TeamName = createSnakeDto.getTeamName();
	}

	@DynamoDBAttribute
	public List<SnakePlayer> getSnakePlayers() {
		return this.snakePlayers;
	}

	@DynamoDBAttribute
	public String getCurrentBudget() {
		return CurrentBudget;
	}

	@DynamoDBAttribute
	public String getTeamName() {
		return TeamName;
	}

	public void setName(String teamName) {
		this.TeamName = teamName;
	}

	public void addAuctionPlayer(SnakePlayer snakePlayer) {
		this.snakePlayers.add(snakePlayer);
	}

	public void setAuctionPlayers(List<SnakePlayer> snakePlayers) {
		this.snakePlayers = snakePlayers;
	}

	public void setCurrentBudget(String currentBudget) {
		this.CurrentBudget = currentBudget;
	}
}
