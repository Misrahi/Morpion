package interfaces;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Final extends JFrame {
	private String v; //variable victoire/ défaite
	
	public Final(){
		setSize(200, 140);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Morpion");
		setResizable(false);
		setLocationRelativeTo(null);
		
		boolean victoire = false;
		
		if (victoire==true)
			v="Victoire ! :D";
		else
			v="Défaite ! D:";
		
		JPanel bouton1 = new JPanel();
		JPanel bouton2 = new JPanel();
		JPanel texte = new JPanel();
		JLabel label = new JLabel(v); //texte
		JButton rejouer = new JButton ("Rejouer");
		JButton quitter = new JButton ("Quitter");
		/*Container box=Box.createVerticalBox();
		Container boite=Box.createHorizontalBox();*/
		
		//ajout
		/*box.add(Box.createVerticalGlue());
		box.add(label);
		box.add(Box.createVerticalGlue());
		box.add(rejouer);
		box.add(Box.createVerticalGlue());
		box.add(quitter);*/
		bouton1.add(rejouer);
		bouton2.add(quitter);
		texte.add(label);
		/*this.add(texte, BorderLayout.NORTH);
		this.add(box, BorderLayout.CENTER);
		this.add(quitter, BorderLayout.SOUTH);*/
		this.setLayout(new GridLayout(3,1));
		this.add(texte);
		this.add(bouton1);
		this.add(bouton2);
		
		//ACTION BOUTON
		rejouer.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Vous allez rejouer");
				Menu frame = new Menu();
				frame.setVisible(true);
				setVisible(false);
			}
		});
	
		quitter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				System.out.println("jeu quitté");
				System.exit(0);
	
			}

		});
	}

}
