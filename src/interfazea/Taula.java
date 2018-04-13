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


import logika.Karta;
import logika.KartaZerrenda;
import logika.Tableroa;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

public class Taula extends JFrame {
	private BorderLayout eskema;
	private Container edukiontzia;
	private GridBagConstraints mugak;

	private JMenuBar menuBarra = new JMenuBar();
	private JMenu hasi = new JMenu();
	private JMenu laguntza = new JMenu();
	private JTextField[] kartak = new JTextField[4];
	private JPanel computerPanel = new JPanel(new GridBagLayout());
	private JPanel gamePanel = new JPanel(new GridBagLayout());
	private JPanel userPanel = new JPanel(new GridBagLayout());
	private JPanel trashPanel = new JPanel(new GridBagLayout());
	private JPanel tabernPanel = new JPanel(new GridBagLayout());

	public static void main(String[] args) {

		TaulaKudeatzailea.getTaulaKudeatzailea().hasieratu();
		
	}

	public static void bistaratu() {
		Taula taula = new Taula();
		taula.setTitle("Bar Bestial");
		taula.setVisible(true);
		taula.setSize(1200, 700);
		taula.setMaximumSize(new Dimension(1000, 700));
		taula.pack();
		taula.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public Taula() {
		taulaHasieratu();
	}
	
	public void taulaHasieratu(){
		edukiontzia = getContentPane();
		eskema = new BorderLayout();
		edukiontzia.setLayout(eskema);
//		Tableroa.getTableroa().jokokoKartakHasieratu();
		// Menua
		this.setJMenuBar(menuBarra);
		this.setTitle("Bar Bestial");
		hasi.setText("Hasi");
		laguntza.setText("laguntza");
		menuBarra.add(hasi);
		menuBarra.add(laguntza);
//		eskukoKartakKargatu("Berdea", this.computerPanel);
//		edukiontzia.add(computerPanel,BorderLayout.NORTH);
//		jokokoKartakKargatu(gamePanel);
//		edukiontzia.add(gamePanel,BorderLayout.CENTER);
		eskukoKartakPantailaratu(this.userPanel);
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
	public void gehituKarta(String jokalaria, Karta karta){
		ImageIcon ii;
		GridBagConstraints c = new GridBagConstraints();
		JButton lable;
		JScrollPane jsp;
		if(jokalaria.equals("taberna.png") || jokalaria.equals("zakarrontzia.png") || jokalaria.equals("kartaHutsa.jpg")){
			ii = new ImageIcon("src/fitxategiak/"+jokalaria);
			lable = new JButton(ii);
			jsp = new JScrollPane(lable);
			computerPanel.add(jsp, c);
		}else if(jokalaria.equals("Urdina")|| jokalaria.equals("karta.png")){
			ii = new ImageIcon("src/fitxategiak/"+karta.getIzena()+jokalaria);
			lable = new JButton(ii);
			jsp = new JScrollPane(lable);
			userPanel.add(jsp, c);
		}else if(jokalaria.equals("Berdea") || jokalaria.equals("karta.png")){
			ii = new ImageIcon("src/fitxategiak/"+karta.getIzena()+jokalaria);
			lable = new JButton(ii);
			jsp = new JScrollPane(lable);
			computerPanel.add(jsp, c);
		}
	}

//	public void eskukoKartakKargatu(String jokalaria, JPanel panela) {
//		ImageIcon ii;
//		GridBagConstraints c = new GridBagConstraints();
//		JButton lable;
//		JScrollPane jsp;
//		if (jokalaria.equals("Berdea")) {
//			ii = new ImageIcon("src/fitxategiak/taberna.png");
//			lable = new JButton(ii);
//			jsp = new JScrollPane(lable);
//			panela.add(jsp, c);
//		}
//		boolean nahikoa = false;
//		boolean badago = false;
//		int kont = 0;
//		List<Integer> kartaZerrenda = new ArrayList<Integer>();
//
//		while (!nahikoa) {
//			badago = false;
//			Random random = new Random();
//			int karta = random.nextInt(12 - 1 + 1) + 1;
//			for (int i = 0; i < kartaZerrenda.size(); i++) {
//				if (kartaZerrenda.get(i) == karta) {
//					badago = true;
//					break;
//				}
//			}
//			if (!badago) {
//				kartaZerrenda.add(karta);
//				if (kartaZerrenda.size() == 4) {
//					nahikoa = true;
//				}
//				if (jokalaria.equals("Berdea")) {
//					ii = new ImageIcon("src/fitxategiak/karta.png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//				} else if (karta == 1) {
//					ii = new ImageIcon("src/fitxategiak/mofeta" + jokalaria + ".png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//					// this.getContentPane().add(jsp);
//				} else if (karta == 2) {
//					ii = new ImageIcon("src/fitxategiak/loro" + jokalaria + ".png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//				} else if (karta == 3) {
//					ii = new ImageIcon("src/fitxategiak/kanguro" + jokalaria + ".png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//				} else if (karta == 4) {
//					ii = new ImageIcon("src/fitxategiak/tximino" + jokalaria + ".png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//				} else if (karta == 5) {
//					ii = new ImageIcon("src/fitxategiak/kamaleoi" + jokalaria + ".png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//				} else if (karta == 6) {
//					ii = new ImageIcon("src/fitxategiak/foka" + jokalaria + ".png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//				} else if (karta == 7) {
//					ii = new ImageIcon("src/fitxategiak/zebra" + jokalaria + ".png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//				} else if (karta == 8) {
//					ii = new ImageIcon("src/fitxategiak/jirafa" + jokalaria + ".png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//				} else if (karta == 9) {
//					ii = new ImageIcon("src/fitxategiak/suge" + jokalaria + ".png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//				} else if (karta == 10) {
//					ii = new ImageIcon("src/fitxategiak/krokodilo" + jokalaria + ".png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//				} else if (karta == 11) {
//					ii = new ImageIcon("src/fitxategiak/hipopotamo" + jokalaria + ".png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//				} else if (karta == 12) {
//					ii = new ImageIcon("src/fitxategiak/lehoi" + jokalaria + ".png");
//					lable = new JButton(ii);
//					jsp = new JScrollPane(lable);
//					panela.add(jsp, c);
//				}
//			}
//
//		}
//		if (jokalaria.equals("Urdina")) {
//			ii = new ImageIcon("src/fitxategiak/karta.png");
//			lable = new JButton(ii);
//			jsp = new JScrollPane(lable);
//			panela.add(jsp, c);
//			
//		}
//		if (jokalaria.equals("Berdea")) {
//			ii = new ImageIcon("src/fitxategiak/zakarrontzia.png");
//			lable = new JButton(ii);
//			jsp = new JScrollPane(lable);
//			panela.add(jsp, c);
//		}
//		
//		lable.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				 if(TaulaKudeatzaile.ilaraBeteta()){
//				 //mezu bat aterako da ilara beteta dagoela esaten
//			 }
//			 else{
//				 TaulaKudeatzailea.kartaBota(karta);
		// hemen grafika aldatu karten irudiak jokalaritik kendu eta mahaian jarriz (GRAFIKAN)
		//ANIMALADA EGIN 
			//mazoko azten karta hartu (AUTOMATIKOKI)
			//TaulaKudeatzailea.mazotikKartaHartu();
			//grafikan karta eguneratu
			
			
			//ORDENAGAILUAREN TXANDA
//			 }
//			}
//});
//
//	}
	
	public void eskukoKartakPantailaratu(JPanel panela){
		JButton lable1 = null;
		JButton lable2 = null;
		JButton lable3 = null;
		JButton lable4 = null;
		ImageIcon ii = null;
		String jokalaria = "Berdea";
		GridBagConstraints c = new GridBagConstraints();
		JScrollPane jsp;
		List<Integer> eskukoKartak = TaulaKudeatzailea.getTaulaKudeatzailea().eskukoKartakKargatu();
		for(int i =1; i<=4; i++){
			if (i ==1){
				Integer karta = eskukoKartak.get(0);
				if (karta == 1) {
					ii = new ImageIcon("src/fitxategiak/mofeta" + jokalaria + ".png");		
				} else if (karta == 2) {
					ii = new ImageIcon("src/fitxategiak/loro" + jokalaria + ".png");
				
				} else if (karta == 3) {
					ii = new ImageIcon("src/fitxategiak/kanguro" + jokalaria + ".png");
				
				} else if (karta == 4) {
					ii = new ImageIcon("src/fitxategiak/tximino" + jokalaria + ".png");
				
				} else if (karta == 5) {
					ii = new ImageIcon("src/fitxategiak/kamaleoi" + jokalaria + ".png");
					
				} else if (karta == 6) {
					ii = new ImageIcon("src/fitxategiak/foka" + jokalaria + ".png");
				
				} else if (karta == 7) {
					ii = new ImageIcon("src/fitxategiak/zebra" + jokalaria + ".png");
					
				} else if (karta == 8) {
					ii = new ImageIcon("src/fitxategiak/jirafa" + jokalaria + ".png");
				
				} else if (karta == 9) {
					ii = new ImageIcon("src/fitxategiak/suge" + jokalaria + ".png");
				
				} else if (karta == 10) {
					ii = new ImageIcon("src/fitxategiak/krokodilo" + jokalaria + ".png");
					
				} else if (karta == 11) {
					ii = new ImageIcon("src/fitxategiak/hipopotamo" + jokalaria + ".png");
					
				} else if (karta == 12) {
					ii = new ImageIcon("src/fitxategiak/lehoi" + jokalaria + ".png");
					
				}
				lable1 = new JButton(ii);
				jsp = new JScrollPane(lable1);
				panela.add(jsp, c);
				
		
					}
			else if (i ==2){
				Integer karta = eskukoKartak.get(1);
				if (karta == 1) {
					ii = new ImageIcon("src/fitxategiak/mofeta" + jokalaria + ".png");		
				} else if (karta == 2) {
					ii = new ImageIcon("src/fitxategiak/loro" + jokalaria + ".png");
				
				} else if (karta == 3) {
					ii = new ImageIcon("src/fitxategiak/kanguro" + jokalaria + ".png");
				
				} else if (karta == 4) {
					ii = new ImageIcon("src/fitxategiak/tximino" + jokalaria + ".png");
				
				} else if (karta == 5) {
					ii = new ImageIcon("src/fitxategiak/kamaleoi" + jokalaria + ".png");
					
				} else if (karta == 6) {
					ii = new ImageIcon("src/fitxategiak/foka" + jokalaria + ".png");
				
				} else if (karta == 7) {
					ii = new ImageIcon("src/fitxategiak/zebra" + jokalaria + ".png");
					
				} else if (karta == 8) {
					ii = new ImageIcon("src/fitxategiak/jirafa" + jokalaria + ".png");
				
				} else if (karta == 9) {
					ii = new ImageIcon("src/fitxategiak/suge" + jokalaria + ".png");
				
				} else if (karta == 10) {
					ii = new ImageIcon("src/fitxategiak/krokodilo" + jokalaria + ".png");
					
				} else if (karta == 11) {
					ii = new ImageIcon("src/fitxategiak/hipopotamo" + jokalaria + ".png");
					
				} else {
					ii = new ImageIcon("src/fitxategiak/lehoi" + jokalaria + ".png");
					
				}
				lable2 = new JButton(ii);
				jsp = new JScrollPane(lable2);
				panela.add(jsp, c);
			}
			else if (i ==3){
				Integer karta = eskukoKartak.get(2);
				if (karta == 1) {
					ii = new ImageIcon("src/fitxategiak/mofeta" + jokalaria + ".png");		
				} else if (karta == 2) {
					ii = new ImageIcon("src/fitxategiak/loro" + jokalaria + ".png");
				
				} else if (karta == 3) {
					ii = new ImageIcon("src/fitxategiak/kanguro" + jokalaria + ".png");
				
				} else if (karta == 4) {
					ii = new ImageIcon("src/fitxategiak/tximino" + jokalaria + ".png");
				
				} else if (karta == 5) {
					ii = new ImageIcon("src/fitxategiak/kamaleoi" + jokalaria + ".png");
					
				} else if (karta == 6) {
					ii = new ImageIcon("src/fitxategiak/foka" + jokalaria + ".png");
				
				} else if (karta == 7) {
					ii = new ImageIcon("src/fitxategiak/zebra" + jokalaria + ".png");
					
				} else if (karta == 8) {
					ii = new ImageIcon("src/fitxategiak/jirafa" + jokalaria + ".png");
				
				} else if (karta == 9) {
					ii = new ImageIcon("src/fitxategiak/suge" + jokalaria + ".png");
				
				} else if (karta == 10) {
					ii = new ImageIcon("src/fitxategiak/krokodilo" + jokalaria + ".png");
					
				} else if (karta == 11) {
					ii = new ImageIcon("src/fitxategiak/hipopotamo" + jokalaria + ".png");
					
				} else if (karta == 12) {
					ii = new ImageIcon("src/fitxategiak/lehoi" + jokalaria + ".png");
					
				}
				lable3 = new JButton(ii);
				jsp = new JScrollPane(lable3);
				panela.add(jsp, c);
				
			}
				else if (i ==4){
				Integer karta = eskukoKartak.get(3);
				if (karta == 1) {
					ii = new ImageIcon("src/fitxategiak/mofeta" + jokalaria + ".png");		
				} else if (karta == 2) {
					ii = new ImageIcon("src/fitxategiak/loro" + jokalaria + ".png");
				
				} else if (karta == 3) {
					ii = new ImageIcon("src/fitxategiak/kanguro" + jokalaria + ".png");
				
				} else if (karta == 4) {
					ii = new ImageIcon("src/fitxategiak/tximino" + jokalaria + ".png");
				
				} else if (karta == 5) {
					ii = new ImageIcon("src/fitxategiak/kamaleoi" + jokalaria + ".png");
					
				} else if (karta == 6) {
					ii = new ImageIcon("src/fitxategiak/foka" + jokalaria + ".png");
				
				} else if (karta == 7) {
					ii = new ImageIcon("src/fitxategiak/zebra" + jokalaria + ".png");
					
				} else if (karta == 8) {
					ii = new ImageIcon("src/fitxategiak/jirafa" + jokalaria + ".png");
				
				} else if (karta == 9) {
					ii = new ImageIcon("src/fitxategiak/suge" + jokalaria + ".png");
				
				} else if (karta == 10) {
					ii = new ImageIcon("src/fitxategiak/krokodilo" + jokalaria + ".png");
					
				} else if (karta == 11) {
					ii = new ImageIcon("src/fitxategiak/hipopotamo" + jokalaria + ".png");
					
				} else if (karta == 12) {
					ii = new ImageIcon("src/fitxategiak/lehoi" + jokalaria + ".png");
					
				}
				lable4 = new JButton(ii);
				jsp = new JScrollPane(lable4);
				panela.add(jsp, c);
				
			}
			lable1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
				
					 Karta karta = TaulaKudeatzailea.getTaulaKudeatzailea().getKarta(0);
					 TaulaKudeatzailea.getTaulaKudeatzailea().kartaBota(karta);
			
					 karta.animaladaEgin();//ANIMALADA EGIN 
					 
					 //ANIMALADA ERREKURTSIBOAK EGIN
					 if(TaulaKudeatzailea.getTaulaKudeatzailea().ilaraBeteta()){ //Lehenengo biak tabernan sartu eta azkena kanporatu
						 TaulaKudeatzailea.getTaulaKudeatzailea().lehenengoBiakTabernanSartu();
						 TaulaKudeatzailea.getTaulaKudeatzailea().azkenaKanporatu();
					 }
					 Karta mazokoAzkena = TaulaKudeatzailea.getTaulaKudeatzailea().mazotikKartaHartu();
				
					 //GRAFIKA EGUNERATU
				
				
				//ORDENAGAILUAREN TXANDA
				 
				}
	});
			lable2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
				
					 Karta karta = TaulaKudeatzailea.getTaulaKudeatzailea().getKarta(1);
					 TaulaKudeatzailea.getTaulaKudeatzailea().kartaBota(karta);
			
					 karta.animaladaEgin(); //ANIMALADA EGIN 
					 
					 //ANIMALADA ERREKURTSIBOAK EGIN
					 
					 if(TaulaKudeatzailea.getTaulaKudeatzailea().ilaraBeteta()){
						 TaulaKudeatzailea.getTaulaKudeatzailea().lehenengoBiakTabernanSartu();
						 TaulaKudeatzailea.getTaulaKudeatzailea().azkenaKanporatu();
					 }
					 Karta mazokoAzkena = TaulaKudeatzailea.getTaulaKudeatzailea().mazotikKartaHartu();
				
				
				
				
				//ORDENAGAILUAREN TXANDA
				 
				}
	});
			lable3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					 Karta karta = TaulaKudeatzailea.getTaulaKudeatzailea().getKarta(2);
					 TaulaKudeatzailea.getTaulaKudeatzailea().kartaBota(karta);
					 
					 karta.animaladaEgin();//ANIMALADA EGIN 
					 
					 //ANIMALADA ERREKURTSIBOAK EGIN
					 if(TaulaKudeatzailea.getTaulaKudeatzailea().ilaraBeteta()){
						 TaulaKudeatzailea.getTaulaKudeatzailea().lehenengoBiakTabernanSartu();
						 TaulaKudeatzailea.getTaulaKudeatzailea().azkenaKanporatu();
					 }
					 Karta mazokoAzkena = TaulaKudeatzailea.getTaulaKudeatzailea().mazotikKartaHartu();
				
				
				
				
				//ORDENAGAILUAREN TXANDA
				 
				}
	});
			lable4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					 Karta karta = TaulaKudeatzailea.getTaulaKudeatzailea().getKarta(3);
					 TaulaKudeatzailea.getTaulaKudeatzailea().kartaBota(karta);
			
			
					 karta.animaladaEgin(); //ANIMALADA EGIN 
					 
			//ANIMALARA ERREKURTSIBOAK EGIN
					 
					 if(TaulaKudeatzailea.getTaulaKudeatzailea().ilaraBeteta()){//ILARA BETETA DAGOEN BEGIRATU
						 TaulaKudeatzailea.getTaulaKudeatzailea().lehenengoBiakTabernanSartu();
						 TaulaKudeatzailea.getTaulaKudeatzailea().azkenaKanporatu();
					 }
					 
					 
					 Karta mazokoAzkena = TaulaKudeatzailea.getTaulaKudeatzailea().mazotikKartaHartu();
				
				
				
				//ORDENAGAILUAREN TXANDA
				 
				}
	});
		}
	}

	public void jokokoKartakKargatu(JPanel panela) {
		ImageIcon ii;
		GridBagConstraints c = new GridBagConstraints();
		JButton lable;
		JScrollPane jsp;
		ii = new ImageIcon("src/fitxategiak/zerrendaHasiera.png");
		lable = new JButton(ii);
		jsp = new JScrollPane(lable);
		panela.add(jsp, c);
		KartaZerrenda kartak= Tableroa.getTableroa().getJokokoKartak();
		for (int i = 0; i<kartak.tamaina(); i++) {
			ii = kartak.get(i).getIrudia();
			lable = new JButton(ii);
			jsp = new JScrollPane(lable);
			panela.add(jsp, c);
		}
		ii = new ImageIcon("src/fitxategiak/zerrendaAmaiera.png");
		lable = new JButton(ii);
		jsp = new JScrollPane(lable);
		panela.add(jsp, c);
		
	}
	

}
