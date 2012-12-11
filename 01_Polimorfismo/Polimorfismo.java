public class Polimorfismo{
	public static void main(String... args){
		Forma forma = new Forma();
		forma = new Rectangulo();
		forma.dibujar();
	}
}