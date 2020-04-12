package DomaciZadaci.dete;

public class GlavniProgramDete {

	public static void main(String[] args) {

		Dete d1 = new Dete("Milica", "Mitrovic", 11);
		Dete d2 = new Dete("Nikola", "Nikolic", 13);

		d1.dodajKlikere(4);
		d2.dodajKlikere(5);
		d2.dodajKlikere(4);
		d2.oduzmiKlikere(1);

		System.out.println("uk br klikera je " + Dete.ukBrKlikera);
		System.out.println("uk br dece je " + Dete.brDece);
		System.out.println("prosek br godina je " + Dete.getProsek());
		System.out.println("Broj klikera d2 je " + d2.getBrKlikera());
	}

}
