package kudeatzaileak;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kudeatzaileak.DBKudeatzaile;

public class LoginKud {
	private static final LoginKud loginKud = new LoginKud();

	public static LoginKud getInstantzia(){
		return loginKud;
	}

	private LoginKud() {
		// Singleton patroia
	}
	public boolean frogatuLogin(String izena, String pasahitza){
		System.out.println("Login zuzena den frogatzeko:");
		System.out.println("          Izena: " + izena);
		System.out.println("          Pasahitza: " + pasahitza);
		boolean loginZuzena;
		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		ResultSet rs = dbkud.execSQL("SELECT izena FROM Jokalari;");
		System.out.println("SELECT kontsulta: ");
		List<String[]> izenak = new ArrayList<String[]>();
		try {
			while(rs.next()){
				String[] res = new String[1];
				res[0] = rs.getString("izena");
				System.out.println("RES: " + res[0]);
				izenak.add(res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Izenak: " + izenak.get(0));
		
		if (izenak.contains(izena)) {
			DBKudeatzaile dbkud2 = DBKudeatzaile.getInstantzia();
			ResultSet rs2 = dbkud2.execSQL("SELECT pasahitza FROM Jokalari WHERE izena = '"+izena+"';");
			List<String[]> pasahitzak = new ArrayList<String[]>();
			try {
				while(rs2.next()){
					String[] res2 = new String[1];
					res2[0] = rs2.getString("pasahitza");
					pasahitzak.add(res2);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (pasahitzak.isEmpty()) {
				loginZuzena = false;
			}
			else {
				loginZuzena = true;
			}
		}
		else {
			loginZuzena = false;
		}
		
		return loginZuzena;
	}
}