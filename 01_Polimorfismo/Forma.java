public abstract class Forma{
	protected int posicionX;
	protected int posicionY;

	protected void mover(int nuevoX, int nuevoY){
		posicionX = nuevoX;
		posicionY = nuevoY;
	}

	protected void dondeEstoy(){
	String lugar = "Estoy en X: "+posicionX+
					" en Y: "+posicionY;
	System.out.println(lugar);
	}

	protected abstract void dibujar();
	protected abstract void redimensionar();
}