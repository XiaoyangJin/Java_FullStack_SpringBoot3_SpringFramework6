package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepositoy extends JpaRepository<Todo, Integer> {
	
}
