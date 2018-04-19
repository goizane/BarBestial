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
	public void eskukoKartakKargatu(KartaZerrenda lista){
		for(int i=0; i<lista.tamaina(); i++){
//			Karta k = null;
//			k = KartaSortzailea.getKartaSortzailea().sortuKarta(i);
			this.eskukoKartak.gehituKarta(lista.get(i));		
		}
	}
	public void mazoaKargatu(KartaZerrenda lista){
		for(int i=0; i<lista.tamaina(); i++){
//			Karta k = null;
//			k = KartaSortzailea.getKartaSortzailea().sortuKarta(i);;
			this.mazoa.push(lista.get(i));
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
	
	public void jokalariKartakHasieratu(){
//		jokalariKartak=new KartaZerrenda();
		eskukoKartak = Tableroa.getTableroa().eskukoKartakKargatu();
//		Karta karta;
//		for(int i=0;i<12;i++){
//			karta=kartaKargatu(jokalariKartak);
//			jokalariKartak.gehituKarta(karta);
//		}
//	}
	
}
}