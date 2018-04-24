package logika;

import interfazea.KanguroUI;

public class KanguroKarta extends Karta {
	private static int salto;
	//ERAIKITZAILEA
	public KanguroKarta(){
		this.izena="kanguro";
		this.zenb=3;
		this.errekurtsiboa = false;
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
