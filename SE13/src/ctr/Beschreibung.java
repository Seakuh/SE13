package ctr;

public class Beschreibung {

	String beschreibung;
	
	public Beschreibung(String b){
		beschreibung = b;
	}

	public String getBeschreibung() {
		if(beschreibung == null) {
			return "Keine Beschreibung vorhanden";
		}
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

}
