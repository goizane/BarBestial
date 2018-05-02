package kudeatzaileak;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartidaKud {
private static final PartidaKud partidaKud = new PartidaKud();
	
	public static PartidaKud getInstantzia(){
		return partidaKud;
	}

	private PartidaKud() {
		// Singleton patroia
	}
	
public List<String[]> getPartidak(){
		
		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		ResultSet rs = dbkud.execSQL("SELECT * FROM Partida WHERE data = 'now' ORDER BY puntuazioa;");
		
				List<String[]> partidak = new ArrayList<String[]>();
		
			try {
				while(rs.next()){
					String[] res = new String[4];
					res[0] = rs.getString("data");
					res[1] = rs.getString("izena");
					res[2] = rs.getString("pKode");
					res[3] = rs.getString("puntuazioa");
					
					partidak.add(res);
					System.out.println(res[2]);
//					System.out.println(res[1]);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			return partidak;
	}
}
