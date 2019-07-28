package com.ej.teamchin.dao;

import static com.ej.teamchin.dao.sqls.InsertTeam.INSERT_TEAM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.ej.teamchin.config.DBConfig;
import com.ej.teamchin.dto.Category;
import com.ej.teamchin.dto.Team;


@Repository
public class TeamDao {
	
	private NamedParameterJdbcTemplate jdbc;
	private RowMapper<Category> rowMapper = BeanPropertyRowMapper.newInstance(Category.class);
	private SimpleJdbcInsert insertActionTeam;
	
	public TeamDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertActionTeam = new SimpleJdbcInsert(dataSource)
                .withTableName("Team")
                .usingColumns("name")
                .usingGeneratedKeyColumns("T_id");
	}
	
	public int insertTeam (Team team) {
		
		Map<String, Object> params = new HashMap<>();
		params.put("name", team.getName());
		
		return insertActionTeam.executeAndReturnKey(params).intValue();
	}
}
