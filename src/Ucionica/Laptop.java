package Ucionica;

import java.util.ArrayList;

public class Laptop {

	private String marka;
	
	private ArrayList<Polaznik> Polaznici;

	public String getMarka() {
		return marka;
	}

	public void dodajPolaznika(Polaznik r) {
		Polaznici.add(r);
	}

	public void oduzmiPolaznika(Polaznik r) {
		Polaznici.remove(r);
	}

	@Override
	public String toString() {
		return marka + "{" + Polaznici + "}";
	}

	public Laptop(String marka, Polaznik nizPolaznika) {
		
		Polaznici = new ArrayList<Polaznik>();
		Polaznici.add(nizPolaznika);
		
		this.marka = marka;

	}

}
