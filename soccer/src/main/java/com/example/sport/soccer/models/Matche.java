package com.example.sport.soccer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Matche {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CLIENT_ID")
	public Long id;
	@Column(name="score")
	public int scoreOne;
	public int scoreTwo;
	public String teamOne;
	public String teamTwo;
	public Matche() {
	}

	public Matche(Long id, int scoreOne, int scoreTwo, String teamOne, String teamTwo) {
		super();
		this.id = id;
		this.scoreOne = scoreOne;
		this.scoreTwo = scoreTwo;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getScoreOne() {
		return scoreOne;
	}
	public void setScoreOne(int scoreOne) {
		this.scoreOne = scoreOne;
	}
	public int getScoreTwo() {
		return scoreTwo;
	}
	public void setScoreTwo(int scoreTwo) {
		this.scoreTwo = scoreTwo;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	@Override
	public String toString() {
		return "Matche [id=" + id + ", scoreOne=" + scoreOne + ", scoreTwo=" + scoreTwo + ", teamOne=" + teamOne
				+ ", teamTwo=" + teamTwo + "]";
	}
	
	
}
