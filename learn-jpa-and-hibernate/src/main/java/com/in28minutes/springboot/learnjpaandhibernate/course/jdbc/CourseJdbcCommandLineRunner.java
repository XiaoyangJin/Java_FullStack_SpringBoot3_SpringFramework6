package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Learn AWS Now", "in28minutes"));
		repository.insert(new Course(2, "Learn Java Now", "in28minutes"));
		repository.insert(new Course(3, "Learn SQL Now", "in28minutes"));
		repository.insert(new Course(4, "Learn Python Now", "in28minutes"));
		repository.insert(new Course(5, "Learn Spring Now", "in28minutes"));
		
		repository.deleteById((long)3);
		System.out.println(repository.findById((long)2));
		System.out.println(repository.findById((long)1));
	}

}
