package com.ff.auction.repository;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.ff.auction.domain.AuctionLeague;

@EnableScan
public interface LeagueRepository extends CrudRepository<AuctionLeague, String> {
     
    AuctionLeague findByName(String id);
    List<AuctionLeague> findAll();
    boolean existsByName(String name);
    }