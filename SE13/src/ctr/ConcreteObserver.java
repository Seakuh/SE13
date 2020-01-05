package ctr;

public class ConcreteObserver extends Observer {

	private Subject subject;
	private String name = "";

	public ConcreteObserver(String n, Subject s) {
		subject = s;
		name = n;
	}

	@Override
	public void update() {
		if (subject instanceof ConcreteSubject) {
			name = ((State) ((ConcreteSubject) subject).getState()).getStatus();
		} else if (subject instanceof ConcreteSubject1) {
			name = ((Beschreibung) ((ConcreteSubject1) subject).getState()).getBeschreibung();
		}
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
