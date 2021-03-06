package interfazea;

import javax.swing.*;

import kudeatzaileak.BazkideKud;
import kudeatzaileak.TaulaKudeatzailea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class BazkideEginUI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JFrame nagusia;
	private JPanel panelNagusia = new JPanel();
	JTextField erabiltzaileArea = new JTextField();
	JTextField emailArea = new JTextField();
	JTextField pasahitzaArea = new JTextField();
	
	public BazkideEginUI() {
		nagusia = new JFrame("Bazkide egin");
		panelNagusia.setLayout(new BorderLayout());
		panelNagusia.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		iparraldea();
		erdialdea();
		hegoaldea();
		nagusia.getContentPane().add(panelNagusia);
	}
	
	public void iparraldea() {
		JLabel azalpenLabela = new JLabel("Zure datuak sartu:");
		panelNagusia.add(azalpenLabela, BorderLayout.NORTH);
	}
	
	public void erdialdea() {
		JLabel erabiltzaileLabela = new JLabel("Erabiltzaile-izena: ");
		JPanel erabiltzailePanela = new JPanel();
		erabiltzailePanela.setLayout(new BoxLayout(erabiltzailePanela, BoxLayout.X_AXIS));
		erabiltzailePanela.add(erabiltzaileLabela);
		erabiltzailePanela.add(erabiltzaileArea);
		
		JLabel emailLabela = new JLabel("Email kontua: ");
		JPanel emailPanela = new JPanel();
		emailPanela.setLayout(new BoxLayout(emailPanela, BoxLayout.X_AXIS));
		emailPanela.add(emailLabela);
		emailPanela.add(emailArea);
		
		JLabel pasahitzaLabela = new JLabel("Pasahitza: ");
		JPanel pasahitzaPanela = new JPanel();
		pasahitzaPanela.setLayout(new BoxLayout(pasahitzaPanela, BoxLayout.X_AXIS));
		pasahitzaPanela.add(pasahitzaLabela);
		pasahitzaPanela.add(pasahitzaArea);
		
		JPanel erdiPanela = new JPanel();
		erdiPanela.setLayout(new BoxLayout(erdiPanela, BoxLayout.Y_AXIS));
		erdiPanela.add(erabiltzailePanela);
		erdiPanela.add(emailPanela);
		erdiPanela.add(pasahitzaPanela);
		panelNagusia.add(erdiPanela, BorderLayout.CENTER);
	}
	
	public void hegoaldea() {
		JButton atzera = new JButton("Atzera");
		atzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				Kudeatzailea.getInstantzia().setErabiltzailea(erabiltzaileArea.getText());
//				Kudeatzailea.getInstantzia().setPasahitza(pasahitzaArea.getText());
//				Data db = new Data();
//				Connection konexioa = db.conn;
				new LehenengoPantailaUI();
				nagusia.dispose();
			}
		});
		
		JButton bazkideBotoia = new JButton("Bazkide egin!");
	
		bazkideBotoia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BazkideKud.getInstantzia().bazkideaSartu(erabiltzaileArea.getText(), emailArea.getText(), pasahitzaArea.getText());
				TaulaKudeatzailea.getTaulaKudeatzailea().hasieratu(erabiltzaileArea.getText());
				nagusia.dispose();
			}
		});
			
		JPanel behekoPanela= new JPanel();
		behekoPanela.add(atzera);
		behekoPanela.add(bazkideBotoia);
		panelNagusia.add(behekoPanela, BorderLayout.SOUTH);
	}
	
	
	public void bistaratu() {
		nagusia.setSize(600, 600);
		pack();
		nagusia.setVisible(true);
		nagusia.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		pack();
//		setSize(1200, 700);
//		setMaximumSize(new Dimension(1000, 700));
//		setPreferredSize(new Dimension(1000, 700));
	}

	public static void main(String[] args) {
		BazkideEginUI pantaila = new BazkideEginUI();
		pantaila.bistaratu();
	}
}