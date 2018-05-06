package taulaEgunekoPartidak;

import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;


import kudeatzaileak.PartidaKud;
import taulaHistorikoa.TableModelHistorikoa;

public class TableModelEgunekoPartidak extends AbstractTableModel{
	
	private Vector<Lag> datuak = new Vector<Lag>();
	private Vector<String> columnNames = new Vector<String>();
	
	public TableModelEgunekoPartidak(){
		kargatu();
	}
	public static void main(String[] args) {
		TableModelEgunekoPartidak taula= new TableModelEgunekoPartidak();
		System.out.println("Lerroak:" + taula.getRowCount());
		System.out.println("Zutabeak:" + taula.getColumnCount());
		//System.out.println("(2,2) elementuaren balioa:" + taula.getValueAt(2, 2));
		System.out.println("Lehenengo zutabearen izena:" + taula.getColumnName(0));

	}

	@Override
	public int getColumnCount() {
		
		return columnNames.size();
	}

	@Override
	public int getRowCount() {
		return datuak.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
	
		return datuak.get(rowIndex).getBalioa(columnIndex);
	}
	
	public String getColumnName(int i){
		return columnNames.get(i);
	}
	
	public void kargatu(){
		hasieratuZutabeIzenak();
		List<String[]> partidaH = PartidaKud.getInstantzia().getGaurkoPartidak();
		for(String[] p : partidaH ){
			System.out.println(p[0]);
			datuak.add(new Lag(p[0],p[1]));
		}
	}

	private void hasieratuZutabeIzenak() {
		columnNames.add("Izena");
		columnNames.add("Puntuazioa");
		
		
		
		
	}
	
	public Class<?> getColumnClass(int col){
		Class<?>  emaitza = null;
		switch (col) {
		case 0:
			emaitza = String.class;
			break;
		case 1:
			emaitza =  String.class;
			break;
		
		
		default:
			break;
		}
		return emaitza;
	}
	
	
}
