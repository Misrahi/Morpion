package interfaces;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Grille extends JFrame {
	
	public Grille(){
	setSize(400, 400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Morpion");
	
	}
}
