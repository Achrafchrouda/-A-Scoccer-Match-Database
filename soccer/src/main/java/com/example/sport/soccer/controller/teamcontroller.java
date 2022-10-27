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
import com.example.sport.soccer.models.Team;
import com.example.sport.soccer.services.Teamservices;
@CrossOrigin("http://localhost:4200") //(kan n7thhoa * twali taccaperty nas lkol )mnin khraaj reques o ne9belhha kan hiyaa hedhy l angular maneha
@RequestMapping("api/Teams")  //hedhy eli dour aleeha
@RestController //twaferli bq de param o
public class teamcontroller {
	@Autowired
	private Teamservices Teamservice;
	@GetMapping("")
	 public List<Team> getAlTeams(){
	 return Teamservice.getAllTeam();
	}	
	@DeleteMapping("/{id}")
	//pathvarriable trecuperi valeur mel url 
	public void delete(@PathVariable Long id) { 
	 Teamservice.deleteTeam(id);
	 }
	@PutMapping("/{id}")
	public Team update(@PathVariable Integer id , @RequestBody Team t) {
	 return Teamservice.updateTeam(t);
	}
	@GetMapping("/{id}")
	 public List<Team> getAllTeams(){
	 return Teamservice.getAllTeam();			 
}
	@PostMapping
	public Team add(@RequestBody Team t) {
	 return Teamservice.addTeam(t) ;}
}

