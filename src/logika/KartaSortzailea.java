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
	
	public Karta sortuKarta(int zenb){
		Karta karta=null;
		if(zenb==0){
			karta=new KartaHutsa();
		}else if(zenb==1){
			karta=new MofetaKarta();
		}
		else if(zenb==2){
			karta=new LoroKarta();
		}
		else if(zenb==3){
			karta=new KanguroKarta();
		}
		else if(zenb==4){
			karta=new TximinoKarta();
		}
		else if(zenb==5){
			karta=new KamaleoiKarta();
		}
		else if(zenb==6){
			karta=new FokaKarta();
		}
		else if(zenb==7){
			karta=new ZebraKarta();
		}
		else if(zenb==8){
			karta=new JirafaKarta();
		}
		else if(zenb==9){
			karta=new SugeKarta();
		}
		else if(zenb==10){
			karta=new KrokodiloKarta();
		}
		else if(zenb==11){
			karta=new HipopotamoKarta();
		}
		else if(zenb==12){
			karta=new LehoiKarta();
		}
		return karta;
		
	}
	

}
