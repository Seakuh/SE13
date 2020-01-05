package ctr;

import java.util.ArrayList;

public class Subject {
	
	ArrayList<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer s) {
		observers.add(s);
	}

	public void detach(Observer s) {
		observers.remove(s);
	}
	
	public void notification() {

	}

}
