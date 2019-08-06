package com.ej.teamchin.dto;

public class Team {
	
	String T_id;
	String name;
	
	
	public Team() {
	}
	
	public Team(String name) {
		this.name = name;
	}

	public Team(String t_id, String name) {
		super();
		T_id = t_id;
		this.name = name;
	}

	public String getT_id() {
		return T_id;
	}

	public void setT_id(String t_id) {
		T_id = t_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Team [T_id=" + T_id + ", name=" + name + "]";
	}
	
	
	
}
