package interfazea;

import java.util.Random;

import logika.FokaKarta;
import logika.HipopotamoKarta;
import logika.JirafaKarta;
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
import logika.TximinoKarta;
import logika.ZebraKarta;

public class TaulaKudeatzailea {
	private static TaulaKudeatzailea taula = new TaulaKudeatzailea();
	private JokalariZerrenda jokalariak;
	private KartaZerrenda jokalariKartak=new KartaZerrenda();
	private KartaZerrenda ordenagailuKartak=new KartaZerrenda();
	private KartaZerrenda jokokoKartak=new KartaZerrenda();
	private Taula t;

	private TaulaKudeatzailea() {
	}

	public static synchronized TaulaKudeatzailea getTaulaKudeatzailea() {
		if (taula != null) {
			taula = new TaulaKudeatzailea();
		}
		return taula;
	}
	
	public void hasieratu(){
		t=new Taula();
		t.bistaratu();
		jokalariKartakHasieratu();
		konputagailuKartakHasieratu();
		erdikoKartakHasieratu();
		taularatuKartak(ordenagailuKartak,"Berdea");
		taularatuKartak(jokokoKartak,"");
		taularatuKartak(jokalariKartak,"Urdina");
		t.konputagailuaHasieratu();
		t.erdiaHasieratu();
		t.jokalariaHasieratu();
	}
	
	public Karta kartaKargatu(KartaZerrenda zerrenda){
		Karta erantzuna;
		boolean badago = true;
		Random random = new Random();
		int kartaZenb = random.nextInt(12 - 1 + 1) + 1;
		while(badago){
			for (int i = 0; i < zerrenda.tamaina(); i++) {
				if (zerrenda.get(i).getZenb() != kartaZenb) {
					badago = true;
					break;
				}
			}
			
		}
		
		
		
		if (!badago) {
			erantzuna=KartaSortzailea.getKartaSortzailea().sortuKarta(kartaZenb);
		}else{
			erantzuna=null;
		}
		return erantzuna;
		
		
	}
	public void jokalariKartakHasieratu(){
		Karta karta;
		for(int i=0;i<12;i++){
			karta=kartaKargatu(jokalariKartak);
			jokalariKartak.gehituKarta(karta);
		}
	}
	
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
		}
		for(int i=0;i<4;i++){
			if("".equals(jokalaria)){
				t.gehituKarta("kartaHutsa.jpg", kartak.get(i));
			}else{
				t.gehituKarta(jokalaria, kartak.get(i));
			}
		}
		if(jokalaria.equals("Berdea")){
			t.gehituKarta("zakarrontzia.png", null);
		}
	}
	
}
