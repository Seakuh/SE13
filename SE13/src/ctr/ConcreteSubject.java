package ctr;

public class ConcreteSubject extends Subject {

	private State status;
	
	public ConcreteSubject() {
	
	}
	
	public State getState() {
		return status;
	}

	public void setState(State s) {
		status = s;
	}
	
}
