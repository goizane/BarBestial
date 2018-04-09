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
	

}
