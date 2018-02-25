package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {

	TresNRaya control=new TresNRaya();
	JButton[][] botones;
	int posicionActualX,posicionActualY;
	

	public MyActionListener(JButton[][] botones) {
		this.botones=botones;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		reconoceBoton(e.getSource());
		asociaCoordenada();
		control.realizarJugada();
		recorreBotonera();
	}

	private void recorreBotonera() {
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				botones[i][j].setText(String.valueOf(control.retornaSimbolo(control.tablero[i][j])));
			}
		}
		
	}

	private void asociaCoordenada() {
		control.asignarPosicion(posicionActualX, posicionActualY);
	}

	private void reconoceBoton(Object source) {
			JButton boton=(JButton)source;
			posicionActualX=Integer.valueOf(Character.toString(boton.getName().charAt(0)));
			posicionActualY=Integer.valueOf(Character.toString(boton.getName().charAt(1)));
			System.out.println("la posicion actual es "+posicionActualX+":"+posicionActualY);
	}

	public int getPosicionActualX() {
		return posicionActualX;
	}

	public int getPosicionActualY() {
		return posicionActualY;
	}

}
