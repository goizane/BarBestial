package taulaJokalaria;

import java.sql.Date;
import java.util.Vector;

import kudeatzaileak.DBKudeatzaile;


class Lag {
	
	
	String puntuazioa;
	Date data;
	
	public Lag( String puntuazioa){
		super();
		
		this.puntuazioa=puntuazioa;

		
	}
	
	

	public static void main(String[] args) {
		Vector<Lag> datuak = new Vector<Lag>();
		DBKudeatzaile dbk = DBKudeatzaile.getInstantzia();
		System.out.println(datuak);
	}

	public String toQuery() {
		return " '" + puntuazioa + "'"; 
	}

	@Override
	public String toString() {
		return "Lag [ puntuazioa=" + puntuazioa + "]";
	}


	public Object getBalioa(int columnIndex) {
		Object emaitza=null;
		switch (columnIndex) {
		
		case 0:
			emaitza = puntuazioa;
			break;
			
		default:
			break;
		}
		return emaitza;
	}


}
