public class FrontEnd implements InterfaceAyuda{
	private final int TIPO_AYUDA = 1;
	private InterfaceAyuda susesor;

	public FrontEnd(InterfaceAyuda s){
		this.susesor = s;
	}

	@Override
	public void getAyuda(int tipo){
		if(tipo == TIPO_AYUDA){
			System.out.println("\t== Ayuda desde el FrontEnd.");
		} else {
			susesor.getAyuda(tipo);
		}
	}
}