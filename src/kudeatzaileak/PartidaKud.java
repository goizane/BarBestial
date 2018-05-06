package kudeatzaileak;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kudeatzaileak.DBKudeatzaile;

public class PartidaKud {
	private static final PartidaKud partidaKud = new PartidaKud();

	public static PartidaKud getInstantzia(){
		return partidaKud;
	}

	private PartidaKud() {
		// Singleton patroia
	}

	public List<String[]> getGaurkoPartidak(){

		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		ResultSet rs = dbkud.execSQL("SELECT data, izena, puntuazioa FROM Partida WHERE data = today() ORDER BY puntuazioa;");

		List<String[]> partidak = new ArrayList<String[]>();

		try {
			while(rs.next()){
				String[] res = new String[4];
				res[0] = rs.getString("izena");
				res[1] = rs.getString("puntuazioa");
				res[2] = rs.getString("data");

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
	public List<String[]> getPartidaHistorikoak(){

		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		ResultSet rs = dbkud.execSQL("SELECT data, izena, puntuazioa FROM Partida ORDER BY puntuazioa;");

		List<String[]> partidak = new ArrayList<String[]>();

		try {
			while(rs.next()){
				String[] res = new String[4];
				res[0] = rs.getString("izena");
				res[1] = rs.getString("puntuazioa");
				res[2] = rs.getString("data");

				partidak.add(res);
				System.out.println(res[2]);
				//				System.out.println(res[1]);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return partidak;
	}

	public List<String[]> getJokalariarenPartidak(String izena){

		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		ResultSet rs = dbkud.execSQL("SELECT data, izena, puntuazioa FROM Partida WHERE Jokalaria.izena = izena ;");

		List<String[]> partidak = new ArrayList<String[]>();

		try {
			while(rs.next()){
				String[] res = new String[4];
				res[0] = rs.getString("izena");
				res[1] = rs.getString("puntuazioa");
				res[2] = rs.getString("data");

				partidak.add(res);
				System.out.println(res[2]);
				//				System.out.println(res[1]);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return partidak;
	}

	public void partidaGehitu(String data, String izena, String puntuazioa){
		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		dbkud.execSQL("INSERT INTO  (data, izena, puntuazioa) VALUES ( '"+ data +"','"+ izena +"','"+ puntuazioa+"' );");
	}
}