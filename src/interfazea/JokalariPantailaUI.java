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

public class JokalariPantailaUI extends JFrame{
	

	JButton jokatu = new JButton();
	JButton zurePartidakIkusi = new JButton();
	JButton partidaHistorikoakIkusi = new JButton();
	JButton gaurkoPartidakIkusi = new JButton();
	JButton irten = new JButton();
	
	JPanel botoiak = new JPanel();
	
	public JokalariPantailaUI(String izena){
		super("Erabiltzaile panela");
		
	
		jokatu.setText("Jokatu");
		zurePartidakIkusi.setText("Zure partidak");
		partidaHistorikoakIkusi.setText("Partida onenak");
		gaurkoPartidakIkusi.setText("Gaurko partidak");
		irten.setText("irten");
		
		botoiak.add(jokatu);
		botoiak.add(zurePartidakIkusi);
		botoiak.add(partidaHistorikoakIkusi);
		botoiak.add(gaurkoPartidakIkusi);
		botoiak.add(irten);
		
		botoiak.setLayout(new GridLayout(1, 2));
		
		
		add(botoiak, BorderLayout.NORTH);
		pack();
		setVisible(true);
		
		jokatu.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				TaulaKudeatzailea.getTaulaKudeatzailea().hasieratu(izena);
				setVisible(false);
			}
	});
		
		zurePartidakIkusi.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				new taulaJokalaria.Taula();
				setVisible(false);
			}
	});
		
		partidaHistorikoakIkusi.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				new taulaHistorikoa.Taula();
				setVisible(false);
			}
	});
		
		gaurkoPartidakIkusi.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				new taulaEgunekoPartidak.Taula();
				setVisible(false);
			}
	});
		
		irten.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				new LoginUI();
				setVisible(false);
			}
	});
		
		
	}

}
