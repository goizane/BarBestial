package logika;

public class LoroKarta extends Karta {
	
	static Karta kenduKar;
	private String kolorea;
	//ERAIKITZAILEA
	public LoroKarta(String kolorea){
		this.izena="loro";
		this.zenb=2;
		this.errekurtsiboa = false;
		this.kolorea = kolorea;
	}

	public void animaladaEgin() { //jokalariak aukeratutako kartari patada eman
		// TODO Auto-generated method stub
		System.out.println("LOROAREN ANIMALADA");
//		System.out.println(kenduKar.getIzena()+ " karta kendu");
		Tableroa.getTableroa().getJokokoKartak().kenduKarta(kenduKar);
		KartaZerrenda jj = Tableroa.getTableroa().getJokokoKartak();
				
	}
	
	public static void kenduKarEguneratu(Karta k){ //ER
		kenduKar= k;
		
	}
	
}
