import java.awt.*;
import javax.swing.*;


public class Calculadora extends JFrame{

	// -------------------------------------------------
	//                     Widgets
	// -------------------------------------------------
	
	JButton btnSuma = new JButton("+");
	JButton btnResta = new JButton("-");
	JButton btnMult = new JButton("x");
	JButton btnDiv = new JButton("/");
	JButton btnUnoSobreX = new JButton("1/x");
	JButton btnIgual = new JButton("=");

	JButton btnBorrar = new JButton("<-");
	JButton btnCuadrado = new JButton("x²");
	JButton btnNueve = new JButton("9");
	JButton btnSeis = new JButton("6");
	JButton btnTres = new JButton("3");
	JButton btnPunto= new JButton(".");

	JButton btnUno = new JButton("1");
	JButton btnCuatro = new JButton("4");
	JButton btnSiete = new JButton("5");
	JButton btnCE = new JButton("CE");
	JButton btnPorcentaje = new JButton("%");
	JButton btnMasMenos = new JButton("+-");

	JButton btnOcho = new JButton("8");
	JButton btnC = new JButton("C");
	JButton btnRaiz = new JButton("√");
	JButton btnCinco = new JButton("5");
	JButton btnDos = new JButton("2");
	JButton btnCero = new JButton("0");
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();




	// -------------------------------------------------
	//                    Constructor
	// -------------------------------------------------

	public Calculadora(){
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setVisible(true);

		// --------------------------------------------------
		
		alinearElemento(0, 0, 1, 1, btnPorcentaje);
		alinearElemento(1, 0, 1, 1, btnRaiz);
		alinearElemento(2, 0, 1, 1, btnCuadrado);
		alinearElemento(3, 0, 1, 1, btnUnoSobreX);
		
		
		// --------------------------------------------------
		
		pack();
		setLocationRelativeTo(null);
		
	}




	// -------------------------------------------------
	//                    Metodos
	// -------------------------------------------------
	
	public void alinearElemento(int x, int y, int height, int width, Component componente) {
		
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridheight = height;
		gbc.gridwidth = width;
		
		gbl.setConstraints(componente, gbc);
		add(componente);
		
	}




	// -------------------------------------------------
	//                    Eventos
	// -------------------------------------------------

}
