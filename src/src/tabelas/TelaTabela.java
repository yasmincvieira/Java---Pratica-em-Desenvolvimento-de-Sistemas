package tabelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;

public class TelaTabela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfIdade;
	private JTable table;
	
	private DefaultTableModel modeloTabela;  //criação de um espelho pra podr manipular a tabela, é necessário 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTabela frame = new TelaTabela();
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
	public TelaTabela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome ");
		lblNewLabel.setBounds(39, 33, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(179, 33, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		tfNome = new JTextField();
		tfNome.setBounds(38, 58, 86, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfIdade = new JTextField();
		tfIdade.setBounds(174, 58, 94, 20);
		contentPane.add(tfIdade);
		tfIdade.setColumns(10);
		

		JScrollPane Tabela = new JScrollPane();
		Tabela.setBounds(39, 111, 366, 115);
		contentPane.add(Tabela);
		
		//coloca os campos na tabla 
		modeloTabela = new DefaultTableModel(new Object[] {"Nome", "Idade"}, 0); 
		
		table = new JTable(modeloTabela);
		Tabela.setViewportView(table);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = tfNome.getText().trim(); 
				String idade = tfIdade.getText().trim(); 
				
				if (!nome.isEmpty() && !idade.isEmpty()){
				modeloTabela.addRow(new Object[] {nome, idade}); 
				tfIdade.setText("");// pra apagar
				tfNome.setText(""); 
				tfNome.requestFocus(); // cursor parado no nome 
				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos");
					//colocar  o foco no campo que estiver vazio
				}
				}
		});
		btnNewButton.setBounds(316, 57, 89, 23);
		contentPane.add(btnNewButton);
		
	
	}
}
