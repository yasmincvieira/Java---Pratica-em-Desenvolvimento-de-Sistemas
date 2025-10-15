package tabelas;

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
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class PrimeiraTela extends JFrame {

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
					PrimeiraTela frame = new PrimeiraTela();
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
	public PrimeiraTela() {
		setTitle("Tela Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null); // abre a tela no centro do monitor 
		
		JLabel lblNewLabel = new JLabel("Nome ");
		lblNewLabel.setBounds(50, 42, 52, 14);
		contentPane.add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.setBounds(113, 39, 97, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JButton Btmostrar = new JButton("Mostrar ");
		Btmostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JOptionPane.showMessageDialog(null, tfNome.getText());
				//tfNome.setText("");// limpa componente
				//tfNome.requestFocus(); // envia o foco para o componente 
				
				//PARA abrir nova tela 
				NovaTela tela2 = new NovaTela(); 
				tela2.setVisible(true);
			}
		});
		Btmostrar.setBounds(246, 38, 89, 23);
		contentPane.add(Btmostrar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(22, 124, 69, 22);
		contentPane.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(151, 107, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(307, 107, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(202, 172, 174, 78);
		contentPane.add(textArea);
	}
}
