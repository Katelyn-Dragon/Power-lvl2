import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	
	ObjectManager objectManager;
	
	
	public static BufferedImage PowerImg;
	
	public static BufferedImage SpaceImg;
	
	public static BufferedImage GameOverImg;
	
	public static BufferedImage PCYImg;
	
	public GamePanel() {
		objectManager = new ObjectManager();
		
		try {

            PowerImg = ImageIO.read(this.getClass().getResourceAsStream("Power.menu.png"));
            
            SpaceImg = ImageIO.read(this.getClass().getResourceAsStream("Space.png"));
            
            GameOverImg = ImageIO.read(this.getClass().getResourceAsStream("Game Over.png"));
            
            PCYImg = ImageIO.read(this.getClass().getResourceAsStream("PCY.png"));

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
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
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
		// TODO Auto-generated method stub
		System.out.println("pressed");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == END_STATE) {
				currentState = MENU_STATE;
			} else if (currentState == MENU_STATE) {
				currentState = GAME_STATE;
			} else if (currentState == GAME_STATE) {
				currentState = END_STATE;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("released");
	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		objectManager.update();
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.drawImage(GamePanel.PowerImg, 0, 0, 1536, 864, null);		
		objectManager.draw(g);
	}

	public void drawGameState(Graphics g) {
		g.drawImage(GamePanel.SpaceImg, 0, 0, 1536, 864, null);		
		objectManager.draw(g);
	}

	public void drawEndState(Graphics g) {
		g.drawImage(GamePanel.GameOverImg, 0, 0, 1536, 864, null);		
		objectManager.draw(g);
	}

}
