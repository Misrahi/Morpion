package interfaces;

import java.awt.Image;

import javax.swing.JFrame;

import affichages.ImagePanel;

@SuppressWarnings("serial")
public class ImageFrame extends JFrame {
	public ImageFrame(Image img){
		setSize(405, 428);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Morpion");
		setResizable(false);
		setLocationRelativeTo(null);
		
		ImagePanel frame = new ImagePanel(img);
		
		this.add(frame);
		
	}
}
