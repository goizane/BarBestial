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
		KartaZerrenda kz =Tableroa.getTableroa().getJokokoKartak();
		int pos = kz.tamainaKartaHutsBarik()-2;
		int salto = 0;
		if(kz.tamainaKartaHutsBarik()!=0){
			for(int i = pos; i>=0; i--){
				System.out.println("i: "+ i );
				System.out.println("karta: " + kz.get(i).izena);
				Karta k =  kz.get(i);
				if(k.getZenb()!=12){
					System.out.println("ez da Lehoia ");
					if(k.getZenb()!=7){
						System.out.println("ez da Zebra ");
						salto++;
						System.out.println("saltatu du-------->"+ k.getIzena());
					}
				}
			}
			Tableroa.getTableroa().saltatu(salto);
			
		}
		}
}