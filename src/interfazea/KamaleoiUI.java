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
import logika.FokaKarta;
import logika.HipopotamoKarta;
import logika.JirafaKarta;
import logika.KamaleoiKarta;
import logika.KanguroKarta;
import logika.Karta;
import logika.KrokodiloKarta;
import logika.LehoiKarta;
import logika.LoroKarta;
import logika.MofetaKarta;
import logika.SugeKarta;
import logika.TximinoKarta;
import logika.ZebraKarta;

public class KamaleoiUI extends JFrame {

	JButton botoia1 = new JButton();
	JButton botoia2 = new JButton();
	JButton botoia3 = new JButton();
	JButton botoia4 = new JButton();
	JButton botoia5 = new JButton();
	JButton botoia6 = new JButton();
	JButton botoia7 = new JButton();
	JButton botoia8 = new JButton();
	JButton botoia9 = new JButton();
	JButton botoia10 = new JButton();
	JButton botoia11 = new JButton();
	
	JLabel label = new JLabel();
	JPanel zenbakienPanela = new JPanel();
	
	
	public KamaleoiUI(){
		super("Kamaleoi panela");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setText("Zein animali kopiatu nahi duzu?");
		add(label,BorderLayout.NORTH );
		botoia1.setText("Mofeta");
		botoia2.setText("Loroa");
		botoia3.setText("Kanguroa");
		botoia4.setText("Tximinoa");
		botoia5.setText("Foka");
		botoia6.setText("Zebra");
		botoia7.setText("Jirafa");
		botoia8.setText("Sugea");
		botoia9.setText("Kokodriloa");
		botoia10.setText("Hipopotamoa");
		botoia11.setText("Lehoia");
		zenbakienPanela.add(botoia1);
		zenbakienPanela.add(botoia2);
		zenbakienPanela.add(botoia3);
		zenbakienPanela.add(botoia4);
		zenbakienPanela.add(botoia5);
		zenbakienPanela.add(botoia6);
		zenbakienPanela.add(botoia7);
		zenbakienPanela.add(botoia8);
		zenbakienPanela.add(botoia9);
		zenbakienPanela.add(botoia10);
		zenbakienPanela.add(botoia11);
		zenbakienPanela.setLayout(new GridLayout(3,4));
		add(zenbakienPanela, BorderLayout.SOUTH);
		pack();
		setVisible(true);
		
		Karta kamaleoi = new KamaleoiKarta("");
		botoia1.addActionListener(new ActionListener() {
		
	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Karta k = new MofetaKarta("");
			
				TaulaKudeatzailea.getTaulaKudeatzailea().kamaleoiarenKopiatuKartaEguneratu(k);
				kamaleoi.animaladaEgin();
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
				
				Karta k = new LoroKarta("");
			
				TaulaKudeatzailea.getTaulaKudeatzailea().kamaleoiarenKopiatuKartaEguneratu(k);
				new LoroUI();
				kamaleoi.animaladaEgin();
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
				
				Karta k = new KanguroKarta("");
			
				TaulaKudeatzailea.getTaulaKudeatzailea().kamaleoiarenKopiatuKartaEguneratu(k);
				new KanguroUI();
				kamaleoi.animaladaEgin();
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
				
				Karta k = new TximinoKarta("");
			
				TaulaKudeatzailea.getTaulaKudeatzailea().kamaleoiarenKopiatuKartaEguneratu(k);
				
				kamaleoi.animaladaEgin();
				
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
		botoia5.addActionListener(new ActionListener() {
			
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Karta k = new FokaKarta("");
			
				TaulaKudeatzailea.getTaulaKudeatzailea().kamaleoiarenKopiatuKartaEguneratu(k);
				
				kamaleoi.animaladaEgin();
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
		botoia6.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Karta k = new ZebraKarta("");
			
				TaulaKudeatzailea.getTaulaKudeatzailea().kamaleoiarenKopiatuKartaEguneratu(k);
				
				kamaleoi.animaladaEgin();
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
		botoia7.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Karta k = new JirafaKarta("");
			
				TaulaKudeatzailea.getTaulaKudeatzailea().kamaleoiarenKopiatuKartaEguneratu(k);
				
				kamaleoi.animaladaEgin();
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
		botoia8.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Karta k = new SugeKarta("");
			
				TaulaKudeatzailea.getTaulaKudeatzailea().kamaleoiarenKopiatuKartaEguneratu(k);
				
				kamaleoi.animaladaEgin();
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
		botoia9.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Karta k = new KrokodiloKarta("");
			
				TaulaKudeatzailea.getTaulaKudeatzailea().kamaleoiarenKopiatuKartaEguneratu(k);
				
				kamaleoi.animaladaEgin();
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
		botoia10.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Karta k = new HipopotamoKarta("");
			
				TaulaKudeatzailea.getTaulaKudeatzailea().kamaleoiarenKopiatuKartaEguneratu(k);
				
				kamaleoi.animaladaEgin();
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
		botoia11.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Karta k = new LehoiKarta("");
			
				TaulaKudeatzailea.getTaulaKudeatzailea().kamaleoiarenKopiatuKartaEguneratu(k);
				
				kamaleoi.animaladaEgin();
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
		new KamaleoiUI();
	}
}
