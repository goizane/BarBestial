package kudeatzaileak;


import java.sql.ResultSet;

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
		dbkud.execSQL("INSERT INTO Jokalari (izena, email, pasahitza) VALUES ( '"+ izena +"','"+ email +"','"+ pasahitza +"' );");
	}
	
	public void bazkidearenPasahitzaLortu(String izena){
		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		ResultSet rs = dbkud.execSQL("SELECT pasahitza FROM Jokalari WHERE Jokalari.izena = 'izena';");
	}
	
	
	
}
