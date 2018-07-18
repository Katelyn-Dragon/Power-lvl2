import java.awt.Graphics;

public class ObjectManager {

	Humans humans;
	
	public ObjectManager(Humans human) {
		humans = human;
	}
	
	public void update() {
		humans.update();
	}
	
	public void draw(Graphics g) {
		humans.draw(g);
	}
}
