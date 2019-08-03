package com.ej.teamchin.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ej.teamchin.dao.BoardDao;
import com.ej.teamchin.dto.Board;
import com.ej.teamchin.dto.TeamUser;
import com.ej.teamchin.service.BoardService;

@Service
public class BoardServiceImple implements BoardService{
	@Autowired
	BoardDao boardDao;
	
	@Override
	@Transactional
	public List<Board> getBoardList(Integer teamId) {
		List<Board> list = boardDao.selectBoardList(teamId);
		return list;
	}

	@Override
	@Transactional
	public Board getBoardItem(Integer boardId) {
		Board item = boardDao.selectBoardItem(boardId);
		return item;
	}

	@Override
	@Transactional(readOnly = false)
	public Board insertBoardItem(Board board) {
		board.setCreateDate(new Date());
		int boardId = boardDao.insertBoard(board);
		board.setBoardId(boardId);
		return board;
	}

	@Override
	@Transactional(readOnly = false)
	public Board insertNoticeItem(Board notice) {
		notice.setCreateDate(new Date());
		int noticeId = boardDao.insertNotice(notice);
		notice.setBoardId(noticeId);
		return notice;
	}

	@Override
	@Transactional
	public List<Board> getNoticeList(Integer teamId) {
		List<Board> list = boardDao.selectNoticeList(teamId);
		return list;
	}

	@Override
	@Transactional
	public Board getNoticeItem(Integer noticeId) {
		Board item = boardDao.selectNoticeItem(noticeId);
		return item;
	}

	@Override
	@Transactional
	public List<TeamUser> getNoticeUserList(Integer noticeId) {
		List<TeamUser> list = boardDao.selectNoticeUserList(noticeId);
		return list;
	}

	@Override
	@Transactional(readOnly = false)
	public int updateBoardItem(Board board) {
		return boardDao.updateBoardItem(board);
	}

	@Override
	@Transactional(readOnly = false)
	public int updateNoticeItem(Board notice) {
		return boardDao.updateNoticeItem(notice);
	}
	
}
