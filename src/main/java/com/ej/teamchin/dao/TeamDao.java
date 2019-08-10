package com.ej.teamchin.dao;

import static com.ej.teamchin.dao.sqls.TeamDaoSqls.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.ej.teamchin.dto.Team;
import com.ej.teamchin.dto.TeamInfo;
import com.ej.teamchin.dto.TeamUser;


@Repository
public class TeamDao {
	
	private NamedParameterJdbcTemplate jdbc;
	private RowMapper<Team> rowMapperTeam = BeanPropertyRowMapper.newInstance(Team.class);
	private RowMapper<TeamInfo> rowMapperTeamInfo = BeanPropertyRowMapper.newInstance(TeamInfo.class);

	private SimpleJdbcInsert insertActionTeam;
	private SimpleJdbcInsert insertActionTeamUser;
	
	public TeamDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertActionTeam = new SimpleJdbcInsert(dataSource)
                .withTableName("Team")
                .usingColumns("name")
                .usingGeneratedKeyColumns("T_id");
		
		this.insertActionTeamUser = new SimpleJdbcInsert(dataSource)
                .withTableName("Team_User")
                .usingColumns("U_id","T_id","grade","nickname")
                .usingGeneratedKeyColumns("TU_id");
	}
	
	public int insertTeam (Team team) {
		System.out.println("insertTeam");
		Map<String, Object> params = new HashMap<>();
		params.put("name", team.getName());
		return insertActionTeam.executeAndReturnKey(params).intValue();
	}
	
	public int insertTeamUser (TeamUser teamUser) {
		
		System.out.println(teamUser);
		Map<String, Object> params = new HashMap<>();
		params.put("U_id", teamUser.getU_id());
		params.put("T_id", teamUser.getT_id());
		params.put("grade", teamUser.getGrade());
		params.put("nickname", teamUser.getNickname());
		return insertActionTeamUser.executeAndReturnKey(params).intValue();
	}
	
	public List<Team> selectTeamList (int userId) {
		
		Map<String, Integer> params = new HashMap<>();
		params.put("U_id", userId);
		System.out.println(userId);
		return jdbc.query(SELECT_TEAM_LIST, params, rowMapperTeam);
		
	}
	
	public List<TeamInfo> selectTeam (int teamId) {
		
		Map<String, Integer> params = new HashMap<>();
		params.put("T_id", teamId);
		return jdbc.query(SELECT_TEAM, params, rowMapperTeamInfo);
		
	}
	
}
