package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CrearLibroView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textCrearTituloLibro;
	public JTextField textCrearAutorLibro;
	public JTextField textCrearEditorialLibro;
	public JTextField textCrearAnioPublicacionLibro;
	public JTextField textCrearISBNLibro;
	public JButton btnCrearNuevoLibro;
	public JButton btnVolverCrearLibro;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public CrearLibroView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 356);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParaCrearEl = new JLabel("         CREAR LIBRO");
		lblParaCrearEl.setForeground(new Color(255, 255, 255));
		lblParaCrearEl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParaCrearEl.setBounds(118, 26, 163, 24);
		contentPane.add(lblParaCrearEl);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa el titulo del libro:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(50, 111, 147, 14);
		contentPane.add(lblNewLabel_1);
		
		textCrearTituloLibro = new JTextField();
		textCrearTituloLibro.setColumns(10);
		textCrearTituloLibro.setBounds(207, 108, 163, 20);
		contentPane.add(textCrearTituloLibro);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingresa el autor del libro:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(50, 142, 147, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textCrearAutorLibro = new JTextField();
		textCrearAutorLibro.setColumns(10);
		textCrearAutorLibro.setBounds(207, 139, 163, 20);
		contentPane.add(textCrearAutorLibro);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ingrese editorial del libro:");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(50, 167, 155, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textCrearEditorialLibro = new JTextField();
		textCrearEditorialLibro.setColumns(10);
		textCrearEditorialLibro.setBounds(207, 170, 163, 20);
		contentPane.add(textCrearEditorialLibro);
		
		btnCrearNuevoLibro = new JButton("CREAR");
		btnCrearNuevoLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrearNuevoLibro.setBounds(151, 274, 129, 32);
		contentPane.add(btnCrearNuevoLibro);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Ingrese año de publicacion:");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(50, 201, 147, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textCrearAnioPublicacionLibro = new JTextField();
		textCrearAnioPublicacionLibro.setColumns(10);
		textCrearAnioPublicacionLibro.setBounds(207, 198, 163, 20);
		contentPane.add(textCrearAnioPublicacionLibro);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ingresa el ISBN del libro:");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(50, 232, 155, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textCrearISBNLibro = new JTextField();
		textCrearISBNLibro.setColumns(10);
		textCrearISBNLibro.setBounds(207, 229, 163, 20);
		contentPane.add(textCrearISBNLibro);
		
		btnVolverCrearLibro = new JButton("ATRAS");
		btnVolverCrearLibro.setBackground(new Color(255, 255, 255));
		btnVolverCrearLibro.setBounds(10, 29, 83, 23);
		contentPane.add(btnVolverCrearLibro);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel.setBounds(0, 0, 430, 317);
		contentPane.add(lblNewLabel);
	}
}
