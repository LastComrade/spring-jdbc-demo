package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.entities.Trainee;

public class TraineeDaoImpl implements TraineeDao {
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int insert(Trainee trainee) {
		int result = 0;
		String INSERT_QUERY = "INSERT INTO trainee (id, name, location) VALUES (?, ?, ?)";
		result = template.update(INSERT_QUERY, trainee.getId(), trainee.getName(), trainee.getLocation());

		return result;
	}

}
