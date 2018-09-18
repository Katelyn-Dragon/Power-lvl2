import java.awt.Graphics;

public class ObjectManager {

	Humans humans;
	Robot robot;
	
	public ObjectManager(Humans human, Robot robots) {
		humans = human;
		robot = robots;
	}
	
	public void update() {
		humans.update();
		robot.update();
		
	}
	
	public void draw(Graphics g) {
		humans.draw(g);
		robot.draw(g);
	}
}
