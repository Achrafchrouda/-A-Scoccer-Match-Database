package com.example.sport.soccer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sport.soccer.models.Team;

public interface TeamRepository extends JpaRepository<Team,Long> {

}
