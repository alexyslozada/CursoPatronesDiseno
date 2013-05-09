package curso.cadena;
import java.util.Scanner;

public class PruebaCadena{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		Aplicacion aplicacion = new Aplicacion();
		Middle intermediario  = new Middle(aplicacion);
		FrontEnd presentacion = new FrontEnd(intermediario);

		do{
			System.out.println("**************************************");
			System.out.println("* SELECCIONE LA AYUDA QUE DESEA VER  *");
			System.out.println("* 1 = Presentacion                   *");
			System.out.println("* 2 = Logica                         *");
			System.out.println("* 3 = Aplicacion                     *");
			System.out.println("* 0 = Salir del programa de ayuda    *");
			System.out.println("**************************************");

			opcion = sc.nextInt();
			if(opcion!=0){
				presentacion.getAyuda(opcion);
			}
		} while(opcion!=0);
	}
}