package executables;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import interfaces.ImageFrame;

public class TestImg{

	public static void main(String[] args) throws IOException {
		Image img =ImageIO.read(new File("././grille.png"));
		ImageFrame frame=new ImageFrame(img);
		frame.setVisible(true);
		
	}

}
