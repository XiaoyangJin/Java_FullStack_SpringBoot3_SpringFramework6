package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	
	List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

	@Test
	void test() {
		
		boolean test = todos.contains("AWS");
		boolean test2 = todos.contains("Angular");
		
		assertTrue(test);
		
		assertFalse(test2);
		
		assertEquals(3, todos.size(), "Something went wrong");
		
	}

}
