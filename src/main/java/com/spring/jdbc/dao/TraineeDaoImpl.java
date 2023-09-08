package com.spring.jdbc.dao;

import java.util.List;

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

	@Override
	public List<Trainee> fetchAll() {
		List<Trainee> result;
		String FETCH_ALL_QUERY = "SELECT * FROM trainee";

		result = template.query(FETCH_ALL_QUERY, new TraineeMapper());

		return result;
	}

	@Override
	public Trainee fetch(int id) {
		Trainee result;
		String FETCH_QUERY = "SELECT * FROM trainee WHERE id = ?";

		result = template.queryForObject(FETCH_QUERY, new TraineeMapper(), id);

		return result;
	}

	@Override
	public int delete(int id) {
		int result = 0;
		String DELETE_QUERY = "DELETE FROM TRAINEE WHERE id = ?";

		result = template.update(DELETE_QUERY, id);

		return result;
	}

	@Override
	public int update(Trainee trainee) {
		int result = 0;
		String UPDATE_QUERY = "UPDATE trainee SET id = ?, name = ?, location = ? WHERE id = ?";

		result = template.update(UPDATE_QUERY, trainee.getId(), trainee.getName(), trainee.getLocation(), trainee.getId());

		return result;
	}

}
