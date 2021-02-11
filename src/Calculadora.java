import java.awt.*;
import javax.swing.*;


public class Calculadora extends JFrame{

	JButton btnSuma = new JButton();
	JButton btnResta = new JButton();
	JButton btnMult = new JButton();
	JButton btnDiv = new JButton();
	JButton btnIgual = new JButton();

	JButton btnBorrar = new JButton();
	JButton btnNueve = new JButton();
	JButton btnSeis = new JButton();
	JButton btnTres = new JButton();
	JButton btnPunto= new JButton();

	JButton btnUno = new JButton();
	JButton btnCuatro = new JButton();
	JButton btnSiete = new JButton();
	JButton btnCE = new JButton();
	JButton btnMasMenos = new JButton();
	
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
