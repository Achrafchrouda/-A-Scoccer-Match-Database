package com.example.sport.soccer.services;

import java.util.List;

import com.example.sport.soccer.models.Player;

public interface Playerservice {
		public List<Player> getAllPlayer();
		public Player updatePlayer(Player p);
		public void deletePlayer(Long id);
		public Player addPlayer(Player p);
		public Player findById(Long id);
}

