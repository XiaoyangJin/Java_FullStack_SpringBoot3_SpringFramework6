package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Learn AWS Jpa", "in28minutes"));
		repository.insert(new Course(2, "Learn Java Jpa", "in28minutes"));
		repository.insert(new Course(3, "Learn SQL Jpa", "in28minutes"));
		repository.insert(new Course(4, "Learn Python Jpa", "in28minutes"));
		repository.insert(new Course(5, "Learn Spring Jpa", "in28minutes"));
		
		repository.deleteById((long)3);
		System.out.println(repository.findById((long)2));
		System.out.println(repository.findById((long)1));
	}

}
