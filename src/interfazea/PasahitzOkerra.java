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

public class PasahitzOkerra extends JFrame{
	
	JLabel testua = new JLabel();
	JButton berriroSaiatu = new JButton();
	JButton bazkideEgin = new JButton();
	
	JPanel botoiak = new JPanel();
	
	public PasahitzOkerra(){
		super("Galdu panela");
		
		testua.setText("Pasahitza ez da zuzena. Berriro saiatu! Oraindik bazkide ez ba zara sakatu bazkide egin botoia!");
		berriroSaiatu.setText("Berriro saiatu");
		bazkideEgin.setText("Bazkide egin!");
		
		botoiak.add(berriroSaiatu);
		botoiak.add(bazkideEgin);
		
		botoiak.setLayout(new GridLayout(1, 2));
		
		add(testua, BorderLayout.SOUTH);
		add(botoiak, BorderLayout.NORTH);
		pack();
		setVisible(true);
		
		berriroSaiatu.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				new BazkideEginUI();
				setVisible(false);
			}
	});
		
		bazkideEgin.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				new BazkideEginUI();
				setVisible(false);
			}
	});
		
		
	}
public static void main(String[] args) {
	new PasahitzOkerra();
}
}
