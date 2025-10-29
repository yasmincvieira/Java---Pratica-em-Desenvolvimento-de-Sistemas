package AtividadeTelaAluno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.ScrollPane;
import java.awt.Label;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Panel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaAluno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTable table;
	private String radioB = null;
	private String checkB = null;
	private JComboBox cbCursos;
	private JCheckBox cbQuimica;
	private JCheckBox cbProgramacao;
	private JRadioButton rbMatutino;
	private JRadioButton rbVespertino;
	private JRadioButton rbNoturno;
	DefaultTableModel tab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAluno frame = new TelaAluno();
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
	
	public TelaAluno() {
		setTitle("Tela Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(28, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.setBounds(72, 11, 226, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		cbCursos = new JComboBox();
		cbCursos.setModel(new DefaultComboBoxModel(new String[] {" ","Química", "Informática"}));
		cbCursos.setBounds(72, 47, 226, 22);
		contentPane.add(cbCursos);
		
		JLabel lblNewLabel_1 = new JLabel("Curso:");
		lblNewLabel_1.setBounds(28, 51, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		rbMatutino = new JRadioButton("Matutino");
		rbMatutino.setBounds(86, 93, 81, 23);
		contentPane.add(rbMatutino);
		
		rbVespertino = new JRadioButton("Vespertino");
		rbVespertino.setBounds(179, 92, 89, 23);
		contentPane.add(rbVespertino);
		
		rbNoturno = new JRadioButton("Noturno");
		rbNoturno.setBounds(280, 92, 81, 23);
		contentPane.add(rbNoturno);
		
		JLabel lbDisciplinas = new JLabel("Disciplinas:");
		lbDisciplinas.setBounds(28, 141, 68, 14);
		contentPane.add(lbDisciplinas);
		
		cbProgramacao = new JCheckBox("Programação");
		cbProgramacao.setBounds(100, 137, 115, 23);
		contentPane.add(cbProgramacao);
		
		cbQuimica = new JCheckBox("Química");
		cbQuimica.setBounds(220, 137, 97, 23);
		contentPane.add(cbQuimica);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 191, 474, 201);
		contentPane.add(scrollPane);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rbMatutino);
		grupo.add(rbVespertino);
		grupo.add(rbNoturno);
		
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (table.getSelectedRow() != -1) {
					tfNome.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
					cbCursos.setSelectedItem(table.getValueAt(table.getSelectedRow(), 1).toString());
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um produto", "Atenção", 
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		table.setModel(new DefaultTableModel(
				new Object[][] {},   // começa vazia
				new String[] {
					"Nome", "Curso", "Turno", "Disciplinas"}  // cabeçalho
			) {
								private static final long serialVersionUID = 1L;
				boolean[] columnEditables = new boolean[] {
					false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];   // impede edição direta na tabela
				}
			});
		
		scrollPane.setViewportView(table);
		
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (table.getSelectedRow() != -1) {
					DefaultTableModel tab = (DefaultTableModel) table.getModel();
					tab.removeRow(table.getSelectedRow());
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um produto", 
							"Atenção", JOptionPane.WARNING_MESSAGE);
				}
				limpaCampos();
			}
		});
		btExcluir.setBounds(383, 115, 103, 23);
		contentPane.add(btExcluir);
		
		JButton btAlterar = new JButton("Alterar");
		btAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rbMatutino.isSelected()) {
					radioB = rbMatutino.getText();
				}
				
				if (rbVespertino.isSelected()) {
					radioB = rbVespertino.getText();
				}
				
				if (rbNoturno.isSelected()) {
					radioB = rbNoturno.getText();
				}
				
				
				if (cbProgramacao.isSelected()) {
					checkB = cbProgramacao.getText();
				}
				
				if (cbQuimica.isSelected()) {
					checkB = cbQuimica.getText();
				}
				
				if (tfNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Favor inserir o nome do aluno");
				}else {
					if (table.getSelectedRow() != -1) {
						table.setValueAt(tfNome.getText(), table.getSelectedRow(), 0);
						table.setValueAt(cbCursos.getSelectedItem(), table.getSelectedRow(), 1);
						table.setValueAt(radioB, table.getSelectedRow(), 2);
						table.setValueAt(checkB, table.getSelectedRow(), 3);
					}else {
						JOptionPane.showMessageDialog(null, "Selecione um produto", 
							"Atenção", JOptionPane.WARNING_MESSAGE);
				}
				
				limpaCampos();
				
				}
			}});
		btAlterar.setBounds(383, 81, 103, 23);
		contentPane.add(btAlterar);
		
		
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (rbMatutino.isSelected()) {
					radioB = rbMatutino.getText();
				}
				
				if (rbVespertino.isSelected()) {
					radioB = rbVespertino.getText();
				}
				
				if (rbNoturno.isSelected()) {
					radioB = rbNoturno.getText();
				}
				
				
				if (cbProgramacao.isSelected()) {
					checkB = cbProgramacao.getText();
				}
				
				if (cbQuimica.isSelected()) {
					checkB = cbQuimica.getText();
				}
				
				if (tfNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Favor inserir o nome do aluno");
				}else {
				
					tab = (DefaultTableModel) table.getModel();
				
					Object[] camposTabela = {tfNome.getText(), cbCursos.getSelectedItem(), radioB, checkB};
				
					tab.addRow(camposTabela);
				}
				
				limpaCampos();
				
			}
		});
		btCadastrar.setBounds(383, 47, 103, 23);
		contentPane.add(btCadastrar);
		
		JLabel lbTurno = new JLabel("Turno:");
		lbTurno.setBounds(28, 97, 46, 14);
		contentPane.add(lbTurno);
		
		
	}
	private void limpaCampos() {
		tfNome.setText("");
		cbCursos.setSelectedIndex(0);
		rbMatutino.setSelected(false);
		rbVespertino.setSelected(false);
		rbNoturno.setSelected(false);
		cbProgramacao.setSelected(false);
		cbQuimica.setSelected(false);
	}
}
