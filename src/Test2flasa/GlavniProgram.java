package Test2flasa;

import java.util.ArrayList;

public class GlavniProgram {
	public static double ukupnaCena(ArrayList<Flasa> inventar) {
		double ukupnaCena = 0;

		for (Flasa f : inventar)
			ukupnaCena += f.cenaBezKaucije;

		return ukupnaCena;
	}
	public static void main(String[] args) {
		
	ArrayList<Flasa>inventar = new ArrayList<Flasa>();
	Naziv n1 = new Naziv ("Pepsi");
	Flasa pf = new PlasticnaFlasa (n1, 60.0, 0.5, 1234);
	Flasa pf2 =  new PlasticnaFlasa (new Naziv ("Koka kola"), 70.0 , 0.33, 3421);
	Flasa pf3 =  new PlasticnaFlasa (new Naziv ("Heineken"), 130.0 , 0.33, 6324);
	Flasa sf1 =  new StaklenaFlasa (new Naziv ("Budweiser"), 100.0 , 0.33, 6320);
    Flasa sf2 =  new StaklenaFlasa (new Naziv ("Guinness"), 80.0 , 0.53, 3250);

    inventar.add(pf);
    inventar.add(pf2);
    inventar.add(pf3);
    inventar.add(sf1);
    inventar.add(sf2);
		

		System.out.println("Ukupna cena je: " + ukupnaCena(inventar));
		System.out.println(inventar.get(1));
	}

}

