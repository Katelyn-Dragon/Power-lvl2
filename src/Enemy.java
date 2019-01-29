import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Enemy extends GameObject{

	boolean kShooting = true;
	
	
	public static BufferedImage KJD;
	
	public Enemy (int x, int y) {
		super(x,y);
		
		try {
			
			KJD = ImageIO.read(this.getClass().getResourceAsStream("KJD.png"));
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public void update () {
		super.update();
	}
	
	public void draw(Graphics g) {
		g.drawImage(KJD, 1000, 450, null);
		Random rand= new Random();
		int randomNum = rand.nextInt((2-1)+1)+1;
		if (kShooting == true) {
			//g.drawImage(GamePanel.Shoot2Img, 1000, 450, null);
		}
	}
}
