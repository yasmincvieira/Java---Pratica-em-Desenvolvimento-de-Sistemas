import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private TelaAluno telaAluno;
	private TelaProfessor telaProf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastro");
		menuBar.add(mnNewMenu);
		
		//instancia
		telaAluno = new TelaAluno();
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Aluno");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//deixa a tela do aluno visivel
				telaAluno.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		//cria uma linha para separar os itens
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		//instancia
		telaProf = new TelaProfessor();
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Professor");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//deixa a tela do professor visivel
				telaProf.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		//cria uma linha para separar os itens
		JMenu mnNewMenu_1 = new JMenu("Sistema");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Sair");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//fecha o sistema
				dispose();
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
