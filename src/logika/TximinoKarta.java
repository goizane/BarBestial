package logika;

public class TximinoKarta extends Karta {
	
	//ERAIKITZAILEA
	public TximinoKarta(){
		this.izena="tximino";
		this.zenb=4;
		this.errekurtsiboa = false;
	}


	public void animaladaEgin() { //tximino bat bakarrik badago ez da ezer egiten
								  // bi baldin badaude: krokodiloak eta hipopotamoak ilaratik kanporatu
											  		  //tximinoa lehenengo jarriko da eta beste tximinoak bere atzetik jarriko ditu
		KartaZerrenda jokokoKartak = Tableroa.getTableroa().getJokokoKartak();
		
		if(jokokoKartak.errepikatutaDago(4)){
			for(int i=0; i<jokokoKartak.tamaina();i++){
				if(jokokoKartak.get(i).zenb==10|| jokokoKartak.get(i).zenb==11){
					jokokoKartak.kenduKarta(jokokoKartak.get(i));
				}
			}
			for(int pos=0; pos<2; pos++){
				Karta azkena =jokokoKartak.azkenKartaBilatu(4);
				jokokoKartak.kartaPosizioBateanSartu(azkena, pos);
			}
		}
		// TODO Auto-generated method stub
		
	}

}
