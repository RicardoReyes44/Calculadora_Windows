import java.awt.*;
import javax.swing.JFrame;


public class Calculadora extends JFrame{

	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	public Calculadora(){
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setVisible(true);
		
		pack();
		setLocationRelativeTo(null);
		
	}

}
