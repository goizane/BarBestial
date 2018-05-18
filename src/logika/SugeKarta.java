package logika;

public class SugeKarta extends Karta {
	
	private String kolorea;
	//ERAIKITZAILEA
	public SugeKarta(String kolorea){
		this.izena="suge";
		this.zenb=9;
		this.errekurtsiboa = false;
		this.kolorea = kolorea;
	}


	public void animaladaEgin() { //animaliak handienetik txikienera ordenatzen ditu
		// TODO Auto-generated method stub
		System.out.println("SUGEAREN ANIMALADA");
		Tableroa.getTableroa().getJokokoKartak().zerrendaOrdenatu(0, Tableroa.getTableroa().getJokokoKartak().tamainaKartaHutsBarik()-1);
	}

}
