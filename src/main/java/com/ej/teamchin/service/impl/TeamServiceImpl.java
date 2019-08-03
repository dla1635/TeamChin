package com.ej.teamchin.service.impl;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ej.teamchin.config.DBConfig;
import com.ej.teamchin.dao.TeamDao;
import com.ej.teamchin.dto.Team;
import com.ej.teamchin.dto.TeamUser;
import com.ej.teamchin.service.TeamService;
import com.mysql.jdbc.PreparedStatement;

@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	 TeamDao teamDao;
	
	@Transactional
	@Override
	public int insertTeam(Team team, TeamUser teamUser) {
		
		// 팀,팀유저 생성한다.
		teamUser.setTeamId(teamDao.insertTeam(team));
		teamUser.setGrade(1); // 방장으로 설정
		return teamDao.insertTeamUser(teamUser);
	}

	@Override
	public List<Team> selectTeamList(int userId) {
		return teamDao.selectTeamList(userId);
	}

	@Override
	public Team selectTeam(int teamId) {
		return teamDao.selectTeam(teamId);
	}

}
