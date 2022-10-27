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
import com.example.sport.soccer.models.Matche;
import com.example.sport.soccer.services.MatchService;
@CrossOrigin("http://localhost:4200") //(kan n7thhoa * twali taccaperty nas lkol )mnin khraaj reques o ne9belhha kan hiyaa hedhy l angular maneha
@RequestMapping("api/matches")  //hedhy eli dour aleeha
@RestController //twaferli bq de param o
public class MatchController{
	@Autowired
	private MatchService MatchService;
	@GetMapping("")
	 public List<Matche> getAllMatchs(){
	 return MatchService.getAllMatches();
	}	
	@DeleteMapping("/{id}")
	//pathvarriable trecuperi valeur mel url 
	public void delete(@PathVariable Long id) { 
	 MatchService.deleteMatch(id);
	 }
	@PutMapping("/{id}")
	public Matche update(@PathVariable Integer id , @RequestBody Matche m) {
	 return MatchService.updateMatches(m);
	}
	@GetMapping("/{id}")
	 public List<Matche> getAllMatches(){
	 return MatchService.getAllMatches();			 
}
	@PostMapping
	public Matche add(@RequestBody Matche m) {
	 return MatchService.addMatch(m) ;}
}	