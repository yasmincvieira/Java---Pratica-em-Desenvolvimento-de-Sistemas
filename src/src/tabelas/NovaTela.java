package tabelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NovaTela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovaTela frame = new NovaTela();
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
	public NovaTela() {
		setTitle("Segunda tela");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// PARA NÃO FECHAR A PRIMEIRA TELA JUNTO, FECHA SOMENTE ESTA TELA 
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir ");
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "Abrindo Tela"); // aparecer a mensagem depoi de clicar em abrir
			}
		});
		mnNewMenu.add(mntmAbrir);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //fecha a tela 
			}
		});
		mnNewMenu.add(mntmSair);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem menuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(menuItem_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
	}
}
