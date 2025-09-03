import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Respostas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//declarar para conseguir vhamar essa tela
	protected JLabel lbTexto;
	protected JTextField tfTextoResposta;
	protected JButton btResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Respostas frame = new Respostas();
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
	public Respostas() {
		setTitle("Tela de respostas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//declaraçao aqui
		lbTexto = new JLabel("xxx");
		lbTexto.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lbTexto.setBounds(46, 80, 337, 14);
		contentPane.add(lbTexto);
		
		tfTextoResposta = new JTextField();
		tfTextoResposta.setBounds(46, 105, 337, 20);
		contentPane.add(tfTextoResposta);
		tfTextoResposta.setColumns(10);
		
		btResposta = new JButton("New button");
		btResposta.setBounds(46, 136, 337, 23);
		contentPane.add(btResposta);
	}

}
