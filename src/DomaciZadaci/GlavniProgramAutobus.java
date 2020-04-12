package DomaciZadaci;

public class GlavniProgramAutobus {

	public static void main(String[] args) {
		Covek c1 = new Covek("Ivan", "Damnjanovic", "123546723");
		Covek c2 = new Covek("Nikola", "Nikolic", "786456462");

		Vozac v1 = new Vozac("Pero", "Peric", "2356112223");
		Vozac v2 = new Vozac("Milan", "Milanovic", "3452677123");

		Putnik p1 = new Putnik("Marko", "Markovic", "235612323", 450);
		Putnik p2 = new Putnik("Zdravko", "Zdravkoovic", "2345297", 750);

		Autobus a1 = new Autobus("Raketa", 220.50, 2);
		Autobus a2 = new Autobus("Lasta", 300, 2);

		System.out.println("AUTOBUS BROJ 1");
		a1.dodajVozaca(v1);
		System.out.println(a1.getVozac());
		System.out.println(a1.dodajVozaca(v1));
		System.out.println(a1.getVozac());
		System.out.println(a1.ukloniVozaca());
		System.out.println(a1.getVozac());
		System.out.println(a1.dodajVozaca(v2));
		System.out.println(a1.getVozac());

		System.out.println("");
		System.out.println(a1.dodajPutnika(p1));
		System.out.println(a1.dodajPutnika(p2));

		System.out.println(a1.ukloniPutnika(p1));
		System.out.println(a1.dodajPutnika(p2));
		System.out.println("");
		a1.ispisiPutnici();

		a1.payTicket();
		System.out.println("");
		System.out.println("");
		System.out.println("");

		

		System.out.println(p1.getPosedujeNovac() + " " + p1.getIme() + " " + p1.getPrezime());

		
		System.out.println(p1.dodajNovac(-300));
		System.out.println(p1.getPosedujeNovac());
		p1.oduzmiNovac(150);
		System.out.println(p1.getPosedujeNovac());
		System.out.println(p1.dodajNovac(200)); 

	}

}
