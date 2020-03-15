package com.ff.snake.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.snake.domain.SnakeLeague;
import com.ff.snake.domain.SnakeTeam;
import com.ff.snake.dto.CreateSnakeDto;
import com.ff.snake.repository.SnakeLeagueRepository;
import com.ff.snake.service.SnakeLeagueService;

@Service
public class SnakeLeagueServiceImpl implements SnakeLeagueService {
	
	@Autowired
	private SnakeLeagueRepository snakeLeagueRepository;
	
	@Override
	public void createSnakeLeague(CreateSnakeDto createDto) {
		SnakeLeague newSnakeLeague = new SnakeLeague(createDto);
		this.snakeLeagueRepository.save(newSnakeLeague);
		return;
	}
	
	@Override
	public List<SnakeLeague> getAllLeagues(String email) {
		List<SnakeLeague> persistentLeague = this.snakeLeagueRepository.findAll();
		List<SnakeLeague> returnLeague = new ArrayList<SnakeLeague>(persistentLeague);
		for (SnakeLeague tmpLeague : persistentLeague) {
			for (SnakeTeam tmpTeam : tmpLeague.getSnakeTeams()) {
				if (tmpTeam.getEmail().equals(email)) {
					returnLeague.remove(tmpLeague);
				}
			}
		}
		return returnLeague;
	}
	
	public List<SnakeLeague> getMyLeagues(String email) {
		List<SnakeLeague> persistentLeague = this.snakeLeagueRepository.findAll();
		List<SnakeLeague> returnLeague = new ArrayList<SnakeLeague>();
		for (SnakeLeague tmpLeague : persistentLeague) {
			for (SnakeTeam tmpTeam : tmpLeague.getSnakeTeams()) {
				if (tmpTeam.getEmail().equals(email)) {
					returnLeague.add(tmpLeague);
				}
			}
		}
		return returnLeague;
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
