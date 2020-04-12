package Ucionica;

public class Polaznik {

	private String ime;
	private String prezime;

	public Polaznik(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	@Override
	public String toString() {
		return ime + "_" + prezime;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

}
