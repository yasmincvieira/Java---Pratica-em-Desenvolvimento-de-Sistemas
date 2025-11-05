package Tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField tfSenha;
	
	private String user = "abc";
	private String senha = "123";
	private Usuario usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setTitle("Tela Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 420);
		//tem que colocar esses codigos depois do tamanho da tela
		
		//não deixa expandir a tela
		setResizable(false);
		//abre a tela centralizada
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
		lblNewLabel.setBounds(32, 47, 68, 14);
		contentPane.add(lblNewLabel);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(110, 46, 389, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(32, 107, 54, 14);
		contentPane.add(lblNewLabel_1);
		
		tfSenha = new JPasswordField();
		tfSenha.setBounds(110, 106, 389, 20);
		contentPane.add(tfSenha);
		
		JButton btEntrar = new JButton("Entrar");
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usuario = new Usuario(tfUsuario.getText(), tfSenha.getText());
				
				if(usuario.getUsuario().equals(user) && usuario.getSenha().equals(senha)) {
					JOptionPane.showMessageDialog(null, "Acesso OK\n"+usuario.msg());
				}else {
					JOptionPane.showMessageDialog(null, "Acesso Negado");
				}
	
			}
		});
		btEntrar.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
		btEntrar.setBounds(32, 164, 89, 23);
		contentPane.add(btEntrar);
	}
}
