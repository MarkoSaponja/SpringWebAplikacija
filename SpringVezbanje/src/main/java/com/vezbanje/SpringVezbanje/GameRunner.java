package com.vezbanje.SpringVezbanje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		System.out.println("pomocu konstruktora");
		this.game = game;
	}
	
	public void runGame() {
		game.up();
		game.left();
		game.down();
		game.right();
	}

	
}
