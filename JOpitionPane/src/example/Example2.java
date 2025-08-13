package example;

import javax.swing.JOptionPane;


public class Example2 {
	
public static void main(String[] args) {
		
		String nome;
		nome = JOptionPane.showInputDialog("Digite seu nome");
		
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		double valor;
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
		
		JOptionPane.showMessageDialog(null, "Nome: "+nome+ "\nIdade: " +idade+ "\nValor: " +String.format("%.2f", valor));
	}
}


