package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ModificarLibroView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textModificarTituloLibro;
	public JTextField textModificarAutorLibro;
	public JTextField textModificarEditorialLibro;
	public JTextField textModificarAnioPublicacionLibro;
	public JTextField textModificarISBNLibro;
	public JTextField textIDBuscarLibro;
	public JButton btnGuardarModificacionLibro;
	public JButton btnBuscarIDLibro;
	public JButton btnVolverModificarLibro;
	private JLabel lblNewLabel;
	/**
	 * Create the frame.
	 */
	public ModificarLibroView() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 386);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParaCrearEl = new JLabel("MODIFICAR LIBROS EXISTENTES");
		lblParaCrearEl.setForeground(new Color(255, 255, 255));
		lblParaCrearEl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParaCrearEl.setBounds(122, 11, 209, 47);
		contentPane.add(lblParaCrearEl);
		
		JLabel lblNewLabel_1 = new JLabel("Titulo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(26, 120, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		textModificarTituloLibro = new JTextField();
		textModificarTituloLibro.setColumns(10);
		textModificarTituloLibro.setBounds(197, 118, 152, 20);
		contentPane.add(textModificarTituloLibro);
		
		JLabel lblNewLabel_1_1 = new JLabel("Autor:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(26, 151, 60, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textModificarAutorLibro = new JTextField();
		textModificarAutorLibro.setColumns(10);
		textModificarAutorLibro.setBounds(197, 149, 152, 20);
		contentPane.add(textModificarAutorLibro);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Editorial:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setBounds(26, 184, 89, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textModificarEditorialLibro = new JTextField();
		textModificarEditorialLibro.setColumns(10);
		textModificarEditorialLibro.setBounds(197, 182, 152, 20);
		contentPane.add(textModificarEditorialLibro);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Año de publicacion del libro:");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(26, 215, 160, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textModificarAnioPublicacionLibro = new JTextField();
		textModificarAnioPublicacionLibro.setColumns(10);
		textModificarAnioPublicacionLibro.setBounds(197, 213, 152, 20);
		contentPane.add(textModificarAnioPublicacionLibro);
		
		JLabel lblNewLabel_1_2 = new JLabel("ISBN:");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setBounds(26, 247, 66, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textModificarISBNLibro = new JTextField();
		textModificarISBNLibro.setColumns(10);
		textModificarISBNLibro.setBounds(197, 244, 152, 20);
		contentPane.add(textModificarISBNLibro);
		
		btnGuardarModificacionLibro = new JButton("MODIFICAR");
		btnGuardarModificacionLibro.setBounds(86, 286, 117, 33);
		contentPane.add(btnGuardarModificacionLibro);
		
		JLabel lblNewLabel_1_3 = new JLabel("Ingrese el id del libro :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setBounds(26, 91, 123, 14);
		contentPane.add(lblNewLabel_1_3);
		
		textIDBuscarLibro = new JTextField();
		textIDBuscarLibro.setColumns(10);
		textIDBuscarLibro.setBounds(197, 89, 152, 20);
		contentPane.add(textIDBuscarLibro);
		
		btnBuscarIDLibro = new JButton("BUSCAR");
		btnBuscarIDLibro.setBounds(258, 286, 107, 33);
		contentPane.add(btnBuscarIDLibro);
		
		btnVolverModificarLibro = new JButton("ATRAS");
		btnVolverModificarLibro.setBackground(new Color(255, 255, 255));
		btnVolverModificarLibro.setBounds(10, 25, 89, 23);
		contentPane.add(btnVolverModificarLibro);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel.setBounds(0, 0, 433, 347);
		contentPane.add(lblNewLabel);
	
	}
}
