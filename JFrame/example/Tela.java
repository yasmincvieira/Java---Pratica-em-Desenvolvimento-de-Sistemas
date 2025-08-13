package example;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Tela extends JFrame{
	
	JLabel label1;
	JLabel label2;
	
	public Tela() {
		super("Primeira tela com JFrame");
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 200, 400, 400);
		
		ImageIcon icone = new ImageIcon(getClass().getResource("/image/comp.png"));
		setIconImage(icone.getImage());
		
		label1 = new JLabel("Label com texto");
		label1.setToolTipText("Você está vendo o label1");
		add(label1);
		
		ImageIcon coqueiro = new ImageIcon(getClass().getResource("coqueiro.png"));
		
		label2 = new JLabel("Label com imagem", coqueiro, SwingConstants.LEFT);
		label2.setToolTipText("Você está vendo o label2");
		add(label2);
		
		setVisible(true);
		
		
	}
	
}

