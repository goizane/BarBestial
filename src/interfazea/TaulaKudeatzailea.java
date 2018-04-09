package interfazea;

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
