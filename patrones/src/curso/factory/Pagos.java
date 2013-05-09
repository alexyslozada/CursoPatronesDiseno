package curso.factory;
import java.util.Scanner;

public class Pagos{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		FabricaHeredada miFabrica;
		Conexion miConexion;

		System.out.print("Digite la BD: ");
		String tipo = sc.nextLine();

		miFabrica = new FabricaHeredada();
		miConexion = miFabrica.creaConexion(tipo);

		String salida = "Esta conectado con: "+
						miConexion.descripcion();

		System.out.println(salida);
	}
}