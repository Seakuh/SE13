package ctr;

public class ConcreteObserver extends Observer {

	private ConcreteSubject subject;
	private ConcreteSubject1 subject1;
	private boolean istSub = false;
	public boolean isIstSub() {
		return istSub;
	}

	private String name = "";

	public ConcreteObserver(String n, ConcreteSubject s) {
		subject = s;
		name = n;
		istSub = true;
	}
	
	public ConcreteObserver(String n, ConcreteSubject1 s) {
		subject1 = s;
		name = n;
	}

	@Override
	public void update() {
		if (istSub) {
			name = ((State) ((ConcreteSubject) subject).getState()).getStatus();
		} else {
			name = ((Beschreibung) ((ConcreteSubject1) subject1).getState()).getBeschreibung();
		}
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
