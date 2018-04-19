package logika;

import java.util.ArrayList;

public class JokalariZerrenda {

	//ATIBUTUAK
	private ArrayList<Jokalari> jokZer;
	private static JokalariZerrenda nireJokalariZerrenda = null;
	
	//ERAIKITZAILEA
	private JokalariZerrenda(){
		this.jokZer = new ArrayList<Jokalari>(); 
	}
	
	//METODOAK
	
	public static JokalariZerrenda getJokalariZerrenda(){
		if(nireJokalariZerrenda == null){
			nireJokalariZerrenda = new JokalariZerrenda();
		}
		return nireJokalariZerrenda;
	}
	
	public Jokalari getJok(int i){
		return jokZer.get(i);
	}
	
	
}
