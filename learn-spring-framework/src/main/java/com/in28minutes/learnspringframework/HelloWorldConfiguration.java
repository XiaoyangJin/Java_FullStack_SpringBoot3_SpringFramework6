package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {
	//record means we don't need to build getters, setters, constructor..., it already automatically created for us
	
}
record Address (String firstLine, String city) {
	
}

@Configuration
public class HelloWorldConfiguration {
	
	//this Bean will be managed by this spring container
	@Bean
	public String name() {
		return "Mia";
	}
	
	@Bean
	public Integer age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		//var person = new Person("Jay", 56);
		//person.name();
		//return person;
		return new Person("Jay", 56, new Address("Main street", "Medford"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean(name = "address2") //custome bean name
	public Address address() {
		return new Address("Baker street", "London");
	}
	
}
