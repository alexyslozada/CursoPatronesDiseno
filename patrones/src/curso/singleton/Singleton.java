package curso.singleton;
public final class Singleton{
	private static final Singleton singleton = new Singleton();
	private static int cantidad;

	private Singleton(){
		System.out.println("Hola, he sido creado una sola vez!!!");
	}

	public static Singleton obtenerSingleton(){
		cantidad++;
		return singleton;
	}

	public static void vecesLlamado(){
		System.out.println("Se ha llamado el metodo: "+cantidad+" veces");
	}

}