package ctr;

import java.util.ArrayList;

public class Subject {
	
	ArrayList<Observer> observers = new ArrayList<Observer>();

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	public void attach(Observer s) {
		observers.add(s);
	}

	public void detach(Observer s) {
		observers.remove(s);
	}
	
	public void notification() {
		for(Observer s : observers) {
			s.update();
		}
	}

}
