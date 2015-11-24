package cz.fit.dpo.mvcshooter.view;

import cz.fit.dpo.mvcshooter.Bullet;
import cz.fit.dpo.mvcshooter.Cannon;
import cz.fit.dpo.mvcshooter.IVisitor;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Ondrej Stuchlik
 */
public class GraphicsDrawer implements IVisitor {
	private static final int INFO_X = 5;
	private static final int INFO_Y = 15;

	private Graphics graphics;


	private BufferedImage cannonImage;
	private BufferedImage enemyImage1;
	private BufferedImage enemyImage2;
	private BufferedImage missileImage;
	private BufferedImage collisionImage;

	public GraphicsDrawer(Graphics graphics) {
		try {

			this.graphics = graphics;

			cannonImage = ImageIO.read(getClass().getResourceAsStream("/images/cannon.png"));
			enemyImage1 = ImageIO.read(getClass().getResourceAsStream("/images/enemy1.png"));
			enemyImage2 = ImageIO.read(getClass().getResourceAsStream("/images/enemy2.png"));
			missileImage = ImageIO.read(getClass().getResourceAsStream("/images/missile.png"));
			collisionImage = ImageIO.read(getClass().getResourceAsStream("/images/collision.png"));
		} catch (IOException ex) {
			ex.printStackTrace(System.err);
		}
	}

	public void drawCannon(Graphics g, Cannon cannon) {
		g.drawImage(cannonImage, cannon.getX() - cannonImage.getWidth() / 2,
				cannon.getY() - cannonImage.getHeight() / 2, null);
	}

	/* tohle budu volat pri visit */
	public void drawMissile(Graphics g, Missile missile) {

	}

	public void drawEnemy(Graphics g, Enemy enemy) {

	}

	public void drawCollision(Graphics g, Collision collision) {

	}

	public void drawInfo(Graphics g, ModelInfo info) {

	}

	// fake classes just to satisfy compilator
	class Missile {
	}

	class Collision {
	}

	class Enemy {
	}

	class ModelInfo {
	}

	@Override
	public void visitCannon(Cannon cannon) {
		// TODO Auto-generated method stub
		drawCannon(this.graphics, cannon);
	}

	@Override
	public void visitBullet(Bullet bullet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitEnemy(cz.fit.dpo.mvcshooter.Enemy enemy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitCollision(cz.fit.dpo.mvcshooter.Collision collision) {
		// TODO Auto-generated method stub

	}

}
