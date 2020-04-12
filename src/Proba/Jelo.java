package Proba;

import java.util.ArrayList;

public class Jelo {
	private String naziv;
	private ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
	private ArrayList<Integer> kolicina = new ArrayList<>();

	public Jelo(String naziv) {

		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public ArrayList<Sastojak> getSastojci() {
		return sastojci;
	}

	public void dodajSastojak(Sastojak s, int kolicina) {
		sastojci.add(s);
		this.kolicina.add(kolicina);
	}

	public double cenaNamirnica() {
		double cena = 0;

		for (int i = 0; i < sastojci.size(); i++) {
			cena += (kolicina.get(i) * sastojci.get(i).getCenaKg()) / 1000;
		}
		return cena;
	}

	@Override
	public String toString() {
		String ispis = naziv + ": ";
		for (int i = 0; i < sastojci.size(); i++) {
			ispis += sastojci.get(i).getNaziv();
			if (sastojci.size() - 1 != i) {
				ispis += ", ";
			}
		}
		return ispis;
	}
}
