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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import java.awt.Panel;
import javax.swing.JScrollPane;

public class TelaAluno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTable table;

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
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Curso:");
		lblNewLabel_1.setBounds(28, 51, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cbCursos = new JComboBox();
		cbCursos.setModel(new DefaultComboBoxModel(new String[] {"", "Química", "Informática"}));
		cbCursos.setBounds(72, 47, 226, 22);
		contentPane.add(cbCursos);
		
		Label label = new Label("Turno:");
		label.setBounds(28, 75, 52, 22);
		contentPane.add(label);
		
		JRadioButton rbMatutino = new JRadioButton("Matutino");
		rbMatutino.setBounds(86, 74, 81, 23);
		contentPane.add(rbMatutino);
		
		JRadioButton rbVespertino = new JRadioButton("Vespertino");
		rbVespertino.setBounds(178, 74, 89, 23);
		contentPane.add(rbVespertino);
		
		JRadioButton rbNoturno = new JRadioButton("Noturno");
		rbNoturno.setBounds(283, 74, 81, 23);
		contentPane.add(rbNoturno);
		
		JLabel lbDisciplinas = new JLabel("Disciplinas:");
		lbDisciplinas.setBounds(28, 107, 68, 14);
		contentPane.add(lbDisciplinas);
		
		JCheckBox cbProgramacao = new JCheckBox("Programação");
		cbProgramacao.setBounds(90, 103, 115, 23);
		contentPane.add(cbProgramacao);
		
		JCheckBox cbBancoDados = new JCheckBox("Banco de dados");
		cbBancoDados.setBounds(207, 103, 140, 23);
		contentPane.add(cbBancoDados);
		
		JCheckBox cbQuimica = new JCheckBox("Química");
		cbQuimica.setBounds(90, 137, 97, 23);
		contentPane.add(cbQuimica);
		
		JCheckBox cbBiologia = new JCheckBox("Biologia");
		cbBiologia.setBounds(207, 137, 97, 23);
		contentPane.add(cbBiologia);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btExcluir.setBounds(383, 115, 103, 23);
		contentPane.add(btExcluir);
		
		JButton btAlterar = new JButton("Alterar");
		btAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btAlterar.setBounds(383, 81, 103, 23);
		contentPane.add(btAlterar);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btCadastrar.setBounds(383, 47, 103, 23);
		contentPane.add(btCadastrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 191, 474, 201);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
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
	}
}
