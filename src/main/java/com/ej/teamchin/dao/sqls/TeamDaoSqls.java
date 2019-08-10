package com.ej.teamchin.dao.sqls;

public class TeamDaoSqls {
	
	public static final String SELECT_TEAM_LIST = "SELECT t.name, t.T_id FROM Team t, Team_User tu WHERE t.T_id = tu.T_id and tu.U_id = :U_id";
	
	public static final String SELECT_TEAM = "SELECT  t.name, tu.TU_id, tu.U_id, tu.grade, tu.nickname, tu.profile_image, tu.status_message FROM team t, Team_User tu WHERE t.T_id = tu.T_id and t.T_id = :T_id;";
}
