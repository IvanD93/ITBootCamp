package DomaciZadaci;

public class Putnik extends Covek {

	private double posedujeNovac;

	public Putnik(String ime, String prezime, String jmbg, double novac) {
		super(ime, prezime, jmbg);
		this.posedujeNovac = novac;
	}

	public double getPosedujeNovac() {
		System.out.println("Stanje na racunu: ");
		return posedujeNovac;
	}

	public boolean dodajNovac(double a) {
		if (a <= 0) {
			System.out.println("Ne moze se dodati nula ili minus novca");
			return false;
		} else {
			posedujeNovac = posedujeNovac + a;
			System.out.println("Novac je uspesno dodat. ");
			return true;
		}

	}

	public boolean oduzmiNovac(double a) {
		if (a <= 0) {
			System.out.println("Ne moze se oduzeti nula ili minus novca");
			return false;
		} else {
			posedujeNovac = posedujeNovac - a;
			System.out.println("Novac je uspesno smanjen. ");
			return true;
		}
	}

}
