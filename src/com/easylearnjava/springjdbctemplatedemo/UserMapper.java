package com.easylearnjava.springjdbctemplatedemo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		return new User(rs.getInt("user_id"), rs.getString("user_name"),rs.getString("user_password"));
	}

}
