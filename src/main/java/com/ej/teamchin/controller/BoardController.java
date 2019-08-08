package com.ej.teamchin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ej.teamchin.dto.Board;
import com.ej.teamchin.dto.TeamUser;
import com.ej.teamchin.service.BoardService;

@RestController
public class BoardController {
	@Autowired
	BoardService boardService;

	@GetMapping(path = "/{teamId}/board")
	public Map<String, Object> getBoardList(@PathVariable(name = "teamId", required = true) int teamId) {
		String statusResult = "fail";
		List<Board> boardList = boardService.getBoardList(teamId);

		if (boardList != null) {
			statusResult = "success";
		}

		Map<String, Object> map = new HashMap<>();
		map.put("status", statusResult);
		map.put("boardList", boardList);

		return map;
	}

	@GetMapping(path = "/{teamId}/notice")
	public Map<String, Object> getNoticeList(@PathVariable(name = "teamId", required = true) int teamId) {
		String statusResult = "fail";
		List<Board> noticeList = boardService.getNoticeList(teamId);

		if (noticeList != null) {
			statusResult = "success";
		}
		Map<String, Object> map = new HashMap<>();
		map.put("status", statusResult);
		map.put("noticeList", noticeList);

		return map;
	}

	@GetMapping(path = "/{teamId}/board/{boardId}")
	public Map<String, Object> getBoardItem(@PathVariable(name = "teamId", required = true) int teamId,
			@PathVariable(name = "boardId", required = true) int boardId) {
		String statusResult = "fail";
		Board board = boardService.getBoardItem(boardId);

		if (board != null) {
			statusResult = "success";
		}
		Map<String, Object> map = new HashMap<>();
		map.put("status", statusResult);
		map.put("board", board);

		return map;
	}

	@GetMapping(path = "/{teamId}/notice/{noticeId}")
	public Map<String, Object> getNoticeItem(@PathVariable(name = "teamId", required = true) int teamId,
			@PathVariable(name = "noticeId", required = true) int noticeId) {
		String statusResult = "fail";
		Board notice = boardService.getNoticeItem(noticeId);
		List<TeamUser> noticeUser = boardService.getNoticeUserList(noticeId);

		if (notice != null) {
			statusResult = "success";
		}
		Map<String, Object> map = new HashMap<>();
		map.put("status", statusResult);
		map.put("notice", notice);
		map.put("noticeUser", noticeUser);

		return map;
	}

	@PostMapping(path = "/insertBoard")
	public Map<String, Object> insertBoardItem(@RequestBody Board board) {
		String statusResult = "fail";
		Board resultBoard = boardService.insertBoardItem(board);

		if (resultBoard != null) {
			statusResult = "success";
		}
		Map<String, Object> map = new HashMap<>();
		map.put("status", statusResult);

		return map;
	}

	@PostMapping(path = "/insertNotice")
	public Map<String, Object> insertNoticeItem(@RequestBody Board notice) {
		String statusResult = "fail";
		Board resultNotice = boardService.insertNoticeItem(notice);

		if (resultNotice != null) {
			statusResult = "success";
		}
		Map<String, Object> map = new HashMap<>();
		map.put("status", statusResult);

		return map;
	}
}