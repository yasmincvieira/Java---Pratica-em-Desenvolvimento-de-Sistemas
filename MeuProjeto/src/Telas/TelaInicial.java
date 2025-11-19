package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

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
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 33, 602, 271);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Matéria", "Tipo", "Grupo", "Data de Inicio", "Data de Entrega"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btExcluir.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btExcluir.setBounds(70, 395, 89, 23);
		contentPane.add(btExcluir);
		
		JButton btAlterar = new JButton("Alterar");
		btAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btAlterar.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btAlterar.setBounds(70, 327, 89, 23);
		contentPane.add(btAlterar);
		
		JButton btEntrege = new JButton("Entrege");
		btEntrege.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btEntrege.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btEntrege.setBounds(70, 361, 89, 23);
		contentPane.add(btEntrege);
		
		JButton btNovaTarefa = new JButton("Cadastrar Nova Tarefa");
		btNovaTarefa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btNovaTarefa.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btNovaTarefa.setBounds(199, 344, 210, 23);
		contentPane.add(btNovaTarefa);
		
		JButton btRegistros = new JButton("Ver Registros");
		btRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btRegistros.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btRegistros.setBounds(199, 378, 210, 23);
		contentPane.add(btRegistros);
		
		
		
		
	}
}
