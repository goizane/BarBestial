package taulaHistorikoa;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import interfazea.JokalariPantailaUI;
import kudeatzaileak.TaulaKudeatzailea;


public class Taula extends JFrame{
	JButton atzera = new JButton();
	JButton berriroHasi = new JButton();
	JButton zurePartidak = new JButton();
	JButton gaurkoPartidak = new JButton();
	
	JPanel botoiak = new JPanel();
	
	public Taula(){
		super("PARTIDARIK ONENAK");
		atzera.setText("Bueltatu");
		berriroHasi.setText("Jokoa hasi");
		zurePartidak.setText("Zure partidak ikusi");
		gaurkoPartidak.setText("Gaurko partidak ikusi");

		TableModelHistorikoa TableModel = new TableModelHistorikoa();
		JTable table = new JTable(TableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		
		botoiak.add(berriroHasi);
		botoiak.add(gaurkoPartidak);
		botoiak.add(zurePartidak);

		botoiak.setLayout(new GridLayout(1, 3));
		
		add(scrollPane,BorderLayout.NORTH );
		add(botoiak,BorderLayout.SOUTH);
		
atzera.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new JokalariPantailaUI(TaulaKudeatzailea.getTaulaKudeatzailea().getIzena());
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
	gaurkoPartidak.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new taulaHistorikoa.Taula();
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
	public static void main(String[] args)  {
		new Taula();
	}
}
