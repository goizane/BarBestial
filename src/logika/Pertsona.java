package logika;

import java.util.List;
import java.util.Stack;

public class Pertsona extends Jokalari{
	
	private static KartaZerrenda eskukoKartakPer;
	private static Stack<Karta> mazoaPer;
	private static int pertsonaPuntuak=0;
	private static String izena;
	public Pertsona(){
		this.izena= new String();
		this.kolorea = kolorea;
		this.eskukoKartakPer = new KartaZerrenda();
		this.mazoaPer = new Stack<Karta>();
	}
	
//	public Stack<Karta> getMazoaPer(){
//		return mazoaPer;
//	}
	
	public static int getPuntuazioa(){ //ER
		return pertsonaPuntuak;
	}
	
	public static Karta mazotikKartaHartuPer(){ //ER
		 return mazoaPer.pop();
		
	}
	public static boolean jokoaAmaituDaPer(){ //ER
		boolean amaitu = false;
		if(eskukoKartakPer.hutsik()){
			amaitu = true;
		}
		else{
			amaitu = false;
		}
		return amaitu;
	}
//	public static void mazokoKartaEskukoKartetaraPer(Karta k){
//		eskukoKartakPer.gehituKarta(k);
//	}
	public static KartaZerrenda getEskukoKartakPer(){
		return eskukoKartakPer;
	}
	public void kartakKargatuPer(List<Integer> lista){
		List<Integer> zerr = lista;
		int kont =1;
		int i =0;
		Karta k = null;
		//ESKUKO KARTAK
		while(kont<=4){
			k = KartaSortzailea.kartaSortu(lista.get(i), kolorea);
			this.eskukoKartakPer.gehituKarta(k);
			k.koloreaEguneratu(kolorea);
			kont ++;
			i++;
		}
		//MAZOKO KARTAK
		while(4<=kont&& kont<=12){
			k = KartaSortzailea.kartaSortu(lista.get(i), kolorea);
			this.mazoaPer.push(k);
			k.koloreaEguneratu(kolorea);
			kont++;
			i++;
		}
		
		
		
	}
	public void jokatuPer(Karta k){ //ER
		KartaZerrenda eskKartak = new KartaZerrenda();
		Tableroa.getTableroa().ilaranKartaSartu(k);
		
		eskukoKartakPer.kenduKarta(k);
		if (eskukoKartakPer.tamainaKartaHutsBarik()<5) {
			eskukoKartakPer.gehituKarta(new KartaHutsa());
		}
		for(int i = 0; i<3; i++){
			eskKartak.gehituKarta(eskukoKartakPer.get(i));
		}
		if(!mazoaPer.isEmpty()){
			Karta mazokoKarta = mazotikKartaHartuPer();
			eskKartak.gehituKarta(mazokoKarta);
		}
		
		eskukoKartakPer = eskKartak;
	}
	public void jokalariaHasieratuPer() { //er
		List<Integer> lista = kartakNahastu();
		kartakKargatuPer(lista);
		
	}
	public void izenaHasieratu(String izena){ //ER
		this.izena= izena;
	}
	
	public static String getIzena(){ //ER
		return izena;
	}
	public static void pertsonaPuntuakEguneratu(Karta k) { //ER
		int puntuak;
		if(k.getZenb()==6 || k.getZenb()==9 || k.getZenb()==11 || k.getZenb()==12){
			puntuak = 2;
		}
		else if(k.getZenb()==4 || k.getZenb()==5 || k.getZenb()== 8 || k.getZenb()==10){
			puntuak = 3;
		}else{
			puntuak = 4;
		}
		pertsonaPuntuak = pertsonaPuntuak + puntuak;
		
	}
	
}
