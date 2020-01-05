package ctr;

public class ProductFactory {

	public Subject createProduct(String s) {
		if (s.equals("state")) {
			return new ConcreteSubject();
		} else if (s.equals("beschreibung")) {
			return new ConcreteSubject1();
		} else {
			System.out.println("Falsche Eingabe");
			return null;
		}
	}

}
