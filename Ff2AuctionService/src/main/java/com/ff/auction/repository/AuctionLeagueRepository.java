package com.ff.auction.repository;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.ff.auction.domain.AuctionLeague;

@EnableScan
public interface AuctionLeagueRepository extends CrudRepository<AuctionLeague, String> {
     
    AuctionLeague findByLeagueName(String leagueName);
    List<AuctionLeague> findAll();
    boolean existsByLeagueName(String name);
    }