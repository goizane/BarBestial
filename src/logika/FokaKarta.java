package logika;

public class FokaKarta extends Karta {
	
	//ERAIKITZAILEA
	public FokaKarta(){
		this.izena="foka";
		this.zenb=6;
		this.errekurtsiboa = false;
	}


	public void animaladaEgin() { //atearen eta patadaren posizioak aldatzen ditu
		
		Tableroa.getTableroa().zerrendarenOrdenaAldatu();
		System.out.println("FOKAREN ANIMALADA");
	}

}
