package logika;

import javax.swing.ImageIcon;

public abstract class Karta {
	protected int zenb;
	protected ImageIcon irudia;
	protected boolean errekurtsiboa;
	protected String izena;
	
	public Karta(){
		
	}
	public void animaladaEgin(){
		
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
}
