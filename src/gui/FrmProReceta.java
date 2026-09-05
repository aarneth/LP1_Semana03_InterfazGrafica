package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JFrame;

public class FrmProReceta extends JInternalFrame implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JTable table;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnCancelar;
	private JLabel lblEstatura;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblPeso;
	private JTextField textField_9;
	private JLabel lblTipoSangre;
	private JTextField textField_10;
	private JLabel lblPresion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProReceta frame = new FrmProReceta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmProReceta() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 734, 577);
		getContentPane().setLayout(null);
		
		JLabel lblRecetaDigital = new JLabel("RECETA DIGITAL");
		lblRecetaDigital.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecetaDigital.setFont(new Font("HP Simplified", Font.BOLD, 39));
		lblRecetaDigital.setBounds(10, 11, 698, 43);
		getContentPane().add(lblRecetaDigital);
		
		JLabel lblPaciente = new JLabel("Paciente:");
		lblPaciente.setBounds(50, 112, 58, 24);
		getContentPane().add(lblPaciente);
		
		textField = new JTextField();
		textField.setBounds(137, 114, 186, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(127, 335, 186, 20);
		getContentPane().add(textField_1);
		
		JLabel lblBuscarMedicamento = new JLabel("Medicamento:");
		lblBuscarMedicamento.setBounds(50, 147, 108, 24);
		getContentPane().add(lblBuscarMedicamento);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(386, 145, 58, 24);
		getContentPane().add(lblCantidad);
		
		JLabel lblIndicacionesdosisfrecuenciava = new JLabel("Indicaciones (Dosis/Frecuencia/Vía):");
		lblIndicacionesdosisfrecuenciava.setBounds(50, 182, 234, 24);
		getContentPane().add(lblIndicacionesdosisfrecuenciava);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 149, 186, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(463, 145, 203, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(50, 204, 616, 103);
		getContentPane().add(textField_4);
		
		JLabel lblAlergia = new JLabel("Alergia:");
		lblAlergia.setBounds(50, 333, 58, 24);
		getContentPane().add(lblAlergia);
		
		btnNewButton = new JButton("Guardar Receta");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(50, 493, 127, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnEjecutarYEnviar = new JButton("Ejecutar y Enviar Firma Digital");
		btnEjecutarYEnviar.setBounds(267, 493, 208, 23);
		getContentPane().add(btnEjecutarYEnviar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(577, 493, 89, 23);
		getContentPane().add(btnCancelar);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setBounds(60, 351, 263, -21);
		getContentPane().add(table);
		
		JLabel lblDniPaciente = new JLabel("DNI Paciente:");
		lblDniPaciente.setBounds(50, 76, 72, 24);
		getContentPane().add(lblDniPaciente);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(137, 78, 186, 20);
		getContentPane().add(textField_5);
		
		JLabel lblNReceta = new JLabel("N° Receta:");
		lblNReceta.setBounds(386, 77, 58, 24);
		getContentPane().add(lblNReceta);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(463, 79, 203, 20);
		getContentPane().add(textField_6);
		
		lblEstatura = new JLabel("Estatura:");
		lblEstatura.setBounds(386, 335, 58, 24);
		getContentPane().add(lblEstatura);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(463, 337, 203, 20);
		getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(463, 372, 203, 20);
		getContentPane().add(textField_8);
		
		lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(386, 370, 58, 24);
		getContentPane().add(lblPeso);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(463, 405, 203, 20);
		getContentPane().add(textField_9);
		
		lblTipoSangre = new JLabel("Tipo Sangre:");
		lblTipoSangre.setBounds(386, 403, 67, 24);
		getContentPane().add(lblTipoSangre);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(127, 403, 186, 20);
		getContentPane().add(textField_10);
		
		lblPresion = new JLabel("Presión:");
		lblPresion.setBounds(50, 401, 58, 24);
		getContentPane().add(lblPresion);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			btnCancelarActionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			btnNewButtonActionPerformed(e);
		}
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) {
	}
	protected void btnCancelarActionPerformed(ActionEvent e) {
	}
}
