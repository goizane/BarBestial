package interfazea;

import logika.FokaKarta;
import logika.HipopotamoKarta;
import logika.JirafaKarta;
import logika.KamaleoiKarta;
import logika.KanguroKarta;
import logika.Karta;
import logika.KartaHutsa;
import logika.KrokodiloKarta;
import logika.LehoiKarta;
import logika.LoroKarta;
import logika.MofetaKarta;
import logika.SugeKarta;
import logika.TximinoKarta;
import logika.ZebraKarta;

public class TaulaKudeatzailea {
	private static TaulaKudeatzailea taula = new TaulaKudeatzailea();

	private TaulaKudeatzailea() {
	}

	public static synchronized TaulaKudeatzailea getTaulaKudeatzailea() {
		if (taula != null) {
			taula = new TaulaKudeatzailea();
		}
		return taula;
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
		else if(zenb==121){
			karta=new LehoiKarta();
		}
		return karta;
		
	}
	
}
