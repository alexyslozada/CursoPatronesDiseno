public class Aplicacion implements InterfaceAyuda{
	private final int TIPO_AYUDA = 3;

	public Aplicacion(){}

	@Override
	public void getAyuda(int tipo){
		System.out.println("\t-- Ayuda BASE DE LA APLICACION.");
	}
}