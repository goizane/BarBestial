package kudeatzaileak;

import java.util.Observable;

import interfazea.Taula;
import logika.Jokalari;
import logika.JokalariZerrenda;
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
	private JokalariZerrenda jokalariak;
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
	
	public void grafikaEguneratu( ){
//		t.setVisible(false);
		t = new Taula();
		
		t.pantailaratuOrdenagailuKartak();
		t.pantailaratuJokokoKartak();
		t.pantailaratuJokalariKartak();
		t.pantailaratuOrdenagailuakJokatuKarta();
	
	}

	public void animaladaErrekurtsiboakEgin(){
		Tableroa.getTableroa().animaladaErrekurtsiboakEgin();
	}
	
	
	
	public Karta mazotikKartaHartuPer(){
		Karta k= Tableroa.getTableroa().getPertsona().mazotikKartaHartuPer();
		Tableroa.getTableroa().getPertsona().mazokoKartaEskukoKartetaraPer(k);
		return k;
	}
	public Karta mazotikKartaHartuOrd(){
		Karta k= Tableroa.getTableroa().getOrdenagailua().mazotikKartaHartuOrd();
		Tableroa.getTableroa().getOrdenagailua().mazokoKartaEskukoKartetaraOrd(k);
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
	
//	public boolean jokoaAmaitu(int i){
//		return Tableroa.getTableroa().getJokalariak().getJok(i).jokoaAmaituDa();
//	}
	
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
	
	public void jokatu(Karta k){
		Tableroa.getTableroa().jokatuPer(k);
	}
	
	public boolean amaitu(){
		boolean amaitu =false;
		if(Pertsona.jokoaAmaituDaPer()){
			amaitu = true;
			System.out.println("jokoa amaitu da!");
		}
		return amaitu;
	}
	
	public boolean pertsonaIrabazi(){
		return Jokalari.pertsonaIrabazi();
	}
	
	public boolean berdinketa(){
		return Jokalari.berdinketa();
	}

	
	public void ordenagailuarenTxanda(){
		Tableroa.getTableroa().ordenagailuarenTxanda();
	}
	
	public KartaZerrenda JokalariarenEskukoKartakLortu(){
		return Tableroa.getTableroa().getPerKartak();
	}
	
	public KartaZerrenda OrdenagailuarenEskukoKartakLortu(){
		return Tableroa.getTableroa().getOrdenagailua().getEskukoKartakOrd();
	}

	public String getIzena() {
		return Pertsona.getIzena();
	}
	
	public int getPuntuazioa(){
		return Pertsona.getPuntuazioa();
	}

	public Karta getOrdenagailuaJokKarta() {
		return Tableroa.getTableroa().getOrdenagailua().getJokatutakoAzkenKarta();
	}
}
