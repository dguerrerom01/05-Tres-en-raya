package vista;

import javax.swing.JPanel;

import controlador.MyActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Botonera extends JPanel {

	public JButton botones[][];
	int anchoPanel=150,altoPanel=150;
	int ladoBoton=50;	
	/**
	 * Create the panel.
	 */
	public Botonera(int x,int y) {
		this.setBounds(x, y, this.anchoPanel, this.altoPanel);
		setLayout(new GridLayout(3, 0, 0, 0));
		iniciarBotonera();
	}
	private void iniciarBotonera(){
		this.botones = new JButton[3][3];
		int x=0,y=0;
		for (int i = 0; i < this.botones.length; i++) {
			for (int j = 0; j < this.botones[i].length; j++) {
				this.botones[i][j] = new JButton();
				this.botones[i][j].setName(String.valueOf(i)+String.valueOf(j));
				this.botones[i][j].setBounds(x, y, this.ladoBoton, this.ladoBoton);				
				this.add(this.botones[i][j]);
				x+=this.ladoBoton;
			}
			x=0;
			y+=this.ladoBoton;
		}
	}
}
