package logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Jokalari {

	//ATRIBUTUAK
	private String izena;
	private KartaZerrenda eskukoKartak;
	private Stack<Karta> mazoa;
	
	//ERAIKITZAILEA
	public Jokalari(String izena){
		this.izena= new String();
		this.eskukoKartak = new KartaZerrenda();
		this.mazoa = new Stack<Karta>();
	}
	
	//METODOAK
	private void jokatu(){
		
	}
	public void eskukoKartakKargatu(List<Integer> lista){
		for(int i : lista){
			Karta k = null;
			k = kartaAurkitu(i);
			this.eskukoKartak.gehituKarta(k);		
		}
	}
	public void mazoaKargatu(List<Integer> lista){
		for(int i : lista){
			Karta k = null;
			k = kartaAurkitu(i);
			this.mazoa.push(k);
		}
	
	}
	public void kartaBota(Karta k){
			eskukoKartak.kenduKarta(k);
			Tableroa.getTableroa().ilaranKartaSartu(k);
		}
		
	public Karta mazotikKartaHartu(){
		 return this.mazoa.pop();
	}
	public void mazokoKartaEskukoKartetara(Karta k){
		this.eskukoKartak.gehituKarta(k);
	}
	public KartaZerrenda getEskukoKartak(){
	return this.eskukoKartak;
	}
	public Karta kartaAurkitu(Integer i){
		Karta k = null;
		if(i==1){
			k= new MofetaKarta();
		}else if(i==2){
			k= new LoroKarta();
		}else if(i==3){
			k= new KanguroKarta();
		}else if(i==4){
			k= new TximinoKarta();
		}else if(i==5){
			k= new KamaleoiKarta();
		}else if(i==6){
			k= new FokaKarta();
		}else if(i==7){
			k= new ZebraKarta();
		}else if(i==8){
			k= new JirafaKarta();
		}else if(i==9){
			k= new SugeKarta();
		}else if(i==10){
			k= new KrokodiloKarta();
		}else if(i==11){
			k= new HipopotamoKarta();
		}else if(i==12){
			k= new LehoiKarta();
		}
		return k;
	}
}
