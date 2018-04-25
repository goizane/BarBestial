package interfazea;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import logika.KanguroKarta;
import logika.Karta;



public class KanguroUI extends JFrame {
	
	JButton botoia1 = new JButton();
	JButton botoia2 = new JButton();
	JLabel label = new JLabel();
	JPanel zenbakienPanela = new JPanel();
	
	public KanguroUI(){
		super("Kanguro panela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setText("Zenbat karta saltatu nahi dituzu?");
		add(label,BorderLayout.NORTH );
		botoia1.setText("1");
		botoia2.setText("2");
		
		
		zenbakienPanela.setLayout(new GridLayout(1, 2));
		zenbakienPanela.add(botoia1);
		zenbakienPanela.add(botoia2);
		add(zenbakienPanela, BorderLayout.SOUTH);
		pack();
		setVisible(true);
		
		botoia1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("salto bat egin nahi du");
				Karta k = new KanguroKarta("");
				TaulaKudeatzailea.getTaulaKudeatzailea().kanguroariSaltoaEsleitu(1);
				TaulaKudeatzailea.getTaulaKudeatzailea().animaladaEgin(k);
				TaulaKudeatzailea.getTaulaKudeatzailea().animaladaErrekurtsiboakEgin();
				
				setVisible(false);
			}
});
		
		botoia2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(" bi salto egin nahi ditu");
				Karta k = new KanguroKarta("");
				TaulaKudeatzailea.getTaulaKudeatzailea().kanguroariSaltoaEsleitu(2);
				TaulaKudeatzailea.getTaulaKudeatzailea().animaladaEgin(k);
				
				TaulaKudeatzailea.getTaulaKudeatzailea().animaladaErrekurtsiboakEgin();
				setVisible(false);
			}
});
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new KanguroUI();
	}
}
