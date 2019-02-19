import java.awt.Graphics;

public class Robot extends GameObject{

	static int width = 200;
	static int height = 350;
	
	public Robot(int x, int y) {
		super(x,y, width, height);
	}
	
	public void update() {
		super.update();
	}
	
	public void draw(Graphics g) {
		// g.drawImage(GamePanel.RobotImg, x, y, null);
	}
}
