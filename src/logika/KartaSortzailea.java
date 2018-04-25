package logika;


public class KartaSortzailea {
	private static KartaSortzailea karta = new KartaSortzailea();

	private KartaSortzailea() {
	}

	public static synchronized KartaSortzailea getKartaSortzailea() {
		if (karta != null) {
			karta = new KartaSortzailea();
		}
		return karta;
	}
	
	public Karta sortuKarta(int zenb, String kolorea){
		Karta karta=null;
		if(zenb==0){
			karta=new KartaHutsa();
		}else if(zenb==1){
			karta=new MofetaKarta();
		}
		else if(zenb==2){
			karta=new LoroKarta(kolorea);
		}
		else if(zenb==3){
			karta=new KanguroKarta(kolorea);
		}
		else if(zenb==4){
			karta=new TximinoKarta(kolorea);
		}
		else if(zenb==5){
			karta=new KamaleoiKarta(kolorea);
		}
		else if(zenb==6){
			karta=new FokaKarta(kolorea);
		}
		else if(zenb==7){
			karta=new ZebraKarta(kolorea);
		}
		else if(zenb==8){
			karta=new JirafaKarta(kolorea);
		}
		else if(zenb==9){
			karta=new SugeKarta(kolorea);
		}
		else if(zenb==10){
			karta=new KrokodiloKarta(kolorea);
		}
		else if(zenb==11){
			karta=new HipopotamoKarta(kolorea);
		}
		else if(zenb==12){
			karta=new LehoiKarta(kolorea);
		}
		return karta;
		
	}
	

}
