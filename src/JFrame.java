import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
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
	public JFrame() {
		setTitle("Tela de componentes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Texto");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel.setBounds(119, 86, 42, 31);
		contentPane.add(lblNewLabel);
		
		tfTexto = new JTextField();
		tfTexto.setBounds(169, 93, 158, 20);
		contentPane.add(tfTexto);
		tfTexto.setColumns(10);
		
		JButton btMostrar = new JButton("Mostrar");
		btMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//exemplo de como mostrar o texto digitado em um JoptionPane
//				JOptionPane.showMessageDialog(null, tfTexto.getText());
				
				//exemplo de como enviar o texto para outra tela (instancia)
				Respostas telaResposta = new Respostas();
				telaResposta.lbTexto.setText(tfTexto.getText());
				telaResposta.tfTextoResposta.setText(tfTexto.getText());
				tfTexto.getText();
				telaResposta.setVisible(true);
				
				
			}
		});
		btMostrar.setBounds(169, 140, 89, 23);
		contentPane.add(btMostrar);
	}
}
