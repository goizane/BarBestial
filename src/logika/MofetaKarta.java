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
		System.out.println("MOFETAREN ANIMALDA");
		for(int i =0; i<2; i++){
			Karta k =jokokoKartak.kartaAltuenaBilatu();
			System.out.println("karta altuena: "+ k.getIzena());
			if(jokokoKartak.errepikatutaDago(k.zenb)){
				for(int j =0; j<jokokoKartak.tamaina(); j++){
					if(jokokoKartak.get(j) == k){
						jokokoKartak.kenduKarta(jokokoKartak.get(j));
					}
				}
				jokokoKartak.kenduKarta(k);
			}
		}
		
	}
	

}
