package ctr;

public class ProductFactory {

	public Subject createProduct(String s) {
		if (s.equals("state")) {
			System.out.println("State Created");
			return new ConcreteSubject();
		} else if (s.equals("beschreibung")) {
			System.out.println("Beschreibung Created");
			return new ConcreteSubject1();
		} else {
			System.out.println("Falsche Eingabe");
			return null;
		}
	}

}
