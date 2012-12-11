public class Rectangulo extends Forma{
	public Rectangulo(){
		mover(5, 8);
		dondeEstoy();
	}

	@Override
	public void dibujar(){
	System.out.println("Estoy dibujando un Rectangulo");
	}

	@Override
	public void redimensionar(){
	System.out.println("Estoy siendo mas grande");
	}

}