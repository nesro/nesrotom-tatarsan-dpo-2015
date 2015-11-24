package cz.fit.dpo.mvcshooter;

public interface IObservable {
	public void attach(IObserver observer);
	public void detach(IObserver observer);
	public void notifyObserver();
}
