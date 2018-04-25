package interfazea;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
	private BorderLayout eskema;
	private Container edukiontzia;
	private GridBagConstraints mugak;
	private static Taula taula;
	private JMenuBar menuBarra = new JMenuBar();
	private JMenu hasi = new JMenu();
	private JMenu laguntza = new JMenu();
	private JTextField[] kartak = new JTextField[4];
	private JPanel computerPanel = new JPanel(new GridBagLayout());
	private JPanel gamePanel = new JPanel(new GridBagLayout());
	private JPanel userPanel = new JPanel(new GridBagLayout());
	private JPanel trashPanel = new JPanel(new GridBagLayout());
	private JPanel tabernPanel = new JPanel(new GridBagLayout());
	private JButton lable0 = new JButton();
	private JButton lable1 = new JButton();
	private JButton lable2 = new JButton();
	private JButton lable3 = new JButton();
	private JButton lable4 = new JButton();

	public static void main(String[] args){

		TaulaKudeatzailea.getTaulaKudeatzailea().hasieratu();
		
	}
	public static synchronized Taula getInstantzia(){
		if(taula==null){
			taula=new Taula();
		}
		return taula;
	}
	public void bistaratu() {
		taula.setTitle("Bar Bestial");
		taula.setVisible(true);
		taula.setSize(1200, 700);
		taula.setMaximumSize(new Dimension(1000, 700));
		taula.pack();
		taula.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	public void taulaHasieratu(){
		edukiontzia = getContentPane();
		eskema = new BorderLayout();
		edukiontzia.setLayout(eskema);
//		Tableroa.getTableroa().jokokoKartakHasieratu();
		// Menua
		taula.setJMenuBar(menuBarra);
		taula.setTitle("Bar Bestial");
		hasi.setText("Hasi");
		laguntza.setText("laguntza");
		menuBarra.add(hasi);
		menuBarra.add(laguntza);
//		eskukoKartakKargatu("Berdea", this.computerPanel);
//		edukiontzia.add(computerPanel,BorderLayout.NORTH);
//		jokokoKartakKargatu(gamePanel);
//		edukiontzia.add(gamePanel,BorderLayout.CENTER);
//		eskukoKartakPantailaratu(this.userPanel);
//		edukiontzia.add(userPanel,BorderLayout.SOUTH);
	}
	public void konputagailuaHasieratu(){
		edukiontzia.add(computerPanel,BorderLayout.NORTH);
	}
	public void erdiaHasieratu(){
		edukiontzia.add(gamePanel,BorderLayout.CENTER);
	}
	public void jokalariaHasieratu(){
		edukiontzia.add(userPanel,BorderLayout.SOUTH);
	}
	public void gehituMazoa(String jokalaria){
		ImageIcon ii = new ImageIcon("src/fitxategiak/karta.png");
		GridBagConstraints c = new GridBagConstraints();
		JButton lable = new JButton(ii);
		JScrollPane jsp = new JScrollPane(lable);
		if(jokalaria.equals("Urdina")){
			userPanel.add(jsp, c);
		}else{
			computerPanel.add(jsp, c);
		}
	}
	public void gehituKarta(String jokalaria, Karta karta){
		ImageIcon ii;
		GridBagConstraints c = new GridBagConstraints();
//		JButton lable = null;
//		JButton lable1 = null;
//		JButton lable2 = null;
//		JButton lable3 = null;
//		JButton lable4 = null;
		JScrollPane jsp;
	
		if(jokalaria.equals("taberna.png") || jokalaria.equals("zakarrontzia.png") ){
			ii = new ImageIcon("src/fitxategiak/"+jokalaria);
			lable0 = new JButton(ii);
			jsp = new JScrollPane(lable0);
			computerPanel.add(jsp, c);
		}else if(jokalaria.equals("Urdina")){
			int i = 1;
			ii = new ImageIcon("src/fitxategiak/"+karta.getIzena()+jokalaria+".png");
			if(i==1){
				lable1 = new JButton(ii);
				lable1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						actionListener(0);
						System.out.println("posizioa: 1");
					}
		});
				jsp = new JScrollPane(lable1);
				
			}
			else if(i ==2){
				lable2 = new JButton(ii);
					lable2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						actionListener(1);
						System.out.println("posizioa: 2");
					}
		});
				jsp = new JScrollPane(lable2);
				
			}
			else if(i ==3){
				lable3 = new JButton(ii);
				lable3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						actionListener(2);
						System.out.println("posizioa: 3");
					}
		});
				jsp = new JScrollPane(lable3);
				
			}
			else{
				lable4 = new JButton(ii);
				lable4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						actionListener(3);
						System.out.println("posizioa: 4");
					}
		});
				jsp = new JScrollPane(lable4);
				i++;
			}
			i++;
			userPanel.add(jsp, c);
		}else if(jokalaria.equals("Berdea")){
			ii = new ImageIcon("src/fitxategiak/karta.png");
			lable0 = new JButton(ii);
			
			jsp = new JScrollPane(lable0);
			computerPanel.add(jsp, c);
		}else if(jokalaria.equals("kartaHutsa.jpg")){
			ii = new ImageIcon("src/fitxategiak/kartaHutsa.jpg");
			lable0 = new JButton(ii);
			jsp = new JScrollPane(lable0);
			gamePanel.add(jsp, c);
		}
		else if(jokalaria.equals("")){
			if(karta.getZenb()==(0)){
				ii = new ImageIcon("src/fitxategiak/kartaHutsa.jpg");
			}
			else{
				ii = new ImageIcon("src/fitxategiak/"+karta.getIzena()+jokalaria+".png");
			}
			lable0 = new JButton(ii);
			jsp = new JScrollPane(lable0);
			gamePanel.add(jsp, c);
		}
		
	}
	
	public void eguneraketa() {
		KartaZerrenda jKartak = TaulaKudeatzailea.getTaulaKudeatzailea().JokalariarenEskukoKartakLortu();
		KartaZerrenda oKartak = TaulaKudeatzailea.getTaulaKudeatzailea().OrdenagailuarenEskukoKartakLortu();
	}
	
	public void actionListener(int botoia) {
		//JOKALARIAREN TXANDA
		KartaZerrenda jKartak = TaulaKudeatzailea.getTaulaKudeatzailea().JokalariarenEskukoKartakLortu();

		Karta jkarta = jKartak.get(botoia);
//		 System.out.println("Jokalariak klik egindako karta: " + jkarta.getIzena());
//		Karta jkarta = new KanguroKarta();
		System.out.println(botoia);
		System.out.println("JOKOKO KARTAK");
		
		TaulaKudeatzailea.getTaulaKudeatzailea().jokatu(jkarta, 0);
		if(jkarta.getZenb()==2){ //loro kartak aukeratu behar du 
			if(TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartenTam()!=1){
				new LoroUI();
			}
		}
		else if(jkarta.getZenb()==3){ //kanguroak zenbat salto egin nahi dituen aukeratu behar du(1 edo 2)

			new KanguroUI();

		}
		else if(jkarta.getZenb()==5){
			new KamaleoiUI();
		}
		else{
			TaulaKudeatzailea.getTaulaKudeatzailea().animaladaEgin(jkarta);
			TaulaKudeatzailea.getTaulaKudeatzailea().animaladaErrekurtsiboakEgin();
		}


//		ImageIcon i = new ImageIcon("src/fitxategiak/"+jkarta.getIzena()+"Urdina.png");
//		JButton kartaBerria = new JButton(i);
//		gamePanel.add(kartaBerria);
		if(Tableroa.getTableroa().jokokoKartakBeteta()){
			TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartakBetetaSartuKanporatu();
		}
		if(TaulaKudeatzailea.getTaulaKudeatzailea().jokoaAmaitu(0)){
			new IrabaziUI();
		}
		
		TaulaKudeatzailea.getTaulaKudeatzailea().ordenagailuarenTxanda();
		
		if(Tableroa.getTableroa().jokokoKartakBeteta()){
			TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartakBetetaSartuKanporatu();
		}
		if(TaulaKudeatzailea.getTaulaKudeatzailea().jokoaAmaitu(1)){
			new GalduUI();
		}
		TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu(jkarta);

		
		
		//ORDENAGAILUAREN TXANDA
		KartaZerrenda oKartak = TaulaKudeatzailea.getTaulaKudeatzailea().OrdenagailuarenEskukoKartakLortu();

		Karta okarta = oKartak.get(1);
		System.out.println("Ordenagailuak aukeratutako karta: " + okarta.getIzena());


		System.out.println("JOKOKO KARTAK");


//		TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu(okarta, 1);
	}
}