package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameConsole;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;

@Configuration
public class App03GamingSpringBeans {
	
	@Bean
	public GameConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GameConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext
				(App03GamingSpringBeans.class)){
			context.getBean(GameConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
