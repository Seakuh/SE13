package ctr;

public class ConcreteObserver extends Observer {

	private ConcreteSubject subject;
	private String name = "";
	
	public ConcreteObserver(String n, ConcreteSubject s) {
		subject = s;
		name = n;
	}
	
	@Override
	public void update() {
		name = subject.getState().getStatus();
	}

	public ConcreteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}
	
	

}
