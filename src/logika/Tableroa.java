package logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;

public class Tableroa {
	private static Tableroa nTableroa;
	private KartaZerrenda jokokoKartak;
	private static JokalariZerrenda jokalariak;
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
		System.out.println("jokalari urdina sortu da!");
		Jokalari j2 = new Jokalari("Berdea"); //ordenagailua
		System.out.println("jokalari urdina sortu da!");
		System.out.println("JOKALARI BERDEA");
		j1.jokalariaHasieratu();
		System.out.println("JOKALARI URDINA");
		j2.jokalariaHasieratu();
		jokZer.gehituJokalaria(j1);
		jokZer.gehituJokalaria(j2);
		this.jokalariak = jokZer;
	
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
		jokokoKartak=new KartaZerrenda();
		Karta karta;
		ImageIcon irudia;
		for(int i=0;i<5;i++){
			karta=new KartaHutsa();
			irudia= new ImageIcon("src/fitxategiak/KartaHutsa.jpg");
			karta.setIrudia(irudia);
			karta.setZenb(0);
			jokokoKartak.gehituKarta(karta);
			
		}
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
	
	public boolean ilaraBeteta(){
		boolean beteta = false;
		if(jokokoKartak.tamaina()==5){
			beteta= true;
		}
		return beteta;
	}

	public void ilaranKartaSartu(Karta k) {
		this.jokokoKartak.gehituKarta(k);
		for(int i =0; i<jokokoKartak.tamaina(); i++){
			System.out.println(jokokoKartak.get(i).getIzena());
		}
	
		}
	
//	public List<Integer> eskukoKartakKargatu(){
//		boolean nahikoa = false;
//		boolean badago = false;
//		int kont = 0;
//		List<Integer> kartaZerrenda = new ArrayList<Integer>();
//
//		while (!nahikoa) {
//			badago = false;
//			Random random = new Random();
//			int karta = random.nextInt(12 - 1 + 1) + 1;
//			for (int i = 0; i < kartaZerrenda.size(); i++) {
//				if (kartaZerrenda.get(i) == karta) {
//					badago = true;
//					break;
//				}
//			}
//			if (!badago) {
//				kartaZerrenda.add(karta);
//				if (kartaZerrenda.size() == 4) {
//					nahikoa = true;
//				}
//			}
//		}
//		return kartaZerrenda;
//	}
//	
//	public List<Integer> mazokoKartakKargatu(List<Integer> eskua){
//		List<Integer> mazoa = new ArrayList<Integer>();
//		for(int i : eskua){
//			if(!mazoa.contains(i)){
//				mazoa.add(i);
//			}
//		}
//		return mazoa;
//	}
//	
	public void ilarakoLehenengoBiakSartu(){
		for(int i =0; i<2; i++){
			Karta k = this.jokokoKartak.get(i);
			this.tabernakoKartak.gehituKarta(k);
			this.jokokoKartak.kenduKarta(k);
		}
	}
	
	public void azkenaKamporatu(){
		Karta k = this.jokokoKartak.get(3);
		this.kalekoKartak.gehituKarta(k);
		this.jokokoKartak.kenduKarta(k);
	}

	public void jokokoKartetatikKartaKendu(Karta k) {
		this.jokokoKartak.kenduKarta(k);
		
	}
//	public static void main(String[] args) {
//		tableroaHasieratu();
//	}
}
