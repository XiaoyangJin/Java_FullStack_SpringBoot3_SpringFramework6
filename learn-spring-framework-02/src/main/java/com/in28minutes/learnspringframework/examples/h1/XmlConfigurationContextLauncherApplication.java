package com.in28minutes.learnspringframework.examples.h1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//@Configuration //java configuration
//@ComponentScan
public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {
		
		try(var context = new ClassPathXmlApplicationContext("contextCondifuration.xml")){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}

	}

}
