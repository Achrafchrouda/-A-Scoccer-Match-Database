package com.example.sport.soccer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sport.soccer.models.Player;

public interface PlayerRepository extends JpaRepository<Player,Long> {

}
