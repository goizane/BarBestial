package kudeatzaileak;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		boolean loginZuzena;

		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		ResultSet rs = dbkud.execSQL("SELECT izena FROM Jokalari;");
		List<String[]> izenak = new ArrayList<String[]>();
		try {
			while(rs.next()){
				String[] res = new String[4];
				res[0] = rs.getString("izena");
				izenak.add(res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (izenak.contains(izena)) {
			DBKudeatzaile dbkud2 = DBKudeatzaile.getInstantzia();
			ResultSet rs2 = dbkud2.execSQL("SELECT pasahitza FROM Jokalari WHERE izena = '"+izena+"';");
			List<String[]> pasahitzak = new ArrayList<String[]>();
			try {
				while(rs2.next()){
					String[] res = new String[4];
					res[0] = rs2.getString("pasahitza");
					pasahitzak.add(res);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (pasahitzak.contains(pasahitza)) {
				loginZuzena = true;
			}
			else {
				loginZuzena = false;
			}
		}
		else {
			loginZuzena = false;
		}
		
		return loginZuzena;
	}
}