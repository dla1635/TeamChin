package com.ej.teamchin.service;

import java.util.List;

import com.ej.teamchin.dto.Board;

public interface BoardService {
	public List<Board> getBoardList(Integer teamId);
	public Board getBoardItem(Integer boardId);
	public Board insertBoardItem(Board board);
	public Board insertNoticeItem(Board notice);
}
