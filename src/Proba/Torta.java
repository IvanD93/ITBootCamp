package Proba;

public class Torta extends Jelo {

	public Torta(String naziv) {
		super(naziv);
	}

	public boolean SadrziMargarin() {
		for (int i = 0; i < getSastojci().size(); i++) {
			if (getSastojci().get(i).getNaziv().equals("margarin"))
				return true;
		}
		return false;
	}

}
