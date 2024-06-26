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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibroView extends JFrame{

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textCodigoEliminarLibro;
	public JTable table;
	public JButton btnMostrarLibros;
	public JButton btnCrearLibro;
	public JButton btnEliminarLibro;
	public JButton btnModificarLibro;
	public DefaultTableModel model;
	public JButton btnVolverLibros;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public LibroView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 355);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModificarLibros = new JLabel("     LIBROS");
		lblModificarLibros.setHorizontalAlignment(SwingConstants.LEFT);
		lblModificarLibros.setBounds(220, 14, 137, 29);
		lblModificarLibros.setForeground(new Color(255, 255, 255));
		lblModificarLibros.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		contentPane.add(lblModificarLibros);
		
		btnMostrarLibros = new JButton("Mostrar libros existentes");
		btnMostrarLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMostrarLibros.setBounds(162, 88, 271, 23);
		contentPane.add(btnMostrarLibros);
	
		btnCrearLibro = new JButton("CREAR libro");
		btnCrearLibro.setBounds(296, 54, 238, 23);
		contentPane.add(btnCrearLibro);
		
		JLabel lblEliminarLibro = new JLabel("Ingrese el ID del libro :");
		lblEliminarLibro.setForeground(new Color(255, 255, 255));
		lblEliminarLibro.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblEliminarLibro.setBounds(27, 282, 161, 20);
		contentPane.add(lblEliminarLibro);
		
		textCodigoEliminarLibro = new JTextField();
		textCodigoEliminarLibro.setColumns(10);
		textCodigoEliminarLibro.setBounds(198, 282, 200, 23);
		contentPane.add(textCodigoEliminarLibro);
		
		btnEliminarLibro = new JButton("ELIMINAR");
		btnEliminarLibro.setBackground(new Color(255, 255, 255));
		btnEliminarLibro.setBounds(430, 282, 117, 23);
		contentPane.add(btnEliminarLibro);
		
		btnModificarLibro = new JButton("MODIFICAR libro");
		btnModificarLibro.setBounds(27, 54, 238, 23);
		contentPane.add(btnModificarLibro);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 122, 559, 136);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel ();
		model.addColumn("id");
		model.addColumn("titulo");
		model.addColumn("autor");
		model.addColumn("editorial");
		model.addColumn("Año publicacion");
		model.addColumn("ISBN");
		
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		btnVolverLibros = new JButton("VOLVER");
		btnVolverLibros.setBackground(new Color(255, 255, 255));
		btnVolverLibros.setBounds(10, 11, 89, 23);
		contentPane.add(btnVolverLibros);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel.setBounds(0, 0, 578, 316);
		contentPane.add(lblNewLabel);
	}
}
