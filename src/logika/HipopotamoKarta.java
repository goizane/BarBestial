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
		// Bera baino txikiagoak diren kartak bultzatzen ditu
		// Lehoia eta zebra ez ditu bultzatzen
		System.out.println("HIPOPOTAMOAREN ANIMALADA");
		Tableroa.getTableroa().hipopotamoakKartaTxikiagoakBultzatu();
	}
}