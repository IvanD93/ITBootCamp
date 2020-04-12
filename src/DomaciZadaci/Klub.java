package DomaciZadaci;

public class Klub {

	public String naziv;
	public String grad;
	public int godOsnivanja;
	public Sportista sportista;

	public Klub(String naziv, String grad, int godOsnivanja, Sportista sportista) {
		super();
		this.naziv = naziv;
		this.grad = grad;
		this.godOsnivanja = godOsnivanja;
		this.sportista = sportista;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getGrad() {
		return grad;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}

	public Sportista getSportista() {
		return sportista;
	}

	@Override
	public String toString() {
		return "Klub: " + naziv + ", Grad: " + grad + ", Godina osnivanja: " + godOsnivanja + ", Sportista: "
				+ sportista;
	}

}
