package com.ff.snake.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.snake.domain.SnakeLeague;
import com.ff.snake.domain.SnakeTeam;
import com.ff.snake.dto.CreateTeamDto;
import com.ff.snake.repository.SnakeLeagueRepository;
import com.ff.snake.service.SnakeTeamService;

@Service
public class SnakeTeamServiceImpl implements SnakeTeamService{

	@Autowired SnakeLeagueRepository snakeLeagueRepository;

	@Override
	public void createSnakeTeam(CreateTeamDto createTeamDto) {
		SnakeLeague persistentLeague= this.snakeLeagueRepository.findByLeagueName(createTeamDto.getLeagueName());
		SnakeTeam newSnakeTeam = new SnakeTeam(createTeamDto);
		newSnakeTeam.setDraftPosition(Integer.toString(persistentLeague.getSnakeTeams().size() + 1));
		persistentLeague.addSnakeTeam(newSnakeTeam);
		snakeLeagueRepository.save(persistentLeague);
	}

	@Override
	public boolean teamNameExists(String teamName) {
		List<SnakeLeague> persistentLeague= this.snakeLeagueRepository.findAll();
		for (SnakeLeague league: persistentLeague) {
			List<SnakeTeam> teams = league.getSnakeTeams();
			if (teams == null) {
				continue;
			}
			for (SnakeTeam team: teams) {
				if (team.getTeamName() == teamName) {
					return true;
				}
			}
			
		}
		return false;
	}

}
