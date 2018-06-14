package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MyActionListener implements ActionListener {

	TresNRaya control = new TresNRaya();
	JButton[][] botones;
	JLabel lblMensaje;
	JLabel lblTurno;
	int posicionActualX, posicionActualY;

	public MyActionListener(JButton[][] botones, JLabel lblMensaje, JLabel lblTurno) {
		this.botones = botones;
		this.lblMensaje = lblMensaje;
		this.lblTurno = lblTurno;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		reconoceBoton(e.getSource());
		asociaCoordenada();
		if (control.realizarJugada()) {
			lblMensaje.setText(control.muestraLetrero());
		} else {
			lblMensaje.setText(control.indicarAnomalia());
		}
		recorreBotonera();
		comprobarTresEnRaya(e.getSource());
		actualizaTurno();
	}

	private void actualizaTurno() {
		lblTurno.setText("Turno de " + control.retornaSimbolo(control.verTurno()));
	}

	private void comprobarTresEnRaya(Object source) {
		if (control.comprobarTresEnRaya()) {
			JButton boton = (JButton) source;
			lblMensaje.setText("Ha ganado "
					+ control.retornaSimbolo(control.tablero[posicionActualX][posicionActualX]));
			for (int i = 0; i < botones.length; i++) {
				for (int j = 0; j < botones[i].length; j++) {
					botones[i][j].setEnabled(false);
				}
			}
		}
	}

	private void reconoceBoton(Object source) {
		JButton boton = (JButton) source;
		posicionActualX = Integer.valueOf(Character.toString(boton.getName().charAt(0)));
		posicionActualY = Integer.valueOf(Character.toString(boton.getName().charAt(1)));
	}

	private void asociaCoordenada() {
		control.asignarPosicion(posicionActualX, posicionActualY);
	}

	private void recorreBotonera() {
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				botones[i][j].setText(String.valueOf(control.retornaSimbolo(control.tablero[i][j])));
			}
		}
	}

	// Getters

	public int getPosicionActualX() {
		return posicionActualX;
	}

	public int getPosicionActualY() {
		return posicionActualY;
	}

}
