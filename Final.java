package Test;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Final extends JFrame {
	private String v; //variable victoire/ défaite
	
	public Final(){
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Morpion");
		
		boolean victoire = false;
		
		if (victoire==true)
			v="Victoire ! :D";
		else
			v="Défaite ! D:";
		
		JPanel bouton = new JPanel();
		JLabel label = new JLabel(v); //texte
		JButton rejouer = new JButton ("Rejouer");
		JButton quitter = new JButton ("Quitter");
		
		//ajout
		bouton.add(rejouer);
		this.add(label, BorderLayout.NORTH);
		this.add(bouton, BorderLayout.CENTER);
		this.add(quitter, BorderLayout.SOUTH);
	}

}
