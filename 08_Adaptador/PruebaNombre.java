import java.util.Scanner;

public class PruebaNombre{

	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		Nombre objetoNombre = new Nombre();

		System.out.println();
		System.out.println();
		System.out.print("Digite su nombre y apellido: ");
		objetoNombre.setNombreCompuesto(sc.nextLine());

		System.out.println();
		System.out.println();
		System.out.println("Tu nombre completo es: "+
			objetoNombre.getNombreCompuesto()
		);
	}
}