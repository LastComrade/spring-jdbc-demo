package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entities.Trainee;
import com.spring.jdbc.dao.TraineeDaoImpl;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		TraineeDaoImpl traineeDao = context.getBean(TraineeDaoImpl.class);

		System.out.println(traineeDao.insert(new Trainee(104, "Harshit Lohat", "New York, USA")));

		((AbstractApplicationContext) context).close();
	}
}
