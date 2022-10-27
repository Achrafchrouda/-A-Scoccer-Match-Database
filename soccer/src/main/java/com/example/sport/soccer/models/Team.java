package com.example.sport.soccer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Team {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TEAM_ID")
	private long id;
	private String name;
	private String foundation;
	private String owner;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(long id, String name, String foundation, String owner) {
		super();
		this.id = id;
		this.name = name;
		this.foundation = foundation;
		this.owner = owner;
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
	public String getFoundation() {
		return foundation;
	}
	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", foundation=" + foundation + ", owner=" + owner + "]";
	}
	

	


}
