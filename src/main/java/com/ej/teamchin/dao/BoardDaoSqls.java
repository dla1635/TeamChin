package com.ej.teamchin.dao;

public class BoardDaoSqls {
	//전체 게시판 글 불러오기 
	public static final String SELECT_BOARD_LIST = "SELECT B_id, T_id, TU_id, title, contents, image, create_date FROM Board";
}
