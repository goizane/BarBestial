package taulaJokalaria;

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
import taulaHistorikoa.TableModelHistorikoa;


public class Taula extends JFrame{
	JButton irten = new JButton();
	JButton berriroHasi = new JButton();
	JButton egunekoPartidak = new JButton();
	JButton partidaOnenak = new JButton();
	
	JPanel botoiak = new JPanel();
	
	public Taula(){
		super("ZURE PARTIDA ONENAK");
		irten.setText("Irten");
		berriroHasi.setText("Berriro hasi");
		egunekoPartidak.setText("Eguneko partidak ikusi");
		partidaOnenak.setText("Partida onenak ikusi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TableModelHistorikoa TableModel = new TableModelHistorikoa();
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
		partidaOnenak.addActionListener(new ActionListener() {
				
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new taulaHistorikoa.Taula();
					setVisible(false);
				}
		});
	
		egunekoPartidak.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new taulaEgunekoPartidak.Taula();
				setVisible(false);
			}
	});
		pack();
		setVisible(true);
	}
}