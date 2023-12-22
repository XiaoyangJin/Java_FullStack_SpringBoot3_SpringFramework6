package com.in28minutes.learnspringaop.aopexample.business;

import java.util.Arrays;

import com.in28minutes.learnspringaop.aopexample.data.DataService1;

public class BusinessService1 {
	
	private DataService1 dataService1;
	
	public int calculateMax() {
		int[] data = dataService1.retrieveData();
		return Arrays.stream(data).max().orElse(0);
	}

}
