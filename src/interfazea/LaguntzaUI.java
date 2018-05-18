package interfazea;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LaguntzaUI extends JDialog{

	
	JLabel l = new JLabel();
	JLabel l1 = new JLabel();
	JLabel l2= new JLabel();
	JLabel l3= new JLabel();
	JLabel l4= new JLabel();
	JLabel l5= new JLabel();
	JLabel l6 = new JLabel();
	JLabel l7= new JLabel();
	JLabel l8= new JLabel();
	JLabel l9= new JLabel();
	JLabel l10= new JLabel();
	JLabel l11= new JLabel();
	private JPanel panelNagusia = new JPanel();
	public LaguntzaUI(){
	
		
		
		l.setText("Joko hau karta joko bat da, karta bakoitzak animali bat eta kolore bat izango du.");
		l1.setText("Animali bakoitzak “animalada” eta zenbaki bat izango ditu.Jokalari bakoitzak karta kolore ");
		l2.setText("bat izango du. Kolore bereko kartak nahastu eta gero, jokalari bakoitzak lau karta hartuko ditu, ");
		l3.setText("hauek eskuko kartak izango dira. Gainontzekoak, mahaian utziko ditu pilatuta eta buruz behera. ");
		l4.setText("Mahaian bi karta kokatuko dira: tabernako atea, eta kalea. Tableroan, jokalariek kartak jartzen");
		l5.setText("joango dira, ilaran. Bost karta egon daitezke gehienez, eta kopuru horretara heltzean ilaran ");
		l6.setText("kokatuta dauden lehenengo bi kartak tabernara sartuko dira, eta azkenekoa kalera joango da. ");
		l7.setText("Jokalari bat jolasten hasten denean, bere eskuko kartetatik bat aukeratuko du, animali hori ilaran");
		l8.setText("jarriko da eta bere “animalada” egikarituko du. Animali bakoitzak “animalda” ezberdinak egingo ditu.");
		l9.setText("Gainera, animali batzuk animalada rekurrenteak izango dituzte, hau da, animali berri bat ilaran");
		l10.setText("jartzen den bakoitzean, bere animalada egin eta gero, animali errekurrenteek beraien animaladak ");
		l11.setText("egikarituko dituzte.");

		panelNagusia.add(l);
		panelNagusia.add(l1);
		panelNagusia.add(l2);
		panelNagusia.add(l3);
		panelNagusia.add(l4);
		panelNagusia.add(l5);
		panelNagusia.add(l6);
		panelNagusia.add(l7);
		panelNagusia.add(l8);
		panelNagusia.add(l9);
		panelNagusia.add(l10);
		panelNagusia.add(l11);
		
		add(panelNagusia);		
		setVisible(true);
		setSize(600, 300);
		setMaximumSize(new Dimension(600, 300));
		setPreferredSize(new Dimension(600, 300));
		setTitle("Jokoaren arauak");
		pack();
	}
	
}
