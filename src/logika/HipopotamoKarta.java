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
		System.out.println("HIPOPOTAMOAREN ANIMALADA (hipopotamo klasean)");
		KartaZerrenda kz =Tableroa.getTableroa().getJokokoKartak();
		int pos = kz.kartaBatenPosizioaLortu(11)-1;
		int salto = 0;
		boolean geldi = false;
		if(kz.tamainaKartaHutsBarik()!=0){
			System.out.println("tamaina karta huts barik: " + kz.tamainaKartaHutsBarik());
				for(int i = 0; i<=pos; i++){
					if(!geldi){
					Karta k =  kz.get(i);
						if(k.getZenb()<11){
							System.out.println("hipopotamoa baino txikiagoa: " + k.getIzena());
							if( k.getZenb()!=7){
								System.out.println("ez da zebra---> " + k.getIzena());
								salto++;
								System.out.println("salto ++ --> "+ salto);
							}else{
								geldi= true;
								System.out.println("zebra da! ----> ez saltatu!");
								System.out.println(geldi);
								}
						}else{
							geldi = true;
							System.out.println("hipopotamoa baino handiagoa da! ----> ez saltatu!");
							System.out.println(geldi);
						}
								
					}
				}
			
			salto++;
			Tableroa.getTableroa().saltatu(salto);
		}
	}
}
		
