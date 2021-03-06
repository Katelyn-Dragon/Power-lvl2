import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Human extends GameObject {

	boolean isShooting;
	boolean forwards;
	boolean backwards;
	int walktimer = 0;
	BufferedImage[] walk;
	int walkIndex = 0;

	public static BufferedImage PCY1Img;

	public static BufferedImage PCY2Img;

	public static BufferedImage PCY3Img;

	public static BufferedImage PCY4Img;

	public static BufferedImage PCY5Img;

	public static BufferedImage PCY6Img;

	public static BufferedImage PCY7Img;
	
	static int width = 100;
	
	static int height = 250;

	
	public Human(int x, int y, int width, int height) {
		super(x, y, width, height);
		walk = new BufferedImage[7];

		try {

			walk[0] = ImageIO.read(this.getClass().getResourceAsStream("PCY1.png"));

			walk[1] = ImageIO.read(this.getClass().getResourceAsStream("PCY2.png"));

			walk[2] = ImageIO.read(this.getClass().getResourceAsStream("PCY3.png"));

			walk[3] = ImageIO.read(this.getClass().getResourceAsStream("PCY4.png"));

			walk[4] = ImageIO.read(this.getClass().getResourceAsStream("PCY5.png"));

			walk[5] = ImageIO.read(this.getClass().getResourceAsStream("PCY6.png"));

			walk[6] = ImageIO.read(this.getClass().getResourceAsStream("PCY7.png"));

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update() {
		super.update();
//		if (forwards == true) {
//			x += 7;
//		}
//		if (backwards == true) {
//			x-= 5;
//		}
	}

	public void draw(Graphics g) {

		if (isShooting == false && forwards == false && backwards == false) {
			g.drawImage(walk[0], x, y, null);
		} 
		
		else if (isShooting == true && forwards == false && backwards == false) {
			g.drawImage(GamePanel.ShootImg, x, y, null);
		} 
		
		super.draw(g);
		
//		else if (isShooting == false && forwards == true && backwards == false) {
//			if (walktimer < 50) {
//				walkIndex = 0;
//			} else if (walktimer < 100) {
//				walkIndex = 1;
//			} else if (walktimer < 150) {
//				walkIndex = 2;
//			} else if (walktimer < 200) {
//				walkIndex = 3;
//			} else if (walktimer < 250) {
//				walkIndex = 4;
//			} else if (walktimer < 300) {
//				walkIndex = 5;
//			} else if (walktimer < 350) {
//				walkIndex = 6;
//			} else {
//				walktimer = 0;
//			}
//			g.drawImage(walk[walkIndex], x, y, null);
//			walktimer++;
//		}
		
//		if (isShooting == false && forwards == false && backwards == true) {
//			if (walktimer < 50) {
//				walkIndex = 6;
//			} else if (walktimer < 100) {
//				walkIndex = 5;
//			} else if (walktimer < 150) {
//				walkIndex = 4;
//			} else if (walktimer < 200) {
//				walkIndex = 3;
//			} else if (walktimer < 250) {
//				walkIndex = 3;
//			} else if (walktimer < 300) {
//				walkIndex = 2;
//			} else if (walktimer < 350) {
//				walkIndex = 1;
//			} else if (walktimer < 400) {
//				walkIndex = 0;
//			} else {
//				walkIndex = 0;
//			}
//			g.drawImage(walk[walkIndex], x, y, null);
//			walktimer++;
//		}
	}

}
