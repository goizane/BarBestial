package logika;

public class KartaSortzailea {

	public KartaSortzailea(){
	}
	
	public static  Karta kartaSortu(int zenb, String kolorea){
		Karta k = KartaFactory.getKartaFactory().sortuKarta(zenb, kolorea);
		return k;
	}
}