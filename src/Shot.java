
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Shot extends GameObject {

	static int width = 40;
	static int height = 1;

	Rectangle collisionBox;

	public Shot(int x, int y) {
		super(x, y, width, height);

		collisionBox = new Rectangle(x, y, width, height);
	}

	public void update() {
		super.update();
		x += 20;
		collisionBox = new Rectangle(x, y, width, height);
	}

	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawRect(x, y, width, height);
		g.drawRect(collisionBox.x, collisionBox.y, width, height);
		super.draw(g);
	}
}
