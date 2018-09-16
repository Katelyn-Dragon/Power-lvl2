import java.awt.Graphics;

public class Humans extends GameObject {

	boolean isShooting;
	boolean walking;
	int walktimer = 0;

	public Humans(int x, int y) {
		super(x, y);
	}

	public void update() {
		super.update();
	}

	public void draw(Graphics g) {
		
		if (isShooting == false & walking == false) {
			g.drawImage(GamePanel.PCY1Img, x, y, null);
		} 
		else if (isShooting == true & walking == false) {
			g.drawImage(GamePanel.ShootImg, x, y, null);
		} 
		else if (isShooting == false & walking == true) {
			if (walktimer < 100) {
				g.drawImage(GamePanel.PCY2Img, x, y, null);
			}
			else if (walktimer < 200) {
				g.drawImage(GamePanel.PCY3Img, x, y, null);
			}
			else if (walktimer < 300) {
				g.drawImage(GamePanel.PCY4Img, x, y, null);
			}
			else {
				walktimer = 0;
			}
			walktimer++;
		}

	}
}