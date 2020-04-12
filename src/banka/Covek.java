package banka;

public class Covek {
	
	private String ime;
	private String prezime;
	private String jbmg;
	private String brLk;
	
	public Covek (String ime, String prezime, String jmbg, String brLk) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.jbmg = jmbg;
		this.brLk = brLk;
		
	}

	public String getIme() {
		return ime;
	}

	
	public String getPrezime() {
		return prezime;
	}

	

	public String getJbmg() {
		return jbmg;
	}

	

	public String getBrLk() {
		return brLk;
	}

	@Override
	public String toString() {
		return ime + " " + prezime;
	}

	
	
	
}
