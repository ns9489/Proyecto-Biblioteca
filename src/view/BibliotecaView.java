package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BibliotecaView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JButton btnUsuario;
	public JButton btnPrestamos;
	public JButton btnCategorias;
	public JButton btnLibros;
	private JLabel lblNewLabel_1;


	/**
	 * Create the frame.
	 */
	public BibliotecaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 320);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   BIBLIOTECA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 18));
		lblNewLabel.setBackground(new Color(128, 255, 128));
		lblNewLabel.setBounds(138, 32, 130, 30);
		contentPane.add(lblNewLabel);
		
		btnLibros = new JButton("LIBROS");
		btnLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLibros.setFont(new Font("Rockwell", Font.PLAIN, 12));
		btnLibros.setBounds(22, 91, 163, 30);
		contentPane.add(btnLibros);
		
		btnCategorias = new JButton("CATEGORIAS");
		btnCategorias.setFont(new Font("Rockwell", Font.PLAIN, 12));
		btnCategorias.setBounds(233, 91, 163, 30);
		contentPane.add(btnCategorias);
		
		btnPrestamos = new JButton("PRESTAMOS");
		btnPrestamos.setFont(new Font("Rockwell", Font.PLAIN, 12));
		btnPrestamos.setBounds(22, 171, 163, 30);
		contentPane.add(btnPrestamos);
		
		btnUsuario = new JButton("USUARIOS");
		btnUsuario.setFont(new Font("Rockwell", Font.PLAIN, 12));
		btnUsuario.setBounds(233, 171, 163, 30);
		contentPane.add(btnUsuario);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\OIP (2).jfif"));
		lblNewLabel_1.setBounds(0, 0, 424, 281);
		contentPane.add(lblNewLabel_1);
	}
}
