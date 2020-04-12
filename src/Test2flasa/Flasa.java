package Test2flasa;

public class Flasa {

	

	private Naziv naziv;
	protected double cenaBezKaucije;
	protected double zapremina;
	private int barKod;
	public Flasa(Naziv naziv, double cenaBezKaucije, double zapremina, int barKod) {
		super();
		this.naziv = naziv;
		if (cenaBezKaucije<=0) {
			System.out.println("Pogresan unos.");
		}else  {
		this.cenaBezKaucije = cenaBezKaucije;
		}
		this.zapremina = zapremina;
		this.barKod = barKod;
	}
	public Naziv getNaziv() {
		return naziv;
	}
	public double getCenaBezKaucije() {
		return cenaBezKaucije;
	}
	public double getZapremina() {
		return zapremina;
	}
	public int getBarKod() {
		return barKod;
	}
	
	
	public void setCenaBezKaucije(double cenaBezKaucije) {
		this.cenaBezKaucije = cenaBezKaucije;
	}

	public String toString() {
		return naziv  +"(" + barKod + " " +cenaBezKaucije + "rsd, " + zapremina + "l"+ ")";
	}
	
}	
