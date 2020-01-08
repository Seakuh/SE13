package ctr;

import java.util.Scanner;

public class BeobeachterTest {

	static ConcreteSubject ressource = null;
	static ConcreteSubject1 ressource1 = null;

	static ConcreteObserver aktuell;
	static ProductFactory pF = new ProductFactory();

	public static void main(String[] args) {

		System.out.println("1: Status");
		System.out.println("2: Beschreibung");

		Scanner e = new Scanner(System.in);

		int zs = e.nextInt();
		System.out.println(zs);

		if (zs == 1) {
			ressource = (ConcreteSubject) pF.createProduct("state");
			aktuell = new ConcreteObserver("St", ressource);
		} else if (zs == 2) {
			ressource1 = (ConcreteSubject1) pF.createProduct("beschreibung");
			aktuell = new ConcreteObserver("Be", ressource);
		} else {
			System.out.println("Falsche Eingabe");
		}
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
			if (aktuell.getSubject() instanceof ConcreteSubject) {
				System.out.println("---Aktueller Status von ConcreteSubject---");
				System.out.println(((State) aktuell.getSubject().getState()).getStatus());
			} else if (aktuell.getSubject1() instanceof ConcreteSubject1) {
				System.out.println("---Aktueller Status von ConcreteSubject1---");
				System.out.println(((Beschreibung) aktuell.getSubject1().getState()).getBeschreibung());
			} else {
				System.out.println("404 - Error");
			}
			auswahl();
			break;
		case 2:
			System.out.println("Geben Sie den neuen Zustand ein: ");
			Scanner zustandNew = new Scanner(System.in);

			if (aktuell.getSubject() != null) {
				aktuell.getSubject().setState(new State(zustandNew.nextLine()));

			} else {
				aktuell.getSubject1().setState(new Beschreibung(zustandNew.nextLine()));
			}
			auswahl();
			break;
		case 3:
			anmelden();
		case 4:
			aktuell.getSubject().detach(aktuell);
			aktuell = null;
			anmelden();
		}
	}

	private static void anmelden() {
		System.out.println("Wer soll angemeldet werden?");
		Scanner eing = new Scanner(System.in);
		if (ressource != null) {
			aktuell = new ConcreteObserver(eing.nextLine(), ressource);
			ressource.attach(aktuell);

		} else {
			aktuell = new ConcreteObserver(eing.nextLine(), ressource1);
			ressource1.attach(aktuell);
		}

		auswahl();

	}

}
