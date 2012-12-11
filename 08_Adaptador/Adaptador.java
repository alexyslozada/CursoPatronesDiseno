public class Adaptador{
	private Nombre objetoNombre;
	private String nombre;
	private String apellido;

	public Adaptador(Nombre n){
		this.objetoNombre = n;
		setNombre(objetoNombre.getNombreCompuesto().split(" ")[0]);
		setApellido(objetoNombre.getNombreCompuesto().split(" ")[1]);
	}

	public void setNombre(String n){
		this.nombre = n;
	}

	public void setApellido(String a){
		this.apellido = a;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getApellido(){
		return this.apellido;
	}
}