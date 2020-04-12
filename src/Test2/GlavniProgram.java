package Test2;

public class GlavniProgram {

	public static void main(String[] args) {
		Bicikli b = new Bicikli (25, 60);
		MountainBike m = new MountainBike(5, 100, 30);
		b.ubrzanje(30);		b.usporavanje(12);
		System.out.println(b.toString());
		System.out.println();
		System.out.println(m.toString());
	}

}
