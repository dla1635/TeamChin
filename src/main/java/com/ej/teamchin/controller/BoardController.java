package com.ej.teamchin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ej.teamchin.dto.Board;
import com.ej.teamchin.service.BoardService;


@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@GetMapping(path="/boardList")
	public String getBoardList(@RequestParam(name="teamId", required=true) int teamId, ModelMap model) {
		List<Board> boardList = boardService.getBoardList(teamId);
		System.out.println(boardList);
		return "index";
	}
	
	@PostMapping(path="/insertBoard")
	public String insertBoardItem(@ModelAttribute Board board) {
		boardService.insertBoardItem(board);
		return "index";
	}
	
	@PostMapping(path="/insertNotice")
	public String insertNoticeItem(@ModelAttribute Board notice) {
		boardService.insertNoticeItem(notice);
		return "index";
	}
}
