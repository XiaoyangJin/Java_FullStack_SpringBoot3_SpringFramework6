package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameConsole;
import com.in28minutes.learnspringframework.game.GameRunner;

@Configuration
@ComponentScan
public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext
				(App03GamingSpringBeans.class)){
			context.getBean(GameConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
