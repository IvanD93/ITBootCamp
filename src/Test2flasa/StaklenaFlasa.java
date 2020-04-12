package Test2flasa;

public class StaklenaFlasa  extends Flasa {

	
	private double cenaSaKaucijom;

	public StaklenaFlasa(Naziv naziv, double cenaBezKaucije, double zapremina,  int barKod) {
		super(naziv, cenaBezKaucije,zapremina, barKod);
		if (cenaBezKaucije <= 0)
			System.out.println("Pogrsesan unos.");
		else {
			this.cenaBezKaucije = cenaBezKaucije;
			if (zapremina <= 0)
				System.out.println("Pogresan unos.");
			else {
				if (zapremina < 0.5)
					cenaSaKaucijom = cenaBezKaucije * 1.05;
				else
					cenaSaKaucijom = cenaBezKaucije * 1.10;
			}
		}
	}

	

	public double cenaSaKaucijom() {
		return cenaSaKaucijom;
	}

	public String toString() {
		return super.toString() + "- staklena";
	}

}
