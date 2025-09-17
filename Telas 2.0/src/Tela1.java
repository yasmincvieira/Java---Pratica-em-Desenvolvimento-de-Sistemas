import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class Tela1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	//cria o objeto da tela2 para a declaração da istancia (assim nao cria varias instancias)
	private Tela2 tela2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		setTitle("Tela de Componentes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 430);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Abrir Tela");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela2.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sair");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Cadastro");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Aluno");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbNome.setBounds(10, 41, 46, 14);
		contentPane.add(lbNome);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfNome.setBounds(66, 39, 201, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lbDisciplinas = new JLabel("Disciplinas:");
		lbDisciplinas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbDisciplinas.setBounds(10, 83, 73, 14);
		contentPane.add(lbDisciplinas);
		
		JCheckBox cbRedes = new JCheckBox("Redes");
		cbRedes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbRedes.setBounds(78, 80, 73, 23);
		contentPane.add(cbRedes);
		
		JCheckBox cbProgramacao = new JCheckBox("Programação");
		cbProgramacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbProgramacao.setBounds(157, 79, 97, 23);
		contentPane.add(cbProgramacao);
		
		JCheckBox cbSistemas = new JCheckBox("Sistemas Operacionais");
		cbSistemas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbSistemas.setBounds(273, 79, 145, 23);
		contentPane.add(cbSistemas);
		
		JLabel lbTurno = new JLabel("Turno:");
		lbTurno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbTurno.setBounds(10, 132, 46, 14);
		contentPane.add(lbTurno);
		
		JRadioButton rbMatutino = new JRadioButton("Matutino");
		rbMatutino.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbMatutino.setBounds(66, 129, 87, 23);
		contentPane.add(rbMatutino);
		
		JRadioButton rbVespertino = new JRadioButton("Vespertino");
		rbVespertino.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbVespertino.setBounds(168, 128, 109, 23);
		contentPane.add(rbVespertino);
		
		JRadioButton rbNoturno = new JRadioButton("Noturno");
		rbNoturno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbNoturno.setBounds(273, 129, 109, 23);
		contentPane.add(rbNoturno);
		
		//cria um grupo pros radioButton
		ButtonGroup grupo = new ButtonGroup();
		//adiciona os radioButtons no ButtonGroup
		grupo.add(rbMatutino);
		grupo.add(rbVespertino);
		grupo.add(rbNoturno);
		
		//instancia fora do action do botao para nao criar uma instancia a cada vez que clica o botao
		tela2 = new Tela2();
		
		JButton btMostrar = new JButton("Mostrar");
		btMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//mostra oq foi escrito no textField na tela2
				//tela2.taResultado.setText(tfNome.getText());
				
				//apenas mostra se o TextField nao estiver vazio (o ! significa negação
				if (!tfNome.getText().isEmpty()) {
					//fazendo assim nao sobrepoe a ultima linha na outra tela
					//tela2.Nome do textField da segunda tela.append(oq vc quer que passe pra outra tela.getText() + "\n" (para quebrar a linha"));
					tela2.taResultado.append("Nome: " + tfNome.getText() + "\n");
				}
				
				tela2.taResultado.append("\nDisciplina(s):");
				//os ifs mostram na tela2 qual checkBox foi selecionado (tem que usar os append)
				//nao poe else if porque o else if so vai ser lido se o primeiro if nao for verdadeiro
				if (cbRedes.isSelected()) {
					tela2.taResultado.append(cbRedes.getText() + "\n");
				}
				
				if (cbProgramacao.isSelected()) {
					tela2.taResultado.append(cbProgramacao.getText() + "\n");
				}
				
				if (cbSistemas.isSelected()) {
					tela2.taResultado.append(cbSistemas.getText() + "\n");
				}
				
				tela2.taResultado.append("\nTurno: ");
				//os ifs motram qual foi o RadioButton selecionado na tela2
				if (rbMatutino.isSelected()) {
					tela2.taResultado.append(rbMatutino.getText() + "\n");
				}
				
				if (rbVespertino.isSelected()) {
					tela2.taResultado.append(rbVespertino.getText() + "\n");
				}
				
				if (rbNoturno.isSelected()) {
					tela2.taResultado.append(rbNoturno.getText() + "\n");
				}
				
				
				//mostra a tela
				tela2.setVisible(true);
				
			}
			
		});
		btMostrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btMostrar.setBounds(10, 188, 97, 29);
		contentPane.add(btMostrar);
	}
}
