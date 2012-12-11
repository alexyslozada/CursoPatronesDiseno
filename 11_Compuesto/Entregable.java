public class Entregable implements ItemProyecto{

	private String nombre;

	public Entregable(String n){
		this.nombre = n;
	}

	@Override
	public int getTiempo(){
		return 0;
	}

	@Override
	public void imprimir(){
		System.out.println("\tEntregable: "+this.nombre);
	}
}