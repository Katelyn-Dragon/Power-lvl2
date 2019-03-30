import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Enemy extends GameObject {

	boolean crouching = false;
	boolean standing = true;
	boolean isAlive = true;
	static int height = 215;
	static int width = 80;
	static int x = 1000;
	static int y = 560;

	Rectangle collisionBox;

	public static BufferedImage KJD;
	public static BufferedImage Crouch;

	public Enemy(int x, int y) {
		super(x, y, width, height);

		try {

			KJD = ImageIO.read(this.getClass().getResourceAsStream("KJD.png"));
			Crouch = ImageIO.read(this.getClass().getResourceAsStream("Crouch.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		collisionBox = new Rectangle(x, y, width, height);
	}

	public void update() {
		super.update();
		collisionBox = new Rectangle(x, y, width, height);
	}

	public void draw(Graphics g) {
		if (crouching == false && standing == true) {
			g.drawImage(KJD, x, y, null);
		}
		if (crouching == true && standing == false) {
			g.drawImage(Crouch, 960, 500, null);
		}

		super.draw(g);
//		if (kShooting == true) {
//			//g.drawImage(GamePanel.Shoot2Img, 1000, 450, null);
//		}
	}
}
