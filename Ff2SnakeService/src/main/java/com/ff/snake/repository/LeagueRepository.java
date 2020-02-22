package com.ff.snake.repository;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.ff.snake.domain.SnakeLeague;

@EnableScan
public interface LeagueRepository extends CrudRepository<SnakeLeague, String> {
     
	SnakeLeague findByName(String id);
    List<SnakeLeague> findAll();
    boolean existsByName(String name);
    }