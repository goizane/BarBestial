package interfazea;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kudeatzaileak.TaulaKudeatzailea;
import logika.HipopotamoKarta;
import logika.JirafaKarta;
import logika.KanguroKarta;
import logika.Karta;
import logika.KartaZerrenda;
import logika.LehoiKarta;
import logika.LoroKarta;
import logika.MofetaKarta;

public class LoroUI extends JFrame {

		JButton botoia1 = new JButton();
		JButton botoia2 = new JButton();
		JButton botoia3 = new JButton();
		JButton botoia4 = new JButton();
		JLabel label = new JLabel();
		JPanel zenbakienPanela = new JPanel();
		
		
		public LoroUI(){
			super("Loro panela");
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			label.setText("Zein da kanporatu nahi duzun karta?");
			add(label,BorderLayout.NORTH );
			
				int tam = TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartenTam();
				
				System.out.println("Tamaina karta huts barik"+tam);
				if(tam==2){
					String testua1 = TaulaKudeatzailea.getTaulaKudeatzailea().getKartaIzena(0);
										
					botoia1.setText(testua1);
					zenbakienPanela.setLayout(new GridLayout(1,0));
					zenbakienPanela.add(botoia1);
				}
				else if(tam ==3){
					String testua1 = TaulaKudeatzailea.getTaulaKudeatzailea().getKartaIzena(0);
					
					botoia1.setText(testua1);
					System.out.println(testua1);
					String testua2 = TaulaKudeatzailea.getTaulaKudeatzailea().getKartaIzena(1);
					
					botoia2.setText(testua2);
					System.out.println(testua2);
					zenbakienPanela.setLayout(new GridLayout(1,0));
					zenbakienPanela.add(botoia1);
					zenbakienPanela.add(botoia2);
				}
				else if(tam ==4){
					String testua1 = TaulaKudeatzailea.getTaulaKudeatzailea().getKartaIzena(0);
					
					botoia1.setText(testua1);
					System.out.println(testua1);
					String testua2 = TaulaKudeatzailea.getTaulaKudeatzailea().getKartaIzena(1);
					
					botoia2.setText(testua2);
					System.out.println(testua2);
					String testua3 = TaulaKudeatzailea.getTaulaKudeatzailea().getKartaIzena(2);
				
					botoia3.setText(testua3);
					System.out.println(testua3);
					zenbakienPanela.setLayout(new GridLayout(1,0));
					zenbakienPanela.add(botoia1);
					zenbakienPanela.add(botoia2);
					zenbakienPanela.add(botoia3);
				}else{
					String testua1 = TaulaKudeatzailea.getTaulaKudeatzailea().getKartaIzena(0);
					
					botoia1.setText(testua1);
					String testua2 = TaulaKudeatzailea.getTaulaKudeatzailea().getKartaIzena(1);
					
					botoia2.setText(testua2);
					String testua3 = TaulaKudeatzailea.getTaulaKudeatzailea().getKartaIzena(2);
					
					botoia3.setText(testua3);
					String testua4 = TaulaKudeatzailea.getTaulaKudeatzailea().getKartaIzena(3);
					
					botoia4.setText(testua4);
					zenbakienPanela.setLayout(new GridLayout(1,0));
					zenbakienPanela.add(botoia1);
					zenbakienPanela.add(botoia2);
					zenbakienPanela.add(botoia3);
					zenbakienPanela.add(botoia4);
				}
				
				
			
			
			
			add(zenbakienPanela, BorderLayout.SOUTH);
			pack();
			setVisible(true);
			
			Karta loro = new LoroKarta(""); 
			botoia1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					Karta k = TaulaKudeatzailea.getTaulaKudeatzailea().getJokokoKartak().get(0);
				
					TaulaKudeatzailea.getTaulaKudeatzailea().loroariKartaEsleitu(k);
					
					loro.animaladaEgin();
					TaulaKudeatzailea.getTaulaKudeatzailea().animaladaErrekurtsiboakEgin();
					TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartakHustu();
					TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
					if(TaulaKudeatzailea.getTaulaKudeatzailea().amaitu()){
						if(TaulaKudeatzailea.getTaulaKudeatzailea().pertsonaIrabazi()){
							new IrabaziUI();
						}	
						else if(TaulaKudeatzailea.getTaulaKudeatzailea().berdinketa()){
							new BerdinketaUI();
						}else{
							new GalduUI();
						}
					}
					setVisible(false);
				}
	});
			botoia2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Karta k = TaulaKudeatzailea.getTaulaKudeatzailea().getJokokoKartak().get(1);
					
					TaulaKudeatzailea.getTaulaKudeatzailea().loroariKartaEsleitu(k);
					loro.animaladaEgin();
					TaulaKudeatzailea.getTaulaKudeatzailea().animaladaErrekurtsiboakEgin();
					TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartakHustu();
					TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
					if(TaulaKudeatzailea.getTaulaKudeatzailea().amaitu()){
						if(TaulaKudeatzailea.getTaulaKudeatzailea().pertsonaIrabazi()){
							new IrabaziUI();
						}	
						else if(TaulaKudeatzailea.getTaulaKudeatzailea().berdinketa()){
							new BerdinketaUI();

						}else{
							new GalduUI();
						}
					}
					setVisible(false);
				}
	});
			botoia3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Karta k = TaulaKudeatzailea.getTaulaKudeatzailea().getJokokoKartak().get(2);
					
					TaulaKudeatzailea.getTaulaKudeatzailea().loroariKartaEsleitu(k);
					loro.animaladaEgin();
					TaulaKudeatzailea.getTaulaKudeatzailea().animaladaErrekurtsiboakEgin();
					
					TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartakHustu();
					TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
					if(TaulaKudeatzailea.getTaulaKudeatzailea().amaitu()){
						if(TaulaKudeatzailea.getTaulaKudeatzailea().pertsonaIrabazi()){
							new IrabaziUI();
						}	
						else if(TaulaKudeatzailea.getTaulaKudeatzailea().berdinketa()){
							new BerdinketaUI();

						}else{
							new GalduUI();
						}
					}
					setVisible(false);
				}
	});
			botoia4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Karta k = TaulaKudeatzailea.getTaulaKudeatzailea().getJokokoKartak().get(3);
					
					TaulaKudeatzailea.getTaulaKudeatzailea().loroariKartaEsleitu(k);
					loro.animaladaEgin();
					TaulaKudeatzailea.getTaulaKudeatzailea().animaladaErrekurtsiboakEgin();
					TaulaKudeatzailea.getTaulaKudeatzailea().jokokoKartakHustu();
					TaulaKudeatzailea.getTaulaKudeatzailea().grafikaEguneratu();
					if(TaulaKudeatzailea.getTaulaKudeatzailea().amaitu()){
						if(TaulaKudeatzailea.getTaulaKudeatzailea().pertsonaIrabazi()){
							new IrabaziUI();
						}	
						else if(TaulaKudeatzailea.getTaulaKudeatzailea().berdinketa()){
							new BerdinketaUI();

						}else{
							new GalduUI();
						}
					}
					setVisible(false);
				}
	});
			
		}
		public static void main(String[] args) {
			new LoroUI();
		}
	}


	
	
