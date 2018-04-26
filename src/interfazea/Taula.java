package interfazea;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import logika.FokaKarta;
import logika.Jokalari;
import logika.KanguroKarta;
import logika.Karta;
import logika.KartaZerrenda;
import logika.MofetaKarta;
import logika.Tableroa;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

public class Taula extends JFrame {
	
	//KARTAK
	
	ImageIcon karta = new ImageIcon("src/fitxategiak/karta.png");
	ImageIcon kartaHutsa = new ImageIcon("src/fitxategiak/kartaHutsa.jpg");
	ImageIcon tabernaKarta = new ImageIcon("src/fitxategiak/taberna.png");
	ImageIcon kaleaKarta =new ImageIcon("src/fitxategiak/zakarrontzia.png");
	ImageIcon sugeBerdea = new ImageIcon("src/fitxategiak/zebraBerdea.png");
	
	
	JPanel panelNagusia = new JPanel();
	JPanel ordenagailuKartak = new JPanel();
	JPanel jokokoKartak = new JPanel();
	JPanel jokalariKartak = new JPanel();
	
	//ORDENAGAILUAREN KARTAK
	
	JLabel ordenagailuKarta1 = new JLabel();
	JLabel ordenagailuKarta2 = new JLabel();
	JLabel ordenagailuKarta3 = new JLabel();
	JLabel ordenagailuKarta4 = new JLabel();
	JLabel ordenagailuMazoa = new JLabel();
	
	
	
	//JOKOKO KARTAK
	
	JLabel taberna = new JLabel();
	JLabel jokokoKarta1 = new JLabel();
	JLabel jokokoKarta2 = new JLabel();
	JLabel jokokoKarta3 = new JLabel();
	JLabel jokokoKarta4 = new JLabel();
	JLabel jokokoKarta5 = new JLabel();
	JLabel kalea = new JLabel();
	
	//JOKALARIAREN BOTOIAK
	
	JButton jokalariKarta1 = new JButton();
	JButton jokalariKarta2 = new JButton();
	JButton jokalariKarta3 = new JButton();
	JButton jokalariKarta4 = new JButton();
	JButton jokalariMazoa = new JButton();
	
	public Taula(){
		super("Taula");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ordenagailuko kartak ordenagailuKartak panelean sartu
		ordenagailuKartak.add(ordenagailuKarta1);
		ordenagailuKartak.add(ordenagailuKarta2);
		ordenagailuKartak.add(ordenagailuKarta3);
		ordenagailuKartak.add(ordenagailuKarta4);
		ordenagailuKartak.add(ordenagailuMazoa);
		
		ordenagailuKartak.setLayout(new GridLayout(1,5));
		
		//jokoko kartak jokokoKartak panelean sartu
		jokokoKartak.add(taberna);
		jokokoKartak.add(jokokoKarta1);
		jokokoKartak.add(jokokoKarta2);
		jokokoKartak.add(jokokoKarta3);
		jokokoKartak.add(jokokoKarta4);
		jokokoKartak.add(jokokoKarta5);
		jokokoKartak.add(kalea);
		
		jokokoKartak.setLayout(new GridLayout(1,7));
		
		//jokalariaren kartak jokalariKartak panelean sartu
		
		jokalariKartak.add(jokalariKarta1);
		jokalariKartak.add(jokalariKarta2);
		jokalariKartak.add(jokalariKarta3);
		jokalariKartak.add(jokalariKarta4);
		jokalariKartak.add(jokalariMazoa);
		
		jokalariKartak.setLayout(new GridLayout(1,5));
		
		//panel nagusian sartu
		getContentPane();
		
		add(ordenagailuKartak, BorderLayout.NORTH);
		add(jokokoKartak, BorderLayout.CENTER);
		add(jokalariKartak, BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(1200, 700);
		pack();
		
		
	}
	
	public void pantailaratuOrdenagailuKartak(){
		ordenagailuKarta1.setIcon(karta);
		ordenagailuKarta2.setIcon(karta);
		ordenagailuKarta3.setIcon(karta);
		ordenagailuKarta4.setIcon(karta);
		ordenagailuMazoa.setIcon(karta);
	}
	
	public void pantailaratuJokokoKartak(){
		KartaZerrenda z = new KartaZerrenda();
		z= TaulaKudeatzailea.getTaulaKudeatzailea().getJokokoKartak();
		taberna.setIcon(tabernaKarta);
		kalea.setIcon(kaleaKarta);
		if(z.get(0).getZenb()==0){
			jokokoKarta1.setIcon(kartaHutsa);
		}
		else{
			ImageIcon jokokoIrudia1 = new ImageIcon("/src/fitxategiak/"+ z.get(0).getIzena()+ z.get(0).getKolorea()+".png");
			jokokoKarta1.setIcon(jokokoIrudia1);
		}
		if(z.get(1).getZenb()==0){
			jokokoKarta2.setIcon(kartaHutsa);
		}
		else{
			ImageIcon jokokoIrudia2 = new ImageIcon("/src/fitxategiak/"+ z.get(1).getIzena()+ z.get(1).getKolorea()+".png");
			jokokoKarta2.setIcon(jokokoIrudia2);
		}
		if(z.get(2).getZenb()==0){
			jokokoKarta3.setIcon(kartaHutsa);
		}
		else{
			ImageIcon jokokoIrudia3 = new ImageIcon("/src/fitxategiak/"+ z.get(2).getIzena()+ z.get(2).getKolorea()+".png");
			jokokoKarta3.setIcon(jokokoIrudia3);
		}
		if(z.get(3).getZenb()==0){
			jokokoKarta4.setIcon(kartaHutsa);
		}
		else{
			ImageIcon jokokoIrudia4 = new ImageIcon("/src/fitxategiak/"+ z.get(3).getIzena()+ z.get(3).getKolorea()+".png");
			jokokoKarta4.setIcon(jokokoIrudia4);
		}
		if(z.get(4).getZenb()==0){
			jokokoKarta5.setIcon(kartaHutsa);
		}
		else{
			ImageIcon jokokoIrudia5 = new ImageIcon("/src/fitxategiak/"+ z.get(4).getIzena()+ z.get(4).getKolorea()+".png");
			jokokoKarta5.setIcon(jokokoIrudia5);
		}
		
	}
	
	public void pantailaratuJokalariKartak(){
		KartaZerrenda z = new KartaZerrenda();
		z= TaulaKudeatzailea.getTaulaKudeatzailea().JokalariarenEskukoKartakLortu();
	
		
	
			ImageIcon jokalariIrudia1 = new ImageIcon("/src/fitxategiak/"+ z.get(0).getIzena()+ z.get(0).getKolorea()+".png");
			jokalariKarta1.setIcon(jokalariIrudia1);
		
		
	
			ImageIcon jokalariIrudia2 = new ImageIcon("/src/fitxategiak/kartaHutsa.jpg");
			jokalariKarta2.setIcon(sugeBerdea);
		
			ImageIcon jokalariIrudia3 = new ImageIcon("/src/fitxategiak/"+ z.get(2).getIzena()+ z.get(2).getKolorea()+".png");
			jokalariKarta3.setIcon(jokalariIrudia3);
	
			ImageIcon jokalariIrudia4 = new ImageIcon("/src/fitxategiak/"+ z.get(3).getIzena()+ z.get(3).getKolorea()+".png");
			jokalariKarta4.setIcon(jokalariIrudia4);
		
		
			jokalariMazoa.setIcon(karta);
		
		
	}
	
	public static void main(String[] args) {
		
		TaulaKudeatzailea.getTaulaKudeatzailea().hasieratu();
		//taula kudeatzailean hasieratu
		Taula t =new Taula();
		t.pantailaratuOrdenagailuKartak();
		t.pantailaratuJokokoKartak();
		t.pantailaratuJokalariKartak();
		
	}
	
	}