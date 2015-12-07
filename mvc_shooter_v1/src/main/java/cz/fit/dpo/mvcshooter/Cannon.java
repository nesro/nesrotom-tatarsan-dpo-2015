package cz.fit.dpo.mvcshooter;

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
		this.y -= 5;
	}

	public void moveDown() {
		this.y += 5;
	}

	public void accept(IVisitor visitor) {
		System.out.println("Cannon accept");
		visitor.visitCannon(this);
	}
}
