package logika;

import interfazea.GalduUI;
import interfazea.IrabaziUI;
import interfazea.TaulaKudeatzailea;

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
//		TaulaKudeatzailea.getTaulaKudeatzailea().animaladaErrekurtsiboakEgin();
//		TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartakHustu();
//		if(TaulaKudeatzailea.getTaulaKudeatzailea().irabazlea(0)){
//			new IrabaziUI();
//		}
//		TaulaKudeatzailea.getTaulaKudeatzailea().ordenagailuarenTxanda();
//		if(TaulaKudeatzailea.getTaulaKudeatzailea().irabazlea(1)){
//			new GalduUI();
//		}
	}

}
