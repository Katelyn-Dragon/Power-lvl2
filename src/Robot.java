import java.awt.Graphics;

public class Robot extends GameObject{

	public Robot(int x, int y) {
		super(x,y);
	}
	
	public void update() {
		super.update();
	}
	
	public void draw(Graphics g) {
		 g.drawImage(GamePanel.RobotImg, x, y, null);
	}
}
