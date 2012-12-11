public class Responsable{
	
	private String nombre;
	private String telefono;

	public Responsable(String n, String t){
		this.nombre = n;
		this.telefono = t;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getTelefono(){
		return this.telefono;
	}
}