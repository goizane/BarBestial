package interfazea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class LoginUI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JFrame nagusia;
	private JPanel panelNagusia = new JPanel();
	JTextField erabiltzaileArea = new JTextField();
	JTextField emailArea = new JTextField();
	JTextField pasahitzaArea = new JTextField();
	
	public LoginUI() {
		nagusia = new JFrame("Login pantaila");
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
		JButton loginBotoia = new JButton("Login");
//		loginBotoia.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Kudeatzailea.getInstantzia().setErabiltzailea(erabiltzaileArea.getText());
//				Kudeatzailea.getInstantzia().setPasahitza(pasahitzaArea.getText());
//				Data db = new Data();
//				Connection konexioa = db.conn;
//				nagusia.dispose();
//			}
//		});
		
		JButton bazkideBotoia = new JButton("Bazkide egin!");
		bazkideBotoia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BazkideUI baz = new BazkideUI();
				baz.bistaratu();
				nagusia.dispose();
			}
		});
			
		JPanel behekoPanela= new JPanel();
		behekoPanela.add(loginBotoia);
		behekoPanela.add(bazkideBotoia);
		panelNagusia.add(behekoPanela, BorderLayout.SOUTH);
	}
	
	public String setUser() {
		return this.erabiltzaileArea.getText();
	}
	
	public String setEmail() {
		return this.emailArea.getText();
	}
	
	public String setPassword() {
		return this.pasahitzaArea.getText();
	}
	
	public void bistaratu() {
		nagusia.setSize(275, 125);
		nagusia.setVisible(true);
		nagusia.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		LoginUI pantaila = new LoginUI();
		pantaila.bistaratu();
	}
}