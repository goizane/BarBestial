package interfazea;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Taula extends JFrame {

	private JPanel contentPane;
	JMenuBar menuBarra = new JMenuBar();
	JMenu hasi = new JMenu();
	JMenu laguntza = new JMenu();
	JTextField[] kartak = new JTextField[4];
	JPanel computerPanel= new JPanel();
	JPanel gamePanel= new JPanel();
	JPanel userPanel= new JPanel();

	public static void main(String[] args) {

		Frame frame = new Taula();
		// JFrame frame = new JFrame("main");
		// .setDefaultCloseOperation(EXIT_ON_CLOSE);
		/*
		 * ImageIcon ii = new ImageIcon("src/fitxategiak/mazo.png"); JLabel
		 * lable = new JLabel(ii); JScrollPane jsp = new JScrollPane(lable);
		 * ((JFrame) frame).getContentPane().add(jsp);
		 */
		frame.setSize(1000, 700);

		frame.setVisible(true);
	}

	public Taula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new FlowLayout());
		setContentPane(contentPane);
		// Menu
		this.setJMenuBar(menuBarra);
		this.setTitle("Bar Bestial");
		hasi.setText("Hasi");
		laguntza.setText("laguntza");
		menuBarra.add(hasi);
		menuBarra.add(laguntza);
		eskukoKartakKargatu("Berdea",this.computerPanel);
		computerPanel.setBounds(0, 0, 450, 100);
		this.getContentPane().add(computerPanel);
		gamePanel.setBounds(0, 0, 450, 100);
		this.getContentPane().add(gamePanel);
		eskukoKartakKargatu("Urdina",this.userPanel);
		userPanel.setBounds(0, 0, 450, 100);
		this.getContentPane().add(userPanel);
		
	}

	public void eskukoKartakKargatu(String jokalaria, JPanel panela) {
		ImageIcon ii;
		JLabel lable;
		JScrollPane jsp;
		if(jokalaria.equals("Berdea")){
			ii = new ImageIcon("src/fitxategiak/karta.png");
			 lable = new JLabel(ii);
			 jsp = new JScrollPane(lable);
			this.getContentPane().add(jsp);
		}
		boolean nahikoa = false;
		boolean badago = false;
		int kont = 0;
		List<Integer> kartaZerrenda = new ArrayList<Integer>();
		
		while (!nahikoa) {
			badago=false;
			Random random = new Random();
			int karta = random.nextInt(12 - 1 + 1) + 1;
			for (int i = 0; i < kartaZerrenda.size(); i++) {
				if (kartaZerrenda.get(i) == karta) {
					badago = true;
					break;
				}
			}
			if (!badago) {
				kartaZerrenda.add(karta);
				if (kartaZerrenda.size() == 4) {
					nahikoa = true;
				}
				if (karta == 1) {
					ii = new ImageIcon("src/fitxategiak/mofeta" + jokalaria + ".png");
					lable = new JLabel(ii);
					jsp = new JScrollPane(lable);
					panela.add(jsp);
//					this.getContentPane().add(jsp);
				} else if (karta == 2) {
					ii = new ImageIcon("src/fitxategiak/loro" + jokalaria + ".png");
					lable = new JLabel(ii);
					jsp = new JScrollPane(lable);
					panela.add(jsp);
				} else if (karta == 3) {
					ii = new ImageIcon("src/fitxategiak/kanguro" + jokalaria + ".png");
					lable = new JLabel(ii);
					jsp = new JScrollPane(lable);
					panela.add(jsp);
				} else if (karta == 4) {
					ii = new ImageIcon("src/fitxategiak/tximino" + jokalaria + ".png");
					lable = new JLabel(ii);
					jsp = new JScrollPane(lable);
					panela.add(jsp);
				} else if (karta == 5) {
					ii = new ImageIcon("src/fitxategiak/kamaleoi" + jokalaria + ".png");
					lable = new JLabel(ii);
					jsp = new JScrollPane(lable);
					panela.add(jsp);
				} else if (karta == 6) {
					ii = new ImageIcon("src/fitxategiak/foka" + jokalaria + ".png");
					lable = new JLabel(ii);
					jsp = new JScrollPane(lable);
					panela.add(jsp);
				} else if (karta == 7) {
					ii = new ImageIcon("src/fitxategiak/zebra" + jokalaria + ".png");
					lable = new JLabel(ii);
					jsp = new JScrollPane(lable);
					panela.add(jsp);
				} else if (karta == 8) {
					ii = new ImageIcon("src/fitxategiak/jirafa" + jokalaria + ".png");
					lable = new JLabel(ii);
					jsp = new JScrollPane(lable);
					panela.add(jsp);
				} else if (karta == 9) {
					ii = new ImageIcon("src/fitxategiak/suge" + jokalaria + ".png");
					lable = new JLabel(ii);
					jsp = new JScrollPane(lable);
					panela.add(jsp);
				} else if (karta == 10) {
					ii = new ImageIcon("src/fitxategiak/krokodilo" + jokalaria + ".png");
					lable = new JLabel(ii);
					jsp = new JScrollPane(lable);
					panela.add(jsp);
				} else if (karta == 11) {
					ii = new ImageIcon("src/fitxategiak/hipopotamo" + jokalaria + ".png");
					lable = new JLabel(ii);
					jsp = new JScrollPane(lable);
					panela.add(jsp);
				} else if (karta == 12) {
					ii = new ImageIcon("src/fitxategiak/lehoi" + jokalaria + ".png");
					lable = new JLabel(ii);
					jsp = new JScrollPane(lable);
					panela.add(jsp);
				}
			}

		}
		if(jokalaria.equals("Urdina")){
			ii = new ImageIcon("src/fitxategiak/karta.png");
			 lable = new JLabel(ii);
			 jsp = new JScrollPane(lable);
			this.getContentPane().add(jsp);
		}
	}
}
