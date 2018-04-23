package logika;

public class JirafaKarta extends Karta {
	
	//ERAIKITZAILEA
	public JirafaKarta(){
		this.izena="jirafa";
		this.zenb=8;
		this.errekurtsiboa = true;
	}


	public void animaladaEgin() { // bere aurretik dagoen karta bera baino txikiagoa bada saltatzen du
		KartaZerrenda jokokoKartak =Tableroa.getTableroa().getJokokoKartak();
		System.out.println("JIRAFAREN ANIMALADA");
		int pos = jokokoKartak.tamaina();
		Karta jirafa = jokokoKartak.get(pos);
		Karta aurrekoa = jokokoKartak.get(pos-1);
		if(aurrekoa.zenb<8){
			jokokoKartak.kartaPosizioBateanSartu(jirafa, pos-1);
		}
		
	}

}
