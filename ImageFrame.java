package Test;

import java.awt.Image;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ImageFrame extends JFrame {
	public ImageFrame(Image img){
		setSize(405, 428);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Morpion");
		
		ImagePanel frame = new ImagePanel(img);
		
		this.add(frame);
		
	}
}
