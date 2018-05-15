package interfazea;

import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LaguntzaUI extends JDialog{

	private JLabel laguntza = new JLabel();
	private JLabel laguntza1 = new JLabel();
	private JLabel laguntza2 = new JLabel();
	private JLabel laguntza3 = new JLabel();
	private JLabel laguntza4 = new JLabel();
	private JLabel laguntza5 = new JLabel();
	private JPanel panelNagusia = new JPanel();
	public LaguntzaUI(){
		laguntza.setText("Joko hau karta joko bat da, karta bakoitzak animali bat eta kolore bat izango du. Animali bakoitzak “animalada” eta zenbaki bat izango ditu.");
		laguntza1.setText("Jokalari bakoitzak karta kolore bat izango du. Kolore bereko kartak nahastu eta gero, jokalari bakoitzak lau karta hartuko ditu, hauek eskuko kartak izango dira. ");
		laguntza2.setText("Gainontzekoak, mahaian utziko ditu pilatuta eta buruz behera. Mahaian bi karta kokatuko dira: tabernako atea, eta kalea.");
		laguntza3.setText("Tableroan, jokalariek kartak jartzen joango dira, ilaran. Bost karta egon daitezke gehienez, eta kopuru horretara heltzean ilaran kokatuta dauden lehenengo bi kartak tabernara sartuko dira, eta azkenekoa kalera joango da.");
		laguntza4.setText("Jokalari bat jolasten hasten denean, bere eskuko kartetatik bat aukeratuko du, animali hori ilaran jarriko da eta bere “animalada” egikarituko du. Animali bakoitzak “animalda” ezberdinak egingo ditu. ");
		laguntza5.setText("Gainera, animali batzuk animalada rekurrenteak izango dituzte, hau da, animali berri bat ilaran jartzen den bakoitzean, bere animalada egin eta gero, animali errekurrenteek beraien animaladak egikarituko dituzte.");
		panelNagusia.setLayout(new GridLayout(6,1));
		panelNagusia.add(laguntza);
		panelNagusia.add(laguntza1);
		panelNagusia.add(laguntza2);
		panelNagusia.add(laguntza3);
		panelNagusia.add(laguntza4);
		panelNagusia.add(laguntza5);
		add(panelNagusia);
		
		setVisible(true);
		pack();
	}
	
}
