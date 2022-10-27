package com.example.sport.soccer.services;
import java.util.List;


import com.example.sport.soccer.models.Matche;
public interface MatchService {
		public List<Matche> getAllMatches();
		public Matche updateMatches(Matche m);
		public void deleteMatch(Long id);
		public Matche addMatch(Matche m);
		public Matche findById(Long id);
		//public String deleteAllMatches();
}