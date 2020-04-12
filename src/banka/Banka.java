package banka;

public class Banka {
	
	private Racun racuni[];
	private int poz; // pozicija clana niza
	
	public Banka() {
		
		racuni = new Racun [50];
	}

	public void dodajRacun( Racun r) {
		racuni [poz] = r;
		poz++;
	}
	
	public Racun dohvatiRacun(String trazeniRacuna) {
		Racun r = null;
		
		for (int i=0; i<poz; i++) {
			String postojeciBrRacuna = racuni[i].getBrRacuna();
			if (trazeniRacuna.equals(postojeciBrRacuna)) {
				r = racuni[i];
				break;
			}
		}
		
		return r;
	}
}
