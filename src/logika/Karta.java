package logika;

import javax.swing.ImageIcon;

public abstract class Karta {
	protected int zenb;
	protected ImageIcon irudia;
	protected boolean errekurtsiboa;
	protected String izena;
	public String kolorea;
	
	
	public Karta(){
		
	}
	public void animaladaEgin(){
				
	}
	
	public String getKolorea(){
		return this.kolorea;
	}
	public int getZenb(){
		return zenb;
	}
	public void setZenb(int pZenb){
		this.zenb=pZenb;
	}
	public ImageIcon getIrudia(){
		return irudia;
	}
	public void setIrudia(ImageIcon irudia){
		this.irudia=irudia;
	}
	public boolean isErrekurtsiboa() {
		return errekurtsiboa;
	}
	public void setErrekurtsiboa(boolean errekurtsiboa) {
		this.errekurtsiboa = errekurtsiboa;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public void animaladaEgin(int i) {
		// TODO Auto-generated method stub
		
	}
	public void koloreaEguneratu(String kolorea2) {
		this.kolorea= kolorea2;
	}
	
	public int compareTo(Karta a) {
		Integer zen = a.getZenb();
		return (Integer.valueOf(zenb)).compareTo(zen);
	}
	
}
