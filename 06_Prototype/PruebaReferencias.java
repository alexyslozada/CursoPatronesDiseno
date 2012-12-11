public class PruebaReferencias{	

	public static void main(String... args){
		
		Persona uno = new Persona("Alexys");
		System.out.print("El nombre del objeto uno es: ");
		System.out.println(uno.getNombre());

		Persona dos = new Persona("");
		dos = uno;
		System.out.print("El nombre del objeto dos es: ");
		System.out.println(dos.getNombre());

		dos.setNombre("Ronald");
		System.out.print("El nombre del objeto uno es: ");
		System.out.println(uno.getNombre());

	}
}