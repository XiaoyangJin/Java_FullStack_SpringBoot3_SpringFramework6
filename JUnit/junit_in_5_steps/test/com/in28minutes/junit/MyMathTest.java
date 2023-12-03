package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	private MyMath math = new MyMath();;

	@Test
	void test() {
		
		int res = math.calculateSum(new int[] {1, 2, 3});
		int expectedRes = 6;
		assertEquals(res, expectedRes);
		
	}
	
	@Test
	void test1() {
		
		int res = math.calculateSum(new int[] {});
		int expectedRes = 0;
		assertEquals(res, expectedRes);
	}

}
