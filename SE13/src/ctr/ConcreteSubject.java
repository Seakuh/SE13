package ctr;

public class ConcreteSubject extends Subject {

	private State status;

	public ConcreteSubject() {
		status = new State("Standard");
	}

	@Override
	public Object getState() {
		return (State)status;
	}

	@Override
	public void setState(Object s) {
		status = (State)s;
	}

}
