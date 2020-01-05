package ctr;

import java.util.Scanner;

public class BeobeachterTest {

	static ConcreteSubject ressource = new ConcreteSubject();
	static ConcreteObserver aktuell;

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
			System.out.println(aktuell.getSubject().getState().getStatus());
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
			aktuell.getSubject().detach(aktuell);v
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

//	ConcreteObserver paul = new ConcreteObserver();
//	ConcreteObserver emma = new ConcreteObserver();
//	ConcreteObserver guenter = new ConcreteObserver();
//	ConcreteObserver christine  = new ConcreteObserver();

}
