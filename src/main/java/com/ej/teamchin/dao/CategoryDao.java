package com.ej.teamchin.dao;


import static com.ej.teamchin.dao.CategoryDaoSqls.*;

import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ej.teamchin.config.DBConfig;
import com.ej.teamchin.dto.Category;

@Repository
public class CategoryDao {
	private NamedParameterJdbcTemplate jdbc;
	private RowMapper<Category> rowMapper = BeanPropertyRowMapper.newInstance(Category.class);

	public CategoryDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public void selectCategory() {
		
		String a = jdbc.queryForObject(SELECT_CATEGORY, Collections.emptyMap(), String.class);
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		DBConfig DB = new DBConfig();
		CategoryDao a  = new CategoryDao(DB.dataSource());
		
		a.selectCategory();
		
	}
}
