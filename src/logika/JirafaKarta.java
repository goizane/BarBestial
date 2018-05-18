package logika;

public class JirafaKarta extends Karta {
	
	private String kolorea;
	//ERAIKITZAILEA
	public JirafaKarta(String kolorea){
		this.izena="jirafa";
		this.zenb=8;
		this.errekurtsiboa = true;
		this.kolorea = kolorea;
	}


	public void animaladaEgin() { // bere aurretik dagoen karta bera baino txikiagoa bada saltatzen du
		System.out.println("JIRAFAREN ANIMALADA");
		KartaZerrenda kz =Tableroa.getTableroa().getJokokoKartak();
		if(!kz.hutsik()){
			if(kz.get(kz.tamainaKartaHutsBarik()-2).getZenb()<8){
				Tableroa.getTableroa().saltatu(1);
			}
		}
		
	}
		
	}