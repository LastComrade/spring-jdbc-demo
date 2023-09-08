package com.spring.jdbc.dao;

import java.util.List;

import com.spring.entities.Trainee;

public interface TraineeDao {
	// Create
	public int insert(Trainee trainee);

	// Read - Fetch all the records from the DB
	public List<Trainee> fetchAll();

	// Read - Fetch only one record from the DB
	public Trainee fetch(int id);

	// Update - Update the record
	public int update(Trainee trainee);

	// Delete - Delete a record by trainee ID
	public int delete(int id);
}
