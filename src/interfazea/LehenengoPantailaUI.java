package interfazea;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import kudeatzaileak.TaulaKudeatzailea;

public class LehenengoPantailaUI extends JFrame{
	
	JButton login = new JButton();
	JButton bazkide = new JButton();
	
	public LehenengoPantailaUI(){
		super(" Lehenengo pantaila");
		login.setText("Login");
		bazkide.setText("Bazkide egin");
		
		add(login, BorderLayout.EAST);
		add(bazkide, BorderLayout.WEST);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		
		login.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				new LoginUI();
				setVisible(false);
			}
	});
		
		bazkide.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				BazkideEginUI b =new BazkideEginUI();
				b.bistaratu();
				setVisible(false);
			}
	});
	}

	public static void main(String[] args) {
		new LehenengoPantailaUI();
		
		
	}

}
