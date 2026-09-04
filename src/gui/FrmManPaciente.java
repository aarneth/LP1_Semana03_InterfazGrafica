package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class FrmManPaciente extends JInternalFrame {
	private JTextField txtNombre;
	private JTextField txtApellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmManPaciente frame = new FrmManPaciente();
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
	public FrmManPaciente() {
		setFrameIcon(new ImageIcon(FrmManPaciente.class.getResource("/iconos/Edit.gif")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Mantenimiento de Pacientes");
		setMaximizable(true);
		setIconifiable(true);
		setResizable(true);
		setClosable(true);
		setBounds(100, 100, 586, 377);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mantenimiento de Pacientes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(40, 32, 486, 39);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(112, 121, 121, 32);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApellido.setBounds(112, 176, 121, 32);
		getContentPane().add(lblApellido);
		
		txtNombre = new JTextField();
		txtNombre.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombre.setBounds(231, 127, 192, 24);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setHorizontalAlignment(SwingConstants.LEFT);
		txtApellido.setColumns(10);
		txtApellido.setBounds(231, 182, 192, 24);
		getContentPane().add(txtApellido);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setForeground(new Color(0, 128, 0));
		btnRegistrar.setBounds(231, 282, 89, 23);
		getContentPane().add(btnRegistrar);

	}
}
