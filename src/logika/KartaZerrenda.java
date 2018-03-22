package logika;

import java.util.ArrayList;

public class KartaZerrenda {

	//ATRIBUTUAK
	private ArrayList<Karta> lista;
	
	//ERAIKITZAILEA
	
	public KartaZerrenda(){
		this.lista = new ArrayList<Karta>();
	}
	
	public void gehituKarta(Karta karta){
		lista.add(karta);
	}
	
	public int tamaina(){
		return lista.size();
	}
	
	public Karta get(int i){
		return lista.get(i);
	}
	
	public void hasieratu(){
		lista=new ArrayList<Karta>();
	}
}
