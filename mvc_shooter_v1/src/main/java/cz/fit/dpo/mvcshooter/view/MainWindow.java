package cz.fit.dpo.mvcshooter.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cz.fit.dpo.mvcshooter.Model;
import cz.fit.dpo.mvcshooter.controller.Controller;

/**
 *
 * @author Ondrej Stuchlik
 */
public class MainWindow extends JFrame {
	private static final long serialVersionUID = 5247876998606141196L;

	public MainWindow(final Model model, final Controller controller) {
		try {
			Canvas view = new Canvas(0, 0, 500, 500, model);

			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("nesrotom-tatarsan-2015");
			this.setResizable(false);

			// Dimension obrazovka =
			// Toolkit.getDefaultToolkit().getScreenSize();
			// this.setLocation(
			// (int) (obrazovka.getWidth() / 2 - 250),
			// (int) (obrazovka.getHeight() / 2 - 250));

			this.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent evt) {
					// delegate to controller
					System.out.println("key pressed: " + evt.getKeyChar());
					if (controller != null) {
						controller.keyPressed(evt);
					} else {
						System.out.println("cntrl is null");
					}
				}
			});

			this.add(view);
			this.pack();
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
		}
	}

	public void showHelp() {
		JOptionPane.showMessageDialog(this, "Controls: \n" + "here goes some description...");
	}
}
