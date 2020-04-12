package Test2;

public class MountainBike extends Bicikli {
	public int visinaSedista;

	public MountainBike(int menjac, int brzina, int visinaSedista) {
		super(menjac, brzina);
		this.visinaSedista = visinaSedista;
	}

	public int getVisinaSedista() {
		return visinaSedista;
	}

	@Override
	public String toString() {
		return "Bicikl ima " + menjac + " brzine/u" + "\n" + "Brzina bicikla je " + brzina + " kmh" + "\n" + "visina sedista je " + visinaSedista + " cm";  
	}

	


	
	
	
}
