package logika;

public class KrokodiloKarta extends Karta {
	
	//ERAIKITZAILEA
	public KrokodiloKarta(){
		this.izena="krokodilo";
		this.zenb=10;
		this.errekurtsiboa = true;
	}


	public void animaladaEgin() { // Bera baino txikiagoak diren animaliak botatzen ditu
		// TODO Auto-generated method stub
		System.out.println("KROKODILOAREN ANIMALADA");
		Tableroa.getTableroa().getJokokoKartak().txikiagoakDirenKartakEzabatu(10);
	}
}
