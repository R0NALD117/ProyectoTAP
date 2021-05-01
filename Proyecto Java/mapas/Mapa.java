package mapas;

import java.awt.*;

public class Mapa extends Canvas{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Image imagen;

	public Mapa() {
		
		String pathImagen = "mapas/Mapa1.png";
		
		imagen = Toolkit.getDefaultToolkit().getImage(pathImagen);
		
	}
	
	public void paint(Graphics g) {
		
		g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
				
	}
	
	
	public static void main(String args[]) {

		Mapa p1 = new Mapa();
	}
}
