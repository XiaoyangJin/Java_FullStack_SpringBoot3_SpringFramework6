package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	
	//this Bean will be managed by this spring container
	@Bean
	public String name() {
		return "Mia";
	}
}
