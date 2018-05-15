package logika;

import java.util.List;
import java.util.Stack;

public class Ordenagailua extends Jokalari {

	private static KartaZerrenda eskukoKartakOrd;
	private static Stack<Karta> mazoaOrd;
	private static int ordenagailuPuntuak=0;
	
	public Ordenagailua(){
		this.kolorea = kolorea;
		this.eskukoKartakOrd = new KartaZerrenda();
		this.mazoaOrd = new Stack<Karta>();
	}
	public Stack<Karta> getMazoaOrd(){
		return mazoaOrd;
	}
	public static Karta mazotikKartaHartuOrd(){
		 return mazoaOrd.pop();
		
	}
	
	public static int getPuntuazioa(){
		return ordenagailuPuntuak;
	}
	public static boolean jokoaAmaituDaOrd(){
		boolean amaitu = false;
		if(getEskukoKartakOrd().hutsik()){
			System.out.println("JOKOA AMAITU DA");
			amaitu = true;
		}
		else{
			amaitu = false;
		}
		return amaitu;
	}
	public void mazokoKartaEskukoKartetaraOrd(Karta k){
		this.eskukoKartakOrd.gehituKarta(k);
	}
	public static KartaZerrenda getEskukoKartakOrd(){
		return eskukoKartakOrd;
	}
	public void kartakKargatuOrd(List<Integer> lista){
		List<Integer> zerr = lista;
		int kont =1;
		int i =0;
		Karta k = null;
		System.out.println("ESKUKO KARTAK");
		while(kont<=4){
			k =  KartaSortzailea.kartaSortu(lista.get(i), kolorea);
			this.eskukoKartakOrd.gehituKarta(k);
			k.koloreaEguneratu(kolorea);
			System.out.println(k.getIzena() +"KOLOREA: "+ k.getKolorea());
			kont ++;
			i++;
		}
		System.out.println("MAZOKO KARTAK");
		while(4<=kont&& kont<=12){
			k =  KartaSortzailea.kartaSortu(lista.get(i), kolorea);
			this.mazoaOrd.push(k);
			k.koloreaEguneratu(kolorea);
			System.out.println(k.getIzena() +"KOLOREA: "+ k.getKolorea());
			kont++;
			i++;
		}
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
		public void jokalariaHasieratuOrd() {
			List<Integer> lista = kartakNahastu();
			kartakKargatuOrd(lista);
			
		}
		public static void OrdenagailuPuntuakEguneratu(Karta k) {
			int puntuak;
			if(k.getZenb()==6 || k.getZenb()==9 || k.getZenb()==11 || k.getZenb()==12){
				puntuak = 2;
			}
			else if(k.getZenb()==4 || k.getZenb()==5 || k.getZenb()== 8 || k.getZenb()==10){
				puntuak = 3;
			}else{
				puntuak = 4;
			}
			ordenagailuPuntuak = ordenagailuPuntuak + puntuak;
		}
}
