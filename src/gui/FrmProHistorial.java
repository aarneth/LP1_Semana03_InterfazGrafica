package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FrmProHistorial extends JInternalFrame implements ActionListener {
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtFechaNacimiento;
	private JTextField txtTipoSangre;
	private JTextField txtDNI;
	private JButton btnGrabar;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProHistorial frame = new FrmProHistorial();
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
	public FrmProHistorial() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("Proceso Historial Médico");
		setBounds(100, 100, 814, 588);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Proceso Historial Médico");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(278, 11, 197, 25);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNumHistorial = new JLabel("Número de Historial Médico");
		lblNumHistorial.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumHistorial.setBounds(20, 58, 176, 25);
		getContentPane().add(lblNumHistorial);
		
		JLabel lblCodigoHistorial = new JLabel("HM-70294511-4");
		lblCodigoHistorial.setBounds(195, 64, 79, 14);
		getContentPane().add(lblCodigoHistorial);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombres.setBounds(20, 94, 126, 25);
		getContentPane().add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApellidos.setBounds(20, 130, 126, 25);
		getContentPane().add(lblApellidos);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFechaNacimiento.setBounds(20, 166, 126, 25);
		getContentPane().add(lblFechaNacimiento);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(155, 98, 136, 20);
		getContentPane().add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(155, 134, 136, 20);
		getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(155, 170, 136, 20);
		getContentPane().add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		JComboBox cmbSexo = new JComboBox();
		cmbSexo.setBounds(155, 237, 110, 22);
		getContentPane().add(cmbSexo);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSexo.setBounds(20, 234, 126, 25);
		getContentPane().add(lblSexo);
		
		JLabel lblEnfermedades = new JLabel("Tiene o ha tenido alguna vez:");
		lblEnfermedades.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnfermedades.setBounds(20, 372, 188, 25);
		getContentPane().add(lblEnfermedades);
		
		JCheckBox chckbxHipertension = new JCheckBox("Hipertension");
		chckbxHipertension.setBounds(30, 404, 85, 23);
		getContentPane().add(chckbxHipertension);
		
		JCheckBox chckbxAsma = new JCheckBox("Asma");
		chckbxAsma.setBounds(119, 404, 58, 23);
		getContentPane().add(chckbxAsma);
		
		JCheckBox chckbxDiabetes = new JCheckBox("Diabetes");
		chckbxDiabetes.setBounds(179, 404, 72, 23);
		getContentPane().add(chckbxDiabetes);
		
		JCheckBox chckbxAnemia = new JCheckBox("Anemia");
		chckbxAnemia.setBounds(263, 404, 66, 23);
		getContentPane().add(chckbxAnemia);
		
		JCheckBox chckbxColesterol = new JCheckBox("Colesterol Alto");
		chckbxColesterol.setBounds(333, 404, 97, 23);
		getContentPane().add(chckbxColesterol);
		
		JCheckBox chckbxIts = new JCheckBox("ITS/ETS/VPH");
		chckbxIts.setBounds(333, 430, 87, 23);
		getContentPane().add(chckbxIts);
		
		JLabel lblReaccinAlrgica = new JLabel("Reacción Alérgica");
		lblReaccinAlrgica.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblReaccinAlrgica.setBounds(20, 302, 126, 25);
		getContentPane().add(lblReaccinAlrgica);
		
		JCheckBox chckbxAspirina = new JCheckBox("Aspirina");
		chckbxAspirina.setBounds(30, 334, 66, 23);
		getContentPane().add(chckbxAspirina);
		
		JCheckBox chckbxPenicilina = new JCheckBox("Penicilina");
		chckbxPenicilina.setBounds(98, 334, 72, 23);
		getContentPane().add(chckbxPenicilina);
		
		JCheckBox chckbxEritromicina = new JCheckBox("Eritromicina");
		chckbxEritromicina.setBounds(172, 334, 85, 23);
		getContentPane().add(chckbxEritromicina);
		
		JCheckBox chckbxSulfonamida = new JCheckBox("Sulfonamida");
		chckbxSulfonamida.setBounds(253, 334, 91, 23);
		getContentPane().add(chckbxSulfonamida);
		
		JLabel lblTipoSangre = new JLabel("Tipo de Sangre");
		lblTipoSangre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTipoSangre.setBounds(20, 270, 126, 25);
		getContentPane().add(lblTipoSangre);
		
		txtTipoSangre = new JTextField();
		txtTipoSangre.setColumns(10);
		txtTipoSangre.setBounds(155, 273, 136, 20);
		getContentPane().add(txtTipoSangre);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDni.setBounds(20, 202, 126, 25);
		getContentPane().add(lblDni);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(156, 205, 136, 20);
		getContentPane().add(txtDNI);
		
		JCheckBox chckbxCorticoides = new JCheckBox("Corticoides");
		chckbxCorticoides.setBounds(30, 430, 85, 23);
		getContentPane().add(chckbxCorticoides);
		
		JCheckBox chckbxCancer = new JCheckBox("Cancer");
		chckbxCancer.setBounds(119, 430, 62, 23);
		getContentPane().add(chckbxCancer);
		
		JCheckBox chckbxTuberculosis = new JCheckBox("Tuberculosis");
		chckbxTuberculosis.setBounds(179, 430, 86, 23);
		getContentPane().add(chckbxTuberculosis);
		
		JCheckBox chckbxLeucemia = new JCheckBox("Leucemia");
		chckbxLeucemia.setBounds(263, 430, 72, 23);
		getContentPane().add(chckbxLeucemia);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setIcon(new ImageIcon(FrmProHistorial.class.getResource("/iconos/Tick.gif")));
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(226, 495, 126, 35);
		getContentPane().add(btnGrabar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon(FrmProHistorial.class.getResource("/iconos/Refresh.gif")));
		btnLimpiar.setBounds(366, 495, 126, 35);
		getContentPane().add(btnLimpiar);
		
		JButton btnNuevoPaciente = new JButton("Nuevo Paciente");
		btnNuevoPaciente.setIcon(new ImageIcon(FrmProHistorial.class.getResource("/iconos/User.gif")));
		btnNuevoPaciente.setBounds(508, 495, 151, 35);
		getContentPane().add(btnNuevoPaciente);
		
		JLabel lblMotivoDeConsulta = new JLabel("Motivo de Consulta");
		lblMotivoDeConsulta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMotivoDeConsulta.setBounds(467, 100, 126, 25);
		getContentPane().add(lblMotivoDeConsulta);
		
		textField = new JTextField();
		textField.setBounds(467, 130, 292, 72);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDiagnsstico = new JLabel("Diagnósstico");
		lblDiagnsstico.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDiagnsstico.setBounds(467, 225, 126, 25);
		getContentPane().add(lblDiagnsstico);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(467, 255, 292, 72);
		getContentPane().add(textField_1);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabarJButton(e);
		}
	}
	protected void actionPerformedBtnGrabarJButton(ActionEvent e) {
	}
}
