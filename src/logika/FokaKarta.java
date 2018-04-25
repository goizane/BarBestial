package logika;

public class FokaKarta extends Karta {
	
	private String kolorea;
	//ERAIKITZAILEA
	public FokaKarta(String kolorea){
		this.izena="foka";
		this.zenb=6;
		this.errekurtsiboa = false;
		this.kolorea = kolorea;
	}


	public void animaladaEgin() { //atearen eta patadaren posizioak aldatzen ditu
		
		Tableroa.getTableroa().zerrendarenOrdenaAldatu();
		System.out.println("FOKAREN ANIMALADA");
	}

}
