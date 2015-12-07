package cz.fit.dpo.mvcshooter;

import cz.fit.dpo.mvcshooter.controller.Controller;
import cz.fit.dpo.mvcshooter.view.MainWindow;

import java.awt.Graphics;

import javax.swing.SwingUtilities;

/**
 *
 * @author stue
 */
public class Shooter {
	private static Controller controller;
	private static Model model;
	private static Graphics graphics;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				model = new Model();
				controller = new Controller(model);
				
				new MainWindow(model, controller, graphics).setVisible(true);
			}
		});
	}
}
