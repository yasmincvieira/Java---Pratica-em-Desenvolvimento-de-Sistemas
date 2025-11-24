package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_1;
	
	private JTextField tfMateria;
	private JTextField tfGrupo;
	private JTextField tfInicio;
	private JTextField tfEntrega;
	private JComboBox cbTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 252, 602, 271);
		contentPane.add(scrollPane);
		
		
		JLabel lblMatria = new JLabel("Matéria:");
		lblMatria.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		lblMatria.setBounds(36, 37, 68, 14);
		contentPane.add(lblMatria);
		
		JLabel lblNewLabel = new JLabel("Tipo:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		lblNewLabel.setBounds(36, 73, 47, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Grupo:");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(36, 107, 56, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Inicio:");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(36, 148, 112, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Entrega:");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(36, 179, 119, 23);
		contentPane.add(lblNewLabel_3);
		
		tfMateria = new JTextField();
		tfMateria.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		tfMateria.setBounds(110, 34, 349, 20);
		contentPane.add(tfMateria);
		tfMateria.setColumns(10);
		
		tfGrupo = new JTextField();
		tfGrupo.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		tfGrupo.setBounds(110, 108, 349, 20);
		contentPane.add(tfGrupo);
		tfGrupo.setColumns(10);
		
		tfInicio = new JTextField();
		tfInicio.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		tfInicio.setBounds(165, 148, 294, 20);
		contentPane.add(tfInicio);
		tfInicio.setColumns(10);
		
		tfEntrega = new JTextField();
		tfEntrega.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		tfEntrega.setBounds(165, 183, 294, 20);
		contentPane.add(tfEntrega);
		tfEntrega.setColumns(10);
		
		cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"", "Prova", "Trabalho", "Seminário", "Atividade", "Experimento"}));
		cbTipo.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		cbTipo.setBounds(110, 73, 349, 22);
		contentPane.add(cbTipo);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (table_1.getSelectedRow() != -1) {
					tfMateria.setText(table_1.getValueAt(table_1.getSelectedRow(), 0).toString());
					cbTipo.setSelectedItem(table_1.getValueAt(table_1.getSelectedRow(), 1).toString());
					tfGrupo.setText(table_1.getValueAt(table_1.getSelectedRow(), 2).toString());
					tfInicio.setText(table_1.getValueAt(table_1.getSelectedRow(), 3).toString());
					tfEntrega.setText(table_1.getValueAt(table_1.getSelectedRow(), 4).toString());
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um produto", "Atenção", 
							JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
		
		
		table_1.setModel(new DefaultTableModel(
				new Object[][] {},   
				new String[] {
						"Matéria", "Tipo", "Grupo", "Data de Inicio", "Data de Entrega"}  
			) {
//				private static final long serialVersionUID = 1L;
//				boolean[] columnEditables = new boolean[] {
//					false, false, false, false, false
//				};
//				public boolean isCellEditable(int row, int column) {
//					return columnEditables[column];   
//				}
			});
		
		scrollPane.setViewportView(table_1);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (table_1.getSelectedRow() != -1) {
					DefaultTableModel tab = (DefaultTableModel) table_1.getModel();
					
					tab.removeRow(table_1.getSelectedRow());
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um produto", 
							"Aten��o", JOptionPane.WARNING_MESSAGE);
				}
				
				limpaCampos();
				
			}
		});
		btExcluir.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btExcluir.setBounds(570, 164, 115, 23);
		contentPane.add(btExcluir);
		
		JButton btAlterar = new JButton("Alterar");
		btAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (table_1.getSelectedRow() != -1) {
					table_1.setValueAt(tfMateria.getText(), table_1.getSelectedRow(), 0);
					table_1.setValueAt(cbTipo.getSelectedItem(), table_1.getSelectedRow(), 1);
					table_1.setValueAt(tfGrupo.getText(), table_1.getSelectedRow(), 2);
					table_1.setValueAt(tfInicio.getText(), table_1.getSelectedRow(), 3);
					table_1.setValueAt(tfEntrega.getText(), table_1.getSelectedRow(), 4);
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um produto", 
							"Atenção", JOptionPane.WARNING_MESSAGE);
				}
				
				limpaCampos();
				
			}
		});
		btAlterar.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btAlterar.setBounds(570, 118, 115, 23);
		contentPane.add(btAlterar);
		
		
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel tab = (DefaultTableModel) table_1.getModel();
				
				Object[] camposTabela = {tfMateria.getText(), cbTipo.getSelectedItem() , tfGrupo.getText(), tfInicio.getText(), tfEntrega.getText()};
				
				tab.addRow(camposTabela);
				
				limpaCampos();
				
			}
		});
		btCadastrar.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btCadastrar.setBounds(570, 73, 115, 23);
		contentPane.add(btCadastrar);
		
	}
	
	private void limpaCampos() {
			tfMateria.setText("");
			tfGrupo.setText("");
			tfInicio.setText("");
			tfEntrega.setText("");
			cbTipo.setSelectedIndex(0);
			
			tfMateria.requestFocus();
		}
}
