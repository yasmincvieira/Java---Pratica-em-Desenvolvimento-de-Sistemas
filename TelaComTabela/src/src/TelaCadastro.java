package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfProduto;
	private JTextField tfCor;
	private JTextField tfQtde;
	private JTable tabela;
	
	DefaultTableModel tab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Produto:");
		lblNewLabel.setBounds(24, 23, 60, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cor:");
		lblNewLabel_1.setBounds(24, 96, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade:");
		lblNewLabel_2.setBounds(24, 60, 80, 13);
		contentPane.add(lblNewLabel_2);
		
		tfProduto = new JTextField();
		tfProduto.setBounds(94, 19, 197, 19);
		contentPane.add(tfProduto);
		tfProduto.setColumns(10);
		
		tfCor = new JTextField();
		tfCor.setBounds(94, 92, 197, 19);
		contentPane.add(tfCor);
		tfCor.setColumns(10);
		
		tfQtde = new JTextField();
		tfQtde.setBounds(94, 56, 197, 19);
		contentPane.add(tfQtde);
		tfQtde.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
	
		
		scrollPane.setBounds(24, 147, 377, 106);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		tabela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (tabela.getSelectedRow() != -1) {
					tfProduto.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
					tfQtde.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
					tfCor.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um produto", "Atenção", 
							JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
		tabela.setModel(new DefaultTableModel(
				new Object[][] {},   // começa vazia
				new String[] {
					"Produto", "Quantidade", "Cor"}  // cabeçalho
			) {
								private static final long serialVersionUID = 1L;
				boolean[] columnEditables = new boolean[] {
					false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];   // impede edição direta na tabela
				}
			});
		
		scrollPane.setViewportView(tabela);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				tab = (DefaultTableModel) tabela.getModel();
				
				Object[] camposTabela = {tfProduto.getText(), tfQtde.getText(), tfCor.getText()};
				
				tab.addRow(camposTabela);
				
				limpaCampos();
				
			}
			
			
		});
		
		btCadastrar.setBounds(301, 19, 100, 21);
		contentPane.add(btCadastrar);
		
		JButton btAlterar = new JButton("Alterar");
		btAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (tabela.getSelectedRow() != -1) {
					tabela.setValueAt(tfProduto.getText(), tabela.getSelectedRow(), 0);
					tabela.setValueAt(tfQtde.getText(), tabela.getSelectedRow(), 1);
					tabela.setValueAt(tfCor.getText(), tabela.getSelectedRow(), 2);
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um produto", 
							"Atenção", JOptionPane.WARNING_MESSAGE);
				}
				
				limpaCampos();
				
			}
		});
		
		btAlterar.setBounds(301, 56, 100, 21);
		contentPane.add(btAlterar);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (tabela.getSelectedRow() != -1) {
					DefaultTableModel tab = (DefaultTableModel) tabela.getModel();
					
					tab.removeRow(tabela.getSelectedRow());
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um produto", 
							"Atenção", JOptionPane.WARNING_MESSAGE);
				}
				
				limpaCampos();
				
			}

			
		});
		
		btExcluir.setBounds(301, 92, 100, 21);
		contentPane.add(btExcluir);
		
		
	}
		private void limpaCampos() {
			tfCor.setText("");
			tfProduto.setText("");
			tfQtde.setText("");
			
			tfProduto.requestFocus();
		}
}
