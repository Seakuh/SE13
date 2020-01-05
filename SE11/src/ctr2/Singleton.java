package ctr2;

import java.util.ArrayList;

public class Singleton {

	private static ArrayList<Singleton> uniqueInstance = new ArrayList<Singleton>();
	String name = "SingletonTest";
	static int max = 5;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Singleton() {
	}
	
	//synchrinized: nur ein Thread darf Codeblock ausführen
	public synchronized static ArrayList<Singleton> getInstance() { 
		if (uniqueInstance.size() < max) {
			uniqueInstance.add(new Singleton());
		}
		System.out.println("Maximale Anzahl an Instancen erreicht");		
		return uniqueInstance;
	}

}
