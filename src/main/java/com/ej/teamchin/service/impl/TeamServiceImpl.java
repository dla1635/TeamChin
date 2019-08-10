package com.ej.teamchin.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ej.teamchin.dao.TeamDao;
import com.ej.teamchin.dto.Team;
import com.ej.teamchin.dto.TeamInfo;
import com.ej.teamchin.dto.TeamUser;
import com.ej.teamchin.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	 TeamDao teamDao;
	
	@Transactional
	@Override
	public int[] insertTeam(Team team, TeamUser teamUser) {
		
		// 팀,팀유저 생성한다.
		int teamId = teamDao.insertTeam(team);
		teamUser.setT_id(teamId);
		teamUser.setGrade(1); // 방장으로 설정
		int teamUserId = teamDao.insertTeamUser(teamUser);
		
		int[] result = new int[2];
		result[0] = teamId;
		result[1] = teamUserId;
		
		return result;
		
	}

	@Override
	public List<Team> selectTeamList(int userId) {
		return teamDao.selectTeamList(userId);
	}

	@Override
	public List<TeamInfo> selectTeam(int teamId) {
		return teamDao.selectTeam(teamId);
	}

}
