package interfazea;

import javax.swing.*;
import kudeatzaileak.BazkideKud;
import kudeatzaileak.TaulaKudeatzailea;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class LoginErroreUI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JFrame nagusia;
	private JPanel panelNagusia = new JPanel();
	
	public LoginErroreUI() {
		nagusia = new JFrame("ERROREA!!!");
		panelNagusia.setLayout(new BorderLayout());
		panelNagusia.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		erdialdea();
		hegoaldea();
		nagusia.getContentPane().add(panelNagusia);
	}
	
	public void erdialdea() {
		JLabel mezuLabela = new JLabel("KONTUZ! Txarto idatzi duzu zure izena edo pasahitza!!");
		JPanel erdiPanela = new JPanel();
		erdiPanela.setLayout(new BoxLayout(erdiPanela, BoxLayout.Y_AXIS));
		erdiPanela.add(mezuLabela);
		panelNagusia.add(erdiPanela, BorderLayout.CENTER);
	}
	
	public void hegoaldea() {
		JButton atzera = new JButton("Berriro saiatu");
		atzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new LoginUI();
				nagusia.dispose();
			}
		});
			
		JPanel behekoPanela= new JPanel();
		behekoPanela.add(atzera);
		panelNagusia.add(behekoPanela, BorderLayout.SOUTH);
	}
	
	public void bistaratu() {
		nagusia.setSize(275, 125);
		nagusia.setVisible(true);
		nagusia.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		LoginErroreUI pantaila = new LoginErroreUI();
		pantaila.bistaratu();
	}
}