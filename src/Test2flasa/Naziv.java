package Test2flasa;

public class Naziv {

	public static int ID = 1;
	private String naziv;
	private int id;

	public Naziv(String naziv) {
		this.naziv = naziv;
		id = ID++;
	}

	public String toString() {
		return naziv + " : " + id;
	}
}
