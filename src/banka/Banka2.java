package banka;

import java.util.ArrayList;

public class Banka2 {
	
	private ArrayList<Racun> racuni;
//	private int poz; // pozicija clana niza
	
	public Banka2() {
		
		racuni = new ArrayList<Racun>();
	}

	public void dodajRacun( Racun r) {
		racuni.add(r);
	}
	
	public Racun dohvatiRacun(String trazeniRacuna) {
		Racun r = null;
		
		for (int i=0; i<racuni.size(); i++) {
			String postojeciBrRacuna = racuni.get(i).getBrRacuna();
			if (trazeniRacuna.equals(postojeciBrRacuna)) {
				r = racuni.get(i);
				break;
			}
		}
		
		return r;
	}
}
