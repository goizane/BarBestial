package interfazea;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import kudeatzaileak.PartidaKud;
import kudeatzaileak.TaulaKudeatzailea;
import logika.Jokalari;
import logika.Karta;
import logika.KartaZerrenda;
import logika.Tableroa;

public class Taula extends JFrame {
	
	// MENU AUKERAK
	JMenuBar menuBarra = new JMenuBar();
	JButton egunekoPartidak = new JButton();
	JButton historikoa = new JButton();
	JButton jokalariPartidak = new JButton();
	JLabel zureIzenaGoian = new JLabel();
	
	//KARTAK
	
	ImageIcon karta = new ImageIcon("src/fitxategiak/karta.png");
	ImageIcon kartaHutsa = new ImageIcon("src/fitxategiak/kartaHutsa.jpg");
	ImageIcon tabernaKarta = new ImageIcon("src/fitxategiak/taberna.png");
	ImageIcon kaleaKarta =new ImageIcon("src/fitxategiak/zakarrontzia.png");
	
	//IRUDI BERDEAK
	
	ImageIcon mofetaBerdea = new ImageIcon("src/fitxategiak/mofetaBerdea.png");
	ImageIcon loroBerdea = new ImageIcon("src/fitxategiak/loroBerdea.png");
	ImageIcon fokaBerdea = new ImageIcon("src/fitxategiak/fokaBerdea.png");
	ImageIcon sugeBerdea = new ImageIcon("src/fitxategiak/sugeBerdea.png");
	ImageIcon zebraBerdea = new ImageIcon("src/fitxategiak/zebraBerdea.png");
	ImageIcon lehoiBerdea = new ImageIcon("src/fitxategiak/lehoiBerdea.png");
	ImageIcon kanguroBerdea = new ImageIcon("src/fitxategiak/kanguroBerdea.png");
	ImageIcon jirafaBerdea = new ImageIcon("src/fitxategiak/jirafaBerdea.png");
	ImageIcon hipopotamoBerdea = new ImageIcon("src/fitxategiak/hipopotamoBerdea.png");
	ImageIcon tximinoBerdea = new ImageIcon("src/fitxategiak/tximinoBerdea.png");
	ImageIcon krokodiloBerdea = new ImageIcon("src/fitxategiak/krokodiloBerdea.png");
	ImageIcon kamaleoiBerdea = new ImageIcon("src/fitxategiak/kamaleoiBerdea.png");
	
	//IRUDI URDINAK
	
	ImageIcon mofetaUrdina = new ImageIcon("src/fitxategiak/mofetaUrdina.png");
	ImageIcon loroUrdina = new ImageIcon("src/fitxategiak/loroUrdina.png");
	ImageIcon fokaUrdina = new ImageIcon("src/fitxategiak/fokaUrdina.png");
	ImageIcon sugeUrdina = new ImageIcon("src/fitxategiak/sugeUrdina.png");
	ImageIcon zebraUrdina = new ImageIcon("src/fitxategiak/zebraUrdina.png");
	ImageIcon lehoiUrdina = new ImageIcon("src/fitxategiak/lehoiUrdina.png");
	ImageIcon kanguroUrdina = new ImageIcon("src/fitxategiak/kanguroUrdina.png");
	ImageIcon jirafaUrdina = new ImageIcon("src/fitxategiak/jirafaUrdina.png");
	ImageIcon hipopotamoUrdina = new ImageIcon("src/fitxategiak/hipopotamoUrdina.png");
	ImageIcon tximinoUrdina = new ImageIcon("src/fitxategiak/tximinoUrdina.png");
	ImageIcon krokodiloUrdina = new ImageIcon("src/fitxategiak/krokodiloUrdina.png");
	ImageIcon kamaleoiUrdina = new ImageIcon("src/fitxategiak/kamaleoiUrdina.png");
	
	
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
		
		// Menu barra panelan sartu
		egunekoPartidak.setText("	Ranking: Eguneko partidak!	");
		jokalariPartidak.setText("	Ranking: Zure partida onenak!	");
		historikoa.setText("	Ranking: Historikoki partida onenak!	");
		zureIzenaGoian.setText("	ZURE IZENA:  " + TaulaKudeatzailea.getTaulaKudeatzailea().getIzena() + "	");
		menuBarra.add(egunekoPartidak);
		menuBarra.add(jokalariPartidak);
		menuBarra.add(historikoa);
		menuBarra.add(zureIzenaGoian);
		setJMenuBar(menuBarra);
		
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
		setTitle("BAR BESTIAL");
		setSize(1200, 700);
		setMaximumSize(new Dimension(1000, 700));
		setPreferredSize(new Dimension(1000, 700));
		
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
			ImageIcon jokokoIrudia1 = irudiaEsleituJokokoKartei(z.get(0));
			jokokoKarta1.setIcon(jokokoIrudia1);
		}
		if(z.get(1).getZenb()==0){
			jokokoKarta2.setIcon(kartaHutsa);
		}
		else{
			ImageIcon jokokoIrudia2 = irudiaEsleituJokokoKartei(z.get(1));
			jokokoKarta2.setIcon(jokokoIrudia2);
		}
		if(z.get(2).getZenb()==0){
			jokokoKarta3.setIcon(kartaHutsa);
		}
		else{
			ImageIcon jokokoIrudia3 = irudiaEsleituJokokoKartei(z.get(2));
			jokokoKarta3.setIcon(jokokoIrudia3);
		}
		if(z.get(3).getZenb()==0){
			jokokoKarta4.setIcon(kartaHutsa);
		}
		else{
			ImageIcon jokokoIrudia4 =irudiaEsleituJokokoKartei(z.get(3));
			jokokoKarta4.setIcon(jokokoIrudia4);
		}
		if(z.get(4).getZenb()==0){
			jokokoKarta5.setIcon(kartaHutsa);
		}
		else{
			ImageIcon jokokoIrudia5 = irudiaEsleituJokokoKartei(z.get(4));
			jokokoKarta5.setIcon(jokokoIrudia5);
		}
		
	}
	
	public ImageIcon irudiaEsleituJokokoKartei(Karta k){
		
		if(k.getKolorea()=="Urdina"){
			if(k.getZenb()==1){
				return this.mofetaUrdina;
			}
			else if(k.getZenb()==2){
				return this.loroUrdina;
			}
			else if(k.getZenb()==3){
				return kanguroUrdina;
			}
			else if(k.getZenb()==4){
				return tximinoUrdina;
			}
			else if(k.getZenb()==5){
				return kamaleoiUrdina;
			}
			else if(k.getZenb()==6){
				return fokaUrdina;
			}
			else if(k.getZenb()==7){
				return zebraUrdina;
			}else if(k.getZenb()==8){
				return jirafaUrdina;
			}else if(k.getZenb()==9){
				return sugeUrdina;
			}else if(k.getZenb()==10){
				return krokodiloUrdina;
			}else if(k.getZenb()==11){
				return hipopotamoUrdina;
			}else {
				return lehoiUrdina;
			}
		}else if( k.getKolorea()=="Berdea"){
			if(k.getZenb()==1){
				return this.mofetaBerdea;
			}
			else if(k.getZenb()==2){
				return this.loroBerdea;
			}
			else if(k.getZenb()==3){
				return kanguroBerdea;
			}
			else if(k.getZenb()==4){
				return tximinoBerdea;
			}
			else if(k.getZenb()==5){
				return kamaleoiBerdea;
			}
			else if(k.getZenb()==6){
				return fokaBerdea;
			}
			else if(k.getZenb()==7){
				return zebraBerdea;
			}else if(k.getZenb()==8){
				return jirafaBerdea;
			}else if(k.getZenb()==9){
				return sugeBerdea;
			}else if(k.getZenb()==10){
				return krokodiloBerdea;
			}else if(k.getZenb()==11){
				return hipopotamoBerdea;
			}else {
				return lehoiBerdea;
			}
		}else{
			return null;
		}
		
		
	}
	
	public void pantailaratuJokalariKartak(){
		KartaZerrenda z = new KartaZerrenda();
		z= TaulaKudeatzailea.getTaulaKudeatzailea().JokalariarenEskukoKartakLortu();


		if (z.get(0).getZenb()==0) {
			jokalariKarta1.setIcon(kartaHutsa);
		}
		else {
			ImageIcon jokalariIrudia1 = irudiaEsleituJokokoKartei(z.get(0));
			jokalariKarta1.setIcon(jokalariIrudia1);
		}
		
		if (z.get(1).getZenb()==0) {
			jokalariKarta2.setIcon(kartaHutsa);
		}
		else {
			ImageIcon jokalariIrudia2 = irudiaEsleituJokokoKartei(z.get(1));
			jokalariKarta2.setIcon(jokalariIrudia2);
		}
		
		if (z.get(2).getZenb()==0) {
			jokalariKarta3.setIcon(kartaHutsa);
		}
		else {
			ImageIcon jokalariIrudia3 =irudiaEsleituJokokoKartei(z.get(2));
			jokalariKarta3.setIcon(jokalariIrudia3);
		}


		if ( z.tamaina()<4) {
			jokalariKarta4.setIcon(kartaHutsa);
		}
		else {
			ImageIcon jokalariIrudia4 = irudiaEsleituJokokoKartei(z.get(3));
			jokalariKarta4.setIcon(jokalariIrudia4);
		}

			jokalariMazoa.setIcon(karta);
			
			
			//ACTION LISTENER-AK
		
			
			jokalariKarta1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					akzioa(0);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("posizioa: 2");
			}
});
		
			jokalariKarta2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					try {
						akzioa(1);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("posizioa: 2");
				}
	});
			
			jokalariKarta3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					try {
						akzioa(2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("posizioa: 2");
				}
	});
			
			jokalariKarta4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					try {
						akzioa(3);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("posizioa: 2");
				}
	});
			
			
			// MenuBarra botoietako actionListener-ak Ranking-ak bistaratzeko
			
			egunekoPartidak.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					new taulaEgunekoPartidak.Taula();
				}
			});
			
			jokalariPartidak.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					new taulaJokalaria.Taula();
				}
			});
			
			historikoa.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					new taulaHistorikoa.Taula();
				}
			});
			
	}
	
	public void akzioa(int botoia) throws InterruptedException {
		//JOKALARIAREN TXANDA
		KartaZerrenda jKartak = TaulaKudeatzailea.getTaulaKudeatzailea().JokalariarenEskukoKartakLortu();
		for(int i = 0; i<jKartak.tamaina(); i++){
			System.out.println(" ----------------------> GRAFIKAN: " + jKartak.get(i).getIzena()+ "   " + jKartak.get(i).kolorea);
		}
		
		
		Karta jkarta = jKartak.get(botoia);

		System.out.println("_________________________________________________JOKALARIAK JOKATU:");
		TaulaKudeatzailea.getTaulaKudeatzailea().jokatu(jkarta, 0);
		
		if(jkarta.getZenb()==2 ){ //loro kartak aukeratu behar du 
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
			TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
		
			TaulaKudeatzailea.getTaulaKudeatzailea().animaladaErrekurtsiboakEgin();
			TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
		
			TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartakHustu();
			TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
	
			if(TaulaKudeatzailea.getTaulaKudeatzailea().amaitu()){
				System.out.println("____________________________________________________AMAITU IF-EAN SARTU DA");
				if(TaulaKudeatzailea.getTaulaKudeatzailea().pertsonaIrabazi()){
					new IrabaziUI();
					
					String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
					int puntuazioa = TaulaKudeatzailea.getTaulaKudeatzailea().getPuntuazioa();
					PartidaKud.getInstantzia().partidaGehitu(izena, puntuazioa);
				}	
				else if(TaulaKudeatzailea.getTaulaKudeatzailea().berdinketa()){
					new BerdinketaUI();
					String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
					int puntuazioa = TaulaKudeatzailea.getTaulaKudeatzailea().getPuntuazioa();
					PartidaKud.getInstantzia().partidaGehitu(izena, puntuazioa);
					System.out.println("_________________________________________________BERDINKETA");
				}else{
					new GalduUI();
					String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
					int puntuazioa = TaulaKudeatzailea.getTaulaKudeatzailea().getPuntuazioa();
					PartidaKud.getInstantzia().partidaGehitu(izena, puntuazioa);
				}

					}else{ 
							System.out.println("_________________________________________________ORDENAGAILUAK JOKATU:");
							TaulaKudeatzailea.getTaulaKudeatzailea().ordenagailuarenTxanda();
							TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
							if(TaulaKudeatzailea.getTaulaKudeatzailea().amaitu()){
								System.out.println("____________________________________________________AMAITU IF-EAN SARTU DA");
								if(TaulaKudeatzailea.getTaulaKudeatzailea().pertsonaIrabazi()){
									new IrabaziUI();
								String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
								int puntuazioa = TaulaKudeatzailea.getTaulaKudeatzailea().getPuntuazioa();
								PartidaKud.getInstantzia().partidaGehitu(izena, puntuazioa);
							}else if(TaulaKudeatzailea.getTaulaKudeatzailea().berdinketa()){
									new BerdinketaUI();
									System.out.println("_________________________________________________BERDINKETA");
									String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
									int puntuazioa = TaulaKudeatzailea.getTaulaKudeatzailea().getPuntuazioa();
									PartidaKud.getInstantzia().partidaGehitu(izena, puntuazioa);
				
								}else{
									new GalduUI();
									String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
									int puntuazioa = TaulaKudeatzailea.getTaulaKudeatzailea().getPuntuazioa();
									PartidaKud.getInstantzia().partidaGehitu(izena, puntuazioa);
								}
						}
			}
		}
	}
				
			
				
		
			

	
	public void ezabatuPanelak() {
		// TODO Auto-generated method stub
		panelNagusia.remove(jokalariKartak);
		panelNagusia.remove(jokokoKartak);
//		userPanel =new JPanel(new GridBagLayout());
//		gamePanel = new JPanel(new GridBagLayout());
	}
	
	public static void main(String[] args) {
		
		TaulaKudeatzailea.getTaulaKudeatzailea().hasieratu("ane");
		//taula kudeatzailean hasieratu
//		Taula t =new Taula();
		
		
	}
	
	}