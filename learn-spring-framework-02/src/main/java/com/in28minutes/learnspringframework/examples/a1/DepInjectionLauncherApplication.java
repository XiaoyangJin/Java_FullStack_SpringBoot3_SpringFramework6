package com.in28minutes.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//YourBusinessClass
//Dependency1
//Dependency2
@Component
class YourBusinessClass{
	
}

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}


//dependency injection
@Configuration
@ComponentScan("com.in28minutes.learnspringframework.examples.a1")
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext
				(DepInjectionLauncherApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}

	}

}
