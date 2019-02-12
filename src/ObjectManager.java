import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {

	Humans humans;
	Enemy enemies;
	Robot robot;
	ArrayList <Shot> shots  = new ArrayList <Shot>();
	
	public ObjectManager(Humans human, Robot robots, Enemy enemy) {
		humans = human;
		enemies = enemy;
		robot = robots;
	}
	
	public void update() {
		humans.update();
		enemies.update();
		robot.update();
		for (int i = 0; i < shots.size(); i++) {
			shots.get(i).update();
		}

	}
	
	public void draw(Graphics g) {
		humans.draw(g);
		enemies.draw(g);
		
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
