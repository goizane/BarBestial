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
	
	public int puntuakKontatu(int i){
		int puntuak =0;
		for(Karta k : this.lista){
			if(i==0 && k.kolorea == "urdina"){
				puntuak++;
			}
			else if(i==1 && k.kolorea == "berdea"){
				puntuak++;
			}
		}
		return puntuak;
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
		if(!this.lista.contains(k)){
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
		
		System.out.println("karta posizio batean sartu");
		for (int i = 0; i<this.lista.size();i++){
			
			if(i == pos){
				zerrendaBerria.add(k);
				
			}else{
				zerrendaBerria.add(this.lista.get(i));
//				System.out.println(this.lista.get(i).getIzena());
			}
		
		}
		this.lista = zerrendaBerria;
		System.out.println("jokoko kartak aukeratutako karta sartuta");
		for(Karta ka : this.lista){
			System.out.println(ka.getIzena());
			
		}
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
		
		int tamaina = 0;
		for(int t =0; t<this.lista.size(); t++){
			if(this.lista.get(t).getZenb()!=0){
				tamaina++;
			}
		}
		int s = salto;
		int posizioa = tamaina-s;
		System.out.println("animalia" + posizioa+1 + " posizioan sartu behar da ");
		System.out.println("Zerrendaren tamaina: " +tamaina);
		Karta k = Tableroa.getTableroa().getJokokoKartak().get(tamaina-1);
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

	public void biKartaAltuenakKenduZerrendaTxikia(){
		ArrayList<Karta> zb = new ArrayList<Karta>();
		int tamaina =0;
		for (Karta k : this.lista){
			if(k.getZenb()!=0){
				tamaina++;
			}
		}
		if(tamaina ==1){
			zb = this.lista;
			
		}
		else if(tamaina ==2){
			zb.add(this.lista.get(1));
		}
		else{
			zb.add(this.lista.get(2));
		}
		for(int i = zb.size()-1; i<=5; i++){
			Karta h = new KartaHutsa();
			zb.add(h);
			
		}
		this.lista= zb;
		for(Karta kar : this.lista){
			System.out.println(kar.getIzena());
		}
	}
	
	public boolean dauka(int i){
		boolean dauka = false;
		if(this.lista.contains(this.get(i))){
			dauka = true;
		}
		return dauka;
	}
	
	public void txikiagoakEzabatuZebraBarik( int zenb){
			ArrayList<Karta> kz = new ArrayList<Karta>();
			
			System.out.println(zenb +" baino txikiagoak diren kartak ezabatu");
			System.out.println("zebrak barrera modukoa da");
			System.out.println("Ez dago zebrarik");
			for( int i =0 ; i<this.lista.size(); i++){
				if(this.lista.get(i).getZenb()>=zenb|| this.lista.get(i).getZenb()==0){
					kz.add(this.lista.get(i));
					System.out.println(this.lista.get(i).getIzena());
				}
			}
			if(kz.size()<5){
				for(int j = kz.size(); j<=5; j++){
					Karta h = new KartaHutsa();
					kz.add(h);
				}
			}
			this.lista = kz;
			
		}
		public void txikiagoakDirenKartakEzabatu(int zenb ){
			ArrayList<Karta> kz = new ArrayList<Karta>();
			System.out.println(zenb +" baino txikiagoak diren kartak ezabatu");
			System.out.println("zebrak barrera modukoa da");
			System.out.println("Zebra dago!");
			
				for( int i =0 ; i<this.lista.size(); i++){
					if(this.lista.get(i).getZenb()==7){
						System.out.println("Zebra aurkitu dugu --> ezin du jarraitu");
						kz.add(this.lista.get(i));
						System.out.println(this.lista.get(i).getIzena());
						}
					else if(this.lista.get(i).getZenb()>=zenb){
						kz.add(this.lista.get(i));
						System.out.println(this.lista.get(i).getIzena());
					}
				}
			
			if(kz.size()<5){
				for(int j = kz.size()-1; j<=5; j++){
					Karta h = new KartaHutsa();
					kz.add(h);
					System.out.println(h.getIzena());
				}
				
			}
			this.lista = kz;
		}
		
		
	
	
	public void tximinoakKanporatu() {
		 ArrayList<Karta> zer = new ArrayList<Karta>();
		
		if(!this.lista.contains(new TximinoKarta(""))){
			zer = this.lista;
			System.out.println("Ez dago tximinorik!");
		}
		 
		else{
			System.out.println("TXIMINO GABEKO LISTA");
			for(int i = 0; i< this.lista.size(); i++){
				if(this.lista.get(i).getZenb()!= 4){
					zer.add(this.lista.get(i));
					System.out.println(this.lista.get(i).getIzena());
				}
			}
		}
		if(zer.size()<5){
			for(int j = zer.size(); j<=5; j++){
				Karta h = new KartaHutsa();
				zer.add(h);
				System.out.println(h.getIzena());
			}
			
		}
		this.lista = zer;
		
		
	}
	}
	
	

	

