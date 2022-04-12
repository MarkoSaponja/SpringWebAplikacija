package com.vezbanje.SpringVezbanje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vezbanje.SpringVezbanje")
public class SpringVezbanjeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringVezbanjeApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
		
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		//GameRunner runner = new GameRunner(game);
		runner.runGame();
	
	}

}
