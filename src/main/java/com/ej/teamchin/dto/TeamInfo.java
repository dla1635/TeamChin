package com.ej.teamchin.dto;

public class TeamInfo {

	private int TU_id;
	private int U_id;
	private int T_id;
	private int grade;
	private String nickname;
	private String profileImage;
	private String statusMessage;
	private String name;
	
	public TeamInfo() {}
	
	public TeamInfo(int tU_id, int u_id, int t_id, int grade, String nickname, String profileImage,
			String statusMessage, String name) {
		super();
		TU_id = tU_id;
		U_id = u_id;
		T_id = t_id;
		this.grade = grade;
		this.nickname = nickname;
		this.profileImage = profileImage;
		this.statusMessage = statusMessage;
		this.name = name;
	}

	public int getTU_id() {
		return TU_id;
	}


	public void setTU_id(int tU_id) {
		TU_id = tU_id;
	}


	public int getU_id() {
		return U_id;
	}


	public void setU_id(int u_id) {
		U_id = u_id;
	}


	public int getT_id() {
		return T_id;
	}


	public void setT_id(int t_id) {
		T_id = t_id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TeamInfo [TU_id=" + TU_id + ", U_id=" + U_id + ", T_id=" + T_id + ", grade=" + grade + ", nickname="
				+ nickname + ", profileImage=" + profileImage + ", statusMessage=" + statusMessage + ", name=" + name
				+ "]";
	}
}
