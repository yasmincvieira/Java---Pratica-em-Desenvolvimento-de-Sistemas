import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela1 extends JFrame {

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
					Tela1 frame = new Tela1();
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
	public Tela1() {
		setTitle("Tela Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null); //abre a tela no centro do monitor
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(25, 34, 46, 14);
		contentPane.add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.setBounds(71, 31, 216, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JButton btMostrar = new JButton("Mostrar");
		btMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				JOptionPane.showMessageDialog(null, tfNome.getText());
//				tfNome.setText(" "); //limpa o componente
//				tfNome.requestFocus(); //envia o foco para o componente (põe o cursor de volta no TextField)
				
				//abrir nova tela
				Tela2 tela2 = new Tela2(); //instancia
				
				tela2.setVisible(true); //deixa a tela2 visisvel
				
				
				
			}
		});
		btMostrar.setBounds(297, 30, 89, 23);
		contentPane.add(btMostrar);
	}
}
