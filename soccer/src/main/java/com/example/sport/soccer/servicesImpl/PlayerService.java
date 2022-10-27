package com.example.sport.soccer.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.sport.soccer.models.Player;
import com.example.sport.soccer.repositories.PlayerRepository;
import com.example.sport.soccer.services.Playerservice;
@Service
public class PlayerService implements Playerservice{
	private PlayerRepository playerrepository;
	@Override
	public List<Player> getAllPlayer() {
		// TODO Auto-generated method stub
		return playerrepository.findAll();
	}

	@Override
	public Player updatePlayer(Player p) {
		// TODO Auto-generated method stub
		return playerrepository.save(p);
	}

	@Override
	public void deletePlayer(Long id) {
		// TODO Auto-generated method stub
		playerrepository.deleteById(id);
	}

	@Override
	public Player addPlayer(Player p) {
		// TODO Auto-generated method stub
		return playerrepository.save(p);
	}

	@Override
	public Player findById(Long id) {
		// TODO Auto-generated method stub
		Optional <Player> Player = playerrepository.findById(id);
		   return Player.isPresent() ? Player.get() : null;
	}

}
