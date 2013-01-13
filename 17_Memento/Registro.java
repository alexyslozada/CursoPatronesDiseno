public class Registro{
	private String nombre;
	private int edad;
	private boolean esActivo;

	public Registro(String n, int e, boolean a){
		this.nombre = n;
		this.edad = e;
		this.esActivo = a;
	}

	public void getRegistro(){
		System.out.print("Nombre: "+this.nombre+", ");
		System.out.print("Edad: "+this.edad+", ");
		System.out.print("Activo: "+this.esActivo+".\n");
	}
}