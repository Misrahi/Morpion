package interfaces;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import affichages.ImagePanel;

@SuppressWarnings("serial")
public class ImageFrame extends JFrame {
	public ImageFrame(Image img){
		setSize(405,428);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Morpion");
		setResizable(false);
		setLocationRelativeTo(null);
		
		ImagePanel fond = new ImagePanel(img);
		
		setContentPane(fond);
//		this.add(fond);
		
		/*JButton[] gril=new JButton();
		this.setLayout(new GridLayout(3,3));*/
		ArrayList<JButton> gril=new ArrayList<JButton>();
		for(int i=0;i<9;i++){
			gril.add(new JButton());
//			gril.get(i).setOpaque(false);
//			gril.get(i).setContentAreaFilled(false);
//			gril.get(i).setBorderPainted(false);
		}
		
		gril.get(0).addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("BOUTON CANCER SAMER");
					}
		});
	}
}
