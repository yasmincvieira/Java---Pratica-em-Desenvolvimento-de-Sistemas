package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NovaTarefa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfMateria;
	private JTextField tfGrupo;
	private JTextField tfInicio;
	private JTextField tfEntrega;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matéria:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel.setBounds(43, 60, 74, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(43, 100, 48, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Grupo:");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(43, 147, 58, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Inicio:");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(43, 198, 108, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data de Entrega:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(43, 240, 121, 22);
		contentPane.add(lblNewLabel_4);
		
		tfMateria = new JTextField();
		tfMateria.setBounds(114, 60, 306, 20);
		contentPane.add(tfMateria);
		tfMateria.setColumns(10);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"", "Prova", "Trabalho", "Atividade", "Seminário", "Experimento", "Maquete"}));
		cbTipo.setBounds(114, 103, 306, 22);
		contentPane.add(cbTipo);
		
		tfGrupo = new JTextField();
		tfGrupo.setBounds(114, 151, 306, 20);
		contentPane.add(tfGrupo);
		tfGrupo.setColumns(10);
		
		tfInicio = new JTextField();
		tfInicio.setBounds(174, 198, 246, 20);
		contentPane.add(tfInicio);
		tfInicio.setColumns(10);
		
		tfEntrega = new JTextField();
		tfEntrega.setBounds(174, 244, 246, 20);
		contentPane.add(tfEntrega);
		tfEntrega.setColumns(10);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btCadastrar.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		btCadastrar.setBounds(43, 308, 108, 22);
		contentPane.add(btCadastrar);

	}
}
