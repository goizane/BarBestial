package logika;

import interfazea.KanguroUI;

public class KanguroKarta extends Karta {
	private static int salto;
	private String kolorea;
	//ERAIKITZAILEA
	public KanguroKarta(String kolorea){
		this.izena="kanguro";
		this.zenb=3;
		this.errekurtsiboa = false;
		this.kolorea = kolorea;
	}


	public void animaladaEgin() { //karta 1 edo bi saltatzen ditu (jokalariak aukeratzen du)
		// TODO Auto-generated method stub
		System.out.println("KANGUROAREN ANIMALADA");
		int s = this.salto;
	
		Tableroa.getTableroa().getJokokoKartak().saltatu(s);
		
		
	}
	
	public static void saltoa( int i){
		salto = i;
	}
	
}
