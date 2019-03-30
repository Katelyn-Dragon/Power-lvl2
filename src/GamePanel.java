
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;

	ObjectManager objectManager;
	Human human;
	Enemy enemy;
	Robot robot;
	Timer timer;

	public static BufferedImage PowerImg;

	public static BufferedImage BackgroundImg;

	public static BufferedImage GameOverImg;

	public static BufferedImage RobotImg;

	public static BufferedImage ShootImg;

	public static BufferedImage Shoot2Img;

	public GamePanel() {
		human = new Human(70, 450, human.width, human.height);
		enemy = new Enemy(1000, 450);
		robot = new Robot(350, 80);
		objectManager = new ObjectManager(human, robot, enemy);
		timer = new Timer(5000 / 60, this);
		timer.start();

		try {

			PowerImg = ImageIO.read(this.getClass().getResourceAsStream("Power.menu.png"));

			BackgroundImg = ImageIO.read(this.getClass().getResourceAsStream("Background.png"));

			GameOverImg = ImageIO.read(this.getClass().getResourceAsStream("GameOver.png"));

			RobotImg = ImageIO.read(this.getClass().getResourceAsStream("Robot.png"));

			ShootImg = ImageIO.read(this.getClass().getResourceAsStream("Shoot.png"));

			Shoot2Img = ImageIO.read(this.getClass().getResourceAsStream("Shoot2.png"));

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

	public void startGame() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		objectManager.update();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			if (!enemy.isAlive) {
				currentState = END_STATE;
				enemy.isAlive = true;
			}
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
		repaint();
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("typed");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		// TODO Auto-generated method stub
		System.out.println("pressed");
		if (key == KeyEvent.VK_ENTER) {
			if (currentState == END_STATE) {
				currentState = MENU_STATE;
			} else if (currentState == MENU_STATE) {
				currentState = GAME_STATE;
			} else if (currentState == GAME_STATE) {
				currentState = END_STATE;
			}
		}
		if (key == KeyEvent.VK_SHIFT && currentState == GAME_STATE) {
			human.isShooting = true;
			objectManager.playerShot();
		} else if (key == KeyEvent.VK_RIGHT) {
			System.out.println("right");
			// humans.forwards = true;
		} else if (key == KeyEvent.VK_LEFT) {
			System.out.println("left");
			// humans.backwards = true;
		} else if (key == KeyEvent.VK_DOWN) {
			System.out.println("down");
			enemy.crouching = true;
			enemy.standing = false;
		} else if (key == KeyEvent.VK_SHIFT && currentState == MENU_STATE && currentState == END_STATE) {
			human.isShooting = false;
		}

		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("released");
		if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
			human.isShooting = false;
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			human.forwards = false;
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			human.backwards = false;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			enemy.crouching = false;
			enemy.standing = true;
		}
	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		objectManager.update();
	}

	public void updateEndState() {

	}

	public void gameOver() {

	}

	public void drawMenuState(Graphics g) {
		g.drawImage(GamePanel.PowerImg, 0, 0, 1536, 864, null);
	}

	public void drawGameState(Graphics g) {
		g.drawImage(GamePanel.BackgroundImg, 0, 0, 1536, 864, null);
		objectManager.draw(g);
	}

	public void drawEndState(Graphics g) {
		g.drawImage(GamePanel.GameOverImg, 0, 0, 1536, 864, null);
	}

}
