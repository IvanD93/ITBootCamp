package Proba;

import java.util.ArrayList;

public class Meni {

	private ArrayList<Jelo> jela;
	
	public Meni() {
		
		jela = new ArrayList<Jelo>();
		
	}
	
	public void dodajJelo(Jelo j) {
		jela.add(j);
	}
	public ArrayList<Jelo> getJela() {
		return jela;
	}
	public void oduzmiJelo(Jelo j) {
		jela.remove(j);
	}
	@Override
	public String toString() {
		String ispis = "";
		for (int i = 0; i<jela.size(); i++) {
			ispis += jela.get(i).toString() + '\n';
		}
		
		return  ispis;
	}
	
	
}
