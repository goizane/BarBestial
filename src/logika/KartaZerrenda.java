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
	
	public boolean dauka (Karta k){
		return this.lista.contains(k);
	}
	
	public void hasieratu(){
		lista=new ArrayList<Karta>();
	}
	public void kenduKarta(Karta k){
		lista.remove(k);
		System.out.println("kendutako karta: " + k.getIzena());
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
	public boolean hutsikDago(){
		 return this.lista.isEmpty();
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
	
	public int tamainaKartaHutsBarik(){
		int kont =0;
		
		
			for(Karta k : this.lista){
				if(k.zenb!=0){
				
				kont ++;
				}
			}
			return kont;
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
		ArrayList<Karta> zerrendaBerria = new ArrayList<Karta>();
		for (int i = 0; i<this.lista.size();i++){
			Karta h = new KartaHutsa();
			if(i == pos){
				zerrendaBerria.add(k);
				
			}else{
				zerrendaBerria.add(this.lista.get(i));
			}
		}
		this.lista = zerrendaBerria;
	}
	
	
	
	public void ordenardenaAldatu(){
		ArrayList<Karta> zerrendaBerria = new ArrayList<Karta>();
		
			for(int i = this.lista.size()-1; i>=0; i--){
				Karta k = this.lista.get(i);
				zerrendaBerria.add(k);
			}
			if(zerrendaBerria.size()<5){
				for(int j = zerrendaBerria.size(); j<=5; j++){
					Karta h = new KartaHutsa();
					zerrendaBerria.add(h);
				}
			}
		

		this.lista= zerrendaBerria;
		
	}
	
	

	
}
