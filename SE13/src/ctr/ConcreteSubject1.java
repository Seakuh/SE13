package ctr;

public class ConcreteSubject1 extends Subject {

	private Beschreibung status;

	public ConcreteSubject1() {
		status = new Beschreibung("neue Beschreibung");
	}

	@Override
	public Object getState() {
		return (Beschreibung)status;
	}
	@Override
	public void setState(Object s) {
		status = (Beschreibung)s;
	}
}
