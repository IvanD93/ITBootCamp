package DomaciZadaci;

public class Sportista {

	private String ime;
	private String prezime;
	private int god;

	public Sportista(String ime, String prezime, int god) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.god = god;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getGod() {
		return god;
	}

	@Override
	public String toString() {
		return ime.toUpperCase() + " " + prezime.toUpperCase() + ": " + god;
	}

}
