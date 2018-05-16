package logika;

import kudeatzaileak.TaulaKudeatzailea;

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
		KartaZerrenda kz = TaulaKudeatzailea.getTaulaKudeatzailea().getJokokoKartak();
		if(kz.tamainaKartaHutsBarik()>1){
			int pos = kz.kartaBatenPosizioaLortu(10);
			System.out.println("kokodriloaren pozisioa: " + pos);
			if(kz.dauka(7)){
				System.out.println("zebra dago");
				int zebraPos = kz.kartaBatenPosizioaLortu(7);
				System.out.println("zebraren posizioa: " + zebraPos);
				if(zebraPos<pos){
					System.out.println("Zebra kokodriloaren aurretik dago");
					kz.tarteBateanTxikiagoakDirenKartakKendu(10, pos, zebraPos);
				}
				
			}else{
				System.out.println("ez dago zebrarik");
				kz.txikiagoakDirenKartakEzabatu(10, pos);
			}
		}
		
		Tableroa.getTableroa().jokokoKartakEguneratu(kz);
	}
}
