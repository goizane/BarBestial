package logika;

import javax.swing.ImageIcon;

public class Tableroa {
	private static Tableroa nTableroa;
	private KartaZerrenda jokokoKartak;
	private JokalariZerrenda jokalariak;
	
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

}
