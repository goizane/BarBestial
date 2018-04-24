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
	
	public boolean ilaraBeteta(){
		boolean beteta = false;
		Karta k = new KartaHutsa();
		if(this.lista.contains(k)){
			beteta= true;
			System.out.println("Beteta dago!");
		}
		return beteta;
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
	
	
	
	public void saltatu(int salto){
		System.out.println("saltatun sartu da!");
		int s = salto +1;
		int posizioa = this.lista.size()-s;
		System.out.println("posizioa: " + posizioa);
		int tamaina = this.lista.size()-1;
		Karta k = new KanguroKarta();
		ArrayList<Karta> zerrendaBerria = new ArrayList<Karta>();
		if(posizioa<0){
			zerrendaBerria = this.lista;
			System.out.println(" posizioa < 0");
		}
			else{
				for (int i = 0; i<this.lista.size();i++){
					if(i == posizioa){
						zerrendaBerria.add(k);
						System.out.println(k.getIzena()+"karta gehitu da");
						
					}else{
						zerrendaBerria.add(this.lista.get(i));
						System.out.println(this.lista.get(i).getIzena()+" gehitu da");
					}
				}
			}
		
		this.lista = zerrendaBerria;
		
		
	}

	public void txikiagoakDirenKartakEzabatu(int zenb ){
		ArrayList<Karta> kz = new ArrayList<Karta>();
		boolean amaitu = false;
		if(!this.lista.contains(new ZebraKarta())){
			for( int i =0 ; i<this.lista.size(); i++){
				if(this.lista.get(i).getZenb()>=zenb|| this.lista.get(i).getZenb()==0){
					kz.add(this.lista.get(i));
				}
			}
			
		}
		else{
			while(!amaitu){
				for( int i =0 ; i<this.lista.size(); i++){
					if(this.lista.get(i).getZenb()==7){
						amaitu = true;
					}
					if(this.lista.get(i).getZenb()>=zenb){
						kz.add(this.lista.get(i));
					}
				}
			}
			if(kz.size()<5){
				for(int j = kz.size()-1; j<=5; j++){
					Karta h = new KartaHutsa();
					kz.add(h);
				}
				
			}
		}
		
		this.lista = kz;
	}
	
	public void tximinoakKanporatu() {
		 ArrayList<Karta> zer = new ArrayList<Karta>();
		if(!this.lista.contains(new TximinoKarta())){
			zer = this.lista;
		}
		else{
			for(int i = 0; i< this.lista.size(); i++){
				if(this.lista.get(i).getZenb()!= 4){
					zer.add(this.lista.get(i));
				}
			}
		}
		if(zer.size()<5){
			for(int j = zer.size(); j<=5; j++){
				Karta h = new KartaHutsa();
				zer.add(h);
			}
			
		}
		this.lista = zer;
		
		
	}
	}
	
	

	

