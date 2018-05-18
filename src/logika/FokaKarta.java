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
		System.out.println("FOKAREN ANIMALADA");
//		Tableroa.getTableroa().zerrendarenOrdenaAldatu();
		KartaZerrenda jokokoKartak = Tableroa.getTableroa().getJokokoKartak();		
		KartaZerrenda zer = new KartaZerrenda();
		for(int i=jokokoKartak.tamainaKartaHutsBarik()-1; i>=0; i--) {
			zer.gehituKarta(jokokoKartak.get(i));
		}
		zer.zerrendaBete();
		Tableroa.getTableroa().jokokoKartakEguneratu(zer);
	}

}
