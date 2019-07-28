package com.ej.teamchin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ej.teamchin.dao.BoardDao;
import com.ej.teamchin.dto.Board;
import com.ej.teamchin.service.BoardService;

@Service
public class BoardServiceImple implements BoardService{
	@Autowired
	BoardDao boardDao;
	
	@Override
	@Transactional
	public List<Board> getBoardList() {
		List<Board> list = boardDao.selectBoardList();
		return list;
	}
	
}
