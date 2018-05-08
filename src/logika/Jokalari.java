package logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Jokalari {

	//ATRIBUTUAK
	private static String izena;
	
	private static KartaZerrenda eskukoKartakPer;
	private static KartaZerrenda eskukoKartakOrd;
	private Stack<Karta> mazoaPer;
	private Stack<Karta> mazoaOrd;

	private static int pertsonaPuntuak=0;
	private static int ordenagailuPuntuak=0;
	private String kolorea;
	
	//ERAIKITZAILEA
	public Jokalari(String kolorea){
		this.izena= new String();
		this.eskukoKartakPer = new KartaZerrenda();
		this.eskukoKartakOrd = new KartaZerrenda();
		this.mazoaPer = new Stack<Karta>();
		this.mazoaOrd = new Stack<Karta>();
		this.kolorea = kolorea;
		
	}
	
	//METODOAK
	private void jokatu(){
		
	}
	
	public Stack<Karta> getMazoaPer(){
		return mazoaPer;
	}
	
	public Stack<Karta> getMazoaOrd(){
		return mazoaOrd;
	}
	
	public static String getIzena(){
		return izena;
	}
	
	public String getKolorea(){
		return kolorea;
	}
	
	public static int getPuntuazioa(){
		return pertsonaPuntuak;
	}
	
	public List<Integer> kartakNahastu(){
		
		int kont =0;
		List<Integer> kartaZerrenda = new ArrayList<Integer>();

		while(kont<12){
			Random generator = new Random(); 
			int zenb = generator.nextInt(12) + 1;
			
			if(!kartaZerrenda.contains(zenb)){
				kartaZerrenda.add(zenb);
//				System.out.println(kont +"sartu da "+zenb);
				kont++;
			}
		}
		return kartaZerrenda;
			
	}
	public void kartakKargatuPer(List<Integer> lista, String kolorea){
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
	
	
	public void kartakKargatuOrd(List<Integer> lista, String kolorea){
		List<Integer> zerr = lista;
		int kont =1;
		int i =0;
		Karta k = null;
		System.out.println("ESKUKO KARTAK");
		while(kont<=4){
			k = KartaSortzailea.getKartaSortzailea().sortuKarta(lista.get(i), kolorea);
			this.eskukoKartakOrd.gehituKarta(k);
			k.koloreaEguneratu(kolorea);
			System.out.println(k.getIzena() +"KOLOREA: "+ k.getKolorea());
			kont ++;
			i++;
		}
		System.out.println("MAZOKO KARTAK");
		while(4<=kont&& kont<=12){
			k = KartaSortzailea.getKartaSortzailea().sortuKarta(lista.get(i), kolorea);
			this.mazoaOrd.push(k);
			k.koloreaEguneratu(kolorea);
			System.out.println(k.getIzena() +"KOLOREA: "+ k.getKolorea());
			kont++;
			i++;
		}

	}
	
	
	public void jokalariarenKoloreaHasieratu(String kol){
		this.kolorea = kol;
	}
	
	public void izenaHasieratu(String izena){
		this.izena= izena;
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
		
	public void jokatuOrd(Karta k){
		KartaZerrenda eskKartak = new KartaZerrenda();
		Tableroa.getTableroa().ilaranKartaSartu(k);
		System.out.println("jokatutako Karta :" + k.getIzena());
		eskukoKartakOrd.kenduKarta(k);
		if (eskukoKartakOrd.tamaina()<5) {
			eskukoKartakOrd.gehituKarta(new KartaHutsa());
		}
		for(int i = 0; i<3; i++){
			eskKartak.gehituKarta(eskukoKartakOrd.get(i));
		}
		if(!mazoaOrd.isEmpty()){
			Karta mazokoKarta = mazotikKartaHartuOrd();
			eskKartak.gehituKarta(mazokoKarta);
		}
		
		eskukoKartakOrd = eskKartak;
	}
	
	public Karta mazotikKartaHartuPer(){
		 return this.mazoaPer.pop();
		
	}
	public Karta mazotikKartaHartuOrd(){
		 return this.mazoaOrd.pop();
		
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
	
	
	
	public static boolean jokoaAmaituDaOrd(){
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
	
	public void mazokoKartaEskukoKartetaraPer(Karta k){
		this.eskukoKartakPer.gehituKarta(k);
	}
	public void mazokoKartaEskukoKartetaraOrd(Karta k){
		this.eskukoKartakOrd.gehituKarta(k);
	}
	public static KartaZerrenda getEskukoKartakPer(){
		return eskukoKartakPer;
	}
	public static KartaZerrenda getEskukoKartakOrd(){
		return eskukoKartakOrd;
	}

	public void jokalariaHasieratuPer( String kolorea) {
		List<Integer> lista = kartakNahastu();
		kartakKargatuPer(lista, kolorea);
		
	}
	public void jokalariaHasieratuOrd( String kolorea) {
		List<Integer> lista = kartakNahastu();
		kartakKargatuOrd(lista, kolorea);
		
	}

	public static void pertsonaPuntuakEguneratu() {
		pertsonaPuntuak++;
		
	}

	public static void OrdenagailuPuntuakEguneratu() {
		ordenagailuPuntuak++;
		
	}
	
	public static boolean pertsonaIrabazi(){
		boolean pertsonaI= false;
		if(pertsonaPuntuak> ordenagailuPuntuak){
		
			pertsonaI = true;
		}
		System.out.println("pertsona puntuak: " + pertsonaPuntuak);
		System.out.println("Ordenagauilu puntuak:" + ordenagailuPuntuak);
		return pertsonaI;
	}
	
	public static boolean berdinketa(){
		boolean berdinketa = false;
		if(pertsonaPuntuak == ordenagailuPuntuak){
			berdinketa = true;
		}
		System.out.println("pertsona puntuak: " + pertsonaPuntuak);
		System.out.println("Ordenagauilu puntuak:" + ordenagailuPuntuak);
		return berdinketa;
	}
}