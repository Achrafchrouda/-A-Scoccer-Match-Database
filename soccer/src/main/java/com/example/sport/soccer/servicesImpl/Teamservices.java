package com.example.sport.soccer.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.sport.soccer.models.Team;
import com.example.sport.soccer.repositories.TeamRepository;
@Service
public class Teamservices implements com.example.sport.soccer.services.Teamservices{
private TeamRepository teamrepository;

@Override
public List<Team> getAllTeam() {
	// TODO Auto-generated method stub
	return teamrepository.findAll();
}

@Override
public Team updateTeam(Team t) {
	// TODO Auto-generated method stub
	return teamrepository.save(t);
}

@Override
public void deleteTeam(Long id) {
	// TODO Auto-generated method stub
	teamrepository.deleteById(id);
}

@Override
public Team addTeam(Team t) {
	// TODO Auto-generated method stub
	return teamrepository.save(t);
}

@Override
public Team findById(Long id) {
	// TODO Auto-generated method stub
	Optional <Team> Team = teamrepository.findById(id);
	   return Team.isPresent() ? Team.get() : null;
}
}