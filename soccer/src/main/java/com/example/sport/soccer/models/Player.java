package com.example.sport.soccer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PLAYER_ID")
	private long id;
	private String name;
	private int age;
	private String poste;
	private int nbr;
	public Player() {
		
	}
	public Player(long id, String name, int age, String poste, int nbr) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.poste = poste;
		this.nbr = nbr;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public int getNbr() {
		return nbr;
	}
	public void setNbr(int nbr) {
		this.nbr = nbr;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", poste=" + poste + ", nbr=" + nbr + "]";
	}
	
}
	