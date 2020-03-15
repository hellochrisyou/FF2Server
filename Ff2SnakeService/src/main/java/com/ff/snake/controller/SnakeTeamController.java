package com.ff.snake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ff.snake.dto.CreateTeamDto;
import com.ff.snake.service.SnakeTeamService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/snake/team")
public class SnakeTeamController {
	
	@Autowired
	private SnakeTeamService snakeTeamService;
	
	@CrossOrigin	
	@PostMapping(value = "/createTeam/", consumes = "application/json", produces = "application/json")
	public void createTeam(@RequestBody CreateTeamDto createTeamDto) {
		this.snakeTeamService.createSnakeTeam(createTeamDto);
		return;
	}
	
	@CrossOrigin	
	@GetMapping(value = "/teamNameExists/{name}", consumes = "application/json", produces = "application/json")
	public boolean teamNameExists(@PathVariable String name) {
		boolean check =  this.snakeTeamService.teamNameExists(name);
		return check;
	}
}

//this.delegateController.delegateCreateTeam(createTeamDto);
