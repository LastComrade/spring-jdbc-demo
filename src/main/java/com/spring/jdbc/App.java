package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entities.Trainee;
import com.spring.jdbc.dao.TraineeDao;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		TraineeDao traineeDao = context.getBean(TraineeDao.class);
		Trainee newTrainee = new Trainee(104, "Suparshav Lohat", "Harayana");
		
//      Create
//		System.out.println(traineeDao.insert(newTrainee));
		
//		Read
//		System.out.println(traineeDao.fetch(104));
//		System.out.println(traineeDao.fetchAll());
		
//		Update
//		newTrainee.setLocation("Gurugram");
//		System.out.println(traineeDao.update(new Trainee(104, "Suparshav Lohat", "Gurugaon")));
		
//		Delete
//		System.out.println(traineeDao.delete(104));

		((AbstractApplicationContext) context).close();
	}
}
