package com.in28minutes.learnspringaop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.learnspringaop.aopexample.business.BusinessService1;

@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {
	
	private BusinessService1 businessService1;

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		businessService1.calculateMax();
	}

}
