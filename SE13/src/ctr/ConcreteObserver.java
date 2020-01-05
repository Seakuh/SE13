package ctr;

public class ConcreteObserver extends Observer {

	private Subject subject;
	private String name = "";
	
	public ConcreteObserver(String n) {
		name = n;
	}
	
	@Override
	public void update() {

	}
	
	

}
