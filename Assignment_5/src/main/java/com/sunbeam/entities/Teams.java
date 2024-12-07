package com.sunbeam.entities;

import javax.persistence.*;

@Entity
@Table(name = "Teams")
public class Teams {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="team_id")
	private int id;
	@Column(length = 20, name="name")
	private String name;
	@Column(length = 20, name="abbreviation")
	private String abbreviation;
	@Column(name="batting_avg")
	private double batting_avg;
	@Column(name="wickets")	
	private int wickets;
	
	public Teams() {
	}

	public Teams(String name, String abbreviation, double batting_avg, int wickets) {
		this.name = name;
		this.abbreviation = abbreviation;
		this.batting_avg = batting_avg;
		this.wickets = wickets;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public double getBatting_avg() {
		return batting_avg;
	}

	public void setBatting_avg(double batting_avg) {
		this.batting_avg = batting_avg;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return "Teams...\nTeam Id: " + id + ", \nTeam Name: " + name + ", \nAbbreviation: " + abbreviation + ", \nBatting Average: " + batting_avg
				+ ", \nWickets=" + wickets;
	}	
}
