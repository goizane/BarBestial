package logika;

public class Jokoa {
	private static Jokoa nJokoa = null;
	
	private Jokoa(){
		
	}
	
	public static Jokoa getJokoa(){
		if(nJokoa == null){
			nJokoa = new Jokoa();
		}
		return nJokoa;
	}
	
	public void jokatu(){
		
	}
	
}
