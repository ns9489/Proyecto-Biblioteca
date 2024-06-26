package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class CrearPrestamoView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textCrearFechaInicioPrestamo;
	public JTextField textCrearFechaDevolucion;
	public JTextField textIDLibroPrestamo;
	public JTextField textIDClientePrestamo;
	public JButton btnCrearNuevoPrestamo;
	public JButton btnVolverCrearPrestamo;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public CrearPrestamoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 312);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParaCrearEl = new JLabel("   CREAR  PRESTAMO");
		lblParaCrearEl.setForeground(new Color(255, 255, 255));
		lblParaCrearEl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParaCrearEl.setBounds(182, 50, 177, 24);
		contentPane.add(lblParaCrearEl);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese fecha de inicio prestamo(YYYY-MM-DD):");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 170, 280, 14);
		contentPane.add(lblNewLabel_1);
		
		textCrearFechaInicioPrestamo = new JTextField();
		textCrearFechaInicioPrestamo.setColumns(10);
		textCrearFechaInicioPrestamo.setBounds(301, 168, 195, 20);
		contentPane.add(textCrearFechaInicioPrestamo);
		
		btnCrearNuevoPrestamo = new JButton("GUARDAR");
		btnCrearNuevoPrestamo.setBounds(194, 238, 109, 24);
		contentPane.add(btnCrearNuevoPrestamo);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese  fecha de devolucion (YYYY-MM-DD):");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setBounds(10, 201, 251, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textCrearFechaDevolucion = new JTextField();
		textCrearFechaDevolucion.setColumns(10);
		textCrearFechaDevolucion.setBounds(301, 199, 195, 20);
		contentPane.add(textCrearFechaDevolucion);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ingresa el ID del libro que se prestara:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setBounds(9, 108, 228, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textIDLibroPrestamo = new JTextField();
		textIDLibroPrestamo.setColumns(10);
		textIDLibroPrestamo.setBounds(301, 105, 195, 20);
		contentPane.add(textIDLibroPrestamo);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Ingresa el ID del cliente que solicita el prestamo:");
		lblNewLabel_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(10, 139, 268, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		textIDClientePrestamo = new JTextField();
		textIDClientePrestamo.setColumns(10);
		textIDClientePrestamo.setBounds(301, 136, 195, 20);
		contentPane.add(textIDClientePrestamo);
		
		btnVolverCrearPrestamo = new JButton("VOLVER");
		btnVolverCrearPrestamo.setBackground(new Color(255, 255, 255));
		btnVolverCrearPrestamo.setBounds(10, 28, 89, 23);
		contentPane.add(btnVolverCrearPrestamo);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel.setBounds(0, 0, 523, 273);
		contentPane.add(lblNewLabel);
	}
}
