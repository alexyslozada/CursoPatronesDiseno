public class Auditor implements Observador{
	@Override
	public void actualizar(String a, String l){
		System.out.println("Guardando en la BD, Accion: "+a+", Lugar: "+l);
	}
}