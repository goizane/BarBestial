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
	
}
