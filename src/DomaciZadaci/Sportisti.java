package DomaciZadaci;

import banka.Racun;

public class Sportisti {

	private Sportisti[] sportisti;

	private int poz;

	public Sportisti() {

		sportisti = new Sportisti[100];
	}

	public void dodajSportistu(Sportisti s) {
		sportisti[poz] = s;
		poz++;
	}

}
