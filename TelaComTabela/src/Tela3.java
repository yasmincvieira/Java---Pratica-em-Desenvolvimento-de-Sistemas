import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tela3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfIdade;
	private JTable tabela; //primeiro jscroll depois o jtable e dapois vem pro codigo
	
	private DefaultTableModel modeloTabela; 
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela3 frame = new Tela3();
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
	public Tela3() {
		setTitle("Tela com Tabela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(22, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setBounds(204, 24, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		tfNome = new JTextField();
		tfNome.setBounds(22, 40, 160, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfIdade = new JTextField();
		tfIdade.setBounds(204, 40, 86, 20);
		contentPane.add(tfIdade);
		tfIdade.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 88, 377, 148);
		contentPane.add(scrollPane);
		
		modeloTabela = new DefaultTableModel(new Object[] {"Nome", "Idade"}, 0); //coloca os campos na tabela
		
		tabela = new JTable(modeloTabela);
		scrollPane.setViewportView(tabela);
		
		JButton btAdicionar = new JButton("Adicionar");
		btAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = tfNome.getText().trim(); //o ".trim" elimina todo o espaço após a String
				String idade = tfIdade.getText().trim();
				
				if (!nome.isEmpty() && !idade.isEmpty()) {
					
					modeloTabela.addRow(new Object[] {nome, idade});
					
					tfNome.setText("");
					tfIdade.setText("");
					
				}
				
			}
		});
		btAdicionar.setBounds(310, 39, 89, 23);
		contentPane.add(btAdicionar);
		
		
	}
}
