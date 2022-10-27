package com.example.sport.soccer.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sport.soccer.models.Matche;
import com.example.sport.soccer.repositories.MatchRepository;
import com.example.sport.soccer.services.MatchService;
@Service
public class MatcheService implements MatchService {
	@Autowired
	private MatchRepository matchrepository;

	@Override
	public List<Matche> getAllMatches() {
		// TODO Auto-generated method stub	
		return matchrepository.findAll();
	}

	@Override
	public Matche updateMatches(Matche m) {
		// TODO Auto-generated method stub
		return matchrepository.save(m);
	}
	@Override
	public void deleteMatch(Long id) {
		// TODO Auto-generated method stub	
		matchrepository.deleteById(id);
	}

	@Override
	public Matche addMatch(Matche m) {
		System.out.println("here");
		return matchrepository.save(m);
	}

	@Override
	public Matche findById(Long id) {
		// TODO Auto-generated method stub
		  Optional <Matche> Matche = matchrepository.findById(id);
		   return Matche.isPresent() ? Matche.get() : null ;

	}

	


}
