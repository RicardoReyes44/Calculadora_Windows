import java.awt.*;
import javax.swing.*;


public class Calculadora extends JFrame{

	JButton btnSuma = new JButton();
	JButton btnResta = new JButton();
	JButton btnMult = new JButton();
	JButton btnDiv = new JButton();
	JButton btnUnoSobreX = new JButton();
	JButton btnIgual = new JButton();

	JButton btnBorrar = new JButton();
	JButton btnCuadrado = new JButton();
	JButton btnNueve = new JButton();
	JButton btnSeis = new JButton();
	JButton btnTres = new JButton();
	JButton btnPunto= new JButton();

	JButton btnUno = new JButton();
	JButton btnCuatro = new JButton();
	JButton btnSiete = new JButton();
	JButton btnCE = new JButton();
	JButton btnPorcentaje = new JButton();
	JButton btnMasMenos = new JButton();

	JButton btnOcho = new JButton();
	JButton btnC = new JButton();
	JButton btnRaiz = new JButton();
	JButton btnCinco = new JButton();
	JButton btnDos = new JButton();
	JButton btnCero = new JButton();
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	public Calculadora(){
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setVisible(true);
		
		// --------------------------------------------------
		
        
		
		// --------------------------------------------------
		
		pack();
		setLocationRelativeTo(null);
		
	}
	
	public void alinearElemento(int x, int y, int height, int width, Component componente) {
		
	}

}
