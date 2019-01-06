import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {

	Humans humans;
	Robot robot;
	ArrayList <Shot> shots  = new ArrayList <Shot>();
	
	public ObjectManager(Humans human, Robot robots) {
		humans = human;
		robot = robots;
	}
	
	public void update() {
		humans.update();
		robot.update();
		for (int i = 0; i < shots.size(); i++) {
			shots.get(i).update();
		}
	}
	
	public void draw(Graphics g) {
		humans.draw(g);
		robot.draw(g);
		for (int i = 0; i < shots.size(); i++) {
			shots.get(i).draw(g);
		}
	}
	
	public void playerShot() {
		Shot shot = new Shot(humans.x + 240, humans.y + 150);
		shots.add(shot);
	}
	
	public void checkCollision() {
		
	}
}
