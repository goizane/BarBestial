package logika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
	
	public boolean errepikatutaDago(int zenb){
		int zenbat =0;
		boolean errepikatuta = false;
		for(Karta k : this.lista){
			if(zenb == k.zenb){
				zenbat++;
			}
		}
		if(zenbat >=2){
		   errepikatuta = true;
		}
		return errepikatuta;
	}
	
	
	
	public Karta azkenKartaBilatu(int zenb){
		Karta azkena = null;
		for(Karta k : this.lista){
			if(k.zenb == zenb){
				azkena = k;
			}
		}
		return azkena;
	}
	
	public void kartaPosizioBateanSartu(Karta k, int pos){
		ArrayList<Karta> zerrendaBerria = null;
		int kont = 0;
		for(Karta karta : this.lista){
			if(kont == pos){
				zerrendaBerria.add(k);
			}
			
			zerrendaBerria.add(karta);
			
		}
		this.lista = zerrendaBerria;
	}
	
	public void zerrendarenOrdenaAldatu(){
		ArrayList<Karta> zerrendaBerria = null;
		for(int i = this.lista.size()-1; i>=0; i--){
			Karta k = this.lista.get(i);
			zerrendaBerria.add(k);
		}
		this.lista= zerrendaBerria;
	}
	

	
}
