package engine;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{ 

	public Game() {
		Dimension dimension = new Dimension(640,480);
		this.setPreferredSize(dimension);
	}
	
	
	public void upadate() {
		
	}
	public void render() {
		
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		JFrame jframe = new JFrame("Meu jogo");
		jframe.add(game);
		jframe.setLocationRelative(null);
		jframe.pack();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
	}
	
	
	
	public void run() {
		while(true) {
			update();
			render();
			try {
				Thread.sleep(1000/60);
		    }catch (InterruptedException e) {
		    	e.printStackTrace();
		    }
		
		
		
		
		
		}
	}

}

