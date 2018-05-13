package logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;

import kudeatzaileak.TaulaKudeatzailea;

public class Tableroa {
	private static Tableroa nTableroa;
	private KartaZerrenda jokokoKartak= new KartaZerrenda();
	private KartaZerrenda tabernakoKartak;
	private KartaZerrenda kalekoKartak;
	private Pertsona j1 = new Pertsona();
	private Ordenagailua j2 = new Ordenagailua();
	
	private Tableroa(){
		
	}
	
	public static synchronized Tableroa getTableroa(){
		if(nTableroa==null){
			nTableroa=new Tableroa();
		}
		return nTableroa;
	}
	
	public  void tableroaHasieratu(String izena){

		JokalariZerrenda jokZer = new JokalariZerrenda();
	

		j1.jokalariarenKoloreaHasieratu("Urdina");
		j1.izenaHasieratu(izena);
		j1.jokalariaHasieratuPer();
//		System.out.println("jokalari urdina sortu da!");
//		Jokalari j2 = new Jokalari("Berdea"); //ordenagailua
		
		j2.jokalariarenKoloreaHasieratu("Berdea");
		
		j2.jokalariaHasieratuOrd();
		tabernakoKartakHasieratu();
		kalekoKartakHasieratu();
		jokokoKartakHasieratu();
		
	
	}
	
	public Ordenagailua getOrdenagailua(){
		return j2;
	}
	
	public Pertsona getPertsona(){
		return j1;
	}
	
	public KartaZerrenda getPerKartak(){
		return j1.getEskukoKartakPer();
	}
	
	public KartaZerrenda getTabernakoKartak() {
		return tabernakoKartak;
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
	
	public void jokatuPer(Karta k){
		j1.jokatuPer(k);
		
	}
	public void jokatuOrd(Karta k){
		j2.jokatuOrd(k);
		
	}
	
	public void saltatu(int salto){
		KartaZerrenda zer = jokokoKartak;
		if(zer.tamainaKartaHutsBarik()==1){
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

	
	public void hipopotamoakKartaTxikiagoakBultzatu() {
		Karta hipopotamo = azkenKartaLortu();
		if (jokokoKartak.dauka(12)) {
			if (jokokoKartak.errepikatutaDago(12)) {
				azkenaKanporatu();
				jokokoKartak.kartaPosizioBateanSartu(hipopotamo, 2);
			}
			else {
				azkenaKanporatu();
				jokokoKartak.kartaPosizioBateanSartu(hipopotamo, 1);
			}
		}
		else {
			azkenaKanporatu();
			jokokoKartak.kartaPosizioBateanSartu(hipopotamo, 0);
		}
		
		
		

		
//		for (int i=0; i<jokokoKartak.tamaina(); i++) {
//			this.saltatu(1);
//		}
			
		
		
//		KartaZerrenda lag = null;
//		Karta zebra = new ZebraKarta("");
//		Karta lehoia = new LehoiKarta("");
//		Karta hipopotamo = new HipopotamoKarta("");
//		if (jokokoKartak.dauka(zebra) && jokokoKartak.dauka(lehoia)) {
//			int pos = 0;
//			while (jokokoKartak.get(pos) != zebra) {
//				lag.gehituKarta(jokokoKartak.get(pos));
//				pos++;
//			}
//			lag.gehituKarta(hipopotamo);
//			
//			while (jokokoKartak.get(pos) != hipopotamo) {
//				lag.gehituKarta(jokokoKartak.get(pos));
//				pos++;
//			}
//			jokokoKartak = lag;
//		}
//		else if (jokokoKartak.dauka(zebra) && (!jokokoKartak.dauka(lehoia))) {
//			int pos = 0;
//			while (jokokoKartak.get(pos) != zebra) {
//				lag.gehituKarta(jokokoKartak.get(pos));
//				pos++;
//			}
//			lag.gehituKarta(hipopotamo);
//			
//			while (jokokoKartak.get(pos) != hipopotamo) {
//				lag.gehituKarta(jokokoKartak.get(pos));
//				pos++;
//			}
//			jokokoKartak = lag;
//		}
//		else if (jokokoKartak.dauka(lehoia) && (!jokokoKartak.dauka(zebra))) {
//			int pos = 0;
//			while (jokokoKartak.get(pos) != lehoia) {
//				lag.gehituKarta(jokokoKartak.get(pos));
//				pos++;
//			}
//			lag.gehituKarta(hipopotamo);
//			
//			while (jokokoKartak.get(pos) != hipopotamo) {
//				lag.gehituKarta(jokokoKartak.get(pos));
//				pos++;
//			}
//			jokokoKartak = lag;
//		}
//		else {
//			lag.gehituKarta(jokokoKartak.get(jokokoKartak.tamaina()));
//			int pos = 0;
//			while (jokokoKartak.get(pos) != hipopotamo) {
//				lag.gehituKarta(jokokoKartak.get(pos));
//				pos++;
//			}
//			jokokoKartak = lag;
//		}
	}
	
	
	public int irabazlea(){
		int irabazlea;
		if(puntuakKontatu(0)> puntuakKontatu(1)){
			irabazlea = 0;
		}else{
			irabazlea = 1;
		}
		return irabazlea;
	}
	
	public boolean jokokoKartakBeteta(){
		boolean beteta = false;
		if(jokokoKartak.tamainaKartaHutsBarik()==5){
			beteta = true;
		}
		return beteta;
	}
	public void jokokoKartakSartuKanporatu(){
		 //Lehenengo biak tabernan sartu eta azkena kanporatu
			 ilarakoLehenengoBiakSartu();
			 azkenaKanporatu();
		 }
	public int puntuakKontatu(int jok){
		return tabernakoKartak.puntuakKontatu(jok);
	}
	
	
	public void animaladaErrekurtsiboakEgin(){
		System.out.println("ANIMALADA ERREKURTSIBOAK:");
		for( int i =0; i<this.jokokoKartak.tamaina(); i++){
			if(jokokoKartak.get(i).errekurtsiboa){
				jokokoKartak.get(i).animaladaEgin();
				System.out.println("animalada errekurtsibo: "+ jokokoKartak.get(i).getIzena());
			}
		}
	}
	

	
	public void jokokoKartakHustu(){
		System.out.println("jokokoKartak hustu?");
		if(jokokoKartakBeteta()){
			System.out.println("jokokoKartak beteta");
			jokokoKartakSartuKanporatu();
		}
	}
	
	public KartaZerrenda getJokokoKartak() {
		return jokokoKartak;
	}

	public void setJokokoKartak(KartaZerrenda jokokoKartak) {
		this.jokokoKartak = jokokoKartak;
	}



	
	public void jokokoKartakHasieratu(){
		KartaZerrenda jokokoKart = new KartaZerrenda();
		System.out.println("JOKOKO KARTAK HASIERATU:");
		for(int i = 0; i<5; i++){
			Karta k = new KartaHutsa();
			jokokoKart.gehituKarta(k);
			System.out.println(k.getZenb());
		}
		this.jokokoKartak = jokokoKart;
	}
	
	
	public Karta bilatuKarta(){
		Karta erantzuna= null;
		for(int i = 0; i<jokokoKartak.tamaina();i++){
			if(jokokoKartak.get(i).getZenb()==0){
				erantzuna= jokokoKartak.get(i);
			}
		}
		return erantzuna;
	}
	
	public void ordenagailuarenTxanda(){
		Jokalari ordenagailua = getOrdenagailua();
		System.out.println(ordenagailua);
		System.out.println("JOKLALARIAREN KOLOREA: "+ ordenagailua.getKolorea());
		
		KartaZerrenda kz =j2.getEskukoKartakOrd();
		for(int i  =0; i<kz.tamaina(); i++){
			System.out.println("karta: " + kz.get(i).getIzena()+" Kolorea: "+ kz.get(i).getKolorea());
		}
		Karta k = kz.get(1);
		System.out.println("ordenagailuak aukeratutako karta: " + k.getIzena()+ "kolorea: " + k.getKolorea());
		System.out.println("__________________________________________________________ "+k.getIzena());
		System.out.println("ORDENAGAILUAREN KARTA: " + k.getIzena()+"KOLOREA: "+ k.getKolorea());
		jokatuOrd(k);
		if(k.getZenb()==2){
			LoroKarta.kenduKarEguneratu(jokokoKartak.get(0)); //loroak beti lehenengo karta kentzen du
		}
		else if(k.getZenb()==5){ // kamaleoiak beti mofeta bezala jokatzen du
			Karta mofeta = new MofetaKarta("");
			KamaleoiKarta.kopiatzekoKartaEguneratu(mofeta);
		}
		k.animaladaEgin();
		animaladaErrekurtsiboakEgin();
		jokokoKartakHustu();
	}
	

	public void ilaranKartaSartu(Karta k) {
//		System.out.println("jokoko kartetan sartu -->");
		int pos = jokokoKartak.tamainaKartaHutsBarik();
	
//		System.out.println("jok tam: " +jokokoKartak.tamainaKartaHutsBarik());
		this.jokokoKartak.kartaPosizioBateanSartu(k, pos);
//		System.out.println("JOKOKO KARTAK: "+ k.getIzena()+ "REKIN");
		
		for(int i =0; i<jokokoKartak.tamaina(); i++){
//			System.out.println("jokoko karten tam: " + jokokoKartak.tamaina());
//			System.out.println(jokokoKartak.get(i).getIzena()+ "-------------> kolorea:" + jokokoKartak.get(i).getKolorea());
		}
	}
	
	
	
		
	
	public void ilarakoLehenengoBiakSartu(){ // tabernako kartak hasieratu behar dira! (kaleko kartak)
		for(int i =0; i<2; i++){
			Karta k = this.jokokoKartak.get(i);
			this.tabernakoKartak.gehituKarta(k);
			System.out.println("TABERNARA SARTU -------------->" + k.getIzena());
			if(k.getKolorea()=="Urdina"){
				Pertsona.pertsonaPuntuakEguneratu(k);
			}
			else{
				Ordenagailua.OrdenagailuPuntuakEguneratu(k);
			}
			this.jokokoKartak.kenduKarta(k);
			
		}
	}
	
	public void azkenaKanporatu(){
		int azkena = jokokoKartak.tamainaKartaHutsBarik() - 1;
		Karta k = this.jokokoKartak.get(azkena);
		this.kalekoKartak.gehituKarta(k);
		System.out.println("Patada eman: " + k.getIzena());
		this.jokokoKartak.kenduKarta(k);
	}
	
	public Karta azkenKartaLortu(){
		int azkena = jokokoKartak.tamainaKartaHutsBarik() - 1;
		Karta k = this.jokokoKartak.get(azkena);
		return k;
	}

	public void jokokoKartetatikKartaKendu(Karta k) {
		this.jokokoKartak.kenduKarta(k);
		
	}
	
	public void zerrendarenOrdenaAldatu(){
		KartaZerrenda zer = new KartaZerrenda();
		for(int i=jokokoKartak.tamainaKartaHutsBarik()-1; i>=0; i--) {
			zer.gehituKarta(jokokoKartak.get(i));
		}
		
		if (zer.tamaina()<5) {
			for (int j=zer.tamaina(); j<=5; j++) {
				zer.gehituKarta(new KartaHutsa());
			}
		}
		
		jokokoKartak = zer;
			
	}
	
	
	public void tximinoAnimalada() {
		if (!jokokoKartak.errepikatutaDago(4)) {
			System.out.println("Tximino bakarra dago!");
		}
		else {
			
			if (jokokoKartak.dauka(11)) {
				Karta k = jokokoKartak.kartaLortuZenbakiarekin(11);
				jokokoKartak.kenduKarta(k);
			} else if (jokokoKartak.dauka(10)) {
				Karta k = jokokoKartak.kartaLortuZenbakiarekin(10);
				jokokoKartak.kenduKarta(k);
			} else {
				System.out.println("Ez dago krokodilo edo hipopotamorik!");
			}
		
		
			int tximinoPos = jokokoKartak.tamainaKartaHutsBarik()-1;
			KartaZerrenda zer = new KartaZerrenda();
			Karta tximinoKarta = jokokoKartak.get(tximinoPos);
			jokokoKartak.kenduKarta(tximinoKarta);
			zer.gehituKarta(tximinoKarta);
			tximinoKarta = jokokoKartak.kartaLortuZenbakiarekin(4);
			jokokoKartak.kenduKarta(tximinoKarta);
			zer.gehituKarta(tximinoKarta);
			
			for (int i=0; i<jokokoKartak.tamainaKartaHutsBarik(); i++) {
				zer.gehituKarta(jokokoKartak.get(i));
			}
			if (zer.tamaina()<5) {
				for (int j=zer.tamaina(); j<=5; j++) {
					zer.gehituKarta(new KartaHutsa());
				}
			}
			jokokoKartak = zer;
		}
		
		
	}
	
	public void jokokoKartakOrdenatu() {
		jokokoKartak.zerrendaOrdenatu(0, jokokoKartak.tamainaKartaHutsBarik()-1);
	}
	
}
