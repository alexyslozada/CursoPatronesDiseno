public class Correo implements Observador{
	@Override
	public void actualizar(String a, String l){
		System.out.println("Enviando correo, Accion: "+a+", Lugar: "+l);
	}
}