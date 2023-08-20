package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1, "Learn AWS Jpa", "in28minutes"));
		repository.save(new Course(2, "Learn Java Jpa", "in28minutes"));
		repository.save(new Course(3, "Learn SQL Jpa", "in28minutes"));
		repository.save(new Course(4, "Learn Python Jpa", "in28minutes"));
		repository.save(new Course(5, "Learn Spring Jpa", "in28minutes"));

		repository.deleteById(3l);

		System.out.println(repository.findById((long) 2));
		System.out.println(repository.findById((long) 1));
		
	}

}
