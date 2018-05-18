package interfazea;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
	JMenu laguntza = new JMenu();
	JMenuItem berriroHasi = new JMenuItem();
	
	JMenu rankingak = new JMenu();
	JMenuItem egunekoPartidak = new JMenuItem();
	JMenuItem historikoa = new JMenuItem();
	JMenuItem jokalariPartidak = new JMenuItem();
	JLabel zureIzenaGoian = new JLabel();
	JLabel ordenagailua = new JLabel();
	JLabel ordenagailuaKarta = new JLabel();
	
	//animaladak
	JMenuItem jokoa = new JMenuItem();
	JMenuItem mofeta = new JMenuItem();
	JMenuItem loro = new JMenuItem();
	JMenuItem foka = new JMenuItem();
	JMenuItem suge = new JMenuItem();
	JMenuItem zebra = new JMenuItem();
	JMenuItem lehoi = new JMenuItem();
	JMenuItem kanguro = new JMenuItem();
	JMenuItem jirafa = new JMenuItem();
	JMenuItem hipopotamo = new JMenuItem();
	JMenuItem tximino = new JMenuItem();
	JMenuItem kokodrilo = new JMenuItem();
	JMenuItem kamaleoi = new JMenuItem();
	JMenu animaladak = new JMenu();
	
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
	JPanel ordenagailuaPanela = new JPanel();
	JPanel eskuinPanela = new JPanel();
	
	
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
//		egunekoPartidak.setText("	Ranking: Eguneko partidak!	");
//		jokalariPartidak.setText("	Ranking: Zure partida onenak!	");
//		historikoa.setText("	Ranking: Historikoki partida onenak!	");
		zureIzenaGoian.setText("	ZURE IZENA:  " + TaulaKudeatzailea.getTaulaKudeatzailea().getIzena() + "	");
		ordenagailua.setText("Ordenagailuaren azken karta");
//		menuBarra.add(egunekoPartidak);
//		menuBarra.add(jokalariPartidak);
//		menuBarra.add(historikoa);
//		menuBarra.add(zureIzenaGoian);
		
		setJMenuBar(menuBarra);
		laguntza.setText("Laguntza");
		jokoa.setText("Jokoari buruz");
		mofeta.setText("Mofeta");
		loro.setText("Loro");
		kanguro.setText("Kanguro");
		tximino.setText("Tximino");
		kamaleoi.setText("Kamaleoi");
		foka.setText("Foka");
		zebra.setText("Zebra");
		jirafa.setText("Jirafa");
		suge.setText("Sugea");
		kokodrilo.setText("Kokodrilo");
		hipopotamo.setText("Hipopotamo");
		lehoi.setText("Lehoia");
		
		animaladak.setText("Animaladei buruz");
		berriroHasi.setText("Jokoa berriro hasi");
		rankingak.setText("Ranking-ak ikusi");
		egunekoPartidak.setText("Eguneko partidak");
		historikoa.setText("Partidarik onenak");
		jokalariPartidak.setText("Zure partidak");
		mofeta.setText("Mofeta");
		menuBarra.add(laguntza);
		
		menuBarra.add(rankingak);
		menuBarra.add(zureIzenaGoian);
		menuBarra.add(berriroHasi);
		rankingak.add(egunekoPartidak);
		rankingak.add(historikoa);
		rankingak.add(jokalariPartidak);
		laguntza.add(jokoa);
		laguntza.add(animaladak);
		animaladak.add(mofeta);
		animaladak.add(loro);
		animaladak.add(kanguro);
		animaladak.add(tximino);
		animaladak.add(kamaleoi);
		animaladak.add(foka);
		animaladak.add(zebra);
		animaladak.add(jirafa);
		animaladak.add(suge);
		animaladak.add(kokodrilo);
		animaladak.add(hipopotamo);
		animaladak.add(lehoi);
		
		
		ordenagailuaPanela.add(ordenagailua);
		ordenagailuaPanela.add(ordenagailuaKarta);
		
		ordenagailuaPanela.setLayout(new GridLayout(1, 2));
		
		// ordenagailuko kartak ordenagailuKartak panelean sartu
		ordenagailuKartak.add(ordenagailuKarta1);
		ordenagailuKartak.add(ordenagailuKarta2);
		ordenagailuKartak.add(ordenagailuKarta3);
		ordenagailuKartak.add(ordenagailuKarta4);
		ordenagailuKartak.add(ordenagailuMazoa);
		ordenagailuKartak.add(ordenagailuaKarta);
		
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
		eskuinPanela.add(ordenagailuKartak, BorderLayout.NORTH);
		eskuinPanela.add(jokokoKartak, BorderLayout.CENTER);
		eskuinPanela.add(jokalariKartak, BorderLayout.SOUTH);
		add(eskuinPanela);

		setVisible(true);
		setTitle("BAR BESTIAL");
		setSize(1000, 500);
		setMaximumSize(new Dimension(800, 600));
		setPreferredSize(new Dimension(800, 600));
//		
		pack();
		
		
	}

	
	public void pantailaratuOrdenagailuKartak(){
		KartaZerrenda z = new KartaZerrenda();
		z= TaulaKudeatzailea.getTaulaKudeatzailea().OrdenagailuarenEskukoKartakLortu();
		
		if(z.get(0).getZenb()==0){
			jokokoKarta1.setIcon(kartaHutsa);
		}
		else{
			
			ordenagailuKarta1.setIcon(karta);
		}
		if(z.get(1).getZenb()==0){
			jokokoKarta2.setIcon(kartaHutsa);
		}
		else{
			ordenagailuKarta2.setIcon(karta);
		}
		if(z.get(2).getZenb()==0){
			jokokoKarta3.setIcon(kartaHutsa);
		}
		else{
			ordenagailuKarta3.setIcon(karta);
		}
		if( z.tamaina()<4){
			jokokoKarta4.setIcon(kartaHutsa);
		}
		else{
			ordenagailuKarta4.setIcon(karta);
		}
		
		ordenagailuMazoa.setIcon(karta);
	}
	
	public void pantailaratuOrdenagailuakJokatuKarta(){
		Karta k = TaulaKudeatzailea.getTaulaKudeatzailea().getOrdenagailuaJokKarta();
		if(k.getZenb()==0){
			jokokoKarta1.setIcon(kartaHutsa);
		}
		else{
			ImageIcon ordIrudia = irudiaEsleituJokokoKartei(k);
			ordenagailuaKarta.setIcon(ordIrudia);
		}
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
				}
	});
			
			
			// MenuBarra botoietako actionListener-ak Ranking-ak bistaratzeko
			
			egunekoPartidak.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					new taulaEgunekoPartidak.Taula();
				}
			});
			
			historikoa.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					new taulaHistorikoa.Taula();
				}
			});
			
			jokalariPartidak.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					new taulaJokalaria.Taula();
				}
			});
			
			berriroHasi.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					TaulaKudeatzailea.getTaulaKudeatzailea().hasieratu(TaulaKudeatzailea.getTaulaKudeatzailea().getIzena());
				}
			});
			jokoa.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					new LaguntzaUI();
				}
			});
			mofeta.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JLabel l = new JLabel();
					l.setText("Animali ahulena da, mahaian jartzen den bakoitzean ilaran dauden eta zenbaki altuena daukaten bi animali espezieak kalera botako ditu.");
					JDialog d = new JDialog();
					d.setTitle("Mofeta animalada");
					d.add(l);
					d.setVisible(true);
					d.pack();
					//new LaguntzaUI();
				}
			});
			loro.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JLabel l = new JLabel();
					l.setText("Ilaran dagoen eta guk aukeratutako animalia kanpora botako du.");
					JDialog d = new JDialog();
					d.setTitle("Loro animalada");
					d.add(l);
					d.setVisible(true);
					d.pack();
					//new LaguntzaUI();
				}
			});
			kanguro.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JLabel l = new JLabel();
					l.setText("Animali hau ilaran sartzean, ilaran bere aurrean dagoen animali bat edo bi saltatuko ditu.");
					JLabel l1 = new JLabel();
					l1.setText("Saltatuko dituen animali kopurua guk aukeratuko dugu.");
					JDialog d = new JDialog();
					d.setTitle("Kanguro animalada");
					JPanel j = new JPanel();
					j.setLayout(new GridLayout(2, 1));
					j.add(l);
					j.add(l1);
					d.add(j);
					d.setVisible(true);
					d.pack();
					//new LaguntzaUI();
				}
			});
			tximino.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JLabel l = new JLabel();
					l.setText("Ilaran dagoeneko tximinorik ez badago ez da ezer gertatzen, hau da, tximinoa ilararen azkeneko posizioan sartuko da.");
					JLabel l1 = new JLabel();
					l1.setText("Tximino bat, edo gehiago ba daude hipopotamoak eta kokodriloak ilaratik botako ditu.");
					JLabel l2 = new JLabel();
					l2.setText("Bera lehenengo posizioan jarriko da eta ilaran zeuden beste tximinoak bere atzetik jarriko ditu alderantzizko ordenan.");
					
					JDialog d = new JDialog();
					d.setTitle("Tximino animalada");
					JPanel j = new JPanel();
					j.setLayout(new GridLayout(2, 1));
					j.add(l);
					j.add(l1);
					j.add(l2);
					d.add(j);
					d.setVisible(true);
					d.pack();
					//new LaguntzaUI();
				}
			});
			kamaleoi.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JLabel l = new JLabel();
					l.setText("Jokalariak aukeratzen duen animalian bilakatzen da, eta jokalariak aukeratutako animaliaren animalada egingo du.");
					JLabel l1 = new JLabel();
					l1.setText("Animalada egikaritu eta gero kamaleoi izatera bueltatzen da.");
					JDialog d = new JDialog();
					d.setTitle("Kamaleoi animalada");
					JPanel j = new JPanel();
					j.setLayout(new GridLayout(2, 1));
					j.add(l);
					j.add(l1);
					d.add(j);
					d.setVisible(true);
					d.pack();
					//new LaguntzaUI();
				}
			});
			foka.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JLabel l = new JLabel();
					l.setText("Animali hau ilaran sartzean ilaran dauden animalien ordena atzetik aurrera aldatzen da");
					JDialog d = new JDialog();
					d.setTitle("Foka animalada");
					d.add(l);
					d.setVisible(true);
					d.pack();
					//new LaguntzaUI();
				}
			});
			zebra.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JLabel l = new JLabel();
					l.setText("Mahaira botatzean ez du ezer egingo, ilaran azken posizioan kokatuko da, baina behin ilaran egonda barrera baten moduan jokatuko du.");
					JLabel l1 = new JLabel();
					l1.setText("Krokodiloak edo hipopotamoak beren animalada egiterakoan ez ditu bere posiziotik pasatzen utziko.");
					JDialog d = new JDialog();
					d.setTitle("Zebra animalada");
					JPanel j = new JPanel();
					j.setLayout(new GridLayout(2, 1));
					j.add(l);
					j.add(l1);
					d.add(j);
					d.setVisible(true);
					d.pack();
					//new LaguntzaUI();
				}
			});
			jirafa.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JLabel l = new JLabel();
					l.setText("Animali honen animalada ilaran bere aurrean kokatuta dagoen animalia saltatzea bere balioa baino gutxiagokoa bada (zortzi baino txikiagoa)");
					JLabel l1 = new JLabel();
					l1.setText("Jirafaren animalara errekurrentea da.");
					JDialog d = new JDialog();
					d.setTitle("Jirafa animalada");
					JPanel j = new JPanel();
					j.setLayout(new GridLayout(2, 1));
					j.add(l);
					j.add(l1);
					d.add(j);
					d.setVisible(true);
					d.pack();
					//new LaguntzaUI();
				}
			});
			suge.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JLabel l = new JLabel();
					l.setText("Sugeak ilaran dauden kartak txikienetik handienera ordenatuko ditu.");
					JDialog d = new JDialog();
					d.setTitle("Suge animalada");
					d.add(l);
					d.setVisible(true);
					d.pack();
				}
			});
			kokodrilo.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JLabel l = new JLabel();
					l.setText("Bere aurretik dagoen edozein animalia jaten du, baldin eta bere zenbakia baino txikiagoak badira (hamar baino txikiagoa).");
					JLabel l1 = new JLabel();
					l1.setText("Beste kokodrilo bat topatzen badu, ez du kanporatuko.");
					JLabel l2 = new JLabel();
					l2.setText("Zebra batekin aurkitzekotan zebra barrera izango da eta kokodriloa ezingo ditu animalia gehiago jan.");
					
					JDialog d = new JDialog();
					d.setTitle("Kokodrilo animalada");
					JPanel j = new JPanel();
					j.setLayout(new GridLayout(2, 1));
					j.add(l);
					j.add(l1);
					j.add(l2);
					d.add(j);
					d.setVisible(true);
					d.pack();
				}
			});
			hipopotamo.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JLabel l = new JLabel();
					l.setText("Bera baino ahulagoak diren animalia guztiak zapalduko ditu (hamaika baino txikiagoak).");
					JLabel l1 = new JLabel();
					l1.setText("Zebra batekin topo egiten badu ezingo ditu animalia gehiago zanpatu");
					
					JDialog d = new JDialog();
					d.setTitle("Hipopotamo animalada");
					JPanel j = new JPanel();
					j.setLayout(new GridLayout(2, 1));
					j.add(l);
					j.add(l1);
					d.add(j);
					d.setVisible(true);
					d.pack();
				}
			});
			lehoi.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JLabel l = new JLabel();
					l.setText("Ilaran lehoirik ez badago lehenengo posizioan kokatuko da, ilaran zeuden beste animalia guztian bere atzetik jarriz");
					JLabel l1 = new JLabel();
					l1.setText("ilaran dauden tximino guztiak kalera botako ditu.");
					JLabel l2 = new JLabel();
					l2.setText("Dagoeneko ilaran beste lehoi bat badago, orduan, lehoia ez da ilaran jarriko eta zuzenean kalera joango da.");
					
					JDialog d = new JDialog();
					d.setTitle("Lehoi animalada");
					JPanel j = new JPanel();
					j.setLayout(new GridLayout(2, 1));
					j.add(l);
					j.add(l1);
					j.add(l2);
					d.add(j);
					d.setVisible(true);
					d.pack();
				}
			});
			
			
	}
	
	public void akzioa(int botoia) throws InterruptedException {
		//JOKALARIAREN TXANDA
		KartaZerrenda jKartak = TaulaKudeatzailea.getTaulaKudeatzailea().JokalariarenEskukoKartakLortu();
		Karta jkarta = jKartak.get(botoia);
		TaulaKudeatzailea.getTaulaKudeatzailea().jokatu(jkarta);

		if(jkarta.getZenb()==2 ){ //loro kartak aukeratu behar du 
			if(TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartenTam()>1){
				new LoroUI();
			} else {
				TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
			}
		}
		else if(jkarta.getZenb()==3 ){
			if(TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartenTam()>=1){ //kanguroak zenbat salto egin nahi dituen aukeratu behar du(1 edo 2)

				new KanguroUI();

			}
		}
		else if(jkarta.getZenb()==5){
			new KamaleoiUI();
		}
		else{
			TaulaKudeatzailea.getTaulaKudeatzailea().animaladaEgin(jkarta);

			TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();


			pantailaratuJokalariKartak();
			pantailaratuJokokoKartak();

			TaulaKudeatzailea.getTaulaKudeatzailea().animaladaErrekurtsiboakEgin();
			TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
//			pantailaratuJokokoKartak();
			TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartakHustu();
			TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
//			pantailaratuJokokoKartak();

			if(TaulaKudeatzailea.getTaulaKudeatzailea().amaitu()){
				//JOKOA AMAITZEN BADA
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
	
				}else{
					new GalduUI();
					String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
					int puntuazioa = TaulaKudeatzailea.getTaulaKudeatzailea().getPuntuazioa();
					PartidaKud.getInstantzia().partidaGehitu(izena, puntuazioa);
				}

			}else{ 
				ordenagailuarenTxanda();
			}
		}
	}


	public void ordenagailuarenTxanda() {
		
		TaulaKudeatzailea.getTaulaKudeatzailea().ordenagailuarenTxanda();
		TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
		//							grafikaEguneratu();
		//							TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
		pantailaratuJokokoKartak();
		amaitu();
	}
	
	public void amaitu() {
		if(TaulaKudeatzailea.getTaulaKudeatzailea().amaitu()){
			TaulaKudeatzailea.getTaulaKudeatzailea().ordenagailuarenTxanda();
			
			if(TaulaKudeatzailea.getTaulaKudeatzailea().pertsonaIrabazi()){
				String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
				int puntuazioa = TaulaKudeatzailea.getTaulaKudeatzailea().getPuntuazioa();
				PartidaKud.getInstantzia().partidaGehitu(izena, puntuazioa);
				new IrabaziUI();

			}else if(TaulaKudeatzailea.getTaulaKudeatzailea().berdinketa()){
				String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
				int puntuazioa = TaulaKudeatzailea.getTaulaKudeatzailea().getPuntuazioa();
				PartidaKud.getInstantzia().partidaGehitu(izena, puntuazioa);
				new BerdinketaUI();


			}else{
				String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
				int puntuazioa = TaulaKudeatzailea.getTaulaKudeatzailea().getPuntuazioa();
				PartidaKud.getInstantzia().partidaGehitu(izena, puntuazioa);
				new GalduUI();

			}
		}
	}




	//	public void grafikaEguneratu( ){

	//		pantailaratuOrdenagailuKartak();
	//		pantailaratuJokokoKartak();
	//		pantailaratuJokalariKartak();
	//	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		TaulaKudeatzailea.getTaulaKudeatzailea().hasieratu("ane");
		//taula kudeatzailean hasieratu
//		Taula t =new Taula();
		
		
	}
	
	}