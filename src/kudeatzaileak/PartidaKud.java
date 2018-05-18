package kudeatzaileak;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;

import kudeatzaileak.DBKudeatzaile;
import logika.Tableroa;

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
		ResultSet rs = dbkud.execSQL("SELECT data, izena, puntuazioa FROM Partida WHERE data =date() ORDER BY puntuazioa DESC;");

		List<String[]> partidak = new ArrayList<String[]>();

		try {
			while(rs.next()){
				String[] res = new String[3];
				res[0] = rs.getString("izena");
				System.out.println("izena: "+ res[0]);
				res[1] = rs.getString("puntuazioa");
				System.out.println("puntuazioa: "+ res[1]);
				res[2] = rs.getString("data");
				System.out.println("data: "+ res[2]);
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
		ResultSet rs = dbkud.execSQL("SELECT data, izena, puntuazioa FROM Partida ORDER BY puntuazioa DESC;");

		List<String[]> partidak = new ArrayList<String[]>();

		try {
			while(rs.next()){
				String[] res = new String[3];
				res[0] = rs.getString("izena");
				res[1] = rs.getString("puntuazioa");
				res[2] = rs.getString("data");
				System.out.println("DATA: " +res[2]);
				partidak.add(res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return partidak;
	}

	public List<String[]> getJokalariarenPartidak(){
		String izena = Tableroa.getTableroa().getPertsona().getIzena();
		System.out.println("Izena: "+izena);
		DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
		ResultSet rs = dbkud.execSQL("SELECT data, izena, puntuazioa FROM Partida WHERE izena = '"+izena+"' ORDER BY puntuazioa DESC;");

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
		
//		dbkud.execSQL("INSERT INTO Partida (data, izena, puntuazioa) VALUES ( '"+ inActiveDate +"','"+ izena +"','"+ puntuazioa+"' );");
		dbkud.execSQL("INSERT INTO Partida (data, izena, puntuazioa) VALUES (date(),'"+ izena +"','"+ puntuazioa+"' );");
	}
}