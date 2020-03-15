package com.ff.snake.domain;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.ff.snake.dto.DraftDto;

@DynamoDBDocument
public class SnakePlayer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String team;
    private String position;
    private String points;
    
    public SnakePlayer(){};
    
    public SnakePlayer(DraftDto draftDto) {
		this.name = draftDto.getPlayerName();
		this.team = draftDto.getTeam();
		this.position = draftDto.getPosition();
		this.team = draftDto.getTeam();
	}

	@DynamoDBAttribute
	public String getName() {
		return this.name;
	}
	@DynamoDBAttribute
	public String getTeam() {
		return this.team;
	}
	@DynamoDBAttribute
	public String getPosition() {
		return this.position;
	}
	@DynamoDBAttribute
	public String getPoints() {
		return this.points;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTeam(String footballTeam) {
		this.team = footballTeam;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public void setPoints(String points) {
		this.points = points;
	}

}