package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JTextField tfSenha;
	
	private TelaInicial telaInicial;
	private String user = "Yasmin";
	private String senha = "PDS";
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
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entrar no Sistema");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		lblNewLabel.setBounds(247, 101, 224, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário:");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(128, 188, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		tfUsuario.setBounds(208, 188, 290, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(128, 242, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		tfSenha = new JTextField();
		tfSenha.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		tfSenha.setBounds(208, 242, 290, 20);
		contentPane.add(tfSenha);
		tfSenha.setColumns(10);
		
		telaInicial = new TelaInicial();
		
		JButton btEntrar = new JButton("Entrar");
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usuario = new Usuario(tfUsuario.getText(), tfSenha.getText());
				
				if(usuario.getUsuario().equals(user) && usuario.getSenha().equals(senha)) {
					telaInicial.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Usuario e/ou senha incorretos");
				}
				
				limpaCampos();
				
			}
		});
		btEntrar.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		btEntrar.setBounds(279, 305, 89, 23);
		contentPane.add(btEntrar);
	}
	private void limpaCampos() {
		tfUsuario.setText("");
		tfSenha.setText("");
		tfUsuario.requestFocus();
	}
}
