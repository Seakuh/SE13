package ctr;

import java.util.ArrayList;

public class Ordner implements Verzeichniseintrag {
	String name = "";
	ArrayList<Verzeichniseintrag> unterVerzeichnisse = new ArrayList<Verzeichniseintrag>();

	public Ordner(String name) {
		this.name = name;
	}

	@Override
	public void print(String tab) {
		System.out.println(tab + "[-]" + name);
		for (Verzeichniseintrag v : unterVerzeichnisse) {
			v.print(tab + "   ");
		}
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void add(Verzeichniseintrag v) {
		unterVerzeichnisse.add(v);
	}

}