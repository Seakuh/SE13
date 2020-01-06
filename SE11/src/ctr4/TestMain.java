package ctr4;

public class TestMain {

	public static void main(String[] args) {

		Ordner d = new Ordner("Verzeichnissystem");

		Ordner bilder = new Ordner("Bilder");
		Ordner dokumente = new Ordner("Dokumente");
		Ordner videos = new Ordner("Videos");
		Ordner schreibtisch = new Ordner("Schreibtisch");

		Datei hausaufgaben = new Datei("Hausaufgaben", "txt");
		Datei steuern = new Datei("Steuern_2019", "doc");

		Datei bild1 = new Datei("Sommer", "jpg");
		Datei bild2 = new Datei("Winter", "jpg");
		Datei bild3 = new Datei("Frühling", "jpg");
		Datei bild4 = new Datei("Herbst", "jpg");

		Datei bild5 = new Datei("IMG_35235", "jpg");
		Datei bild6 = new Datei("IMG_34564", "jpg");
		Datei bild7 = new Datei("IMG_34345", "jpg");
		Datei bild8 = new Datei("IMG_45346", "jpg");
		
		bilder.add(bild5);
		bilder.add(bild6);
		bilder.add(bild7);
		bilder.add(bild8);

		Ordner jahrOrdner = new Ordner("Jahreszeiten");

		jahrOrdner.add(bild1);
		jahrOrdner.add(bild2);
		jahrOrdner.add(bild3);
		jahrOrdner.add(bild4);
		
		Ordner jahrDatum = new Ordner("Datum");
		
		Datei bild10 = new Datei("Bild_28.12.2020", "jpg");
		Datei bild11 = new Datei("Bild_18.02.2020", "jpg");
		Datei bild12 = new Datei("Bild_22.03.2020", "jpg");
		
		jahrDatum.add(bild10);
		jahrDatum.add(bild11);
		jahrDatum.add(bild12);
		
		jahrOrdner.add(jahrDatum);
		
		Ordner Urlaub = new Ordner("Urlaub in Paris");
		Datei bild13 = new Datei("IMG_234323", "jpg");		
		
		Urlaub.add(bild13);
		
		jahrDatum.add(Urlaub);

		Ordner finanzen = new Ordner("Finanzen");

		dokumente.add(hausaufgaben);
		bilder.add(jahrOrdner);

		dokumente.add(finanzen);
		finanzen.add(steuern);

		d.add(bilder);
		d.add(dokumente);
		d.add(videos);
		d.add(schreibtisch);

		d.print("\t");

	}
}
