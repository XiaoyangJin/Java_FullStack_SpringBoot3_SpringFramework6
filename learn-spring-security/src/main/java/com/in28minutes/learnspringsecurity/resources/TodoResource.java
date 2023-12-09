package com.in28minutes.learnspringsecurity.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {
	
	@GetMapping("/todos")
	public List<Todo> retrieveAllTodos() {
		return List.of(new Todo("in28minutes", "Learn AWS"),
				new Todo("in28minutes", "Learn Angular"));
	}
}

record Todo(String username, String description) {
	
}