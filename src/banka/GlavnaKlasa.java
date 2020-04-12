package banka;

public class GlavnaKlasa {

	public static void main(String[] args) {
	
		//Banka intesa = new Banka();
		Banka2 intesa = new Banka2();
		
	//promenljiva tipa racun  //br racuna	,	klijent promenljiva tipa covek
		Racun r1 = new Racun("178234596", new Covek ("Ivan", "damnjanovic", "123456", "15612"));
		Racun r2 = new Racun("112564221", new Covek ("Dragoljub", "boranijasevic", "432551", "112355"));
		Racun r3 = new Racun("456774221", new Covek ("Ivo", "andric", "876541", "1135675"));
		
		System.out.println(r2.getStanje());
		r2.dodajNovac(100000.00);
		System.out.println(r2.getStanje());
		
		r2.oduzmiNovac(20000);
		System.out.println(r2.getStanje());
	
		System.out.println(r3.getStanje());
		r3.dodajNovac(20000);
		System.out.println(r3.getStanje());
		
		intesa.dodajRacun(r1);
		intesa.dodajRacun(r2);
		intesa.dodajRacun(r3);
		
		System.out.println(intesa.dohvatiRacun("178234596"));
		
		if (r3 !=null)
			System.out.println(r3.getBrRacuna());
		
	}
	

}
