package com.ej.teamchin.dao.sqls;

public class BoardDaoSqls {
	//전체 게시판 글 불러오기 
	public static final String SELECT_BOARD_LIST = "SELECT Board.B_id boardId, Board.T_id teamId, Board.TU_id teamUserId, Team_User.nickname, Team_User.profile_image profileImage, Board.title, Board.contents, Board.image, Board.create_date createDate " + 
			"FROM Board, Team_User " + 
			"WHERE Board.TU_id = Team_User.TU_id and Board.T_id = :teamId";
	
	public static final String SELECT_BOARD_ITEM = "SELECT Board.B_id boardId, Board.T_id teamId, Board.TU_id teamUserId, Team_User.nickname, Team_User.profile_image profileImage, Board.title, Board.contents, Board.image, Board.create_date createDate " + 
			"FROM Board, Team_User " + 
			"WHERE Board.TU_id = Team_User.TU_id and Board.B_id = :boardId";
	
	public static final String SELECT_NOTICE_LIST = "SELECT Notice.N_id boardId, Notice.T_id teamId, Notice.TU_id teamUserId, Team_User.nickname, Team_User.profile_image profileImage, Notice.contents, Notice.image, Notice.create_date createDate " + 
			"FROM Notice, Team_User " + 
			"WHERE Notice.TU_id = Team_User.TU_id and Notice.T_id = :teamId";
			
	public static final String SELECT_NOTICE_ITEM = "SELECT Notice.N_id boardId, Notice.T_id teamId, Notice.TU_id teamUserId, Team_User.nickname, Team_User.profile_image profileImage, Notice.contents, Notice.image, Notice.create_date createDate " + 
			"FROM Notice, Team_User " + 
			"WHERE Notice.TU_id = Team_User.TU_id and Notice.N_id = :noticeId";
	
	public static final String SELECT_NOTICE_USER_LIST = "SELECT Team_User.TU_id teamUserId, Team_User.U_id userId, Team_User.T_id teamId, Team_User.rank, Team_User.nickname, Team_User.profile_image profileImage, Team_User.status_message statusMessage " + 
			"FROM Notice_User, Team_User " + 
			"WHERE Notice_User.TU_id = Team_User.TU_Id and Notice_User.N_id = :noticeId";
	
	//public static final String INSERT_BOARD = "INSERT INTO Board(T_id, TU_id, title, contents, image, create_date) VALUES(?, ?, ?, ?, ?, ?)";
}
