package com.vezbanje.SpringVezbanje;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("jump");
	}
	@Override
	public void down() {
		System.out.println("go into a hole");
	}
	@Override
	public void right() {
		System.out.println("go faster");
	}
	@Override
	public void left() {
		System.out.println("stop");
	}
}
