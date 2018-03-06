package logika;

import java.util.ArrayList;

public class Mahaia {

	//ATRIBUTUAK
	private static Mahaia nireMahaia = null;
	private ArrayList<Karta> ilara;
	//private ArrayList<Karta> barruan
	
	//ERAIKITZAILEA
	private Mahaia(){
		this.ilara = new ArrayList<Karta>();
		// this.barruan = new ArrayList<Karta>();
	}
	
	//METODOAK
	public Mahaia getMahaia(){
		if(nireMahaia == null){
			nireMahaia = new Mahaia();
		}
		return nireMahaia;
	}
}
