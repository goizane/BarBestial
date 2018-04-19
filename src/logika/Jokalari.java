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
			k = KartaSortzailea.getKartaSortzailea().sortuKarta(i);
			this.eskukoKartak.gehituKarta(k);		
		}
	}
	public void mazoaKargatu(List<Integer> lista){
		for(int i : lista){
			Karta k = null;
			k = KartaSortzailea.getKartaSortzailea().sortuKarta(i);;
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
	
	
	
}
