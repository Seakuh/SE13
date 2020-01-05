package ctr;

public class ConcreteSubject extends Subject {

	private State status;
	
	public ConcreteSubject() {
		status = new State("Standard");
	}
	
	public State getState() {
		return status;
	}

	public void setState(State s) {
		status = s;
	}
	
}
