package logika;

public class LoroKarta extends Karta {
	
	//ERAIKITZAILEA
	public LoroKarta(){
		this.izena="loro";
		this.zenb=2;
		this.errekurtsiboa = false;
	}

	public void animaladaEgin(Karta k) { //jokalariak aukeratutako kartari patada eman
		// TODO Auto-generated method stub
		System.out.println("LOROAREN ANIMALADA");
		Tableroa.getTableroa().getJokokoKartak().kenduKarta(k);
		
	}
	
}
