package Test2flasa;

public class PlasticnaFlasa extends Flasa {

	

	private double cenaSaKaucijom;

	public PlasticnaFlasa(Naziv naziv, double cenaBezKaucije, double zapremina, int barKod) {
		super(naziv, cenaBezKaucije, zapremina, barKod);
		if (cenaBezKaucije <= 0)
			System.out.println("Pogresan unos.");
		else
			this.cenaBezKaucije = cenaBezKaucije;
	}

	

	public double cenaSaKaucijom() {
		return cenaSaKaucijom;
	}

	public String toString() {
		return super.toString() + "- plasticna";
	}
}


