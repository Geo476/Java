package demo.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {
	private List<Observer<T>> observers = new ArrayList<>();
	
	public void addObserver(Observer<T> obs) {
		this.observers.add(obs);
	}
	
	public void removeObserver(Observer<T> obs) {
		this.observers.remove(obs);
	}
	
	public void notifyObservers(T obj) {
		this.observers.forEach(obs -> obs.update(obj));
	}
	
}
