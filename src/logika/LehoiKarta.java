package logika;

public class LehoiKarta extends Karta {
	
	//ERAIKITZAILEA
	public LehoiKarta(){
		this.izena="lehoi";
		this.zenb=12;
		this.errekurtsiboa = false;
	}


	public void animaladaEgin() { //lehoirik ez badago:
									//1- lehenengo jartzen da eta tximinoak botatzen ditu
									// bestela: lehoia ez da sartzen
		// TODO Auto-generated method stub
		System.out.println("LEHOIAREN ANIMALADA");
		Karta lehoia = new LehoiKarta();
		
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
			Tableroa.getTableroa().getJokokoKartak().kartaPosizioBateanSartu(lehoia, 0);
		}
	}
		
	}


