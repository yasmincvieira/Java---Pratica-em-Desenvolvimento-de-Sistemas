import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaNova extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfTextoNovo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNova frame = new TelaNova();
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
	public TelaNova() {
		setTitle("Tela Nova");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTextoNovo = new JLabel("Texto");
		lbTextoNovo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lbTextoNovo.setBounds(37, 76, 46, 14);
		contentPane.add(lbTextoNovo);
		
		tfTextoNovo = new JTextField();
		tfTextoNovo.setBounds(93, 75, 287, 20);
		contentPane.add(tfTextoNovo);
		tfTextoNovo.setColumns(10);
		
		JButton btLabel = new JButton("Mostrar Label");
		btLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Respostas telaResposta = new Respostas();
				telaResposta.lbTexto.setText(tfTextoNovo.getText());
				tfTextoNovo.getText();
				telaResposta.setVisible(true);
				
			}
		});
		btLabel.setBounds(10, 129, 126, 23);
		contentPane.add(btLabel);
		
		JButton btTextField = new JButton("Mostrar TextField");
		btTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Respostas telaResposta = new Respostas();
				telaResposta.tfTextoResposta.setText(tfTextoNovo.getText());
				tfTextoNovo.getText();
				telaResposta.setVisible(true);
				
			}
		});
		btTextField.setBounds(146, 129, 137, 23);
		contentPane.add(btTextField);
		
		JButton btBotao = new JButton("Mostrar Botão");
		btBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Respostas telaResposta = new Respostas();
				telaResposta.btResposta.setText(tfTextoNovo.getText());
				tfTextoNovo.getText();
				telaResposta.setVisible(true);
				
			}
		});
		btBotao.setBounds(293, 129, 131, 23);
		contentPane.add(btBotao);
	}

}
