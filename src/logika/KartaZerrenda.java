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

	public void gehituKarta(Karta karta){ //ER
		lista.add(karta);
	}

	public int kolorekoKartakKontatu(String kolorea){ //ER
		int kop=0;
		for (Karta k : this.lista) {
			if (k.getKolorea()==kolorea) {
				kop++;
			}
		}
		return kop;
	}
	public int tamaina(){
		return lista.size();
	}

	public Karta get(int i){ //ER
		return lista.get(i);
	}

	public boolean dauka (Karta k){ //ER
		return this.lista.contains(k);
	}

	public void hasieratu(){
		lista=new ArrayList<Karta>();
	}
	public void kenduKarta(Karta k){ //ER
		lista.remove(k);
		if(lista.size()<5){
			for(int i = lista.size(); i<=5; i++){
				Karta h = new KartaHutsa();
				lista.add(h);
			}
		}
	}
	
	public void zerrendaBete(){
		if (this.lista.size()<5) {
			for (int j=this.lista.size(); j<=5; j++) {
				this.lista.add(new KartaHutsa());
			}
		}
		
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
	
	

	public Karta kartaAltuenaBilatu(){ //ER
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

	public boolean hutsik(){ //zerrenda karta hutsez beteta badago TRUE bueltatzen du --> ER
		boolean hutsik = false;
		int kop =0;
		for(Karta k : this.lista){
			if(k.getZenb()==0){
				kop++;
			}
		}
		if(kop == 3){
			hutsik = true;
		}
	
		return hutsik;
	}

	public boolean errepikatutaDago(int zenb){ //ER
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

	public int tamainaKartaHutsBarik(){ //ER
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
	
	

	public void kartaPosizioBateanSartu(Karta k, int pos){ //ER
		ArrayList<Karta> zerrendaBerria = new ArrayList<Karta>();

		for (int i = 0; i<this.lista.size();i++){

			if(i == pos){
				zerrendaBerria.add(k);
				zerrendaBerria.add(this.lista.get(i));

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

	public void set(Karta k, int pos){ //ER
		lista.set(pos, k);
	}

	public void biKartaAltuenakKenduZerrendaTxikia(){ //ER
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
		for(int i = zb.size(); i<5; i++){
			Karta h = new KartaHutsa();
			zb.add(h);


		}
		this.lista= zb;
		
	}

	public boolean dauka(int i){ //ER
		boolean dauka = false;
		if(this.lista.contains(kartaLortuZenbakiarekin(i))){
			dauka = true;
		}
		return dauka;
	}

	public void txikiagoakDirenKartakEzabatu(int zenb, int pos ){ //ER
		ArrayList<Karta> kz = new ArrayList<Karta>();
		
		for(int i = 0; i<pos; i++){
			if(this.lista.get(i).getZenb()>= zenb){
				kz.add(this.lista.get(i));
			}
			else{
				System.out.println("ZENB BAINO TXIKIAGO ------->" + this.lista.get(i).getIzena());
			}
		}
		if(pos!= kz.size()-1){
			for(int j = pos; j< this.lista.size(); j++){
				kz.add(this.lista.get(j));
			}
		}
		
		
		if(kz.size()<5){
				for(int l = kz.size()-1; l<=5; l++){
					Karta h = new KartaHutsa();
					kz.add(h);
				}
	
		}
		this.lista = kz;
		
	}

	public void tarteBateanTxikiagoakDirenKartakKendu(int zenb, int esk, int ezk){ //ER
		ArrayList<Karta> kz = new ArrayList<Karta>();
		for(int j = 0; j<=ezk; j++){ //ezk baino lehenago
			kz.add(this.lista.get(j));
		}
		for(int i = ezk; i<esk; i++){// ezk eta esk artean
			if(this.lista.get(i).getZenb()>=zenb){
				kz.add(this.lista.get(i));
			}
		}
		for(int s = esk; s< this.lista.size(); s++){ // esk eta gero
			kz.add(this.lista.get(s));
		}
		if(kz.size()<5){
			for(int j = kz.size()-1; j<=5; j++){
				Karta h = new KartaHutsa();
				kz.add(h);
			}

	}
	this.lista = kz;
	
	}

	public Karta kartaLortuZenbakiarekin(int zenb) { //ER
		Karta k = null;
		for (int i=0; i<this.lista.size(); i++) {
			if (this.lista.get(i).getZenb()==zenb) {
				k = this.lista.get(i);
			}
		}
		return k;
	}

	public void tximinoakKanporatu() { //ER
		ArrayList<Karta> zer = new ArrayList<Karta>();

		if(!this.lista.contains(new TximinoKarta(""))){
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
	
	public int kartaBatenPosizioaLortu(int zenb){ //ER
		boolean aurkitu = false;
		int posizioa = 0;
		for(Karta k : this.lista){
			if(!aurkitu){
				if(k.getZenb()==zenb){
					aurkitu = true;
				}else{
					posizioa ++;
				}
			}
		
		}
		return posizioa;
	}

	// quickSort zerrenda ordenatzeko
	public void zerrendaOrdenatu(int hasiera, int bukaera) { //ER
		if (bukaera - hasiera >= 0) {
			int ind = zatiketa(this.lista, hasiera, bukaera);
			zerrendaOrdenatu(hasiera, ind - 1);
			zerrendaOrdenatu(ind + 1, bukaera);
		}
	}

	private int zatiketa(ArrayList<Karta> list, int i, int f) { //ER
		Karta a = list.get(i);

		int ezker = i;
		int eskuin = f;

		while (ezker < eskuin) {
			while (list.get(ezker).compareTo(a) <= 0 && ezker < eskuin)
				ezker++;
			while (list.get(eskuin).compareTo(a) > 0)
				eskuin--;

			if (ezker < eskuin)
				Collections.swap(list, ezker, eskuin);
		}
		list.set(i, list.get(eskuin));
		list.set(eskuin, a);

		return eskuin;
	}

}