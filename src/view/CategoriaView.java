package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class CategoriaView extends JFrame{

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textIDEliminarCategoria;
	public JTable table;
	public DefaultTableModel modelo;
	public JButton btnMostrarCategoria;
	public JButton btnCrearCategoria;
	public JButton btnEliminarCategoria;
	public JButton btnModificarCategoria;
	public JButton btnVolverCategoria;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 * @param conexion 
	 */
	public CategoriaView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 348);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModificarCategoria = new JLabel("CATEGORIAS");
		lblModificarCategoria.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblModificarCategoria.setForeground(new Color(255, 255, 255));
		lblModificarCategoria.setBounds(225, 19, 113, 29);
		contentPane.add(lblModificarCategoria);
		
		btnCrearCategoria = new JButton("CREAR Categoria");
		btnCrearCategoria.setBackground(new Color(255, 255, 255));
		btnCrearCategoria.setBounds(299, 59, 239, 23);
		contentPane.add(btnCrearCategoria);
		
		JLabel lblEliminarCategoria = new JLabel("Ingrese ID de la categoria:");
		lblEliminarCategoria.setForeground(new Color(255, 255, 255));
		lblEliminarCategoria.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblEliminarCategoria.setBounds(10, 267, 182, 20);
		contentPane.add(lblEliminarCategoria);
		
		btnEliminarCategoria = new JButton("ELIMINAR");
		btnEliminarCategoria.setForeground(new Color(0, 0, 0));
		btnEliminarCategoria.setBackground(new Color(255, 255, 255));
		btnEliminarCategoria.setBounds(396, 267, 151, 23);
		contentPane.add(btnEliminarCategoria);
		
		textIDEliminarCategoria = new JTextField();
		textIDEliminarCategoria.setColumns(10);
		textIDEliminarCategoria.setBounds(178, 267, 196, 23);
		contentPane.add(textIDEliminarCategoria);
		
		btnMostrarCategoria = new JButton("Mostrar categorias");
		btnMostrarCategoria.setBackground(new Color(255, 255, 255));
		btnMostrarCategoria.setBounds(149, 93, 271, 23);
		contentPane.add(btnMostrarCategoria);
		
		btnModificarCategoria = new JButton("MODIFICAR categoria");
		btnModificarCategoria.setBackground(new Color(255, 255, 255));
		btnModificarCategoria.setBounds(37, 59, 233, 23);
		contentPane.add(btnModificarCategoria);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 127, 554, 129);
		contentPane.add(scrollPane);
		
		table = new JTable();
		modelo = new DefaultTableModel();
		table.setModel(modelo);
		
		modelo.addColumn("ID");
		modelo.addColumn("Nombre");
	
		scrollPane.setViewportView(table);
		
		btnVolverCategoria = new JButton("VOLVER");
		btnVolverCategoria.setForeground(new Color(0, 0, 0));
		btnVolverCategoria.setBackground(new Color(255, 255, 255));
		btnVolverCategoria.setBounds(10, 11, 89, 23);
		contentPane.add(btnVolverCategoria);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel.setBounds(0, 0, 579, 309);
		contentPane.add(lblNewLabel);
	}

}
