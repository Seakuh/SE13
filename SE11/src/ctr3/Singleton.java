package ctr3;

public class Singleton {

	private static Singleton uniqueInstance;
	String name = "SingletonTest";
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Singleton() {
	}
	
	//synchrinized: nur ein Thread darf Codeblock ausführen
	public synchronized static Singleton getInstance() { 
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

}
