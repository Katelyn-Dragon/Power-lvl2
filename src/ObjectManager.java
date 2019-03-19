    import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {

	Human humans;
	Enemy enemy;
	Robot robot;
	ArrayList <Shot> shots  = new ArrayList <Shot>();
	
	public ObjectManager(Human human, Robot robots, Enemy enemy) {
		this.humans = human;
		this.enemy = enemy;
		this.robot = robots;
	}
	
	public void update() {
		humans.update();
		enemy.update();
		robot.update();
		for (int i = 0; i < shots.size(); i++) {
			shots.get(i).update();
		}

	}
	
	public void draw(Graphics g) {
		humans.draw(g);
		enemy.draw(g);
		checkCollision();
		for (int i = 0; i < shots.size(); i++) {
			shots.get(i).draw(g);
		}
		
		
	}
	
	public void playerShot() {
		Shot shot = new Shot(humans.x + 240, humans.y + 150);
		shots.add(shot);
	}
	
	public boolean checkCollision() {
		for (int i = 0; i < shots.size(); i++) {
			if (shots.get(i).collisionBox.intersects(enemy.collisionBox)) {
				System.out.println("intersect");
				return true;
			}
		}
		return false;
	}
}
