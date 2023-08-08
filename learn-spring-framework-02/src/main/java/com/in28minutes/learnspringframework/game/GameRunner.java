package com.in28minutes.learnspringframework.game;

public class GameRunner {
	//create an instance of MarioGame
	private GameConsole game;
	
	public GameRunner(GameConsole game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
