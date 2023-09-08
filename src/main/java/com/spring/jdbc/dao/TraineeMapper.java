package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.entities.Trainee;

public final class TraineeMapper implements RowMapper<Trainee> {

	@Override
	public Trainee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Trainee trainee = new Trainee();
		
		trainee.setId(rs.getInt(1));
		trainee.setName(rs.getString(2));
		trainee.setLocation(rs.getString(3));
		
		return trainee;
	}
}
