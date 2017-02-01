package interfaces;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Menu extends JFrame {
	public Menu(){
		setSize(200, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Morpion");
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("Morpion"); //texte
		JPanel panel = new JPanel(); //conteneur label
		JPanel bouton = new JPanel();//conteneur bouton 1 et 2 
		JPanel bouton1 = new JPanel();//conteneur 1 joueur
		JPanel bouton2 = new JPanel();//conteneur 2 joueur
		JPanel bouton3= new JPanel();	//conteneur quitter
		JButton unJoueur = new JButton("1 joueur");
		JButton deuxJoueurs = new JButton ("2 joueurs");
		JButton quitter = new JButton ("Quitter");
		
		//ajout
		panel.add(label);
		this.add(panel, BorderLayout.NORTH);
		bouton1.add(unJoueur);
		bouton2.add(deuxJoueurs);
		bouton3.add(quitter);
		bouton.add(bouton1);
		bouton.add(bouton2);
		this.add(bouton, BorderLayout.CENTER);
		this.add(bouton3, BorderLayout.SOUTH);
		
		//ACTION BOUTON
		deuxJoueurs.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Vous allez jouez contre un Homme!!!!");
				setVisible(false);
					}
		});
	
		quitter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				System.out.println("jeu quitté");
				java.lang.System.exit(0);
	
			}

		});
		
		unJoueur.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Vous allez jouez contre une intelligence supérieure!!!!");
				setVisible(false);	
			}
		});
	}
}
		
	