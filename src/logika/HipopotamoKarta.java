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
		KartaZerrenda kz =Tableroa.getTableroa().getJokokoKartak();
		int pos = kz.kartaBatenPosizioaLortu(11)-1;
		int salto = 0;
		boolean geldi = false;
		if(kz.tamainaKartaHutsBarik()!=0){
				for(int i = 0; i<=pos; i++){
					if(!geldi){
					Karta k =  kz.get(i);
						if(k.getZenb()<11){
							if( k.getZenb()!=7){
								salto++;
							}else{
								geldi= true;
								}
						}else{
							geldi = true;
						}
								
					}
				}
			
			salto++;
			Tableroa.getTableroa().saltatu(salto);
		}
	}
}
		
