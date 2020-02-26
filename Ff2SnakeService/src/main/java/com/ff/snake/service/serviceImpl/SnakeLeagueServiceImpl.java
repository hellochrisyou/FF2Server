package com.ff.snake.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ff.snake.domain.SnakeLeague;
import com.ff.snake.dto.CreateSnakeDto;
import com.ff.snake.repository.SnakeLeagueRepository;
import com.ff.snake.service.SnakeLeagueService;

public class SnakeLeagueServiceImpl implements SnakeLeagueService {
	
	@Autowired
	private SnakeLeagueRepository snakeLeagueRepository;
	
	@Override
	public void createSnakeLeague(CreateSnakeDto createDto) {
		SnakeLeague newAuctionLeague = new SnakeLeague(createDto);
		this.snakeLeagueRepository.save(newAuctionLeague);
		return;
	}
	
	@Override
	public List<SnakeLeague> getAllLeagues() {
		List<SnakeLeague> auctionLeague =  snakeLeagueRepository.findAll();
		return auctionLeague;
	}

	@Override
	public boolean existsByLeagueName(String leagueName) {		
		if (this.snakeLeagueRepository.existsByLeagueName(leagueName)) {
			return true;
		} else {
		return false;
		}
	}
}
