package logika;

import java.util.ArrayList;

public class JokalariZerrenda {

	//ATIBUTUAK
	private ArrayList<Jokalari> jokZer;
	private static JokalariZerrenda nireJokalariZerrenda = null;
	
	//ERAIKITZAILEA
	JokalariZerrenda(){
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
	
	public Jokalari getJokalari(String kolorea){
		if(kolorea == "Berdea"){
			return jokZer.get(1);
		}else{
				return jokZer.get(0);
			}
		
			
		}
		
	
	
	public void gehituJokalaria(Jokalari j){
		jokZer.add(j);
	}
}
