package com.ej.teamchin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ej.teamchin.dto.Team;
import com.ej.teamchin.service.TeamService;


@RestController
public class TeamController {

	@Autowired
	TeamService teamService;
	
	@GetMapping(path="/insertTeam")
	public void insertTeam() {
		
		System.out.println("TeamController");
		Team team = new Team("jongwan");
		int result = teamService.insertTeam(team);
		System.out.println("generate key : "+result);
//		Map<String, Object> map = new HashMap<>();
//		map.put("reservationInfo", result);
//		return map;
	}
}
