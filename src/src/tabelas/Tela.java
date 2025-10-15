package tabelas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;

import javax.swing.*;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfIdade;
	private JTable tabela;
	
	private DefaultTableModel modeloTabela; // para manipular a tabela 
	private int linhaAlteracao = -1; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfNome = new JTextField();
		tfNome.setBounds(27, 44, 96, 19);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfIdade = new JTextField();
		tfIdade.setBounds(161, 44, 96, 19);
		contentPane.add(tfIdade);
		tfIdade.setColumns(10);
		
		JButton btAdiciona = new JButton("Adiciona");
		btAdiciona.setBounds(282, 43, 85, 21);
		contentPane.add(btAdiciona);
		
		// Modelo de Tabela padrão
        modeloTabela = new DefaultTableModel(new Object[]{"Nome", "Idade"}, 0);
        tabela = new JTable(modeloTabela);

        // Colocando JTable no JScrollPane
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(27, 131, 356, 128);
        contentPane.add(scrollPane);
        
        JLabel lblNewLabel = new JLabel("Nome:");
        lblNewLabel.setBounds(27, 21, 45, 13);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Idade:");
        lblNewLabel_1.setBounds(161, 21, 45, 13);
        contentPane.add(lblNewLabel_1);
        
        JButton btAdicionar = new JButton("Adiciona");
        btAdicionar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String nome = tfNome.getText().trim(); // para não icar repetindo tudo
                String idade = tfIdade.getText().trim();

                if (!nome.isEmpty() && !idade.isEmpty()) {
                	//se tiver alterando, substitui a linha
                	if( linhaAlteracao >= 0) {
                		modeloTabela.setValueAt(nome, linhaAlteracao, 0); // alteração e acordo com o textfild
                		modeloTabela.setValueAt(idade, linhaAlteracao, 1); 
                		
                		linhaAlteracao = -1;
                	} else {
                		modeloTabela.addRow(new Object[] {nome,idade}); 
                	}
                	
                    tfNome.setText("");
                    tfIdade.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!",
                            "Aviso", JOptionPane.WARNING_MESSAGE);
                
            }
        	
        		
        	}
        	
        });
        btAdicionar.setBounds(42, 322, 89, 23);
        contentPane.add(btAdicionar);
        
        JButton btAlterar = new JButton("Alterar");
        btAlterar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int  linhaSelecionada = tabela.getSelectedRow();
        		if (linhaSelecionada  >=0) {
        			
        			linhaAlteracao = linhaSelecionada; 
        			
        			String nome = modeloTabela.getValueAt(linhaSelecionada, 0).toString();
        			String idade = modeloTabela.getValueAt(linhaSelecionada, 1).toString(); 
        		
        			tfNome.setText(nome);
        			tfIdade.setText(idade);// paa jogar o textopra dentro do campinho de preencher
        			
        		} else {
        			JOptionPane.showMessageDialog(null, "Selecione uma linha para alerar"); 
        		}
        	}
        });
        btAlterar.setBounds(172, 322, 89, 23);
        contentPane.add(btAlterar);
        
        JButton btExcluir = new JButton("Excluir");
        btExcluir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int linhaSelecionada = tabela.getSelectedRow(); 
        		if (linhaSelecionada >= 0 ) {
        			modeloTabela.removeRow(linhaSelecionada); 
        		} else {
        			JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir");
        		
        		}
        	}
        });
        btExcluir.setBounds(307, 322, 89, 23);
        contentPane.add(btExcluir);

        // Ação do botão
        btAdiciona.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = tfNome.getText().trim(); // para não icar repetindo tudo
                String idade = tfIdade.getText().trim();

                if (!nome.isEmpty() && !idade.isEmpty()) {
                	//se tiver alterando, substitui a linha
                	if( linhaAlteracao >= 0) {
                		modeloTabela.setValueAt(nome, linhaAlteracao, 0); // alteração e acordo com o textfild
                		modeloTabela.setValueAt(idade, linhaAlteracao, 1); 
                		
                		linhaAlteracao = -1;
                	} else {
                		modeloTabela.addRow(new Object[] {nome,idade}); 
                	}
                	
                    tfNome.setText("");
                    tfIdade.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!",
                            "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}
