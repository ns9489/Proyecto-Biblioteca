package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class PrestamoView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textCodigoEliminarPrestamo;
	private JTable table;
	public JButton btnMostrarPrestamos;
	public JButton btnCrearNuevoPrestamo;
	public JButton btnEliminarPrestamo;
	public JButton btnModificarPrestamo;
	public DefaultTableModel model;
	public JButton btnVolverPrestamos;
	private JLabel lblNewLabel;


	/**
	 * Create the frame.
	 */
	public PrestamoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 379);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModificarPrestamos = new JLabel(" PRESTAMOS");
		lblModificarPrestamos.setHorizontalAlignment(SwingConstants.LEFT);
		lblModificarPrestamos.setForeground(new Color(255, 255, 255));
		lblModificarPrestamos.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblModificarPrestamos.setBounds(233, 22, 107, 29);
		contentPane.add(lblModificarPrestamos);
		
		btnMostrarPrestamos = new JButton("Mostrar prestamos de los libros");
		btnMostrarPrestamos.setBounds(149, 109, 271, 23);
		contentPane.add(btnMostrarPrestamos);
		
		btnCrearNuevoPrestamo = new JButton("CREAR prestamo");
		btnCrearNuevoPrestamo.setBounds(294, 69, 264, 29);
		contentPane.add(btnCrearNuevoPrestamo);
		
		JLabel lblEliminarLibro = new JLabel("Ingrese el ID del prestamo :");
		lblEliminarLibro.setForeground(new Color(255, 255, 255));
		lblEliminarLibro.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblEliminarLibro.setBounds(10, 289, 200, 23);
		contentPane.add(lblEliminarLibro);
		
		textCodigoEliminarPrestamo = new JTextField();
		textCodigoEliminarPrestamo.setColumns(10);
		textCodigoEliminarPrestamo.setBounds(220, 290, 176, 23);
		contentPane.add(textCodigoEliminarPrestamo);
		
		btnEliminarPrestamo = new JButton("Eliminar registro");
		btnEliminarPrestamo.setBackground(new Color(255, 255, 255));
		btnEliminarPrestamo.setBounds(407, 290, 151, 23);
		contentPane.add(btnEliminarPrestamo);
		
		btnModificarPrestamo = new JButton("MODIFICAR prestamo");
		btnModificarPrestamo.setBounds(20, 69, 264, 29);
		contentPane.add(btnModificarPrestamo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 143, 559, 135);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Libro ID");
		model.addColumn("Usuario ID");
		model.addColumn("Fecha Prestamo");
		model.addColumn("Fecha Devolucion");
		
		table.setModel(model);
	
		scrollPane.setViewportView(table);
		
		btnVolverPrestamos = new JButton("ATRAS");
		btnVolverPrestamos.setBackground(new Color(255, 255, 255));
		btnVolverPrestamos.setBounds(10, 6, 89, 23);
		contentPane.add(btnVolverPrestamos);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel.setBounds(0, 0, 579, 340);
		contentPane.add(lblNewLabel);
	}
}
