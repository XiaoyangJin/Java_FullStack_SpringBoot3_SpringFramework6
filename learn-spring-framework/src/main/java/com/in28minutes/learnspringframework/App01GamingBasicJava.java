package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		
		var game = new PacmanGame(); //1: Object Creation
		var gameRunner = new GameRunner(game);
			//2: Object Creation + Wiring of Dependencies
			//a GameRunner class needs to be able to run a game -> Game is a Dependency
			//a GameConsole is a Dependency of a GameRunner class
			//so 'new GameRunner(game)' means game is injected/wired into the GameRunner class
			//Spring can help us to do the create and wire things
		
		gameRunner.run();

	}

}
