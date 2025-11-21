package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class NovaTarefa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfMateria;
	private JTextField tfGrupo;
	private JTextField tfInicio;
	private JTextField tfEntrega;
	private JTable table;
	
	DefaultTableModel tab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovaTarefa frame = new NovaTarefa();
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
	public NovaTarefa() {
		setTitle("Tela de Tarefas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matéria:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel.setBounds(43, 49, 74, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(43, 84, 48, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Grupo:");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(43, 124, 58, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Inicio:");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(43, 178, 108, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data de Entrega:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(43, 218, 121, 22);
		contentPane.add(lblNewLabel_4);
		
		tfMateria = new JTextField();
		tfMateria.setBounds(114, 49, 306, 20);
		contentPane.add(tfMateria);
		tfMateria.setColumns(10);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"", "Prova", "Trabalho", "Atividade", "Seminário", "Experimento", "Maquete"}));
		cbTipo.setBounds(114, 87, 306, 22);
		contentPane.add(cbTipo);
		
		tfGrupo = new JTextField();
		tfGrupo.setBounds(114, 128, 306, 20);
		contentPane.add(tfGrupo);
		tfGrupo.setColumns(10);
		
		tfInicio = new JTextField();
		tfInicio.setBounds(174, 178, 246, 20);
		contentPane.add(tfInicio);
		tfInicio.setColumns(10);
		
		tfEntrega = new JTextField();
		tfEntrega.setBounds(174, 222, 246, 20);
		contentPane.add(tfEntrega);
		tfEntrega.setColumns(10);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (table.getSelectedRow() != -1) {
					tfMateria.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
					cbTipo.setSelectedItem(table.getValueAt(table.getSelectedRow(), 1).toString());
					tfGrupo.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
					tfInicio.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
					tfEntrega.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um produto", "Atenção", 
							JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
//		table.setModel(new DefaultTableModel(
//				new Object[][] {},   // começa vazia
//				new String[] {"Matéria", "Tipo", "Grupo", "Data de Inicio", "Data de Entrega"}  // cabeçalho
//			) {
//								private static final long serialVersionUID = 1L;
//				boolean[] columnEditables = new boolean[] {false, false, false, false, false
//				};
//				public boolean isCellEditable(int row, int column) {return columnEditables[column];   // impede edição direta na tabela
//				}
//			});
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//table = new JTable();
				
				tab = (DefaultTableModel) table.getModel();
				
				Object[] camposTabela = {tfMateria.getText(), cbTipo.getSelectedItem(), tfGrupo.getText(), tfInicio.getText(), tfEntrega.getText()};
				
				tab.addRow(camposTabela);
				
			}
		});
		btCadastrar.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		btCadastrar.setBounds(43, 273, 108, 22);
		contentPane.add(btCadastrar);

	}
}
