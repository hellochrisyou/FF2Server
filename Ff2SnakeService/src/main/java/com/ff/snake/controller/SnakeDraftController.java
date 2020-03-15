package com.ff.snake.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ff.snake.domain.SnakeLeague;
import com.ff.snake.dto.CreateSnakeDto;
import com.ff.snake.service.SnakeLeagueService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/snake")
public class SnakeDraftController {
	
	@Autowired
	private SnakeLeagueService snakeLeagueService;
	
	@CrossOrigin	
	@PostMapping(value = "/createSnakeLeague/", consumes = "application/json", produces = "application/json")
	public void createLeague(@RequestBody CreateSnakeDto createSnakeDto) {
		this.snakeLeagueService.createSnakeLeague(createSnakeDto);
	}
	
	@CrossOrigin	
	@PostMapping(value = "/getAllLeagues/", consumes = "application/json", produces = "application/json")
	public List<SnakeLeague> getAllLeagues(@RequestBody String email) {
		return this.snakeLeagueService.getAllLeagues(email);
	}
	
	@CrossOrigin	
	@PostMapping(value = "/getMyLeagues/", consumes = "application/json", produces = "application/json")
	public List<SnakeLeague> getMyLeagues(@RequestBody String email) {
		return this.snakeLeagueService.getMyLeagues(email);
	}
	
	@CrossOrigin	
	@GetMapping(value = "/existsByLeagueName/{name}", consumes = "application/json", produces = "application/json")
	public boolean leagueNameExists(@PathVariable String name) {
		return this.snakeLeagueService.existsByLeagueName(name);
	}
}
