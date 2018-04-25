package logika;

public class KrokodiloKarta extends Karta {
	
	private String kolorea;
	//ERAIKITZAILEA
	public KrokodiloKarta(String kolorea){
		this.izena="krokodilo";
		this.zenb=10;
		this.errekurtsiboa = true;
		this.kolorea = kolorea;
	}


	public void animaladaEgin() { // Bera baino txikiagoak diren animaliak botatzen ditu
		// TODO Auto-generated method stub
		System.out.println("KROKODILOAREN ANIMALADA");
		if(Tableroa.getTableroa().getJokokoKartak().dauka(7)){
			Tableroa.getTableroa().getJokokoKartak().txikiagoakDirenKartakEzabatu(10);
		}
		else{
			Tableroa.getTableroa().getJokokoKartak().txikiagoakEzabatuZebraBarik(10);
		}
	}
}
