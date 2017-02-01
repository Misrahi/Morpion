package interfaces;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Difficult extends JFrame {
	public Difficult(){
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Morpion");
		setResizable(false);
		setLocationRelativeTo(null);

		
		JLabel label = new JLabel("Choisissez le niveau de difficulté"); //texte
		JPanel panel = new JPanel(); //conteneur label
		JPanel bouton = new JPanel();//conteneur bouton 1, 2 et 3
		JPanel bouton1 = new JPanel();//conteneur easy
		JPanel bouton2 = new JPanel();//conteneur medium
		JPanel bouton3= new JPanel();	//conteneur hard
		JPanel bouton4= new JPanel();	//conteneur quitter
		JButton izy = new JButton ("Facile");
		JButton medium = new JButton ("Moyen");
		JButton hard = new JButton ("Difficile");
		JButton quitter = new JButton ("Quitter");
		
		//ajout
		panel.add(label);
		this.add(panel, BorderLayout.NORTH);
		bouton1.add(izy);
		bouton2.add(medium);
		bouton3.add(hard);
		bouton4.add(quitter);
		bouton.add(bouton1);
		bouton.add(bouton2);
		bouton.add(bouton3);
		this.add(bouton, BorderLayout.CENTER);
		this.add(bouton4, BorderLayout.SOUTH);
		
		//ACTION BOUTON
		izy.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Vous allez jouez contre un homo sapiens sapiens");
				setVisible(false);
					}
		});
		
		medium.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Vous allez jouez contre une intelligence artificielle");
				setVisible(false);	
			}
		});
		
		hard.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Vous allez jouez contre une intelligence artificielle");
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



