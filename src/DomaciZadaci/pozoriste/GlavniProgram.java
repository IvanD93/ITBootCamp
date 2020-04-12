package DomaciZadaci.pozoriste;

public class GlavniProgram { 
	
	public static void main(String[] args) {

		Pozoriste pz1 = new Pozoriste("Narodno pozoriste");
		Pozoriste pz2 = new Pozoriste("Atelje 212");

		Zaposleni zp1 = new Zaposleni("Ivan Damnjanovic", pz1);
		Zaposleni zp2 = new Zaposleni("Pera Peric", pz1);
		Zaposleni zp3 = new Zaposleni("Nikola Nikolic", pz2);

		Glumac gl1 = new Glumac("Ljubomir Bandovic", pz1, "Ilija Cvorovic");
		Glumac gl2 = new Glumac("Katarina Radivojevic", pz2, "Zona");

		Reditelj rd1 = new Reditelj("Tatjana Mandic Rigonat", pz1, "Vlado");
		Reditelj rd2 = new Reditelj("Zdravko Sotra", pz2, "Sole");

		Predstava p1 = new Predstava("Balkanski spijun", pz1);
		Predstava p2 = new Predstava("Zona Zamfirova", pz2);

		p1.removeZaposleni(zp1);
		p1.addZaposleni(zp2);
		p1.addZaposleni(zp3);
		p1.addZaposleni(zp2);
		System.out.println("Broj zaposlenih u predstavi " + p1.getNaziv() + " je " + p1.brojZaposlenih() + ".");
		System.out.println("");
		System.out.println(p1);

		
		System.out.println("");
		System.out.println("Broj zaposlenih u predstavi " + p2.getNaziv() + " je " + p2.brojZaposlenih() + ".");
		System.out.println(p2);

	}

}