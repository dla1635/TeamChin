package com.ej.teamchin.service.impl;


import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ej.teamchin.config.DBConfig;
import com.ej.teamchin.dao.TeamDao;
import com.ej.teamchin.dto.Team;
import com.ej.teamchin.service.TeamService;
import com.mysql.jdbc.PreparedStatement;

@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	 TeamDao teamDao;
	
	@Override
	public int insertTeam(Team team) {
		
		return teamDao.insertTeam(team);
	}

}
