package com.ej.teamchin.dto;

public class TeamUser {
	
	private int teamUserId;
	private int userId;
	private int teamId;
	private int grade;
	private String nickname;
	private String profileImage;
	private String statusMessage;
	
	public int getTeamUserId() {
		return teamUserId;
	}
	public void setTeamUserId(int teamUserId) {
		this.teamUserId = teamUserId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	@Override
	public String toString() {
		return "TeamUser [teamUserId=" + teamUserId + ", userId=" + userId + ", teamId=" + teamId + ", rank=" + grade
				+ ", nickname=" + nickname + ", profileImage=" + profileImage + ", statusMessage=" + statusMessage
				+ "]";
	}

}
	
	
