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

public class TaulaKudeatzailea extends Observable {
	private static TaulaKudeatzailea taula = new TaulaKudeatzailea();
	private JokalariZerrenda jokalariak;
	private KartaZerrenda jokalariKartak =new KartaZerrenda();
	private KartaZerrenda ordenagailuKartak=new KartaZerrenda();
	private KartaZerrenda jokokoKartak=new KartaZerrenda();
	private Taula t;
	private Jokalari jokalari = new Jokalari("Urdina");
	
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
		jokalari.jokalariKartakHasieratu();
//		System.out.println("Hasieratu dira");
//		System.out.println(jokalariKartak.get(1).getIzena());
		konputagailuKartakHasieratu();
		erdikoKartakHasieratu();
		taularatuKartak(ordenagailuKartak,"Berdea");
		taularatuKartak(jokokoKartak,"");
		taularatuKartak(jokalariKartak,"Urdina");
		t.konputagailuaHasieratu();
		t.erdiaHasieratu();
		t.jokalariaHasieratu();
		t.bistaratu();
		
	}
	
	public Karta kartaKargatu(KartaZerrenda zerrenda){
		Karta erantzuna;
		boolean badago = true;
		Random random = new Random();
		int kartaZenb=random.nextInt(12 - 1 + 1) + 1;
		if(zerrenda.tamaina()>0){
			while(badago){
				for (int i = 0; i < zerrenda.tamaina(); i++) {
					if (zerrenda.get(i).getZenb() != kartaZenb) {
						badago = false;
						break;
					}
				}
				if(badago){
					kartaZenb = random.nextInt(12 - 1 + 1) + 1;
				}
			}
		}else{
			badago=false;
		}
		
		if (!badago) {
			erantzuna=KartaSortzailea.getKartaSortzailea().sortuKarta(kartaZenb);
		}else{
			erantzuna=null;
		}
		return erantzuna;
		
		
	}
//	public void jokalariKartakHasieratu(){
////		jokalariKartak=new KartaZerrenda();
////		jokalariKartak = Tableroa.getTableroa().eskukoKartakKargatu();
//		Karta karta;
//		for(int i=0;i<12;i++){
//			karta=kartaKargatu(jokalariKartak);
//			jokalariKartak.gehituKarta(karta);
//		}
//	}
	
	public void konputagailuKartakHasieratu(){
		Karta karta;
		for(int i=0;i<12;i++){
			karta=kartaKargatu(ordenagailuKartak);
			ordenagailuKartak.gehituKarta(karta);
		}
	}
	public void erdikoKartakHasieratu(){
		Karta karta;
		for(int i=0;i<5;i++){
			karta=new KartaHutsa();
			jokokoKartak.gehituKarta(karta);
		}
	}
	
	public void taularatuKartak(KartaZerrenda kartak, String jokalaria){
		if(jokalaria.equals("Berdea")){
			t.gehituKarta("taberna.png", null);
			t.gehituMazoa("Berdea");
		}
		if(!"".equals(jokalaria)){
			for(int i=0;i<4;i++){
			
				t.gehituKarta(jokalaria, kartak.get(i));
				
			}
			
			if(jokalaria.equals("Urdina")){
				t.gehituMazoa("Urdina");
			}
		}else{
			for(int i=0;i<5;i++){
				t.gehituKarta("kartaHutsa.jpg", null);
			}
		}
		
		if(jokalaria.equals("Berdea")){
			t.gehituKarta("zakarrontzia.png", null);
		}
	}
	
	public void kartaBota(Karta k ){
		jokalari.kartaBota(k);
	}
	
	public boolean ilaraBeteta(){
		return Tableroa.getTableroa().ilaraBeteta();
	}
	
	public Karta mazotikKartaHartu(){
		Karta k= jokalari.mazotikKartaHartu();
		jokalari.mazokoKartaEskukoKartetara(k);
		return k;
	}
	
	public KartaZerrenda eskukoKartakKargatu(){
		return (KartaZerrenda) Tableroa.getTableroa().eskukoKartakKargatu();
		
	}
	public Karta kartaAurkitu(int i ){
		return KartaSortzailea.getKartaSortzailea().sortuKarta(i);
	}
	
	public Karta getKarta(int i){
		return jokalariKartak.get(i);
	}
	
	public void animaladaEgin(){
		
	}
	
	public void lehenengoBiakTabernanSartu(){
		Tableroa.getTableroa().ilarakoLehenengoBiakSartu();
	}
	
	public void azkenaKanporatu(){
		Tableroa.getTableroa().azkenaKamporatu();
	}
}
