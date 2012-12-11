public final class Marcianos{
	private static final Marcianos marcianos = new Marcianos();
	private static int cantidad;

	private Marcianos(){
		cantidad = 10;
	}

	public static Marcianos getMarcianos(){
		return marcianos;
	}

	public static void derribaMarcianos(){
		if(cantidad>0){
			cantidad--;	
			System.out.println("Soy el bueno, derribe un marciano");
		} 
	}

	public static void creaMarcianos(){
		if(cantidad>0){
			cantidad++;	
			System.out.println("Soy el malo, cree un marciano");
		} 
	}

	public static void cuantosQuedan(){
		if(cantidad>0){
			System.out.println("Quedan en el juego: "+cantidad+" marcianos");
		} else {
			System.out.println("Felicidades, has ganado!!!");
		}
	}
}