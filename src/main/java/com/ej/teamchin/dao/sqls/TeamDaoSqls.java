package com.ej.teamchin.dao.sqls;

public class TeamDaoSqls {
	
	public static final String SELECT_TEAM_LIST = "SELECT t.name FROM Team t, Team_User tu WHERE t.T_id = tu.T_id and tu.U_id = :U_id";
	
	public static final String SELECT_TEAM = "SELECT T_id, name FROM Team WHERE T_id = :T_id";
}
