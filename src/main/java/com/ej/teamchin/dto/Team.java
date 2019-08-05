package com.ej.teamchin.dto;

public class Team {
	
	String teamId;
	String name;
	
	
	public Team() {
	}
	
	public Team(String name) {
		this.name = name;
	}
	
	public Team(String teamId, String name) {
		super();
		this.teamId = teamId;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", name=" + name + "]";
	}
	
}
