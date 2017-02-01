package affichages;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JComponent;
 
@SuppressWarnings("serial")
public class ImagePanel extends JComponent {
   private static Image img;
   
    @SuppressWarnings("static-access") 
	public ImagePanel(Image img){
        this.img = img;
    }
     
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
        g.drawImage(img,0,0,null);
    }
}