package example;

import javax.swing.JOptionPane;

public class Example {
	
	public static void main(String[] args) {
		
		Object disciplinas[] = {"POO", "Redes", "Banco de Dados", "Análise de Sistemas", "Design Gráfico", "Prática em Desenvolvimento de Sistemas"};
		
		Object itemSelecionado;
		
		itemSelecionado = JOptionPane.showInputDialog(null, "Escolha uma disciplina", "Disciplinas", JOptionPane.QUESTION_MESSAGE, null, disciplinas, disciplinas[0]);
		
		if (itemSelecionado == null) {
			JOptionPane.showMessageDialog(null, "Operação cancelada");
		}else {
			JOptionPane.showMessageDialog(null, "Você selecionou a disciplina: " + itemSelecionado);
		}
	}
}

