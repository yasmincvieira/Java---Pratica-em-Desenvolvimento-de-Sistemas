import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Tela1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbDisciplinas = new JComboBox();
		cbDisciplinas.setModel(new DefaultComboBoxModel(new String[] {"Programação", "Redes", "Sistemas Operacionais", "Banco de Dados", "Desing Gráfico"}));
		cbDisciplinas.setBounds(74, 27, 189, 22);
		contentPane.add(cbDisciplinas);
		
		JLabel lblNewLabel_1 = new JLabel("Disciplinas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 30, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lbDisciplina = new JLabel("xxx");
		lbDisciplina.setBounds(74, 60, 189, 14);
		contentPane.add(lbDisciplina);
		
		JButton btInserir = new JButton("Inserir");
		btInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//mostra oq foi selecionado em um JOptionPane antes de abrir a tela2
				JOptionPane.showMessageDialog(null, cbDisciplinas.getSelectedItem());
				
				//mostra no label dentro da tela1
				lbDisciplina.setText((String) cbDisciplinas.getSelectedItem());
				
				//instancia
				Tela2 tela2 = new Tela2();
				
				//mostra oq foi selecionado para a outra tela
				tela2.taConteudo.setText( (String) cbDisciplinas.getSelectedItem());
				
				tela2.setVisible(true);
				
			}
		});
		btInserir.setBounds(273, 27, 89, 23);
		contentPane.add(btInserir);
		
		JCheckBox ckOpcao1 = new JCheckBox("Opção 1");
		ckOpcao1.setBounds(10, 98, 97, 23);
		contentPane.add(ckOpcao1);
		
		JCheckBox ckOpcao2 = new JCheckBox("Opção 2");
		ckOpcao2.setBounds(10, 122, 97, 23);
		contentPane.add(ckOpcao2);
		
		JCheckBox ckOpcao3 = new JCheckBox("Opção 3");
		ckOpcao3.setBounds(10, 148, 97, 23);
		contentPane.add(ckOpcao3);
		
		JButton btCkBox = new JButton("Inserir CkBox");
		btCkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//instacia de novo para poder manipular aqui
				Tela2 tela2 = new Tela2();
				
				//seleciona as opcoes para mostrar na tela2
				if(ckOpcao1.isSelected()) {
					//pega exatamente oq está escrito na opção (nao é texto selecionado)
					tela2.taConteudo.setText(ckOpcao1.getText());
				}
				
				if(ckOpcao2.isSelected()) {
					tela2.taConteudo.setText(ckOpcao2.getText());
				}
				
				if(ckOpcao3.isSelected()) {
					tela2.taConteudo.setText(ckOpcao3.getText());
				}
				
				tela2.setVisible(true);
			}//por algum motivo esse codigo nao ta dando certo
			 //precisa de outro componente, professora vai mostrar em outra aula
		});
		btCkBox.setBounds(10, 178, 124, 23);
		contentPane.add(btCkBox);
		
		JRadioButton rbSim = new JRadioButton("Sim");
		rbSim.setBounds(181, 98, 109, 23);
		contentPane.add(rbSim);
		
		JRadioButton rbNao = new JRadioButton("Não");
		rbNao.setBounds(181, 122, 109, 23);
		contentPane.add(rbNao);
		
		//cria um grupo para os RadioButton para que possa ser selecionado apenas um deles
		ButtonGroup grupo = new ButtonGroup();
		//adiciona o grupo que criamos para os RadioButtons
		grupo.add(rbNao);
		grupo.add(rbSim);
	}
}
