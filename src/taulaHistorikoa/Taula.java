package taulaHistorikoa;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import kudeatzaileak.TaulaKudeatzailea;


public class Taula extends JFrame{
	JButton irten = new JButton();
	JButton berriroHasi = new JButton();
	JButton zurePartidak = new JButton();
	JButton egunekoPartidak = new JButton();
	
	JPanel botoiak = new JPanel();
	
	public Taula(){
		super("PARTIDA HISTORIKOAK");
		irten.setText("Irten");
		berriroHasi.setText("Berriro hasi");
		zurePartidak.setText("Zure partidak ikusi");
		egunekoPartidak.setText("Eguneko partidak ikusi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TableModelHistorikoak TableModel = new TableModelHistorikoak();
		JTable table = new JTable(TableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		
		botoiak.setLayout(new GridLayout(2, 2));
		
		add(scrollPane,BorderLayout.NORTH );
		add(botoiak,BorderLayout.SOUTH);
irten.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
});
	
	berriroHasi.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent e) {
			String izena = TaulaKudeatzailea.getTaulaKudeatzailea().getIzena();
			TaulaKudeatzailea.getTaulaKudeatzailea().hasieratu(izena);
			setVisible(false);
		}
});
	;
	egunekoPartidak.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new taulaEgunekoPartidak.Taula();
				setVisible(false);
			}
	});

	zurePartidak.addActionListener(new ActionListener() {
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new taulaJokalaria.Taula();
			setVisible(false);
		}
});
		pack();
		setVisible(true);
	}
}