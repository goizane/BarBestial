package logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Jokalari {

	//ATRIBUTUAK
	private static String izena;
	
	private static KartaZerrenda eskukoKartak;
	private Stack<Karta> mazoa;
	private int lortutakoPuntuak;
	private String kolorea;
	
	//ERAIKITZAILEA
	public Jokalari(String kolorea){
		this.izena= new String();
		this.eskukoKartak = new KartaZerrenda();
		this.mazoa = new Stack<Karta>();
		this.kolorea = kolorea;
		
	}
	
	//METODOAK
	private void jokatu(){
		
	}
	
	public Stack<Karta> getMazoa(){
		return mazoa;
	}
	
	public static String getIzena(){
		return izena;
	}
	
	public String getKolorea(){
		return kolorea;
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
	public void kartakKargatu(List<Integer> lista, String kolorea){
		List<Integer> zerr = lista;
		int kont =1;
		int i =0;
		Karta k = null;
		System.out.println("ESKUKO KARTAK");
		while(kont<=4){
			k = KartaSortzailea.getKartaSortzailea().sortuKarta(lista.get(i), kolorea);
			this.eskukoKartak.gehituKarta(k);
			k.koloreaEguneratu(kolorea);
			System.out.println(k.getIzena() +"KOLOREA: "+ k.getKolorea());
			kont ++;
			i++;
		}
		System.out.println("MAZOKO KARTAK");
		while(4<=kont&& kont<=12){
			k = KartaSortzailea.getKartaSortzailea().sortuKarta(lista.get(i), kolorea);
			this.mazoa.push(k);
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
	public void jokatu(Karta k){
			KartaZerrenda eskKartak = new KartaZerrenda();
			Tableroa.getTableroa().ilaranKartaSartu(k);
			System.out.println("jokatutako Karta :" + k.getIzena());
			eskukoKartak.kenduKarta(k);
			if (eskukoKartak.tamaina()<5) {
				eskukoKartak.gehituKarta(new KartaHutsa());
			}
			for(int i = 0; i<3; i++){
				eskKartak.gehituKarta(eskukoKartak.get(i));
			}
			if(!mazoa.isEmpty()){
				Karta mazokoKarta = mazotikKartaHartu();
				eskKartak.gehituKarta(mazokoKarta);
			}
			
			eskukoKartak = eskKartak;
		}
		
	public Karta mazotikKartaHartu(){
		 return this.mazoa.pop();
		
	}
	
	public boolean jokoaAmaituDa(){
		boolean amaitu = false;
		if(this.getEskukoKartak().hutsikDago()){
			amaitu = true;
		}
		else{
			amaitu = false;
		}
		return amaitu;
	}
	
	
	public void mazokoKartaEskukoKartetara(Karta k){
		this.eskukoKartak.gehituKarta(k);
	}
	public KartaZerrenda getEskukoKartak(){
		return eskukoKartak;
	}

	public void jokalariaHasieratu( String kolorea) {
		List<Integer> lista = kartakNahastu();
		kartakKargatu(lista, kolorea);
		
	}
}