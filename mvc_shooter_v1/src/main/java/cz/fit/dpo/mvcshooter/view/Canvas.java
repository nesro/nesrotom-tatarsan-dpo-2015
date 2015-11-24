package cz.fit.dpo.mvcshooter.view;

import cz.fit.dpo.mvcshooter.Cannon;
import cz.fit.dpo.mvcshooter.IObserver;
import cz.fit.dpo.mvcshooter.Model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ondrej Stuchlik
 */
public class Canvas extends JPanel implements IObserver {
	private static final long serialVersionUID = -2405586700704546079L;
	
	Model model;
	Graphics graphics;

	GraphicsDrawer drawer = new GraphicsDrawer(graphics);

	public Canvas(int x, int y, int width, int height, Model m) {
		this.setBackground(Color.WHITE);
		this.setDoubleBuffered(true);
		this.setLocation(x, y);
		this.setPreferredSize(new Dimension(width, height));
		this.setVisible(true);
		this.model = m;
		
		/* tohle asi neni dobre */
		this.model.attach(this);
	}

	public void update() {
		System.out.println("Canvas updated!");
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawer.drawCannon(g, new Cannon());
	}

}
