import java.util.Scanner;

public class PruebaAdaptador{

	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		Nombre objetoNombre = new Nombre();

		System.out.println();
		System.out.println();
		System.out.print("Digite su nombre y apellido: ");
		objetoNombre.setNombreCompuesto(sc.nextLine());

		Adaptador adaptador = new Adaptador(objetoNombre);

		System.out.println();
		System.out.println();
		System.out.println("Tu nombre es: "+adaptador.getNombre());
		System.out.println("Tu apellido es: "+adaptador.getApellido());
	}
}