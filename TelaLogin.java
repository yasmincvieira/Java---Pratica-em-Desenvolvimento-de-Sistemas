package tela;

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
	private JTextField tfUsuário;
	private JPasswordField pfSenha;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbUsuário = new JLabel("Usuário:");
		lbUsuário.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 12));
		lbUsuário.setBounds(10, 11, 46, 14);
		contentPane.add(lbUsuário);
		
		tfUsuário = new JTextField();
		tfUsuário.setBounds(66, 9, 212, 20);
		contentPane.add(tfUsuário);
		tfUsuário.setColumns(10);
		
		JLabel lbSenha = new JLabel("Senha:");
		lbSenha.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 12));
		lbSenha.setBounds(10, 42, 46, 14);
		contentPane.add(lbSenha);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(66, 40, 212, 20);
		contentPane.add(pfSenha);
		
		JButton btEntrar = new JButton("Entrar");
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuarioBanco = "admin";
				String senhaBanco = "123";
				
				if (tfUsuário.getText().equals(usuarioBanco) && pfSenha.getText().equals(senhaBanco)) {
					JOptionPane.showMessageDialog(btEntrar, "Usuário logado com sucesso");
				}else {
					JOptionPane.showMessageDialog(btEntrar, "Usuário e/ou senha incorreto");
					//deixa o campo vazio depois da senha incorreta
					tfUsuário.setText("");
					pfSenha.setText("");
					//deixa o cursos no lugar certo depois que mostra senha incorrreta
					tfUsuário.requestFocus();
				}
				
			}
		});
		btEntrar.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 12));
		btEntrar.setBounds(335, 227, 89, 23);
		contentPane.add(btEntrar);
	}
}
