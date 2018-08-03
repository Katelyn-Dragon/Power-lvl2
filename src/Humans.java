import java.awt.Graphics;

public class Humans extends GameObject {

	boolean isShooting;
	boolean walking;

	public Humans(int x, int y) {
		super(x, y);
	}

	public void update() {
		super.update();
	}

	public void draw(Graphics g) {
		
		if (isShooting == false & walking == false) {
			
			g.drawImage(GamePanel.PCYImg, x, y, null);
			
		} 
		else if (isShooting == true & walking == false)
		{
			g.drawImage(GamePanel.ShootImg, x, y, null);
			
		} 
		else if (isShooting == false & walking == true) {
			g.drawImage(GamePanel.StepImg, x, y, null);
		}

	}
}