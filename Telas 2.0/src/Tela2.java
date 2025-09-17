import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class Tela2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//declara para conseguir acessar em outra tela
	protected JTextArea taResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela2 frame = new Tela2();
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
	public Tela2() {
		setTitle("Tela de Resultados");
		//dispose on close para fechar apenas essa tela e nao as duas
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		taResultado = new JTextArea();
		taResultado.setBounds(48, 49, 332, 147);
		contentPane.add(taResultado);
	}
}
