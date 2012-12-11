import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import javax.swing.*;

public class DetallesRaton extends JFrame{
	// Variables que contendran la posición del clic
	private int xPos, yPos;

	// Constructor que llamará la clase del Adaptador
	public DetallesRaton(){
		super("Muestra de MouseAdapter");
		addMouseListener(new ManejadorRaton());
		setSize(400,200);
		setVisible(true);
	}

	// Dibujará donde se hizo clic
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("Se hizo clic en: ["+xPos+","+yPos+"]", xPos, yPos);
	}

	public static void main(String... args){
		DetallesRaton dr = new DetallesRaton();
		dr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// se crea una clase interna para el adaptador
	class ManejadorRaton extends MouseAdapter{

		// Se sobre escribe el método mouseClicked
		@Override
		public void mouseClicked(MouseEvent evento){
			xPos = evento.getX();
			yPos = evento.getY();
			repaint();
		}
	}
}