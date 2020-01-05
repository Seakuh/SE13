package ctr;

import java.util.Scanner;

public class BeobeachterTest {

	static ConcreteSubject ressource = new ConcreteSubject();

	public static void main(String[] args) {

		anmelden();

	}

	private static void auswahl() {
		System.out.println("1: Zustand abfragen");
		System.out.println("2: Zustand ändern");
		System.out.println("3: Neuer Nutzer anmelden");
		System.out.println("4: Abmelden");
		Scanner intEing = new Scanner(System.in);
		int eing = intEing.nextInt();

		switch (eing) {
		case 1:
			System.out.println(ressource.getState().getStatus());
			auswahl();
		case 2:
		case 3:
		case 4:
			anmelden();
		}
	}

	private static void anmelden() {
		System.out.println("Wer soll angemeldet werden?");
		Scanner eing = new Scanner(System.in);

		ressource.attach(new ConcreteObserver(eing.nextLine()));
		auswahl();

	}

//	ConcreteObserver paul = new ConcreteObserver();
//	ConcreteObserver emma = new ConcreteObserver();
//	ConcreteObserver guenter = new ConcreteObserver();
//	ConcreteObserver christine  = new ConcreteObserver();

}
