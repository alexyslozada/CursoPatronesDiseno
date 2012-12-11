public class Nombre implements INombre{
	private String nombreCompleto;

	public Nombre(){}

	public void setNombreCompuesto(String n){
		this.nombreCompleto = n;
	}

	public String getNombreCompuesto(){
		return this.nombreCompleto;
	}
}