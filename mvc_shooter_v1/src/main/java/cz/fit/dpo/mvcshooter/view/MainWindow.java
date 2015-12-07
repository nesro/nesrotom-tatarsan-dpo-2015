package cz.fit.dpo.mvcshooter.view;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

import cz.fit.dpo.mvcshooter.Model;
import cz.fit.dpo.mvcshooter.controller.Controller;

/**
 *
 * @author Ondrej Stuchlik
 */
public class MainWindow extends JFrame {
	private static final long serialVersionUID = 5247876998606141196L;

	public MainWindow(final Model model, final Controller controller, Graphics graphics) {
		try {
			Canvas view = new Canvas(0, 0, 500, 500, model, graphics);

			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("nesrotom-tatarsan-2015");
			this.setResizable(false);

			this.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent evt) {
					controller.keyPressed(evt);
				}
			});

			this.add(view);
			this.pack();
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
		}
	}
}
