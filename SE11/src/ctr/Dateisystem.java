package ctr;

import java.util.ArrayList;

public class Dateisystem {

	ArrayList<Verzeichniseintrag> verzeichnisse = new ArrayList<Verzeichniseintrag>();

	private Verzeichniseintrag verzeichnisseintrag;

	public Verzeichniseintrag getVerzeichnisseintrag() {
		return verzeichnisseintrag;
	}

	public void setVerzeichnisseintrag(Verzeichniseintrag verzeichnisseintrag) {
		this.verzeichnisseintrag = verzeichnisseintrag;
	}

	public void add(Verzeichniseintrag v) {
		verzeichnisse.add(v);
	}

	public void remove(Verzeichniseintrag v) {
		verzeichnisse.remove(v);
	}

	public Verzeichniseintrag getEintrag(int v) {
		return verzeichnisse.get(v);
	}

	public void print(String tab) {
		System.out.println("---Verzeichnis---");
		for (Verzeichniseintrag v : verzeichnisse) {
			v.print(tab);
		}
	}

}