package com.example.sport.soccer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.sport.soccer.models.Player;

import com.example.sport.soccer.servicesImpl.PlayerService;
@CrossOrigin("http://localhost:4200") //(kan n7thhoa * twali taccaperty nas lkol )mnin khraaj reques o ne9belhha kan hiyaa hedhy l angular maneha
@RequestMapping("api/players")  //hedhy eli dour aleeha
@RestController //twaferli bq de param o
public class PlayerController {
		@Autowired
		private PlayerService PlayerService;
		@GetMapping("")
		 public List<Player> getAllPlayers1(){
		 return PlayerService.getAllPlayer();
		}	
		@DeleteMapping("/{id}")
		//pathvarriable trecuperi valeur mel url 
		public void delete(@PathVariable Long id) { 
		 PlayerService.deletePlayer(id);
		 }
		@PutMapping("/{id}")
		public Player update(@PathVariable Integer id , @RequestBody Player p) {
		 return PlayerService.updatePlayer(p);
		}
		@GetMapping("/{id}")
		 public List<Player> getAllPlayers(){
		 return PlayerService.getAllPlayer();			 
	}
		@PostMapping
		public Player add(@RequestBody Player p) {
		 return PlayerService.addPlayer(p) ;}
	}	

