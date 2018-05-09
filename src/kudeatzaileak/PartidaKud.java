package kudeatzaileak;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
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
		java.util.Date fecha = new Date();
		String data = fecha.toString();

		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		ResultSet rs = dbkud.execSQL("SELECT data, izena, puntuazioa FROM Partida WHERE data = '"+data+"' ORDER BY puntuazioa;");

		List<String[]> partidak = new ArrayList<String[]>();

		try {
			while(rs.next()){
				String[] res = new String[3];
				res[0] = rs.getString("izena");
				res[1] = rs.getString("puntuazioa");
				res[2] = rs.getString("data");
				partidak.add(res);
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
				String[] res = new String[3];
				res[0] = rs.getString("izena");
				res[1] = rs.getString("puntuazioa");
				res[2] = rs.getString("data");
				partidak.add(res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return partidak;
	}

	public List<String[]> getJokalariarenPartidak(String izena){

		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		ResultSet rs = dbkud.execSQL("SELECT data, izena, puntuazioa FROM Partida WHERE izena = '"+izena+"';");

		List<String[]> partidak = new ArrayList<String[]>();

		try {
			while(rs.next()){
				String[] res = new String[3];
				res[0] = rs.getString("izena");
				res[1] = rs.getString("puntuazioa");
				res[2] = rs.getString("data");

				partidak.add(res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return partidak;
	}

	public void partidaGehitu(String izena, int puntuazioa){
		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		java.util.Date fecha = new Date();
		String data = fecha.toString();
		dbkud.execSQL("INSERT INTO Partida (data, izena, puntuazioa) VALUES ( '"+ data +"','"+ izena +"','"+ puntuazioa+"' );");
	}
}