package logika;

public class HipopotamoKarta extends Karta {
	
	
	//ERAIKITZAILEA
	public HipopotamoKarta(){
		this.izena="hipopotamo";
		this.zenb=11;
		this.errekurtsiboa = true;
	}


	public void animaladaEgin() {
		// TODO Auto-generated method stub
		System.out.println("HIPOPOTAMOAREN ANIMALADA");
		if(Tableroa.getTableroa().getJokokoKartak().dauka(7)){
			Tableroa.getTableroa().getJokokoKartak().txikiagoakDirenKartakEzabatu(11);
		}
		else{
			Tableroa.getTableroa().getJokokoKartak().txikiagoakEzabatuZebraBarik(11);
		}
	}

}
