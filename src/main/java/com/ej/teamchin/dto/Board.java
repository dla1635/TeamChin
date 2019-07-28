package com.ej.teamchin.dto;

import java.util.Date;

public class Board {
	private int boardId;
	private int teamId;
	private int teamUserId;
	private String title;
	private String contents;
	private String image;
	private Date createDate;
	
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getTeamUserId() {
		return teamUserId;
	}
	public void setTeamUserId(int teamUserId) {
		this.teamUserId = teamUserId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Board [boardId=" + boardId + ", teamId=" + teamId + ", teamUserId=" + teamUserId + ", title=" + title
				+ ", contents=" + contents + ", image=" + image + ", createDate=" + createDate + "]";
	}
	
}
