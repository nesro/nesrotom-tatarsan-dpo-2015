package cz.fit.dpo.mvcshooter;

import java.util.ArrayList;
import java.util.List;

public class Model implements IObservable {
	public Cannon cannon;
	/* canvas implemeuje observer? */
	private List<IObserver> myObserver; // list vsech co ho pozoruji

	// private List<Bullet> missiles;
	// private List<Enemy> enemies;
	// private List<Collision> collisions;

	public Model() {
		this.cannon = new Cannon();
		this.myObserver = new ArrayList<IObserver>();
	}

	public void moveCannonUp() {
		this.cannon.moveUp();
		this.notifyObserver(); /* tady ma jest enco byt? */
	}

	public void moveCannonDown() {
		this.cannon.moveDown();
		this.notifyObserver(); /* tady ma jest enco byt? */
	}

	@Override
	public void attach(IObserver observer) {
		myObserver.add(observer);
	}

	@Override
	public void detach(IObserver observer) {
		myObserver.remove(observer);
	}

	@Override
	public void notifyObserver() {
		if (!myObserver.isEmpty()) {
			for (IObserver o : myObserver) {
				o.update();
			}
		} else {
			System.out.println("myObserver is empty");
		}
	}
}
