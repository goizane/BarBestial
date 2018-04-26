package logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;

import interfazea.TaulaKudeatzailea;

public class Tableroa {
	private static Tableroa nTableroa;
	private KartaZerrenda jokokoKartak= new KartaZerrenda();
	private JokalariZerrenda jokalariak;
	private KartaZerrenda tabernakoKartak;
	private KartaZerrenda kalekoKartak;
	
	private Tableroa(){
		
	}
	
	public static synchronized Tableroa getTableroa(){
		if(nTableroa==null){
			nTableroa=new Tableroa();
		}
		return nTableroa;
	}
	
	public  void tableroaHasieratu(){
		System.out.println("TABLEROA HASIERATU");
		JokalariZerrenda jokZer = new JokalariZerrenda();
	
		Jokalari j1= new Jokalari("Urdina"); //pertsona
//		System.out.println("jokalari urdina sortu da!");
		Jokalari j2 = new Jokalari("Berdea"); //ordenagailua
//		System.out.println("jokalari urdina sortu da!");
		System.out.println("JOKALARI BERDEA");
		j1.jokalariaHasieratu("Urdina");
		System.out.println("JOKALARI URDINA");
		j2.jokalariaHasieratu("Berdea");
		tabernakoKartakHasieratu();
		kalekoKartakHasieratu();
		jokZer.gehituJokalaria(j1);
		jokZer.gehituJokalaria(j2);
		jokokoKartakHasieratu();
		this.jokalariak = jokZer;
	
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
	
	public void jokatu(Karta k, int jok){
		this.jokalariak.getJok(jok).jokatu(k);
		
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
		if(jokokoKartak.ilaraBeteta()){
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

	public JokalariZerrenda getJokalariak() {
		return jokalariak;
	}

	public void setJokalariak(JokalariZerrenda jokalariak) {
		this.jokalariak = jokalariak;
	}
	

	public void jolastuKarta(Karta karta){
		Karta aukeratutakoKarta=bilatuKarta();
		aukeratutakoKarta.setZenb(karta.getZenb());
		aukeratutakoKarta.setIrudia(karta.getIrudia());
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
		Jokalari ordenagailua = jokalariak.getJok(1);
		System.out.println("JOKLALARIAREN KOLOREA: "+ ordenagailua.getKolorea());
		
		KartaZerrenda kz =ordenagailua.getEskukoKartak();
		Karta k = kz.get(1);
		System.out.println("__________________________________________________________ "+k.getIzena());
		System.out.println("ORDENAGAILUAREN KARTA: " + k.getIzena()+"KOLOREA: "+ k.getKolorea());
		jokatu(k,1);
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
		System.out.println("jokoko kartetan sartu -->");
		int pos = jokokoKartak.tamainaKartaHutsBarik();
	
//		System.out.println("jok tam: " +jokokoKartak.tamainaKartaHutsBarik());
		this.jokokoKartak.kartaPosizioBateanSartu(k, pos);
		System.out.println("JOKOKO KARTAK: "+ k.getIzena()+ "REKIN");
		
		for(int i =0; i<jokokoKartak.tamaina(); i++){
//			System.out.println("jokoko karten tam: " + jokokoKartak.tamaina());
			System.out.println(jokokoKartak.get(i).getIzena()+ "-------------> kolorea:" + jokokoKartak.get(i).getKolorea());
		}
	}
	
	
	
		
	
	public void ilarakoLehenengoBiakSartu(){ // tabernako kartak hasieratu behar dira! (kaleko kartak)
		for(int i =0; i<2; i++){
			Karta k = this.jokokoKartak.get(i);
			this.tabernakoKartak.gehituKarta(k);
			System.out.println("Tabernan sartu: "+k.getIzena());
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
		for (int i = 0; i< jokokoKartak.tamaina(); i++){
			System.out.println(jokokoKartak.get(i).zenb);
		}
		KartaZerrenda kZer = new KartaZerrenda();
		boolean amaitu = false;
		System.out.println("tamaina: "+this.jokokoKartak.tamainaKartaHutsBarik());
		if(this.jokokoKartak.tamainaKartaHutsBarik()==1){
			
			kZer = this.jokokoKartak;
		}else{
		
				for(int i =0; i<jokokoKartak.tamaina(); i++){
					
					if(this.jokokoKartak.get(i).getZenb()!=0){
						kZer.gehituKarta(this.jokokoKartak.get(i));
					}
				}		
				
			
			kZer.ordenardenaAldatu();
		}
		
		
		for (int i = 0; i< kZer.tamaina(); i++){
			System.out.println(kZer.get(i).zenb);
		}
	}
	
	
	
}
