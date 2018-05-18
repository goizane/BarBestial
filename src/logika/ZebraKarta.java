package logika;

import interfazea.GalduUI;
import interfazea.IrabaziUI;
import kudeatzaileak.TaulaKudeatzailea;

public class ZebraKarta extends Karta {
	
	private String kolorea;
	//ERAIKITZAILEA
	public ZebraKarta(String kolorea){
		this.izena="zebra";
		this.zenb=7;
		this.errekurtsiboa = true;
		this.kolorea = kolorea;
	}


	public void animaladaEgin() { // ez ditu kokrodiloak eta hipopotamoak pasatzen uzten
		// TODO Auto-generated method stub
		System.out.println("ZEBRAREN ANIMALADA");

	}

}
