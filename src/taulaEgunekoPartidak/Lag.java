package taulaEgunekoPartidak;

import java.sql.Date;
import java.util.Vector;

import kudeatzaileak.DBKudeatzaile;

class Lag {
	
	String izena;
	String puntuazioa;
	Date data;
	
	public Lag(String izena, String puntuazioa){
		super();
		this.izena= izena;
		this.puntuazioa=puntuazioa;

		
	}
	
	

	public static void main(String[] args) {
		Vector<Lag> datuak = new Vector<Lag>();
		DBKudeatzaile dbk = DBKudeatzaile.getInstantzia();
		System.out.println(datuak);
	}

	public String toQuery() {
		return "'" + izena + "', '" + puntuazioa + "'"; 
	}

	@Override
	public String toString() {
		return "Lag [izena=" + izena + ", puntuazioa=" + puntuazioa + "]";
	}


	public Object getBalioa(int columnIndex) {
		Object emaitza=null;
		switch (columnIndex) {
		case 0:
			emaitza = izena;
			break;
		case 1:
			emaitza = puntuazioa;
			break;
			
		default:
			break;
		}
		return emaitza;
	}


}