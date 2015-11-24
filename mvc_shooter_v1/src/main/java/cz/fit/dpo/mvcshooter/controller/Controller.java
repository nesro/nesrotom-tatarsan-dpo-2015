package cz.fit.dpo.mvcshooter.controller;

import java.awt.event.KeyEvent;

import cz.fit.dpo.mvcshooter.Model;

public class Controller {
	private Model model;
	
	public Controller(Model m) {
		System.out.println("controller contructor");
		this.model = m;
	}
	
	public void keyPressed(KeyEvent evt) {
		switch (evt.getKeyCode()) {
		case KeyEvent.VK_UP:
			model.moveCannonUp();
			System.out.println("up!");
			break;
		case KeyEvent.VK_DOWN:
			model.moveCannonDown();
			System.out.println("down!");
			break;
		default:
			break;
		}
	}
}
