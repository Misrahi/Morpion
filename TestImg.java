package Test;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TestImg{

	public static void main(String[] args) throws IOException {
		Image img =ImageIO.read(new File("D:/workspace/morpion/src/grille.png"));
		ImageFrame win=new ImageFrame(img);
		win.setVisible(true);
		win.setResizable(false);
	}

}
