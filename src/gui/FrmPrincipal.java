package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntmPaciente;
	FrmManPaciente frmManPaciente = new FrmManPaciente();
	FrmProCita frmProCita = new FrmProCita();
	FrmProHistorial frmProHistorial = new FrmProHistorial();
	FrmProReceta frmProReceta = new FrmProReceta();
	private JMenuItem mntmHistorial;
	private JMenuItem mntmCita;
	private JMenuItem mntmReceta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
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
	public FrmPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmPrincipal.class.getResource("/iconos/Funny.gif")));
		setTitle("Sistema de gestión de Establecimientos Médicos");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Edit.gif")));
		menuBar.add(mnMantenimiento);
		
		mntmPaciente = new JMenuItem("Paciente");
		mntmPaciente.addActionListener(this);
		mnMantenimiento.add(mntmPaciente);
		
		JMenuItem mntmEspecialidad = new JMenuItem("Especialidad");
		mnMantenimiento.add(mntmEspecialidad);
		
		JMenuItem mntmMedico = new JMenuItem("Medico");
		mnMantenimiento.add(mntmMedico);
		
		JMenu mnProcesos = new JMenu("Procesos");
		mnProcesos.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Key.gif")));
		menuBar.add(mnProcesos);
		
		mntmHistorial = new JMenuItem("Historial Médico");
		mntmHistorial.addActionListener(this);
		mnProcesos.add(mntmHistorial);
		
		mntmCita = new JMenuItem("Cita");
		mntmCita.addActionListener(this);
		mnProcesos.add(mntmCita);
		
		mntmReceta = new JMenuItem("Receta");
		mntmReceta.addActionListener(this);
		mnProcesos.add(mntmReceta);
		
		JMenu mnConsultas = new JMenu("Consultas");
		mnConsultas.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Search.gif")));
		menuBar.add(mnConsultas);
		
		JMenuItem mntmConsulta01 = new JMenuItem("Historial Médico por Paciente");
		mnConsultas.add(mntmConsulta01);
		
		JMenuItem mntmConsulta02 = new JMenuItem("Cita por Paciente");
		mnConsultas.add(mntmConsulta02);
		
		JMenuItem mntmConsulta03 = new JMenuItem("Receta por paciente");
		mnConsultas.add(mntmConsulta03);
		
		JMenu mnReportes = new JMenu("Reportes");
		mnReportes.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Documents.gif")));
		menuBar.add(mnReportes);
		
		JMenuItem mntmReporte01 = new JMenuItem("Reporte de Análisis de Paciente");
		mnReportes.add(mntmReporte01);
		
		JMenuItem mntmReporte02 = new JMenuItem("Reporte de Análisis de Historial Médico");
		mnReportes.add(mntmReporte02);
		
		JMenuItem mntmReporte03 = new JMenuItem("Reporte de Citas");
		mnReportes.add(mntmReporte03);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.textHighlight);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(new BorderLayout(0, 0));
		
		desktopPane.add(frmManPaciente);
		desktopPane.add(frmProHistorial);
		desktopPane.add(frmProCita);
		desktopPane.add(frmProReceta);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmReceta) {
			actionPerformedMntmRecetaJMenuItem(e);
		}
		if (e.getSource() == mntmCita) {
			actionPerformedMntmCitaJMenuItem(e);
		}
		if (e.getSource() == mntmHistorial) {
			actionPerformedMntmHistorialJMenuItem(e);
		}
		if (e.getSource() == mntmPaciente) {
			actionPerformedMntmPaciente(e);
		}
	}
	protected void actionPerformedMntmPaciente(ActionEvent e) {
		
		
		frmManPaciente.setVisible(true);
		
		
	}
	protected void actionPerformedMntmHistorialJMenuItem(ActionEvent e) {
		
		frmProHistorial.setVisible(true);
		
	}
	
	
	
	protected void actionPerformedMntmCitaJMenuItem(ActionEvent e) {
		frmProCita.setVisible(true);
	}
	protected void actionPerformedMntmRecetaJMenuItem(ActionEvent e) {
		frmProReceta.setVisible(true);
	}
}





