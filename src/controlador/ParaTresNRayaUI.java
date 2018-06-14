package controlador;

import vista.TresNRayaUI;

public class ParaTresNRayaUI extends TresNRayaUI {
	MyActionListener listener = new MyActionListener(this.botonera.botones, this.lblMensaje, this.lblTurno);

	public ParaTresNRayaUI() {
		super();
		for (int i = 0; i < this.botonera.botones.length; i++) {
			for (int j = 0; j < this.botonera.botones[i].length; j++) {
				this.botonera.botones[i][j].addActionListener(listener);
			}
		}
	}

}
