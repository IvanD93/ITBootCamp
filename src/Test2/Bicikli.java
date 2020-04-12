package Test2;

public class Bicikli {
	
	public int menjac;
	public int brzina;
	
	public Bicikli(int menjac, int brzina) {
		super();
		this.menjac = menjac;
		this.brzina = brzina;
	}

	public int getMenjac() {
		return menjac;
	}

	public int getBrzina() {
		return brzina;
	}

	public void setMenjac(int menjac) {
		this.menjac = menjac;
	}

	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}

	public void ubrzanje (int ubrz) {
		if (ubrz > 0) {
			this.brzina = this.brzina + ubrz;
	} else { 
		System.out.println("Pogresan unos!");
		this.brzina = brzina;
	}
	}

	public void usporavanje (int usp) {
		if (usp >0 ) {
			this.brzina = this.brzina - usp;
		} else {
			System.out.println("Pogresan unos!");
			this.brzina = brzina;
		}
	
	
		
	
	}

	@Override
	public String toString() {
		return "Bicikli ima " + menjac + "brzine/u" + "\n" + "brzina bicikla je " + brzina + " kmh";
	}
	
	
	
}
