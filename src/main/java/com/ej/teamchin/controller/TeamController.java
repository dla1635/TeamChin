package com.ej.teamchin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ej.teamchin.dto.Team;
import com.ej.teamchin.dto.TeamUser;
import com.ej.teamchin.service.TeamService;

@CrossOrigin(origins = "http://localhost:8084")
@RestController
public class TeamController {

	@Autowired
	TeamService teamService;
	
	@PostMapping(path="/insertTeam")
	public Map<String, Integer> insertTeam(@ModelAttribute("t") Team team, @ModelAttribute("tu") TeamUser teamUser) {
		
		System.out.println("insertTeam-----------");
		System.out.println("team : "+team);
		System.out.println("teamUser : "+teamUser);
		int result = teamService.insertTeam(team, teamUser);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("insertResult", result);
		
		return map;
	}
	
	@PostMapping(path="/selectTeamList")
	public Map<String, List<Team>> selectTeamList(@RequestParam(name="U_id", required=true) int U_id) {
		
		System.out.println("selectTeamList");
		System.out.println("U_id : "+U_id);

		List<Team> result = teamService.selectTeamList(U_id);
		
		Map<String, List<Team>> map = new HashMap<>();
		map.put("teamList", result);
		System.out.println(result);
		return map;
	}
	
	@GetMapping(path="/selectTeam")
	public Map<String, Team> selectTeam(@RequestParam(name="T_id", required=true) int T_id) {
		
		System.out.println("selectTeam");
		System.out.println("T_id : "+T_id);
		
		Team result = teamService.selectTeam(T_id);
		
		Map<String, Team> map = new HashMap<>();
		map.put("team", result);
		
		return map;
	}
	
	
}
