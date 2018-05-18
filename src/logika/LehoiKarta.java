package logika;

public class LehoiKarta extends Karta {
	
	private String kolorea;
	//ERAIKITZAILEA
	public LehoiKarta(String kolorea){
		this.izena="lehoi";
		this.zenb=12;
		this.errekurtsiboa = false;
		this.kolorea = kolorea;
	}


	public void animaladaEgin() { //lehoirik ez badago:
									//1- lehenengo jartzen da eta tximinoak botatzen ditu
									// bestela: lehoia ez da sartzen
		// TODO Auto-generated method stub
		System.out.println("LEHOIAREN ANIMALADA");
		Karta lehoia = Tableroa.getTableroa().azkenKartaLortu();
		
	if(Tableroa.getTableroa().getJokokoKartak().tamainaKartaHutsBarik()>1){
		
		if(Tableroa.getTableroa().getJokokoKartak().errepikatutaDago(12)){
			Tableroa.getTableroa().azkenaKanporatu();
			
			
		}
		else{
			
			Tableroa.getTableroa().azkenaKanporatu();
			Tableroa.getTableroa().getJokokoKartak().kartaPosizioBateanSartu(lehoia, 0);
			Tableroa.getTableroa().getJokokoKartak().tximinoakKanporatu();
		}
	}
	else{
		Tableroa.getTableroa().azkenaKanporatu();
		Tableroa.getTableroa().getJokokoKartak().kartaPosizioBateanSartu(lehoia, 0);
		}
	}
		
	}


