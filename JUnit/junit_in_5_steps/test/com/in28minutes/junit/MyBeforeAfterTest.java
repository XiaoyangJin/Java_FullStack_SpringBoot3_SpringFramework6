package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	
//	this is a class method
	@BeforeAll
	static void beforAll() {
		System.out.println("beforAll");
	}
	
//	@BeforeEach
//	void beforeEach() {
//		System.out.println("beforeEach");
//	}

	@Test
	void test1() {
		System.out.println("test1");
	}
	
	@Test
	void test2() {
		System.out.println("test2");
	}
	
	@Test
	void test3() {
		System.out.println("test3");
	}
	
//	@AfterEach
//	void aftereEach() {
//		System.out.println("aftereEach");
//	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("afterAll");
	}

}
