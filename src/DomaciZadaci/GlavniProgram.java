package DomaciZadaci;

public class GlavniProgram {

	public static void main(String[] args) {

		Sportista s1 = new Sportista("Vlade", "Divac", 1968);
		System.out.println(s1.toString());
		
		Klub zvezda = new Klub("Crvena Zvezda", "Beograd", 1945, s1);
		System.out.println(zvezda.toString());
		
		zvezda.setNaziv("Crvena Zvezda Beograd");
		System.out.println(zvezda.toString());

	}
}
