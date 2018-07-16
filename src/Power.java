import java.awt.Dimension;

import javax.swing.JFrame;

public class Power {
	public static void main(String[] args) {
		Power power = new Power();
		power.setup();
	}
	
	JFrame gameFrame;
	final static int width = 1536;
	final static int height = 864;
	GamePanel gamePanel;
	
	public Power() {
	gameFrame = new JFrame();
	gamePanel = new GamePanel();
}
	
	public void setup() {
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.add(gamePanel);
		gameFrame.setVisible(true);
		gameFrame.getContentPane().setPreferredSize(new Dimension(width, height));
		gameFrame.pack();
		gamePanel.startGame();
		gameFrame.addKeyListener(gamePanel);
	}
	
}
