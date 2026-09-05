package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrmProCita extends JInternalFrame implements ActionListener {
	private JTextField textField_DNI;
	private JTextField textField_NombreCompleto;
	private JTextField textField_Telefono;
	private JTextField textField_Motivo;
	private JButton btnNuevo;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProCita frame = new FrmProCita();
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
	public FrmProCita() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("Proceso de Cita");
		setBounds(100, 100, 931, 525);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_TituloProcesoCita = new JLabel("Proceso de Cita");
		lblNewLabel_TituloProcesoCita.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_TituloProcesoCita.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 55));
		lblNewLabel_TituloProcesoCita.setBounds(208, 11, 467, 80);
		getContentPane().add(lblNewLabel_TituloProcesoCita);
		
		JLabel lblNewLabel_DatosPaciente = new JLabel("Datos del Paciente");
		lblNewLabel_DatosPaciente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_DatosPaciente.setBounds(44, 107, 142, 19);
		getContentPane().add(lblNewLabel_DatosPaciente);
		
		textField_DNI = new JTextField();
		textField_DNI.setBounds(208, 151, 263, 20);
		getContentPane().add(textField_DNI);
		textField_DNI.setColumns(10);
		
		JLabel lblNewLabel_DNI = new JLabel("DNI");
		lblNewLabel_DNI.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_DNI.setBounds(44, 138, 30, 42);
		getContentPane().add(lblNewLabel_DNI);
		
		JLabel lblNewLabel_NombreCompleto = new JLabel("Nombre completo");
		lblNewLabel_NombreCompleto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_NombreCompleto.setBounds(44, 190, 142, 19);
		getContentPane().add(lblNewLabel_NombreCompleto);
		
		textField_NombreCompleto = new JTextField();
		textField_NombreCompleto.setColumns(10);
		textField_NombreCompleto.setBounds(208, 187, 263, 20);
		getContentPane().add(textField_NombreCompleto);
		
		JLabel lblNewLabel_Telefono = new JLabel("Teléfono");
		lblNewLabel_Telefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_Telefono.setBounds(44, 230, 142, 19);
		getContentPane().add(lblNewLabel_Telefono);
		
		textField_Telefono = new JTextField();
		textField_Telefono.setColumns(10);
		textField_Telefono.setBounds(208, 231, 263, 20);
		getContentPane().add(textField_Telefono);
		
		JLabel lblNewLabel_DatosEspecialidad = new JLabel("Datos del especialista");
		lblNewLabel_DatosEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_DatosEspecialidad.setBounds(44, 281, 184, 19);
		getContentPane().add(lblNewLabel_DatosEspecialidad);
		
		JLabel lblNewLabel_Especialidad = new JLabel("Especialidad:");
		lblNewLabel_Especialidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_Especialidad.setBounds(44, 320, 142, 19);
		getContentPane().add(lblNewLabel_Especialidad);
		
		JComboBox comboBox_Especialidad = new JComboBox();
		comboBox_Especialidad.setBounds(208, 320, 263, 22);
		getContentPane().add(comboBox_Especialidad);
		
		JLabel lblNewLabel_Medico = new JLabel("Médico:");
		lblNewLabel_Medico.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_Medico.setBounds(44, 365, 142, 19);
		getContentPane().add(lblNewLabel_Medico);
		
		JComboBox comboBox_Medico = new JComboBox();
		comboBox_Medico.setBounds(208, 365, 263, 22);
		getContentPane().add(comboBox_Medico);
		
		JLabel lblNewLabel_DetalleCita = new JLabel("Detalles de la cita");
		lblNewLabel_DetalleCita.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_DetalleCita.setBounds(511, 107, 184, 19);
		getContentPane().add(lblNewLabel_DetalleCita);
		
		JLabel lblNewLabel_Fecha = new JLabel("Fecha:");
		lblNewLabel_Fecha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_Fecha.setBounds(510, 150, 142, 19);
		getContentPane().add(lblNewLabel_Fecha);
		
		JLabel lblNewLabel_Hora = new JLabel("Hora:");
		lblNewLabel_Hora.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_Hora.setBounds(511, 190, 70, 19);
		getContentPane().add(lblNewLabel_Hora);
		
		JLabel lblNewLabel_Motivo = new JLabel("Motivo:");
		lblNewLabel_Motivo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_Motivo.setBounds(511, 230, 142, 19);
		getContentPane().add(lblNewLabel_Motivo);
		
		textField_Motivo = new JTextField();
		textField_Motivo.setBounds(591, 230, 288, 95);
		getContentPane().add(textField_Motivo);
		textField_Motivo.setColumns(10);
		
		JComboBox comboBox_Hora = new JComboBox();
		comboBox_Hora.setBounds(591, 190, 84, 22);
		getContentPane().add(comboBox_Hora);
		
		JComboBox comboBox_Fecha = new JComboBox();
		comboBox_Fecha.setBounds(591, 150, 142, 22);
		getContentPane().add(comboBox_Fecha);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setIcon(new ImageIcon(FrmProCita.class.getResource("/iconos/Add.gif")));
		btnNuevo.addActionListener(this);
		btnNuevo.setBounds(44, 430, 128, 33);
		getContentPane().add(btnNuevo);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setIcon(new ImageIcon(FrmProCita.class.getResource("/iconos/Report.gif")));
		btnRegistrar.setBounds(208, 430, 135, 33);
		getContentPane().add(btnRegistrar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(FrmProCita.class.getResource("/iconos/Notes.gif")));
		btnModificar.setBounds(375, 430, 135, 33);
		getContentPane().add(btnModificar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(FrmProCita.class.getResource("/iconos/Delete.gif")));
		btnCancelar.setBounds(538, 430, 135, 33);
		getContentPane().add(btnCancelar);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setIcon(new ImageIcon(FrmProCita.class.getResource("/iconos/Exit.gif")));
		btnCerrar.setBounds(707, 430, 135, 33);
		getContentPane().add(btnCerrar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrar) {
			actionPerformedBtnNewButton_1(e);
		}
		if (e.getSource() == btnNuevo) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
	}
}
