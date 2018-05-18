package logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public abstract class Jokalari {

	//ATRIBUTUAK
	

	protected String kolorea;
	
	//ERAIKITZAILEA
	public Jokalari(){
		
		
	}
	
	//METODOAK
	private void jokatu(){
		
	}

//	public String getKolorea(){
//		return kolorea;
//	}

	public List<Integer> kartakNahastu(){ //ER
		
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

	public void jokalariarenKoloreaHasieratu(String kol){ //ER
		this.kolorea = kol;
	}

//	public static boolean pertsonaIrabazi(){ //ER
//		boolean pertsonaIrabazi= false;
//		if (Tableroa.getTableroa().getTabernakoKartak().kolorekoKartakKontatu("Berdea")!=Tableroa.getTableroa().getTabernakoKartak().kolorekoKartakKontatu("Urdina")) {
//			if (Tableroa.getTableroa().getTabernakoKartak().kolorekoKartakKontatu("Berdea")<Tableroa.getTableroa().getTabernakoKartak().kolorekoKartakKontatu("Urdina")) {
//				pertsonaIrabazi=true;
//			}
//		}
//		else {
//			int pertsonaPuntuak = Pertsona.getPuntuazioa();
//			int ordenagailuPuntuak = Ordenagailua.getPuntuazioa();
//			if(pertsonaPuntuak< ordenagailuPuntuak){
//			
//				pertsonaIrabazi = true;
//			}
//		}
//		
//		return pertsonaIrabazi;
//	}
//	
//	public static boolean berdinketa(){ //ER
//		boolean berdinketa = false;
//		int pertsonaPuntuak = Pertsona.getPuntuazioa();
//		int ordenagailuPuntuak = Ordenagailua.getPuntuazioa();
//		if(pertsonaPuntuak == ordenagailuPuntuak){
//			berdinketa = true;
//		}
//		System.out.println("pertsona puntuak: " + pertsonaPuntuak);
//		System.out.println("Ordenagauilu puntuak:" + ordenagailuPuntuak);
//		return berdinketa;
//	}
}