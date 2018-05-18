package logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;

import kudeatzaileak.TaulaKudeatzailea;

public class Tableroa {
	private static Tableroa nTableroa;
	private KartaZerrenda jokokoKartak= new KartaZerrenda();
	private static KartaZerrenda tabernakoKartak;
	private KartaZerrenda kalekoKartak;
	private Pertsona j1;
	private Ordenagailua j2;
	
	private Tableroa(){
		
	}
	
	public static synchronized Tableroa getTableroa(){
		if(nTableroa==null){
			nTableroa=new Tableroa();
		}
		return nTableroa;
	}
	
	
	
	//HASIERAKETAK 
	
	public  void tableroaHasieratu(String izena){
		j1 = new Pertsona();
		j2 = new Ordenagailua();
		j1.jokalariarenKoloreaHasieratu("Urdina");
		j1.izenaHasieratu(izena);
		j1.jokalariaHasieratuPer();
		j2.jokalariarenKoloreaHasieratu("Berdea");
		j2.jokalariaHasieratuOrd();	
		jokokoKartakHasieratu();
		tabernakoKartakHasieratu();
		kalekoKartakHasieratu();
	
	}
	
	public void jokokoKartakHasieratu(){ // jokoko kartak hasieratu
		KartaZerrenda jokokoKart = new KartaZerrenda();
		for(int i = 0; i<5; i++){
			Karta k = new KartaHutsa();
			jokokoKart.gehituKarta(k);
			
		}
		this.jokokoKartak = jokokoKart;
	}
	
	public void tabernakoKartakHasieratu(){
		KartaZerrenda z = new KartaZerrenda();
		for(int i =0; i<24; i++){
			Karta h = new KartaHutsa();
			z.gehituKarta(h);
		}
		tabernakoKartak =z;
	}
	
	
	public void kalekoKartakHasieratu(){
		KartaZerrenda z = new KartaZerrenda();
		for(int i =0; i<24; i++){
			Karta h = new KartaHutsa();
			z.gehituKarta(h);
		}
		kalekoKartak = z;
	
	}
	
	//GETTERS
	
	public Ordenagailua getOrdenagailua(){ //ER
		return j2;
	}
	
	public Pertsona getPertsona(){
		return j1;
	}
	
	public KartaZerrenda getPerKartak(){
		return j1.getEskukoKartakPer();
	}
	
	public KartaZerrenda getTabernakoKartak() { //er
		return tabernakoKartak;
	}
	
	public KartaZerrenda getJokokoKartak() { //er
		return jokokoKartak;
	}
	
	//JokokoKartak eguneratu 
	public void jokokoKartakEguneratu(KartaZerrenda berria){ //ER
		jokokoKartak = berria;
	}
	
	//jokatu metodoak
	public void jokatuPer(Karta k){ //ER
		j1.jokatuPer(k);
		
	}
	public void jokatuOrd(Karta k){ //ER
		j2.jokatuOrd(k);
		
	}
	
	
	
	public void saltatu(int salto){ //er
		KartaZerrenda zer = jokokoKartak;
		if(zer.tamainaKartaHutsBarik()<=1){
			System.out.println("Ez du saltorik egingo bakarrik dagoelako");
		}
		else if(zer.tamainaKartaHutsBarik()==2){
			Karta k1= zer.get(0);
			Karta k2 = zer.get(1);
			zer.set(k1, 1);
			zer.set(k2, 0);
		}
		else{
			int azkenAurrekoarenPos = zer.tamainaKartaHutsBarik()-3;
			int azkenarenPos= zer.tamainaKartaHutsBarik()-2;
			int kanguroPos = zer.tamainaKartaHutsBarik()-1;
			Karta kAzkenAurreko = zer.get(azkenAurrekoarenPos);
			Karta kAzkena= zer.get(azkenarenPos);
			Karta kKanguro = zer.get(kanguroPos);
			
			if(salto == 1){
				zer.set(kAzkena, kanguroPos);
				zer.set(kKanguro, azkenarenPos);
			}
			else{
				zer.set(kKanguro, azkenAurrekoarenPos);
				zer.set(kAzkena, kanguroPos);
				zer.set(kAzkenAurreko, azkenarenPos);
			}
		}
	}

	public static boolean pertsonaIrabazi(){ //ER
		boolean pertsonaIrabazi= false;
		if (tabernakoKartak.kolorekoKartakKontatu("Berdea")!=tabernakoKartak.kolorekoKartakKontatu("Urdina")) {
			if (tabernakoKartak.kolorekoKartakKontatu("Berdea")<tabernakoKartak.kolorekoKartakKontatu("Urdina")) {
				pertsonaIrabazi=true;
			}
		}
		else {
			int pertsonaPuntuak = Pertsona.getPuntuazioa();
			int ordenagailuPuntuak = Ordenagailua.getPuntuazioa();
			if(pertsonaPuntuak< ordenagailuPuntuak){
			
				pertsonaIrabazi = true;
			}
		}
		
		return pertsonaIrabazi;
	}
	
	public static boolean berdinketa(){ //ER
		boolean berdinketa = false;
		int pertsonaPuntuak = Pertsona.getPuntuazioa();
		int ordenagailuPuntuak = Ordenagailua.getPuntuazioa();
		if(pertsonaPuntuak == ordenagailuPuntuak){
			berdinketa = true;
		}
		return berdinketa;
	}
	
	public boolean jokokoKartakBeteta(){
		boolean beteta = false;
		if(jokokoKartak.tamainaKartaHutsBarik()==5){
			beteta = true;
		}
		return beteta;
	}
	public void jokokoKartakSartuKanporatu(){ //ER
		 //Lehenengo biak tabernan sartu eta azkena kanporatu
			 ilarakoLehenengoBiakSartu();
			 azkenaKanporatu();
		 }

	
	
	public void animaladaErrekurtsiboakEgin(){ //ER
		for( int i =0; i<this.jokokoKartak.tamaina(); i++){
			if(jokokoKartak.get(i).errekurtsiboa){
				jokokoKartak.get(i).animaladaEgin();
			}
		}
	}

	public void jokokoKartakHustu(){ //ER
		
		if(jokokoKartakBeteta()){
			jokokoKartakSartuKanporatu();
		}
	}
	

	public void ilaranKartaSartu(Karta k) { // jokoko kartetan k karta sartzen du azken posizioan ---> ER
		int pos = jokokoKartak.tamainaKartaHutsBarik();
		this.jokokoKartak.kartaPosizioBateanSartu(k, pos);
	}
	
	
	public void ilarakoLehenengoBiakSartu(){ // tabernako kartak hasieratu behar dira! (kaleko kartak) --> ER
		for(int i =0; i<2; i++){
			Karta k = this.jokokoKartak.get(i);
			this.tabernakoKartak.gehituKarta(k);
			if(k.getKolorea()=="Urdina"){
				Pertsona.pertsonaPuntuakEguneratu(k);
			}
			else{
				Ordenagailua.OrdenagailuPuntuakEguneratu(k);
			}
			this.jokokoKartak.kenduKarta(k);
			
		}
	}
	
	
	
	
	public void azkenaKanporatu(){ //ER
		int azkena = jokokoKartak.tamainaKartaHutsBarik() - 1;
		Karta k = this.jokokoKartak.get(azkena);
		this.kalekoKartak.gehituKarta(k);
		this.jokokoKartak.kenduKarta(k);
	}
	
	public Karta azkenKartaLortu(){ //ER
		int azkena = jokokoKartak.tamainaKartaHutsBarik() - 1;
		Karta k = this.jokokoKartak.get(azkena);
		return k;
	}
}

	

	

