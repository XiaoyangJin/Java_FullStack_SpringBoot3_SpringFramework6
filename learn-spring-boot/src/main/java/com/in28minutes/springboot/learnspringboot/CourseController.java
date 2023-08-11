package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//[
// {
//	 "id" : 1,
//	 "name" : "Learn AWS",
//	 "author" : "in28minutes"
// }
//]
@RestController
public class CourseController {
	
	// http://localhost:8080/courses
	// Course: id, name, author
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		//JSON Conversion
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28minutes"),
				new Course(2, "Learn DevOps", "in28minutes"),
				new Course(3, "Learn Anzure", "in28minutes"),
				new Course(4, "Learn Python", "in28minutes"),
				new Course(5, "Learn Angular", "in28minutes"),
				new Course(6, "Learn Kotlin", "in28minutes")
				);
	}
	
}
