package cz.fit.dpo.mvcshooter;


public interface IVisitor {
	public void visitCannon(Cannon cannon);	
	public void visitBullet(Bullet bullet);
	public void visitEnemy(Enemy enemy);
	public void visitCollision(Collision collision);
	// todo: visit: bullet, enemy etc
}
