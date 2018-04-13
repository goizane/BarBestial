package logika;

public class MofetaKarta extends Karta {
	
	//ERAIKITZAILEA
	public MofetaKarta(){
		this.izena="mofeta";
		this.zenb=1;
		this.errekurtsiboa = false;
	}

	public void animaladaEgin() { //2 karta altuenak ilaratik kanporatzen ditu
		KartaZerrenda jokokoKartak = Tableroa.getTableroa().getJokokoKartak();
		for(int i =0; i<2; i++){
			Karta k =jokokoKartak.kartaAltuenaBilatu();
			Tableroa.getTableroa().jokokoKartetatikKartaKendu(k);
			if(jokokoKartak.dauka(k)){
				Karta kar = jokokoKartak.kartaBilatu(k);
				jokokoKartak.kenduKarta(kar);
			}
		}
		
	}
	

}
