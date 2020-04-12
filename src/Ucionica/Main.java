package Ucionica;

public class Main {

	public static void main(String[] args) {

		Laptop l = new Laptop("Dell", new Polaznik("Ivan", "Damnjanovic"));

		Laptop l2 = new Laptop("Toshiba", new Polaznik("Petar", "Petrovic"));

		Polaznik p = new Polaznik("Milan", "Milanovic");

		l.dodajPolaznika(p);

		l.oduzmiPolaznika(p);

		l2.dodajPolaznika(new Polaznik("Aleksa", "Aleksic"));
		System.out.println(l);
		System.out.println(l2);

	}
}
