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
import javax.swing.JPanel;

import kudeatzaileak.TaulaKudeatzailea;

import kudeatzaileak.TaulaKudeatzailea;

public class BerdinketaUI extends JFrame{
	JLabel label1 = new JLabel();
	ImageIcon berdindu = new ImageIcon("src/fitxategiak/bored.png");
	JButton irtenBotoia = new JButton();
	JButton berriroHasiBotoia = new JButton();
	JButton gaurkoPartidakIkusi = new JButton();
	JButton zurePartidakIkusi = new JButton();
	JButton partidaOnenakIkusi = new JButton();
	JPanel botoiak = new JPanel();
	JPanel botoiDanak = new JPanel();
	JLabel irudia = new JLabel();
	
	public BerdinketaUI(){
		super("Berdinketa panela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label1.setText("BERDINKETA EGON DA!");
		irtenBotoia.setText("Irten");
		berriroHasiBotoia.setText("Berriro hasi");
		gaurkoPartidakIkusi.setText("Gaurko partidak ikusi");
		zurePartidakIkusi.setText("Zure partidak ikusi");
		partidaOnenakIkusi.setText("Partida onenak ikusi");
		
		irudia.setIcon(berdindu);
		
		
		botoiak.add(berriroHasiBotoia);
		botoiak.add(gaurkoPartidakIkusi);
		botoiak.add(zurePartidakIkusi);
		botoiak.add(partidaOnenakIkusi);
		
		botoiak.setLayout(new GridLayout(2,2));
		
		botoiak.setLayout(new GridLayout(2,2));
		botoiDanak.add(botoiak, BorderLayout.NORTH);
		botoiDanak.add(irtenBotoia, BorderLayout.SOUTH);
		add(label1,BorderLayout.NORTH );
		add(irudia, BorderLayout.CENTER);
		add(botoiDanak,BorderLayout.SOUTH );
		pack();
		setVisible(true);
		setMaximumSize(new Dimension(700, 700));
		setPreferredSize(new Dimension(700, 700));
		
		irtenBotoia.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
});
	
	berriroHasiBotoia.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent e) {
			String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
			TaulaKudeatzailea.getTaulaKudeatzailea().hasieratu(izena);
			setVisible(false);
		}
});
	gaurkoPartidakIkusi.addActionListener(new ActionListener() {
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new taulaEgunekoPartidak.Taula();
			setVisible(false);
		}
});
	partidaOnenakIkusi.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new taulaHistorikoa.Taula();
				setVisible(false);
			}
	});

	zurePartidakIkusi.addActionListener(new ActionListener() {
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new taulaJokalaria.Taula();
			setVisible(false);
		}
});
}
	
	public static void main(String[] args) {
		new BerdinketaUI();
	}

}
