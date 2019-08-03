package com.ej.teamchin.service;

import java.sql.Connection;
import java.util.List;

import com.ej.teamchin.dto.Team;
import com.ej.teamchin.dto.TeamUser;

public interface TeamService {

	int insertTeam(Team team, TeamUser teamUser);
	List<Team> selectTeamList(int userId);
	Team selectTeam(int teamId);
}
