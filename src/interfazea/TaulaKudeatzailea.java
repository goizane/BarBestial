package interfazea;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

import logika.FokaKarta;
import logika.HipopotamoKarta;
import logika.JirafaKarta;
import logika.Jokalari;
import logika.JokalariZerrenda;
import logika.KamaleoiKarta;
import logika.KanguroKarta;
import logika.Karta;
import logika.KartaHutsa;
import logika.KartaSortzailea;
import logika.KartaZerrenda;
import logika.KrokodiloKarta;
import logika.LehoiKarta;
import logika.LoroKarta;
import logika.MofetaKarta;
import logika.SugeKarta;
import logika.Tableroa;
import logika.TximinoKarta;
import logika.ZebraKarta;

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
		t=Taula.getInstantzia();
		t.taulaHasieratu();
		Tableroa.getTableroa().tableroaHasieratu();
	
	
		this.jokalariKartak = Tableroa.getTableroa().getJokalariak().getJok(0).getEskukoKartak();
		this.ordenagailuKartak = Tableroa.getTableroa().getJokalariak().getJok(1).getEskukoKartak();
		this.jokokoKartak = Tableroa.getTableroa().getJokokoKartak();
		String jokalari = Tableroa.getTableroa().getJokalariak().getJok(0).getKolorea();
		String ordenagailu = Tableroa.getTableroa().getJokalariak().getJok(1).getKolorea();
		taularatuKartak(ordenagailuKartak,"Berdea");
		taularatuKartak(jokokoKartak,"");
		taularatuKartak(jokalariKartak,"Urdina");
		t.konputagailuaHasieratu();
		t.erdiaHasieratu();
		t.jokalariaHasieratu();
		t.bistaratu();
	}
	
	public KartaZerrenda getJokokoKartak(){
		return Tableroa.getTableroa().getJokokoKartak();
	}
	
	public void grafikaEguneratu(Karta k ){
		t=Taula.getInstantzia();
		t.taulaHasieratu();
		
		
		this.jokokoKartak = Tableroa.getTableroa().getJokokoKartak();
		this.jokalariKartak = Tableroa.getTableroa().getJokalariak().getJok(0).getEskukoKartak();
		this.ordenagailuKartak = Tableroa.getTableroa().getJokalariak().getJok(1).getEskukoKartak();
		String jokalari = Tableroa.getTableroa().getJokalariak().getJok(0).getKolorea();
		String ordenagailu = Tableroa.getTableroa().getJokalariak().getJok(1).getKolorea();
		taularatuKartak(ordenagailuKartak,"Berdea");
		taularatuKartak(jokokoKartak,"");
		taularatuKartak(jokalariKartak,"Urdina");
		t.konputagailuaHasieratu();
		t.erdiaHasieratu();
		t.jokalariaHasieratu();
		t.bistaratu();
	}
//	public Karta kartaKargatu(KartaZerrenda zerrenda){
//		Karta erantzuna;
//		boolean badago = true;
//		Random random = new Random();
//		int kartaZenb=random.nextInt(12 - 1 + 1) + 1;
//		if(zerrenda.tamaina()>0){
//			while(badago){
//				for (int i = 0; i < zerrenda.tamaina(); i++) {
//					if (zerrenda.get(i).getZenb() != kartaZenb) {
//						badago = false;
//						break;
//					}
//				}
//				if(badago){
//					kartaZenb = random.nextInt(12 - 1 + 1) + 1;
//				}
//				
//				
//			}
//		}else{
//			badago=false;
//		}
//		
//		
//		
//		
//		if (!badago) {
//			erantzuna=KartaSortzailea.getKartaSortzailea().sortuKarta(kartaZenb);
//		}else{
//			erantzuna=null;
//		}
//		return erantzuna;
//		
//		
//	}
//	public void jokalariKartakHasieratu(){
//		Karta karta;
//		for(int i=0;i<12;i++){
//			karta=kartaKargatu(jokalariKartak);
//			jokalariKartak.gehituKarta(karta);
//		}
//	}
//	
//	public void konputagailuKartakHasieratu(){
//		Karta karta;
//		for(int i=0;i<12;i++){
//			karta=kartaKargatu(ordenagailuKartak);
//			ordenagailuKartak.gehituKarta(karta);
//		}
//	}

	
	public void taularatuKartak(KartaZerrenda kartak, String kolorea){
		if (kolorea.equals("Berdea")) {
			t.gehituKarta("taberna.png", null);
			t.gehituMazoa("Berdea");
			for(int i=0;i<4;i++){
				t.gehituKarta(kolorea, kartak.get(i));
			}
			t.gehituKarta("zakarrontzia.png", null);
		}
		else if (kolorea.equals("Urdina")) {
			for(int i=0;i<4;i++){
				t.gehituKarta(kolorea, kartak.get(i));
			}
			t.gehituMazoa("Urdina");
		}
		else {
			for(int i=0;i<5;i++){
				t.gehituKarta(kolorea, kartak.get(i));
			}
		}
		
		
		
//		if(kolorea.equals("Berdea")){
//			t.gehituKarta("taberna.png", null);
//			t.gehituMazoa("Berdea");
//		}
//		if(!"".equals(kolorea)){
//			for(int i=0;i<4;i++){
//			
//				t.gehituKarta(kolorea, kartak.get(i));
//				
//			}
//			
//			if(kolorea.equals("Urdina")){
//				t.gehituMazoa("Urdina");
//			}
//		}else{ //"" --> jokoko kartak
//			
//				for(int i=0;i<5;i++){
//					t.gehituKarta(kolorea, kartak.get(i));
//				}
//		}
//		
//		if(kolorea.equals("Berdea")){
//			t.gehituKarta("zakarrontzia.png", null);
//		}
	}

	public void animaladaErrekurtsiboakEgin(){
		Tableroa.getTableroa().animaladaErrekurtsiboakEgin();
	}
	
	
	
	public Karta mazotikKartaHartu(){
		Karta k= jokalari.mazotikKartaHartu();
		jokalari.mazokoKartaEskukoKartetara(k);
		return k;
	}
	
	public void jokokoKartakBetetaSartuKanporatu(){ //jokokoKarten ilara beteta badago lehenengo biak sartu eta azkena kanporatzen du
		if(Tableroa.getTableroa().jokokoKartakBeteta()){
			System.out.println("Tableroa beteta dago! --> lehenengo biak tabernara eta azkena kanpora");
			Tableroa.getTableroa().jokokoKartakSartuKanporatu();
		}
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
	
//	public Karta kartaAurkitu(int i){
//		return KartaSortzailea.getKartaSortzailea().sortuKarta(i);
//	}
	
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
