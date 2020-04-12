package Proba;

public class Sastojak {

	private String naziv;
	private int cenaKg;

	public int getCenaKg() {
		return cenaKg;
	}

	public void setCenaKg(int cenaKg) {
		if (cenaKg >= 0)
			this.cenaKg = cenaKg;
	}

	public Sastojak(String naziv, int cenaKg) {
		this.naziv = naziv;
		this.cenaKg = cenaKg;
	}

	public String getNaziv() {
		return naziv;
	}

	@Override
	public String toString() {
		return naziv;
	}

}
