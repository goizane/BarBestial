package logika;

public class MofetaKarta extends Karta {
	
	private String kolorea;
	//ERAIKITZAILEA
	public MofetaKarta(String kolorea){
		this.izena="mofeta";
		this.zenb=1;
		this.errekurtsiboa = false;
		this.kolorea= kolorea;
	}

	public void animaladaEgin() { //2 karta altuenak ilaratik kanporatzen ditu
		if(Tableroa.getTableroa().getJokokoKartak().tamainaKartaHutsBarik()<=3){
			System.out.println("zerrenda 3 karta edo gutxiago ditu --> mofeta bakarrik");
			System.out.println(" zerrenda tamaina mofeta: " + Tableroa.getTableroa().getJokokoKartak().tamaina());
			Tableroa.getTableroa().getJokokoKartak().biKartaAltuenakKenduZerrendaTxikia();
			System.out.println(" zerrenda tamaina mofeta LAKSJDFC: " + Tableroa.getTableroa().getJokokoKartak().tamaina());
		}
		else{
			for(int i = 0; i<2; i++){
				Karta altuena = Tableroa.getTableroa().getJokokoKartak().kartaAltuenaBilatu();
				System.out.println("karta altuena: " + altuena);
				Tableroa.getTableroa().getJokokoKartak().kenduKarta(altuena);
				if(Tableroa.getTableroa().getJokokoKartak().dauka(altuena)){
					System.out.println("errepikatuta dago");
					Tableroa.getTableroa().getJokokoKartak().kenduKarta(altuena);
				}
			}
		}
		if(Tableroa.getTableroa().getJokokoKartak().tamaina()<5){
			
			for( int j = Tableroa.getTableroa().getJokokoKartak().tamaina(); j<=5; j++){
				Karta h = new KartaHutsa();
				Tableroa.getTableroa().getJokokoKartak().gehituKarta(h);
			}
	}
		
	}
	

}
