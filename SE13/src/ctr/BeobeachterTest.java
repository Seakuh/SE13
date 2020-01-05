package ctr;

import java.util.Scanner;

public class BeobeachterTest {

	static Subject ressource;
	static ConcreteObserver aktuell;
	static ProductFactory pF = new ProductFactory();

	public static void main(String[] args) {

		System.out.println("1: Status");
		System.out.println("2: Beschreibung");

		Scanner e = new Scanner(System.in);

		int zs = e.nextInt();

		if (zs == 1) {
			pF.createProduct("status");			
		}else if(zs == 2) {
			pF.createProduct("beschreibung");
		}else {
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

			if (aktuell.getSubject().getState() instanceof ConcreteSubject) {
				System.out.println(((State) aktuell.getSubject().getState()).getStatus());
			} else if (aktuell.getSubject().getState() instanceof ConcreteSubject1) {
				System.out.println(((Beschreibung) aktuell.getSubject().getState()).getBeschreibung());
			}
			auswahl();
			break;
		case 2:
			System.out.println("Geben Sie den neuen Zustand ein: ");
			Scanner zustandNew = new Scanner(System.in);
			aktuell.getSubject().setState(new State(zustandNew.nextLine()));
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
		aktuell = new ConcreteObserver(eing.nextLine(), ressource);
		ressource.attach(aktuell);
		auswahl();

	}

}
