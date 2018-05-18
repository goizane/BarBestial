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
			if(pos>0){
				if(kz.get(pos).getZenb()> kz.get(pos-1).getZenb()){
					if(kz.get(pos-1).getZenb()!=7){
						if(kz.dauka(7)){
							int zebraPos = kz.kartaBatenPosizioaLortu(7);
							if(zebraPos<pos){
								kz.tarteBateanTxikiagoakDirenKartakKendu(10, pos, zebraPos);
							}
							
						}else{
							kz.txikiagoakDirenKartakEzabatu(10, pos);
						}
					}
					
				}
				
			}
			
		}
		
		Tableroa.getTableroa().jokokoKartakEguneratu(kz);
	}
}
