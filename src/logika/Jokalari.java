package logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Jokalari {

	//ATRIBUTUAK
	private String izena;
	private static KartaZerrenda eskukoKartak;
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
	
	public Stack<Karta> getMazoa(){
		return mazoa;
	}
	
	public String getKolorea(){
		return izena;
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
	public void kartakKargatu(List<Integer> lista){
		List<Integer> zerr = lista;
		int kont =1;
		int i =0;
		Karta k = null;
		while(kont<=4){
			k = KartaSortzailea.getKartaSortzailea().sortuKarta(lista.get(i));
			this.eskukoKartak.gehituKarta(k);
			
//			System.out.println(kont+" - "+k.getIzena()+" karta eskuko kartetan sartu da!");
			kont ++;
			i++;
		}
//		System.out.println("eskuko karten tam: " + eskukoKartak.tamaina());
		while(4<=kont&& kont<=12){
			k = KartaSortzailea.getKartaSortzailea().sortuKarta(lista.get(i));
			this.mazoa.push(k);
//			System.out.println(kont+" - "+k.getIzena()+" karta mazoan sartu da!");
			
			kont++;
			i++;
		}
		System.out.println("mazoaren tam: " + mazoa.size());
	}

	public void jokatu(Karta k){
			KartaZerrenda eskKartak = new KartaZerrenda();
			Tableroa.getTableroa().ilaranKartaSartu(k);
		
			eskukoKartak.kenduKarta(k);
			for(int i = 0; i<3; i++){
				eskKartak.gehituKarta(eskukoKartak.get(i));
			}
			Karta mazokoKarta = mazotikKartaHartu();
			System.out.println("mazoko karta: " + mazokoKarta.getIzena());
			eskKartak.gehituKarta(mazokoKarta);
			
			
			 eskukoKartak = eskKartak;
			
			System.out.println("ESKUKO KARTAK: " + k.getIzena()+ "BARIK");
			System.out.println("eskuko karten tam: " + eskukoKartak.tamaina());
			for(int i = 0; i<eskukoKartak.tamaina(); i++){
				System.out.println(eskukoKartak.get(i).getIzena());
			}
		}
		
	public Karta mazotikKartaHartu(){
		 return this.mazoa.pop();
		
	}
	public void mazokoKartaEskukoKartetara(Karta k){
		this.eskukoKartak.gehituKarta(k);
	}
	public static KartaZerrenda getEskukoKartak(){
		return eskukoKartak;
	}

	public void jokalariaHasieratu() {
		List<Integer> lista = kartakNahastu();
		kartakKargatu(lista);
		
	}
	
	
	
}
