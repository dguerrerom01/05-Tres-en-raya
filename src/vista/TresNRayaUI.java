package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;

public class TresNRayaUI extends JFrame {

	private JPanel contentPane;
	protected Botonera botonera;
	public JLabel lblMensaje;
	public JLabel lblTurno;
	/**
	 * Create the frame.
	 */
	public TresNRayaUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{31, 31, 0};
		gbl_contentPane.rowHeights = new int[]{15, 70, 16, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblTresEnRaya = new JLabel("Tres en raya");
		lblTresEnRaya.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblTresEnRaya = new GridBagConstraints();
		gbc_lblTresEnRaya.gridwidth = 2;
		gbc_lblTresEnRaya.insets = new Insets(0, 0, 5, 0);
		gbc_lblTresEnRaya.gridx = 0;
		gbc_lblTresEnRaya.gridy = 0;
		contentPane.add(lblTresEnRaya, gbc_lblTresEnRaya);
		botonera=new Botonera(100, 0);
		GridBagConstraints gbc_botonera = new GridBagConstraints();
		gbc_botonera.gridwidth = 2;
		gbc_botonera.insets = new Insets(0, 0, 5, 0);
		gbc_botonera.fill = GridBagConstraints.BOTH;
		gbc_botonera.gridx = 0;
		gbc_botonera.gridy = 1;
		contentPane.add(botonera, gbc_botonera);
		
		lblMensaje = new JLabel(" ");
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.insets = new Insets(0, 0, 0, 5);
		gbc_lblMensaje.anchor = GridBagConstraints.WEST;
		gbc_lblMensaje.gridx = 0;
		gbc_lblMensaje.gridy = 2;
		contentPane.add(lblMensaje, gbc_lblMensaje);
		
		lblTurno = new JLabel("Turno de O");
		GridBagConstraints gbc_lblTurno = new GridBagConstraints();
		gbc_lblTurno.gridx = 1;
		gbc_lblTurno.gridy = 2;
		contentPane.add(lblTurno, gbc_lblTurno);
	}

}
