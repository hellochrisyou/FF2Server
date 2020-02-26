package com.ff.snake.repository;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.ff.snake.domain.SnakeLeague;

@EnableScan
public interface SnakeLeagueRepository extends CrudRepository<SnakeLeague, String> {
     
	SnakeLeague findByLeagueName(String id);
    List<SnakeLeague> findAll();
    boolean existsByLeagueName(String name);
    }