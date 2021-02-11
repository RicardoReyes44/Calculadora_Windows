import java.awt.*;
import javax.swing.*;


public class Calculadora extends JFrame{

	JButton btnSuma = new JButton();
	JButton btnResta = new JButton();
	JButton btnMult = new JButton();
	JButton btnDiv = new JButton();
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
