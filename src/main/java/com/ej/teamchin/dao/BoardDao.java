package com.ej.teamchin.dao;

import static com.ej.teamchin.dao.BoardDaoSqls.*;

import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ej.teamchin.dto.Board;

@Repository
public class BoardDao {
	private NamedParameterJdbcTemplate jdbc;
	private RowMapper<Board> rowMapper = BeanPropertyRowMapper.newInstance(Board.class);

	public BoardDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<Board> selectBoardList() {
		return jdbc.query(SELECT_BOARD_LIST, Collections.emptyMap(), rowMapper);
	}
}
