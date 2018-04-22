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

import logika.Jokalari;
import logika.Karta;
import logika.KartaZerrenda;
import logika.Tableroa;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

public class Taula extends JFrame implements Observer{
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
	
	private Taula() {
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
		ImageIcon ii;
		GridBagConstraints c = new GridBagConstraints();
		JButton lable;
		JScrollPane jsp;
		if(jokalaria.equals("Urdina")){
			ii = new ImageIcon("src/fitxategiak/karta.png");
			lable = new JButton(ii);
			jsp = new JScrollPane(lable);
			userPanel.add(jsp, c);
		}else{
			ii = new ImageIcon("src/fitxategiak/karta.png");
			lable = new JButton(ii);
			jsp = new JScrollPane(lable);
			computerPanel.add(jsp, c);
		}
	}
	public void gehituKarta(String jokalaria, Karta karta){
		ImageIcon ii;
		GridBagConstraints c = new GridBagConstraints();
		JButton lable;
		JScrollPane jsp;
	
		if(jokalaria.equals("taberna.png") || jokalaria.equals("zakarrontzia.png") ){
			ii = new ImageIcon("src/fitxategiak/"+jokalaria);
			lable = new JButton(ii);
			jsp = new JScrollPane(lable);
			computerPanel.add(jsp, c);
		}else if(jokalaria.equals("Urdina")){
			ii = new ImageIcon("src/fitxategiak/"+karta.getIzena()+jokalaria+".png");
			lable = new JButton(ii);
			
			lable.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					KartaZerrenda kZer = TaulaKudeatzailea.getTaulaKudeatzailea().eskukoKartakLortu();
				
					 Karta karta = kZer.get(0);//0 jokalariak klik egiten duen kartaren posizioagaitik aldatu
					 System.out.println("klik egindako karta: " + karta.getIzena());
					 TaulaKudeatzailea.getTaulaKudeatzailea().jokatu(karta,0);
					 System.out.println("Karta bota da");
					 
					 TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
					 
//					 karta.animaladaEgin();//ANIMALADA EGIN 
					 
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
			jsp = new JScrollPane(lable);
			userPanel.add(jsp, c);
		}else if(jokalaria.equals("Berdea")){
			ii = new ImageIcon("src/fitxategiak/karta.png");
			lable = new JButton(ii);
			
			jsp = new JScrollPane(lable);
			computerPanel.add(jsp, c);
		}else if(jokalaria.equals("kartaHutsa.jpg")){
			ii = new ImageIcon("src/fitxategiak/kartaHutsa.jpg");
			lable = new JButton(ii);
			jsp = new JScrollPane(lable);
			gamePanel.add(jsp, c);
		}
		else if(jokalaria.equals("")){
			if(karta.equals(null)){
				ii = new ImageIcon("src/fitxategiak/kartaHutsa.jpg");
			}
			else{
				ii = new ImageIcon("src/fitxategiak/"+karta.getIzena()+jokalaria+".png");
			}
			lable = new JButton(ii);
			jsp = new JScrollPane(lable);
			gamePanel.add(jsp, c);
		}
		
	}

	
//	public void eskukoKartakPantailaratu(JPanel panela){
//		JButton lable1 = null;
//		JButton lable2 = null;
//		JButton lable3 = null;
//		JButton lable4 = null;
//		ImageIcon ii = null;
//		String jokalaria = "Berdea";
//		GridBagConstraints c = new GridBagConstraints();
//		JScrollPane jsp;
//		List<Integer> eskukoKartak = TaulaKudeatzailea.getTaulaKudeatzailea().eskukoKartakKargatu();
//		for(int i =1; i<=4; i++){
//			if (i ==1){
//				Integer karta = eskukoKartak.get(0);
//				if (karta == 1) {
//					ii = new ImageIcon("src/fitxategiak/mofeta" + jokalaria + ".png");		
//				} else if (karta == 2) {
//					ii = new ImageIcon("src/fitxategiak/loro" + jokalaria + ".png");
//				
//				} else if (karta == 3) {
//					ii = new ImageIcon("src/fitxategiak/kanguro" + jokalaria + ".png");
//				
//				} else if (karta == 4) {
//					ii = new ImageIcon("src/fitxategiak/tximino" + jokalaria + ".png");
//				
//				} else if (karta == 5) {
//					ii = new ImageIcon("src/fitxategiak/kamaleoi" + jokalaria + ".png");
//					
//				} else if (karta == 6) {
//					ii = new ImageIcon("src/fitxategiak/foka" + jokalaria + ".png");
//				
//				} else if (karta == 7) {
//					ii = new ImageIcon("src/fitxategiak/zebra" + jokalaria + ".png");
//					
//				} else if (karta == 8) {
//					ii = new ImageIcon("src/fitxategiak/jirafa" + jokalaria + ".png");
//				
//				} else if (karta == 9) {
//					ii = new ImageIcon("src/fitxategiak/suge" + jokalaria + ".png");
//				
//				} else if (karta == 10) {
//					ii = new ImageIcon("src/fitxategiak/krokodilo" + jokalaria + ".png");
//					
//				} else if (karta == 11) {
//					ii = new ImageIcon("src/fitxategiak/hipopotamo" + jokalaria + ".png");
//					
//				} else if (karta == 12) {
//					ii = new ImageIcon("src/fitxategiak/lehoi" + jokalaria + ".png");
//					
//				}
//				lable1 = new JButton(ii);
//				jsp = new JScrollPane(lable1);
//				panela.add(jsp, c);
//				
//		
//					}
//			else if (i ==2){
//				Integer karta = eskukoKartak.get(1);
//				if (karta == 1) {
//					ii = new ImageIcon("src/fitxategiak/mofeta" + jokalaria + ".png");		
//				} else if (karta == 2) {
//					ii = new ImageIcon("src/fitxategiak/loro" + jokalaria + ".png");
//				
//				} else if (karta == 3) {
//					ii = new ImageIcon("src/fitxategiak/kanguro" + jokalaria + ".png");
//				
//				} else if (karta == 4) {
//					ii = new ImageIcon("src/fitxategiak/tximino" + jokalaria + ".png");
//				
//				} else if (karta == 5) {
//					ii = new ImageIcon("src/fitxategiak/kamaleoi" + jokalaria + ".png");
//					
//				} else if (karta == 6) {
//					ii = new ImageIcon("src/fitxategiak/foka" + jokalaria + ".png");
//				
//				} else if (karta == 7) {
//					ii = new ImageIcon("src/fitxategiak/zebra" + jokalaria + ".png");
//					
//				} else if (karta == 8) {
//					ii = new ImageIcon("src/fitxategiak/jirafa" + jokalaria + ".png");
//				
//				} else if (karta == 9) {
//					ii = new ImageIcon("src/fitxategiak/suge" + jokalaria + ".png");
//				
//				} else if (karta == 10) {
//					ii = new ImageIcon("src/fitxategiak/krokodilo" + jokalaria + ".png");
//					
//				} else if (karta == 11) {
//					ii = new ImageIcon("src/fitxategiak/hipopotamo" + jokalaria + ".png");
//					
//				} else {
//					ii = new ImageIcon("src/fitxategiak/lehoi" + jokalaria + ".png");
//					
//				}
//				lable2 = new JButton(ii);
//				jsp = new JScrollPane(lable2);
//				panela.add(jsp, c);
//			}
//			else if (i ==3){
//				Integer karta = eskukoKartak.get(2);
//				if (karta == 1) {
//					ii = new ImageIcon("src/fitxategiak/mofeta" + jokalaria + ".png");		
//				} else if (karta == 2) {
//					ii = new ImageIcon("src/fitxategiak/loro" + jokalaria + ".png");
//				
//				} else if (karta == 3) {
//					ii = new ImageIcon("src/fitxategiak/kanguro" + jokalaria + ".png");
//				
//				} else if (karta == 4) {
//					ii = new ImageIcon("src/fitxategiak/tximino" + jokalaria + ".png");
//				
//				} else if (karta == 5) {
//					ii = new ImageIcon("src/fitxategiak/kamaleoi" + jokalaria + ".png");
//					
//				} else if (karta == 6) {
//					ii = new ImageIcon("src/fitxategiak/foka" + jokalaria + ".png");
//				
//				} else if (karta == 7) {
//					ii = new ImageIcon("src/fitxategiak/zebra" + jokalaria + ".png");
//					
//				} else if (karta == 8) {
//					ii = new ImageIcon("src/fitxategiak/jirafa" + jokalaria + ".png");
//				
//				} else if (karta == 9) {
//					ii = new ImageIcon("src/fitxategiak/suge" + jokalaria + ".png");
//				
//				} else if (karta == 10) {
//					ii = new ImageIcon("src/fitxategiak/krokodilo" + jokalaria + ".png");
//					
//				} else if (karta == 11) {
//					ii = new ImageIcon("src/fitxategiak/hipopotamo" + jokalaria + ".png");
//					
//				} else if (karta == 12) {
//					ii = new ImageIcon("src/fitxategiak/lehoi" + jokalaria + ".png");
//					
//				}
//				lable3 = new JButton(ii);
//				jsp = new JScrollPane(lable3);
//				panela.add(jsp, c);
//				
//			}
//				else if (i ==4){
//				Integer karta = eskukoKartak.get(3);
//				if (karta == 1) {
//					ii = new ImageIcon("src/fitxategiak/mofeta" + jokalaria + ".png");		
//				} else if (karta == 2) {
//					ii = new ImageIcon("src/fitxategiak/loro" + jokalaria + ".png");
//				
//				} else if (karta == 3) {
//					ii = new ImageIcon("src/fitxategiak/kanguro" + jokalaria + ".png");
//				
//				} else if (karta == 4) {
//					ii = new ImageIcon("src/fitxategiak/tximino" + jokalaria + ".png");
//				
//				} else if (karta == 5) {
//					ii = new ImageIcon("src/fitxategiak/kamaleoi" + jokalaria + ".png");
//					
//				} else if (karta == 6) {
//					ii = new ImageIcon("src/fitxategiak/foka" + jokalaria + ".png");
//				
//				} else if (karta == 7) {
//					ii = new ImageIcon("src/fitxategiak/zebra" + jokalaria + ".png");
//					
//				} else if (karta == 8) {
//					ii = new ImageIcon("src/fitxategiak/jirafa" + jokalaria + ".png");
//				
//				} else if (karta == 9) {
//					ii = new ImageIcon("src/fitxategiak/suge" + jokalaria + ".png");
//				
//				} else if (karta == 10) {
//					ii = new ImageIcon("src/fitxategiak/krokodilo" + jokalaria + ".png");
//					
//				} else if (karta == 11) {
//					ii = new ImageIcon("src/fitxategiak/hipopotamo" + jokalaria + ".png");
//					
//				} else if (karta == 12) {
//					ii = new ImageIcon("src/fitxategiak/lehoi" + jokalaria + ".png");
//					
//				}
//				lable4 = new JButton(ii);
//				jsp = new JScrollPane(lable4);
//				panela.add(jsp, c);
//				
//			}
//			lable1.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					
//				
//					 Karta karta = TaulaKudeatzailea.getTaulaKudeatzailea().getKarta(0);
//					 TaulaKudeatzailea.getTaulaKudeatzailea().kartaBota(karta);
//			
//					 karta.animaladaEgin();//ANIMALADA EGIN 
//					 
//					 //ANIMALADA ERREKURTSIBOAK EGIN
//					 if(TaulaKudeatzailea.getTaulaKudeatzailea().ilaraBeteta()){ //Lehenengo biak tabernan sartu eta azkena kanporatu
//						 TaulaKudeatzailea.getTaulaKudeatzailea().lehenengoBiakTabernanSartu();
//						 TaulaKudeatzailea.getTaulaKudeatzailea().azkenaKanporatu();
//					 }
//					 Karta mazokoAzkena = TaulaKudeatzailea.getTaulaKudeatzailea().mazotikKartaHartu();
//				
//					 //GRAFIKA EGUNERATU
//				
//				
//				//ORDENAGAILUAREN TXANDA
//				 
//				}
//	});
//			lable2.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					
//				
//					 Karta karta = TaulaKudeatzailea.getTaulaKudeatzailea().getKarta(1);
//					 TaulaKudeatzailea.getTaulaKudeatzailea().kartaBota(karta);
//			
//					 karta.animaladaEgin(); //ANIMALADA EGIN 
//					 
//					 //ANIMALADA ERREKURTSIBOAK EGIN
//					 
//					 if(TaulaKudeatzailea.getTaulaKudeatzailea().ilaraBeteta()){
//						 TaulaKudeatzailea.getTaulaKudeatzailea().lehenengoBiakTabernanSartu();
//						 TaulaKudeatzailea.getTaulaKudeatzailea().azkenaKanporatu();
//					 }
//					 Karta mazokoAzkena = TaulaKudeatzailea.getTaulaKudeatzailea().mazotikKartaHartu();
//				
//				
//				
//				
//				//ORDENAGAILUAREN TXANDA
//				 
//				}
//	});
//			lable3.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					
//					 Karta karta = TaulaKudeatzailea.getTaulaKudeatzailea().getKarta(2);
//					 TaulaKudeatzailea.getTaulaKudeatzailea().kartaBota(karta);
//					 
//					 karta.animaladaEgin();//ANIMALADA EGIN 
//					 
//					 //ANIMALADA ERREKURTSIBOAK EGIN
//					 if(TaulaKudeatzailea.getTaulaKudeatzailea().ilaraBeteta()){
//						 TaulaKudeatzailea.getTaulaKudeatzailea().lehenengoBiakTabernanSartu();
//						 TaulaKudeatzailea.getTaulaKudeatzailea().azkenaKanporatu();
//					 }
//					 Karta mazokoAzkena = TaulaKudeatzailea.getTaulaKudeatzailea().mazotikKartaHartu();
//				
//				
//				
//				
//				//ORDENAGAILUAREN TXANDA
//				 
//				}
//	});
//			lable4.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					
//					 Karta karta = TaulaKudeatzailea.getTaulaKudeatzailea().getKarta(3);
//					 TaulaKudeatzailea.getTaulaKudeatzailea().kartaBota(karta);
//			
//			
//					 karta.animaladaEgin(); //ANIMALADA EGIN 
//					 
//			//ANIMALARA ERREKURTSIBOAK EGIN
//					 
//					 if(TaulaKudeatzailea.getTaulaKudeatzailea().ilaraBeteta()){//ILARA BETETA DAGOEN BEGIRATU
//						 TaulaKudeatzailea.getTaulaKudeatzailea().lehenengoBiakTabernanSartu();
//						 TaulaKudeatzailea.getTaulaKudeatzailea().azkenaKanporatu();
//					 }
//					 
//					 
//					 Karta mazokoAzkena = TaulaKudeatzailea.getTaulaKudeatzailea().mazotikKartaHartu();
//				
//				
//				
//				//ORDENAGAILUAREN TXANDA
//				 
//				}
//	});
//		}
//	}

//	public void jokokoKartakKargatu(JPanel panela) {
//		ImageIcon ii;
//		GridBagConstraints c = new GridBagConstraints();
//		JButton lable;
//		JScrollPane jsp;
//		ii = new ImageIcon("src/fitxategiak/zerrendaHasiera.png");
//		lable = new JButton(ii);
//		jsp = new JScrollPane(lable);
//		panela.add(jsp, c);
//		KartaZerrenda kartak= Tableroa.getTableroa().getJokokoKartak();
//		for (int i = 0; i<kartak.tamaina(); i++) {
//			ii = kartak.get(i).getIrudia();
//			lable = new JButton(ii);
//			jsp = new JScrollPane(lable);
//			panela.add(jsp, c);
//		}
//		ii = new ImageIcon("src/fitxategiak/zerrendaAmaiera.png");
//		lable = new JButton(ii);
//		jsp = new JScrollPane(lable);
//		panela.add(jsp, c);
//		
//	}
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	

}
