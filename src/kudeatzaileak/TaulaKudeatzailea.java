package kudeatzaileak;

import java.util.Observable;

import interfazea.Taula;
import logika.Jokalari;

import logika.KamaleoiKarta;
import logika.KanguroKarta;
import logika.Karta;
import logika.KartaZerrenda;
import logika.LoroKarta;
import logika.Ordenagailua;
import logika.Pertsona;
import logika.Tableroa;

public class TaulaKudeatzailea {
	private static TaulaKudeatzailea taula = new TaulaKudeatzailea();
	private KartaZerrenda jokalariKartak=new KartaZerrenda();
	private KartaZerrenda ordenagailuKartak=new KartaZerrenda();
	private KartaZerrenda jokokoKartak=new KartaZerrenda();
	private Jokalari jokalari;
	private Taula t;
	
	
	private TaulaKudeatzailea() {
	}

	public static synchronized TaulaKudeatzailea getTaulaKudeatzailea() {
		if (taula != null) {
			taula = new TaulaKudeatzailea();
		}
		return taula;
	}
	
	public void hasieratu(String izena){
		Tableroa.getTableroa().tableroaHasieratu(izena);
		t = new Taula();
//		Tableroa.getTableroa().tableroaHasieratu(izena);
		t.pantailaratuOrdenagailuKartak();
		t.pantailaratuJokokoKartak();
		t.pantailaratuJokalariKartak();
		t.pantailaratuOrdenagailuakJokatuKarta();
	

	}
	
	public KartaZerrenda getJokokoKartak(){
		return Tableroa.getTableroa().getJokokoKartak();
	}
	
	public void grafikaEguneratu( ){ //ER
//		t.setVisible(false);
		t = new Taula();
		
		t.pantailaratuOrdenagailuKartak();
		t.pantailaratuJokokoKartak();
		t.pantailaratuJokalariKartak();
		t.pantailaratuOrdenagailuakJokatuKarta();
	
	}

	public void animaladaErrekurtsiboakEgin(){ //ER
		Tableroa.getTableroa().animaladaErrekurtsiboakEgin();
	}
	
	public void jokokoKartakHustu(){ //ER
		Tableroa.getTableroa().jokokoKartakHustu();
	}
	
	public int jokokoKartenTam(){ //ER
		return Tableroa.getTableroa().getJokokoKartak().tamainaKartaHutsBarik();
	}
	
//	public void kartaKendu(Karta k){
//		jokokoKartak.kenduKarta(k);
//	}
	
	
	public void loroariKartaEsleitu( Karta k){ //ER
		LoroKarta.kenduKarEguneratu(k);
	}
	
	
	
	public String getKartaIzena(int i){ //ER
		return Tableroa.getTableroa().getJokokoKartak().get(i).getIzena();
	}
	
	public void kanguroariSaltoaEsleitu( int i ){
		KanguroKarta.saltoa(i);
	}
	

	
	public Karta getKarta(int i){ //ER
		return jokalariKartak.get(i);
	}
	
	public void kamaleoiarenKopiatuKartaEguneratu(Karta k){ //ER
		KamaleoiKarta.kopiatzekoKartaEguneratu( k );
	}
	
	public void animaladaEgin(Karta k ){ //ER
		k.animaladaEgin();
	}
	
	public void jokatu(Karta k){ //ER
		Tableroa.getTableroa().jokatuPer(k);
	}
	
	public boolean amaitu(){ //ER
		boolean amaitu =false;
		if(Pertsona.jokoaAmaituDaPer()){
			amaitu = true;
		}
		return amaitu;
	}
	
	public boolean pertsonaIrabazi(){ //ER
		return Tableroa.getTableroa().pertsonaIrabazi();
	}
	
	public boolean berdinketa(){ //ER
		return Tableroa.getTableroa().berdinketa();
	}

	
	public void ordenagailuarenTxanda(){ //ER
		Tableroa.getTableroa().getOrdenagailua().ordenagailuarenTxanda();
	}
	
	public KartaZerrenda JokalariarenEskukoKartakLortu(){ //ER
		return Tableroa.getTableroa().getPerKartak();
	}
	
	public KartaZerrenda OrdenagailuarenEskukoKartakLortu(){ //ER
		return Tableroa.getTableroa().getOrdenagailua().getEskukoKartakOrd();
	}

	public String getIzena() { //ER
		return Pertsona.getIzena();
	}
	
	public int getPuntuazioa(){ //ER
		return Pertsona.getPuntuazioa();
	}

	public Karta getOrdenagailuaJokKarta() { //er
		return Tableroa.getTableroa().getOrdenagailua().getJokatutakoAzkenKarta();
	}
}
