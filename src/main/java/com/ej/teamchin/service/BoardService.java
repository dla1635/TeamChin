package com.ej.teamchin.service;

import java.util.List;

import com.ej.teamchin.dto.Board;
import com.ej.teamchin.dto.TeamUser;

public interface BoardService {
	public List<Board> getBoardList(Integer teamId);
	public Board getBoardItem(Integer boardId);
	
	public List<Board> getNoticeList(Integer teamId);
	public Board getNoticeItem(Integer noticeId);
	
	public Board insertBoardItem(Board board);
	public Board insertNoticeItem(Board notice);
	
	public List<TeamUser> getNoticeUserList(Integer noticeId);
	
	public int updateBoardItem(Board board);
	public int updateNoticeItem(Board notice);
}
