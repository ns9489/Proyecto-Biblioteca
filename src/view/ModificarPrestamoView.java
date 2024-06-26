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

	

public class ModificarPrestamoView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textModificarLibroID;
	public JTextField textModificarUsuarioID;
	public JTextField textModificarFechaInicioPrestamo;
	public JTextField textModificarFechaDevolucionPrestamo;
	public JButton btnGuardarModificacionPrestamo;
	public JTextField textIDBuscarPrestamo;
	public JButton btnBuscarIDPrestamo;
	public JButton btnVolverModificarPrestamo;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public ModificarPrestamoView() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 368);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParaCrearEl = new JLabel("MODIFICAR PRESTAMOS:");
		lblParaCrearEl.setBackground(new Color(255, 255, 255));
		lblParaCrearEl.setForeground(new Color(255, 255, 255));
		lblParaCrearEl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParaCrearEl.setBounds(129, 11, 169, 47);
		contentPane.add(lblParaCrearEl);
		
		JLabel lblNewLabel_1 = new JLabel("Libro ID:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(48, 141, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		textModificarLibroID = new JTextField();
		textModificarLibroID.setColumns(10);
		textModificarLibroID.setBounds(204, 139, 151, 20);
		contentPane.add(textModificarLibroID);
		
		JLabel lblNewLabel_1_1 = new JLabel("Usuario ID:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(48, 172, 89, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textModificarUsuarioID = new JTextField();
		textModificarUsuarioID.setColumns(10);
		textModificarUsuarioID.setBounds(204, 170, 151, 20);
		contentPane.add(textModificarUsuarioID);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha inicio del prestamo:");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(48, 212, 145, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textModificarFechaInicioPrestamo = new JTextField();
		textModificarFechaInicioPrestamo.setColumns(10);
		textModificarFechaInicioPrestamo.setBounds(204, 210, 151, 20);
		contentPane.add(textModificarFechaInicioPrestamo);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Fecha de devolucion:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setBounds(48, 253, 128, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textModificarFechaDevolucionPrestamo = new JTextField();
		textModificarFechaDevolucionPrestamo.setColumns(10);
		textModificarFechaDevolucionPrestamo.setBounds(204, 250, 151, 20);
		contentPane.add(textModificarFechaDevolucionPrestamo);
		
		btnGuardarModificacionPrestamo = new JButton("MODIFICAR");
		btnGuardarModificacionPrestamo.setBounds(129, 298, 163, 20);
		contentPane.add(btnGuardarModificacionPrestamo);
		
		JLabel lblNewLabel_1_3 = new JLabel("Ingresa el id del prestamo :");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(42, 102, 151, 14);
		contentPane.add(lblNewLabel_1_3);
		
		textIDBuscarPrestamo = new JTextField();
		textIDBuscarPrestamo.setColumns(10);
		textIDBuscarPrestamo.setBounds(204, 100, 151, 20);
		contentPane.add(textIDBuscarPrestamo);
		
		btnBuscarIDPrestamo = new JButton("BUSCAR");
		btnBuscarIDPrestamo.setBounds(312, 56, 100, 23);
		contentPane.add(btnBuscarIDPrestamo);
		
		btnVolverModificarPrestamo = new JButton("VOLVER");
		btnVolverModificarPrestamo.setBackground(new Color(255, 255, 255));
		btnVolverModificarPrestamo.setBounds(10, 25, 89, 23);
		contentPane.add(btnVolverModificarPrestamo);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel.setBounds(0, 0, 433, 329);
		contentPane.add(lblNewLabel);
	
	}

}
