package logika;

public class KamaleoiKarta extends Karta {
	static Karta kopiatu;
	private String kolorea;
	//ERAIKITZAILEA
	public KamaleoiKarta(String kolorea){
		this.izena="kamaleoi";
		this.zenb=5;
		this.errekurtsiboa = false;
		this.kolorea = kolorea;
	}


	public void animaladaEgin() { // nahi duen animaliaren animalada egiten du
		// TODO Auto-generated method stub
		System.out.println("KAMALEOIAREN ANIMALADA");
		kopiatu.animaladaEgin();
	}
	
	public static void kopiatzekoKartaEguneratu(Karta k ){
		kopiatu = k;
	}
}
