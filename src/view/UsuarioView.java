package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class UsuarioView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textCodigoEliminarUsuario;
	public JTable table;
	public JButton btnMostrarUsuarios;
	public JButton btnCrearNuevoUsuario;
	public JButton btnEliminarUsuario;
	public JButton btnModificarUsuario;
	public DefaultTableModel modelo;
	public JButton btnVolverUsuarios;
	private JLabel lblNewLabel;

	
	/**
	 * Create the frame.
	 */
	public UsuarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 385);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModificarUsuario = new JLabel("   USUARIOS");
		lblModificarUsuario.setBackground(new Color(255, 255, 255));
		lblModificarUsuario.setBounds(219, 23, 123, 21);
		lblModificarUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblModificarUsuario.setForeground(new Color(255, 255, 255));
		lblModificarUsuario.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		contentPane.add(lblModificarUsuario);
		
		btnMostrarUsuarios = new JButton("Mostrar usuarios existentes");
		btnMostrarUsuarios.setBounds(156, 100, 271, 23);
		contentPane.add(btnMostrarUsuarios);
		
		btnCrearNuevoUsuario = new JButton("CREAR usuario");
		btnCrearNuevoUsuario.setBounds(298, 66, 245, 23);
		contentPane.add(btnCrearNuevoUsuario);
		
		JLabel lblEliminarUsuario = new JLabel("Ingrese el codigo del usuario:");
		lblEliminarUsuario.setForeground(new Color(255, 255, 255));
		lblEliminarUsuario.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblEliminarUsuario.setBounds(10, 309, 207, 14);
		contentPane.add(lblEliminarUsuario);
		
		textCodigoEliminarUsuario = new JTextField();
		textCodigoEliminarUsuario.setColumns(10);
		textCodigoEliminarUsuario.setBounds(208, 306, 207, 23);
		contentPane.add(textCodigoEliminarUsuario);
		
		btnEliminarUsuario = new JButton("Eliminar usuario");
		btnEliminarUsuario.setBackground(new Color(255, 255, 255));
		btnEliminarUsuario.setBounds(418, 306, 151, 23);
		contentPane.add(btnEliminarUsuario);
		
		btnModificarUsuario = new JButton("MODIFICAR usuario");
		btnModificarUsuario.setBounds(24, 66, 245, 23);
		contentPane.add(btnModificarUsuario);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 144, 559, 141);
		contentPane.add(scrollPane);
		
		table = new JTable();
		modelo = new DefaultTableModel();
		
		modelo.addColumn("ID");
		modelo.addColumn("Nombre");
		modelo.addColumn("EMAIL");
		modelo.addColumn("Telefono");
		
		table.setModel(modelo);
		
		scrollPane.setViewportView(table);
		
		btnVolverUsuarios = new JButton("ATRAS");
		btnVolverUsuarios.setBackground(new Color(255, 255, 255));
		btnVolverUsuarios.setBounds(10, 11, 89, 23);
		contentPane.add(btnVolverUsuarios);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel.setBounds(-10, -15, 590, 361);
		contentPane.add(lblNewLabel);
	}
}
