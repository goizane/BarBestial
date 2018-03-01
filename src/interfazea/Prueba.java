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

public class Prueba extends JFrame {
	
	private JPanel contentPane;
	JMenuBar menuBarra= new JMenuBar();
	JMenu hasi = new JMenu();
	JMenu laguntza = new JMenu();
	JTextField[] kartak = new JTextField[4];
	
	public Prueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new FlowLayout());
		setContentPane(contentPane);
			//Menu
			this.setJMenuBar(menuBarra);
			this.setTitle("Bar Bestial");
			hasi.setText("Hasi");
			laguntza.setText("laguntza");
			menuBarra.add(hasi);
			menuBarra.add(laguntza);
			//Menu*
			ArrayList<String> kartaZerrenda = new ArrayList();
			kartaZerrenda.add("1");
			kartaZerrenda.add("2");
			kartaZerrenda.add("3");
			kartaZerrenda.add("4");
			kartaZerrenda.add("5");
//			this.add(new JLabel(new ImageIcon("/pruebas/mazo.jpg")));
		kartak[0] = new JTextField("0");
		this.add(kartak[0]);
			for(int i =0; i<4; i++){
			kartak[i] = new JTextField(kartaZerrenda.get(i));
			this.add(kartak[i]);
		}
//			ImageIcon mazo = new ImageIcon("/pruebas/src/mazo.jpg");
//			JLabel lable = new JLabel(mazo);
//		    JScrollPane jsp = new JScrollPane(lable);
//		    this.getContentPane().add(jsp);
//		    this. setSize(1000,700);
	}
	public static void main(String[] args) {
		
		Frame frame = new Prueba();
//		JFrame frame = new JFrame("main");
//	      .setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon ii = new ImageIcon("C:/Users/Julen/workspace/pruebas/src/mazo.jpg");
	      JLabel lable = new JLabel(ii);
	      JScrollPane jsp = new JScrollPane(lable);
	      ((JFrame) frame).getContentPane().add(jsp);
	      frame. setSize(1000, 700);

		frame.setVisible(true);
	}
}
