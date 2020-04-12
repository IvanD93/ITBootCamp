package DomaciZadaci;

public class Autobus {

	private String nazivAutobusa;
	private Vozac vozac; // atribut klase vozac
	private double cenaKarte;
	private Putnik[] putnici; // atribut klase putnik u nizu

	public Autobus(String nazivAutobusa, double cenaKarte, int brojMesta) {
		super();
		this.nazivAutobusa = nazivAutobusa;
		this.cenaKarte = cenaKarte;
		if (brojMesta > 0)
			this.putnici = new Putnik[brojMesta];
		else {
			this.putnici = null;
			// int[] niz = new int[5]; ovako se kreira niz
		}
	}

	public Vozac getVozac() {
		return vozac;
	}

	public boolean dodajVozaca(Vozac v) { // (Vozac v) - dodelio sam vozaca
		if (this.vozac == null) {
			this.vozac = v;
			System.out.println("Vozac uspesno dodat");
			return true;
		}
		return false;
	}

	public boolean ukloniVozaca() {
		if (this.vozac != null) {
			this.vozac = null;
			return true;
		}
		return false;
	}

	public void ispisiPutnici() {
		if (putnici != null) {
			for (Putnik p : putnici) {
				if (p != null)
					System.out.println(p.getIme());
			}
		} else {
			System.out.println("Autobus nema sedista.");
		}
	}

	public boolean dodajPutnika(Putnik p1) {
		if (putnici == null) {
			return false;
		}
		for (int i = 0; i < putnici.length; i++) {
			if (putnici[i] == null) {
				putnici[i] = p1;
				return true;
			}
		}
		return false;
	}

	public boolean ukloniPutnika(Putnik p1) {
		if (putnici == null) {
			return false;
		}
		for (int i = 0; i < putnici.length; i++) {
			if (putnici[i] == p1) {
				putnici[i] = null;
				return true;
			}
		}
		return false;
	}

	public void payTicket() {
		if (vozac != null && putnici != null) {
			for (Putnik k : putnici) {
				if (k != null) {
					k.oduzmiNovac(this.cenaKarte);
				}
			}
		}
	}

	@Override
	public String toString() {
		String s = this.nazivAutobusa + " ( ";
		if (vozac != null)
			s += vozac.toString();
		if (putnici != null) {
			for (Putnik p1 : putnici) {
				if (p1 != null) {
					s += p1.getIme() + " " + p1.getPrezime() + " " + p1.getID() + "[" + p1.getPosedujeNovac() + "]"
							+ "  ";
				}
			}
		}
		return s += ")";
	}
}
