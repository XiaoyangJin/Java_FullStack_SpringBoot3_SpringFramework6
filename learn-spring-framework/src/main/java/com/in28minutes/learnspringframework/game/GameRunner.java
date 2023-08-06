package com.in28minutes.learnspringframework.game;

public class GameRunner {
	//create an instance of MarioGame
	MarioGame game;
	
	public GameRunner(MarioGame game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: " + game);
	}

}
