import java.util.Scanner;

public class PruebaPuente{
	
	public static void main(String... args){

		Scanner entrada = new Scanner(System.in);
		int opcion;

		I_ImplLista implementacion;

		System.out.println("\nDigite el tipo de lista que desea:\n");
		System.out.println("1 = Items Repetidos, 2 = Items Unicos\n");

		opcion = entrada.nextInt();

		switch (opcion){
			case 1:
				System.out.println("Creando lista. Permite Repetidos\n");
				implementacion = new ImpListaRepetidos();
				break;
			case 2:
				System.out.println("Creando lista. Items Unicos\n");
				implementacion = new ImpListaUnicos();
				break;
			default:
				System.out.println("Error, debe elegir entre 1 o 2.");
				System.out.println("Saliendo del programa...");
				return;
		}

		System.out.println("Creando presentacion BASE...");
		ListasBase listaBase = new ListasBase();
		listaBase.setImplementacion(implementacion);
		System.out.println("Lista Base Creada!!!\n");

		System.out.println("Por favor digite 5 elementos de la lista:");
		for(int i=0; i<5; i++){
			System.out.print("Item "+(i+1)+": ");
			listaBase.agregarItem(entrada.next());
		}
		System.out.println();

		System.out.println("Creando una Lista Enumerada...");
		ListaEnumerada listaEnumerada = new ListaEnumerada();
		listaEnumerada.setImplementacion(implementacion);
		System.out.println();

		System.out.println("Creando una Lista con Vinetas...");
		ListaVineta listaVineta = new ListaVineta();
		listaVineta.setImplementacion(implementacion);
		System.out.print("Digite un simbolo para la vineta: ");
		listaVineta.setTipoItem((char) entrada.next().charAt(0));
		System.out.println();

		System.out.println("Imprimiendo las diferentes listas...");

		System.out.println("Lista Base:");
		for(int i=0; i<listaBase.cuentaItems(); i++){
			System.out.println("\t"+listaBase.obtenerItem(i));
		}
		
		System.out.println("Lista Enumerada:");
		for(int i=0; i<listaEnumerada.cuentaItems(); i++){
			System.out.println("\t"+listaEnumerada.obtenerItem(i));
		}
		
		System.out.println("Lista con Vinetas:");
		for(int i=0; i<listaVineta.cuentaItems(); i++){
			System.out.println("\t"+listaVineta.obtenerItem(i));
		}
			}
}