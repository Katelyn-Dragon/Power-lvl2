import java.awt.Graphics;

public class Humans extends GameObject {

	public Humans(int x, int y) {
		super(x, y);
	}
	
	public void update() {
		super.update();
	}
	
	public void draw(Graphics g) {
		 g.drawImage(GamePanel.PCYImg, x, y, null);
	}
}
