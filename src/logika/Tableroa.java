package logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;

public class Tableroa {
	private static Tableroa nTableroa;
	private KartaZerrenda jokokoKartak;
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
	
		}
	
	public Karta eskukoKartakKargatu(KartaZerrenda zerrenda){
		Karta erantzuna;
		boolean badago = true;
		Random random = new Random();
		int kartaZenb=random.nextInt(12 - 1 + 1) + 1;
		if(zerrenda.tamaina()>0){
			while(badago){
				for (int i = 0; i < zerrenda.tamaina(); i++) {
					if (zerrenda.get(i).getZenb() != kartaZenb) {
						badago = false;
						break;
					}
				}
				if(badago){
					kartaZenb = random.nextInt(12 - 1 + 1) + 1;
				}
			}
		}else{
			badago=false;
		}
		
		if (!badago) {
			erantzuna=KartaSortzailea.getKartaSortzailea().sortuKarta(kartaZenb);
		}else{
			erantzuna=null;
		}
		return erantzuna;	
	}
	
//	public void hasi(){
//		Jokalari j1 =jokalariak.getJokalariZerrenda().getJok(0);
//		Jokalari j2 =jokalariak.getJokalariZerrenda().getJok(1);
//		
//		KartaZerrenda kartZer = this.eskukoKartakKargatu();
//		KartaZerrenda eskukoZer = null;
//		KartaZerrenda mazoZer = null;
//		for (int i=0; i<4; i++) {
//			eskukoZer.gehituKarta(kartZer.get(i));
//		}
//		for (int i=4; i<12; i++) {
//			mazoZer.gehituKarta(kartZer.get(i));
//		}
//		j1.eskukoKartakKargatu(eskukoZer);
//		j1.mazoaKargatu(mazoZer);
//		j2.eskukoKartakKargatu(eskukoZer);
//		j2.mazoaKargatu(mazoZer);
//	}
	
	public List<Integer> mazokoKartakKargatu(List<Integer> eskua){
		List<Integer> mazoa = new ArrayList<Integer>();
		for(int i : eskua){
			if(!mazoa.contains(i)){
				mazoa.add(i);
			}
		}
		return mazoa;
	}
	
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
	
}
