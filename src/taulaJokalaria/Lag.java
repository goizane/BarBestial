package taulaJokalaria;

import java.util.Vector;
import kudeatzaileak.DBKudeatzaile;

class Lag {
	
	String izena;
	String puntuazioa;
	String data;
	
	public Lag(String izena, String puntuazioa, String data){
		super();
		this.izena= izena;
		this.puntuazioa=puntuazioa;
		this.data = data;

		
	}
	
	

	public static void main(String[] args) {
		Vector<Lag> datuak = new Vector<Lag>();
		DBKudeatzaile dbk = DBKudeatzaile.getInstantzia();
		System.out.println(datuak);
	}

	public String toQuery() {
		return "'" + izena + "', '" + puntuazioa + "', '" + data + "'"; 
	}

	@Override
	public String toString() {
		return "Lag [izena=" + izena + ", puntuazioa=" + puntuazioa + ", data=" + data + "]";
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
		case 2:
			emaitza = data;
			break;
		default:
			break;
		}
		return emaitza;
	}


}