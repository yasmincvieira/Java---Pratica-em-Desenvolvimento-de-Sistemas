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

public class TelaAluno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAluno frame = new TelaAluno();
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
	public TelaAluno() {
		setTitle("Tela Aluno");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lbNome.setBounds(10, 27, 56, 14);
		contentPane.add(lbNome);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		tfNome.setBounds(70, 25, 210, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JButton btMostrar = new JButton("Mostrar");
		btMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//se o TextField estiver vazio mostrar uma mensagem pedindo para inserir o nome
				if(tfNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Favor inserir seu nome.");
				}else {
					JOptionPane.showMessageDialog(null, "Nome: " + tfNome.getText());
				}
				
			}
		});
		btMostrar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		btMostrar.setBounds(10, 66, 89, 31);
		contentPane.add(btMostrar);
	}
}
