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

public class CrearUsuarioView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textCrearEmailUsuario;
	public JButton btnCrearNuevoUsuario;
	public JTextField textCrearTelefonoUsuario;
	public JTextField textCrearNombreUsuario;
	public JTextField textIDUsuario;
	public JButton btnVolverCrearUsuario;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public CrearUsuarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 297);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParaCrearEl = new JLabel("CREA USUARIO");
		lblParaCrearEl.setForeground(new Color(255, 255, 255));
		lblParaCrearEl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParaCrearEl.setBounds(176, 25, 101, 24);
		contentPane.add(lblParaCrearEl);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa el telefono: ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(69, 150, 131, 14);
		contentPane.add(lblNewLabel_1);
		
		textCrearEmailUsuario = new JTextField();
		textCrearEmailUsuario.setColumns(10);
		textCrearEmailUsuario.setBounds(227, 119, 191, 20);
		contentPane.add(textCrearEmailUsuario);
		
		btnCrearNuevoUsuario = new JButton("GUARDAR");
		btnCrearNuevoUsuario.setBounds(161, 208, 147, 28);
		contentPane.add(btnCrearNuevoUsuario);
		
		textCrearTelefonoUsuario = new JTextField();
		textCrearTelefonoUsuario.setColumns(10);
		textCrearTelefonoUsuario.setBounds(227, 149, 191, 20);
		contentPane.add(textCrearTelefonoUsuario);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ingresa el nombre:");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(69, 94, 131, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textCrearNombreUsuario = new JTextField();
		textCrearNombreUsuario.setColumns(10);
		textCrearNombreUsuario.setBounds(227, 88, 191, 20);
		contentPane.add(textCrearNombreUsuario);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Ingresa email:");
		lblNewLabel_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(69, 125, 107, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		btnVolverCrearUsuario = new JButton("VOLVER");
		btnVolverCrearUsuario.setBackground(new Color(255, 255, 255));
		btnVolverCrearUsuario.setBounds(10, 26, 89, 23);
		contentPane.add(btnVolverCrearUsuario);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel.setBounds(0, 0, 501, 258);
		contentPane.add(lblNewLabel);
	}

}
