package com.example.sport.soccer.services;

import java.util.List;

import com.example.sport.soccer.models.Team;
public interface Teamservices {
		public List<Team> getAllTeam();
		public Team updateTeam(Team t);
		public void deleteTeam(Long id);
		public Team addTeam(Team t);
		public Team findById(Long id);
}


