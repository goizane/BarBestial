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
	public void kenduKarta(Karta k){
		lista.remove(k);
	}
	
	public Karta kartaAltuenaBilatu(){
		Karta altuena = null;
		int balioa = 0;
		for(Karta k : this.lista){
			if(k.zenb>balioa){
				balioa = k.zenb;
				altuena = k;
			}
		}
		return altuena;
	}
	
	public boolean dauka(Karta k){
		boolean dauka = false;
		if(this.lista.contains(k)){
			dauka = true;
		}
		return dauka;
	}
	
	public Karta kartaBilatu(Karta k){
		Karta karta = null;
		for(Karta kar : this.lista){
			if(kar==k){
				karta = kar;
			}
		}
		return karta;
	}
}
