package cz.fit.dpo.mvcshooter;

/**
 *
 * @author Ondrej Stuchlik
 */
public class Cannon extends GameObject {

	public Cannon() {
		this.x = 100;
		this.y = 100;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void moveUp() {
		System.out.println("cannon moves up");
		this.y -= 5;
	}

	public void moveDown() {
		this.y += 5;
	}

	public void accept(IVisitor visitor) {
		visitor.visitCannon(this);
	}
}
