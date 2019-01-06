import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {

	int x;
	int y;
	
	Rectangle collisionBox;
	
	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
		collisionBox = new Rectangle(x,y);
	}
	
	public void update() {
		
	}
	
	public void draw(Graphics g) {
		
	}
}
