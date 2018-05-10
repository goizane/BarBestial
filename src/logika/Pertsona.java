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
	
	public Stack<Karta> getMazoaPer(){
		return mazoaPer;
	}
	
	public static int getPuntuazioa(){
		return pertsonaPuntuak;
	}
	
	public static Karta mazotikKartaHartuPer(){
		 return mazoaPer.pop();
		
	}
	public static boolean jokoaAmaituDaPer(){
		boolean amaitu = false;
		if(getEskukoKartakPer().hutsik()){
			System.out.println("JOKOA AMAITU DA");
			amaitu = true;
		}
		else{
			amaitu = false;
		}
		return amaitu;
	}
	public static void mazokoKartaEskukoKartetaraPer(Karta k){
		eskukoKartakPer.gehituKarta(k);
	}
	public static KartaZerrenda getEskukoKartakPer(){
		return eskukoKartakPer;
	}
	public void kartakKargatuPer(List<Integer> lista){
		List<Integer> zerr = lista;
		int kont =1;
		int i =0;
		Karta k = null;
		System.out.println("ESKUKO KARTAK");
		while(kont<=4){
			k = KartaSortzailea.getKartaSortzailea().sortuKarta(lista.get(i), kolorea);
			this.eskukoKartakPer.gehituKarta(k);
			k.koloreaEguneratu(kolorea);
			System.out.println(k.getIzena() +"KOLOREA: "+ k.getKolorea());
			kont ++;
			i++;
		}
		System.out.println("MAZOKO KARTAK");
		while(4<=kont&& kont<=12){
			k = KartaSortzailea.getKartaSortzailea().sortuKarta(lista.get(i), kolorea);
			this.mazoaPer.push(k);
			k.koloreaEguneratu(kolorea);
			System.out.println(k.getIzena() +"KOLOREA: "+ k.getKolorea());
			kont++;
			i++;
		}
		
		
		
	}
	public void jokatuPer(Karta k){
		KartaZerrenda eskKartak = new KartaZerrenda();
		Tableroa.getTableroa().ilaranKartaSartu(k);
		System.out.println("jokatutako Karta :" + k.getIzena());
		eskukoKartakPer.kenduKarta(k);
		if (eskukoKartakPer.tamainaKartaHutsBarik()<5) {
			System.out.println(" ESKUKO KARTAK < 5");
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
	public void jokalariaHasieratuPer() {
		List<Integer> lista = kartakNahastu();
		kartakKargatuPer(lista);
		
	}
	public void izenaHasieratu(String izena){
		this.izena= izena;
	}
	
	public static String getIzena(){
		return izena;
	}
	public static void pertsonaPuntuakEguneratu(Karta k) {
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
