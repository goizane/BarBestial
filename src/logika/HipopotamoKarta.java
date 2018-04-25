package logika;

public class HipopotamoKarta extends Karta {
	private String kolorea;
	
	//ERAIKITZAILEA
	public HipopotamoKarta(String kolorea){
		this.izena="hipopotamo";
		this.zenb=11;
		this.errekurtsiboa = true;
		this.kolorea = kolorea;
	}


	public void animaladaEgin() {
		// TODO Auto-generated method stub
		System.out.println("HIPOPOTAMOAREN ANIMALADA");
		Karta zebra = new ZebraKarta("");
		if(Tableroa.getTableroa().getJokokoKartak().dauka(zebra)){
			Tableroa.getTableroa().getJokokoKartak().txikiagoakDirenKartakEzabatu(11);
		}
		else{
			Tableroa.getTableroa().getJokokoKartak().txikiagoakEzabatuZebraBarik(11);
		}
	}

}
