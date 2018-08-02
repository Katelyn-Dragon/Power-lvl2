import java.awt.Graphics;

public class Humans extends GameObject {

	boolean isShooting;
	
	public Humans(int x, int y) {
		super(x, y);
	}
	
	public void update() {
		super.update();
	}
	
	public void draw(Graphics g) {
		if (isShooting == false) {
			g.drawImage(GamePanel.PCYImg, x, y, null);
		}
		else {
			g.drawImage(GamePanel.ShootImg, x, y, null);
		}
	}
}
