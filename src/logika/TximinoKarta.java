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
		
		
		KartaZerrenda jokokoKartak = Tableroa.getTableroa().getJokokoKartak();
		if (!jokokoKartak.errepikatutaDago(4)) {
			System.out.println("Tximino bakarra dago!");
		}
		else {
			
			if (jokokoKartak.dauka(11)) {
				Karta k = jokokoKartak.kartaLortuZenbakiarekin(11);
				jokokoKartak.kenduKarta(k);
			} else if (jokokoKartak.dauka(10)) {
				Karta k = jokokoKartak.kartaLortuZenbakiarekin(10);
				jokokoKartak.kenduKarta(k);
			} else {
				System.out.println("Ez dago krokodilo edo hipopotamorik!");
			}
		
		
			int tximinoPos = jokokoKartak.tamainaKartaHutsBarik()-1;
			KartaZerrenda zer = new KartaZerrenda();
			Karta tximinoKarta = jokokoKartak.get(tximinoPos);
			jokokoKartak.kenduKarta(tximinoKarta);
			zer.gehituKarta(tximinoKarta);
			tximinoKarta = jokokoKartak.kartaLortuZenbakiarekin(4);
			jokokoKartak.kenduKarta(tximinoKarta);
			zer.gehituKarta(tximinoKarta);
			
			for (int i=0; i<jokokoKartak.tamainaKartaHutsBarik(); i++) {
				zer.gehituKarta(jokokoKartak.get(i));
			}
			if (zer.tamaina()<5) {
				for (int j=zer.tamaina(); j<=5; j++) {
					zer.gehituKarta(new KartaHutsa());
				}
			}
			Tableroa.getTableroa().jokokoKartakEguneratu(zer);
		}
		
		
		

	}

}
