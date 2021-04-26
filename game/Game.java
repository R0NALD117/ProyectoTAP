package game;

import javax.swing.*;

import mapas.Mapa;

import java.awt.*;

public class Game extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Mapa obj_pintable;

	public Game() {
		
		Toolkit Pantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamPantalla = Pantalla.getScreenSize();
		
		int alturaPantalla = tamPantalla.height;
		
		int anchoPantalla = tamPantalla.width;
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Alien Hominid Puzzle");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(true);
		
		setVisible(true);
		
		obj_pintable = new Mapa();
		
		this.add(obj_pintable);
	}

	public static void main(String args[]) {
		
		Game v1 = new Game();
		
	}
	
}
