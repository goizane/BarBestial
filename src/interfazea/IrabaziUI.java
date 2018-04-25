package interfazea;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import logika.Karta;
import logika.MofetaKarta;

public class IrabaziUI extends JFrame {
	JLabel label1 = new JLabel();

	JButton botoia1 = new JButton();
	
	public IrabaziUI(){
		super("Irabazi panela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label1.setText("ZORIONAK IRABAZI DUZU!");
		botoia1.setText("Irten");
		
		add(label1,BorderLayout.NORTH );
		add(botoia1,BorderLayout.SOUTH );
		pack();
		setVisible(true);
		
		botoia1.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
});
	}
	public static void main(String[] args) {
		new IrabaziUI();
	}
}
