public class Informador implements Observador{
	@Override
	public void actualizar(String a, String l){
		System.out.println("Informando al jefe, Accion: "+a+", Lugar: "+l);
	}
}