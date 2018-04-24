package logika;

public class LoroKarta extends Karta {
	static Karta kenduKar;
	//ERAIKITZAILEA
	public LoroKarta(){
		this.izena="loro";
		this.zenb=2;
		this.errekurtsiboa = false;
	}

	public void animaladaEgin() { //jokalariak aukeratutako kartari patada eman
		// TODO Auto-generated method stub
		System.out.println("LOROAREN ANIMALADA");
//		Tableroa.getTableroa().getJokokoKartak().kenduKarta(kenduKar);
		
	}
	
	public static void kenduKarEguneratu(Karta k){
		kenduKar= k;
		System.out.println(" loroaren kendukar: " + kenduKar);
	}
	
}
