package interfazea;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kudeatzaileak.LoginKud;
import kudeatzaileak.TaulaKudeatzailea;

public class LoginUI extends JFrame {
	
	JTextField izena = new JTextField();
	JTextField pasahitza = new JTextField();
	
	JLabel izenaL = new JLabel();
	JLabel pasahitzaL = new JLabel();
	
	JButton bazkide = new JButton();
	JButton atzera = new JButton();
	JButton login = new JButton();
	
	JPanel datuak = new JPanel();
	JPanel botoiak = new JPanel();
	
	public LoginUI(){
		super("Login pantaila");
		
		izenaL.setText("Izena: ");
		pasahitzaL.setText("Pasahitza: ");
		bazkide.setText("Bazkide egin!");
		atzera.setText("Atzera");
		login.setText("Login");
		
		datuak.add(izenaL);
		datuak.add(izena);
		datuak.add(pasahitzaL);
		datuak.add(pasahitza);
		
		
		datuak.setLayout(new GridLayout(2, 2));
		
		botoiak.add(bazkide);
		botoiak.add(atzera);
		botoiak.add(login);
		
		botoiak.setLayout(new GridLayout(1, 3));
		
		add(datuak, BorderLayout.NORTH);
		add(botoiak, BorderLayout.SOUTH);
		pack();
		setVisible(true);
		
		bazkide.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				BazkideEginUI b =new BazkideEginUI();
				b.bistaratu();
				setVisible(false);
			}
	});
		atzera.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				LehenengoPantailaUI lp =new LehenengoPantailaUI();
				
				setVisible(false);
			}
	});
		
		login.addActionListener(new ActionListener() {
					
					
					public void actionPerformed(ActionEvent e) {
						boolean zuzena = LoginKud.getInstantzia().frogatuLogin(izena.getText(), pasahitza.getText());
//						String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
						if (zuzena==true) {
							TaulaKudeatzailea.getTaulaKudeatzailea().hasieratu(izena.getText());
							setVisible(false);
						}
						else {
							new LoginErroreUI();
							setVisible(false);
						}
					}
			});
	}
	public static void main(String[] args) {
		new LoginUI();
	}

}
