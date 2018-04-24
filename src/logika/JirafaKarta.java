package logika;

public class JirafaKarta extends Karta {
	
	//ERAIKITZAILEA
	public JirafaKarta(){
		this.izena="jirafa";
		this.zenb=8;
		this.errekurtsiboa = true;
	}


	public void animaladaEgin() { // bere aurretik dagoen karta bera baino txikiagoa bada saltatzen du
		System.out.println("JIRAFAREN ANIMALADA");
		Tableroa.getTableroa().getJokokoKartak().saltatu(1);
		}
		
	}


