package banka;

public class Racun {

	private String brRacuna;
	private double stanje;
	private Covek klijent;

	public Racun(String brRacuna, Covek klijent) {
		this.brRacuna = brRacuna;
		this.klijent = klijent;
		// stanje = 0;
	}

	public boolean dodajNovac(double iznos) {
		if (iznos > 0) {
			stanje += iznos;
			return true;
		} else {
			System.out.println("Doslo jedo greske...");
		return false;
		}
	}
	
	public double oduzmiNovac (double iznos) {
		if (iznos > 0 && iznos <= stanje) 
			stanje -= iznos;
		else
			System.out.println("Greska..");
		return stanje;
		}

	public String getBrRacuna() {
		return brRacuna;
	}

	public double getStanje() {
		return stanje;
	}

	@Override
	public String toString() {
		return "Racun [brRacuna=" + brRacuna + ", klijent=" + klijent + "]";
	}

	public Covek getKlijent() {
		return klijent;
	}
	
	
	}


