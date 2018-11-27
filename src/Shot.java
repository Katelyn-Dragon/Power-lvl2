import java.awt.Color;
import java.awt.Graphics;

public class Shot extends GameObject{
	
	public Shot (int x, int y) {
		super(x,y);
	}
	public void update() {
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawRect(x, y, 5, 1);
		g.fillRect(x, y, 5, 1);
	}
}
