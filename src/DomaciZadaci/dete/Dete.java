package DomaciZadaci.dete;

public class Dete {

	public static int ukBrKlikera;
	public static int brDece;
	public static double ukBrGod;
	private String ime;
	private String prezime;
	private int brGod;
	private int brKlikera;

	public Dete(String ime, String prezime, int brGod) {
		this.ime = ime;
		this.prezime = prezime;
		this.brGod = brGod;
		brDece++;
		ukBrGod += this.brGod;
	}

	public static double getProsek() {
		return ukBrGod / brDece;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getBrGod() {
		return brGod;
	}

	public int getBrKlikera() {
		return brKlikera;
	}

	public int getUkBrKlikera() {
		return ukBrKlikera;
	}

	public void dodajKlikere(int brKlikera) {
		this.brKlikera += brKlikera;
		ukBrKlikera += brKlikera;
	}

	public void oduzmiKlikere(int brKlikera) {
		this.brKlikera -= brKlikera;
		ukBrKlikera -= brKlikera;
	}
}
