public class Middle implements InterfaceAyuda{
	private final int TIPO_AYUDA = 2;
	private InterfaceAyuda susesor;

	public Middle(InterfaceAyuda s){
		this.susesor = s;
	}

	@Override
	public void getAyuda(int tipo){
		if(tipo == TIPO_AYUDA){
			System.out.println("\t++ Ayuda desde el Middle.");
		} else {
			susesor.getAyuda(tipo);
		}
	}
}