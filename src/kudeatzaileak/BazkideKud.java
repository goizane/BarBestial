package kudeatzaileak;

import kudeatzaileak.DBKudeatzaile;

public class BazkideKud {
private static final BazkideKud bazkideKud = new BazkideKud();
	
	public static BazkideKud getInstantzia(){
		return bazkideKud;
	}

	private BazkideKud() {
		// Singleton patroia
	}
	public void bazkideaSartu(String izena, String email, String pasahitza){
		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		dbkud.execSQL("INSERT INTO Jokalari VALUES ('"+ izena +"','"+ email +"','"+ pasahitza +"');");
	}
	
//	public void bazkidearenPasahitzaLortu(String izena){
//		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
//		ResultSet rs = dbkud.execSQL("SELECT pasahitza FROM Jokalari WHERE izena = 'izena';");
//	}
}