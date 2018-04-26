package interfazea;

import logika.Jokalari;
import logika.JokalariZerrenda;
import logika.KamaleoiKarta;
import logika.KanguroKarta;
import logika.Karta;
import logika.KartaZerrenda;
import logika.LoroKarta;
import logika.Tableroa;

public class TaulaKudeatzailea {
	private static TaulaKudeatzailea taula = new TaulaKudeatzailea();
	private JokalariZerrenda jokalariak;
	private KartaZerrenda jokalariKartak=new KartaZerrenda();
	private KartaZerrenda ordenagailuKartak=new KartaZerrenda();
	private KartaZerrenda jokokoKartak=new KartaZerrenda();
	private Taula t;
	private Jokalari jokalari;
	
	private TaulaKudeatzailea() {
	}

	public static synchronized TaulaKudeatzailea getTaulaKudeatzailea() {
		if (taula != null) {
			taula = new TaulaKudeatzailea();
		}
		return taula;
	}
	
	public void hasieratu(){
		Taula t = new Taula();
		Tableroa.getTableroa().tableroaHasieratu();
		t.pantailaratuOrdenagailuKartak();
		t.pantailaratuJokokoKartak();
		t.pantailaratuJokalariKartak();
	

	}
	
	public KartaZerrenda getJokokoKartak(){
		return Tableroa.getTableroa().getJokokoKartak();
	}
	
	public void grafikaEguneratu( ){
//		t.setVisible(false);
		t = new Taula();
		t.pantailaratuOrdenagailuKartak();
		t.pantailaratuJokokoKartak();
		t.pantailaratuJokalariKartak();
	
	}

	public void animaladaErrekurtsiboakEgin(){
		Tableroa.getTableroa().animaladaErrekurtsiboakEgin();
	}
	
	
	
	public Karta mazotikKartaHartu(){
		Karta k= jokalari.mazotikKartaHartu();
		jokalari.mazokoKartaEskukoKartetara(k);
		return k;
	}
	
	public void jokokoKartakHustu(){
		Tableroa.getTableroa().jokokoKartakHustu();
	}
	
	public int jokokoKartenTam(){
		return Tableroa.getTableroa().getJokokoKartak().tamainaKartaHutsBarik();
	}
	
	public void kartaKendu(Karta k){
		jokokoKartak.kenduKarta(k);
	}
	
	public boolean jokoaAmaitu(int i){
		return Tableroa.getTableroa().getJokalariak().getJok(i).jokoaAmaituDa();
	}
	
	public void loroariKartaEsleitu( Karta k){
		LoroKarta.kenduKarEguneratu(k);
	}
	
	
	
	public String getKartaIzena(int i){
		return Tableroa.getTableroa().getJokokoKartak().get(i).getIzena();
	}
	
	public void kanguroariSaltoaEsleitu( int i ){
		KanguroKarta.saltoa(i);
	}
	

	
	public Karta getKarta(int i){
		return jokalariKartak.get(i);
	}
	
	public void kamaleoiarenKopiatuKartaEguneratu(Karta k){
		KamaleoiKarta.kopiatzekoKartaEguneratu( k );
	}
	
	public void animaladaEgin(Karta k ){
		k.animaladaEgin();
	}
	
	public void jokatu(Karta k, int jok){
		Tableroa.getTableroa().jokatu(k, jok);
	}
	
	public boolean irabazlea(int i){
		boolean irabazi =false;
		if(Tableroa.getTableroa().getJokalariak().getJok(i).jokoaAmaituDa()){
			irabazi = true;
		}
		return irabazi;
	}
	
	public void ordenagailuarenTxanda(){
		Tableroa.getTableroa().ordenagailuarenTxanda();
	}
	
	public KartaZerrenda JokalariarenEskukoKartakLortu(){
		return Tableroa.getTableroa().getJokalariak().getJok(0).getEskukoKartak();
	}
	
	public KartaZerrenda OrdenagailuarenEskukoKartakLortu(){
		return Tableroa.getTableroa().getJokalariak().getJok(1).getEskukoKartak();
	}
}
