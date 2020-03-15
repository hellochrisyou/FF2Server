package com.ff.snake.service;

import com.ff.snake.dto.CreateTeamDto;

public interface SnakeTeamService {
	
	public void createSnakeTeam(CreateTeamDto createTeamDto) ;
	public boolean teamNameExists(String teamName);
}