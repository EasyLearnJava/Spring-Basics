package com.easylearnjava.springjdbctemplatedemo;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setInjectDbParameters(DataSource bds){
		this.jdbcTemplate = new JdbcTemplate(bds);
	}
	
	
	public User findByUserId(int userId){
		String sql = "select * from user where user_id = ?";
		User user = (User)jdbcTemplate.queryForObject(sql, new Object[]{userId}, new UserMapper());
		return user;
	}
	
	public void updateUser(int id, String password){
		String sql ="update user set user_password = ? where user_id = ?";
		jdbcTemplate.update(sql, new Object[]{password, id});
	}

}
