package interfazea;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import logika.KanguroKarta;
import logika.Karta;



public class KanguroUI extends JFrame {
	
	JButton botoia1 = new JButton();
	JButton botoia2 = new JButton();
	JLabel label = new JLabel();
	public KanguroUI(){
		super("Kanguro panela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setText("Zenbat karta saltatu nahi dituzu?");
		add(label,BorderLayout.NORTH );
		botoia1.setText("1");
		botoia2.setText("2");
		setLayout(new GridLayout(1,0));
		add(botoia1);
		add(botoia2);
		
		botoia1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Karta k = new KanguroKarta();
				k.animaladaEgin(1);
			}
});
		
		botoia2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Karta k = new KanguroKarta();
				k.animaladaEgin(2);
			}
});
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new KanguroUI();
	}
}
