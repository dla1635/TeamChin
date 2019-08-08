package com.ej.teamchin.dao;

import static com.ej.teamchin.dao.sqls.BoardDaoSqls.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.ej.teamchin.dto.Board;
import com.ej.teamchin.dto.TeamUser;

@Repository
public class BoardDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertActionBoard;
	private SimpleJdbcInsert insertActionNotice;
	private RowMapper<Board> rowMapper = BeanPropertyRowMapper.newInstance(Board.class);
	private RowMapper<TeamUser> rowMapperTeamUser = BeanPropertyRowMapper.newInstance(TeamUser.class);
public BoardDao(DataSource dataSource) {
	this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	this.insertActionBoard = new SimpleJdbcInsert(dataSource)
            .withTableName("Board")
            .usingColumns("T_id", "TU_id", "title", "contents", "image", "create_date")
            .usingGeneratedKeyColumns("B_id");
	this.insertActionNotice = new SimpleJdbcInsert(dataSource)
            .withTableName("Notice")
            .usingColumns("T_id", "TU_id", "contents", "image", "create_date")
            .usingGeneratedKeyColumns("N_id");
}

public List<Board> selectBoardList(Integer teamId) {
	Map<String, Integer> params = new HashMap<>();
	params.put("teamId", teamId);
	return jdbc.query(SELECT_BOARD_LIST, params, rowMapper);
}

// 필요없을 것 같음
public Board selectBoardItem(Integer boardId) {
	Map<String, Integer> params = new HashMap<>();
	params.put("boardId", boardId);
	return jdbc.queryForObject(SELECT_BOARD_ITEM, params, rowMapper);
}

public List<Board> selectNoticeList(Integer teamId) {
	Map<String, Integer> params = new HashMap<>();
	params.put("teamId", teamId);
	return jdbc.query(SELECT_NOTICE_LIST, params, rowMapper);
}

// 필요없을 것 같음
public Board selectNoticeItem(Integer noticeId) {
	Map<String, Integer> params = new HashMap<>();
	params.put("noticeId", noticeId);
	return jdbc.queryForObject(SELECT_NOTICE_ITEM, params, rowMapper);
}

public List<TeamUser> selectNoticeUserList(Integer noticeId) {
	Map<String, Integer> params = new HashMap<>();
	params.put("noticeId", noticeId);
	return jdbc.query(SELECT_NOTICE_USER_LIST, params, rowMapperTeamUser);
}

public int insertBoard(Board board) {
	Map<String, Object> params = new HashMap<>();
	params.put("T_id", board.getTeamId());
	params.put("TU_id", board.getTeamUserId());
	params.put("title", board.getTitle());
	params.put("contents", board.getContents());
	params.put("image", board.getImage());
	params.put("create_date", board.getCreateDate());
	
	return insertActionBoard.executeAndReturnKey(params).intValue();
}

public int insertNotice(Board notice) {
	Map<String, Object> params = new HashMap<>();
	params.put("T_id", notice.getTeamId());
	params.put("TU_id", notice.getTeamUserId());
	params.put("contents", notice.getContents());
	params.put("image", notice.getImage());
	params.put("create_date", notice.getCreateDate());
	
	return insertActionNotice.executeAndReturnKey(params).intValue();
}

public int updateBoardItem(Board board) {
	Map<String, Object> params = new HashMap<>();
	params.put("title", board.getTitle());
	params.put("contents", board.getContents());
	params.put("image", board.getImage());
	params.put("boardId", board.getBoardId());
	
	return jdbc.update(UPDATE_BOARD_ITEM, params);
}

public int updateNoticeItem(Board notice) {
	Map<String, Object> params = new HashMap<>();
	params.put("contents", notice.getContents());
	params.put("image", notice.getImage());
	params.put("noticeId", notice.getBoardId());
	
	return jdbc.update(UPDATE_NOTICE_ITEM, params);
}
}