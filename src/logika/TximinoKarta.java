package logika;

public class TximinoKarta extends Karta {
	
	private String kolorea;
	//ERAIKITZAILEA
	public TximinoKarta(String kolorea){
		this.izena="tximino";
		this.zenb=4;
		this.errekurtsiboa = false;
		this.kolorea = kolorea;
	}


	public void animaladaEgin() { //tximino bat bakarrik badago ez da ezer egiten
								  // bi baldin badaude: krokodiloak eta hipopotamoak ilaratik kanporatu
											  		  //tximinoa lehenengo jarriko da eta beste tximinoak bere atzetik jarriko ditu
		
		Tableroa.getTableroa().tximinoAnimalada();
		
		
		
		
		
//		KartaZerrenda jokokoKartak = Tableroa.getTableroa().getJokokoKartak();
//		System.out.println("TXIMINOAREN ANIMALADA");
//		if(jokokoKartak.errepikatutaDago(4)){
//			for(int i=0; i<jokokoKartak.tamaina();i++){
//				if(jokokoKartak.get(i).zenb==10|| jokokoKartak.get(i).zenb==11){
//					jokokoKartak.kenduKarta(jokokoKartak.get(i));
//				}
//			}
//			for(int pos=0; pos<2; pos++){
//				Karta azkena =jokokoKartak.azkenKartaBilatu(4);
//				jokokoKartak.kartaPosizioBateanSartu(azkena, pos);
//			}
//		}
//		// TODO Auto-generated method stub
		
	}

}
