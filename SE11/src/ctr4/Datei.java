package ctr4;

public class Datei implements Verzeichniseintrag {
	String name = "";
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String format = "";

	public Datei(String name, String format) {
		this.name = name;
		this.format = format;
	}

	@Override
	public void print(String tab) {
		System.out.println(tab +" |-" + name + "." + format);
	}

}
