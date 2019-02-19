
import java.awt.Color;
import java.awt.Graphics;

public class Shot extends GameObject{
	
	static int width = 40;
	static int height = 1;
	
	public Shot (int x, int y) {
		super(x,y, width, height);
	}
	public void update() {
		super.update();
		x+= 20;
	}
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawRect(x, y, width, height);
		super.draw(g);
	}
}
