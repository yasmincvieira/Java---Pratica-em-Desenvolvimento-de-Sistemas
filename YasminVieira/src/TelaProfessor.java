import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaProfessor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProfessor frame = new TelaProfessor();
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
	public TelaProfessor() {
		setTitle("Tela Professor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 443, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox cbRedes = new JCheckBox("Redes");
		cbRedes.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		cbRedes.setBounds(20, 43, 85, 23);
		contentPane.add(cbRedes);
		
		JLabel lbDisciplinas = new JLabel("Disciplinas selecionadas:");
		lbDisciplinas.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lbDisciplinas.setBounds(10, 22, 165, 14);
		contentPane.add(lbDisciplinas);
		
		JCheckBox cbProgramacao = new JCheckBox("Programação");
		cbProgramacao.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		cbProgramacao.setBounds(20, 69, 110, 23);
		contentPane.add(cbProgramacao);
		
		JCheckBox cbBancoDados = new JCheckBox("Banco de dados");
		cbBancoDados.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		cbBancoDados.setBounds(20, 95, 122, 23);
		contentPane.add(cbBancoDados);
		
		JLabel lbSuperior = new JLabel("Leciona para o ensino superior?");
		lbSuperior.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lbSuperior.setBounds(10, 131, 196, 14);
		contentPane.add(lbSuperior);
		
		JRadioButton rbNao = new JRadioButton("Não");
		rbNao.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rbNao.setBounds(20, 152, 109, 23);
		contentPane.add(rbNao);
		
		JRadioButton rbSim = new JRadioButton("Sim");
		rbSim.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rbSim.setBounds(21, 178, 109, 23);
		contentPane.add(rbSim);
		
		//cria os grupos para os RadioButtons
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rbSim);
		grupo.add(rbNao);
		
		JButton btMostrarProf = new JButton("Mostrar");
		btMostrarProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//mostra qual RadioButton soi selecionado
				if (rbNao.isSelected()) {
					JOptionPane.showMessageDialog(null, "Leciona para o superior?\n" + rbNao.getText());
				}
				if (rbSim.isSelected()) {
					JOptionPane.showMessageDialog(null, "Leciona para o ensiona superior?\n" + rbSim.getText());
				}
				
			}
		});
		btMostrarProf.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		btMostrarProf.setBounds(10, 216, 101, 25);
		contentPane.add(btMostrarProf);
		
		
	}
}
